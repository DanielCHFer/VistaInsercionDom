package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.Document;

import javax.swing.JScrollPane;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class InterfazConsulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	
	public InterfazConsulta() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setBackground(new Color(248, 218, 218));
		panel.setBounds(0, 0, 928, 84);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Salón Habana");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		lblNewLabel_1.setAlignmentY(0.0f);
		panel.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JLabel lblAccesoADatos = new JLabel("Acceso a datos");
		lblAccesoADatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccesoADatos.setFont(new Font("Bahnschrift", Font.ITALIC, 18));
		lblAccesoADatos.setAlignmentY(0.0f);
		panel.add(lblAccesoADatos, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 85, 928, 254);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				,
			},
			new String[] {
				"Nombre", "Telefono", "Fecha evento", "Tipo reserva", "Asistentes", "Tipo cocina", "Numero jornadas", "Requiere habitaciones", "Tipo mesa", "Comensales mesa"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(115);
		table.getColumnModel().getColumn(1).setPreferredWidth(61);
		table.getColumnModel().getColumn(2).setPreferredWidth(79);
		table.getColumnModel().getColumn(6).setPreferredWidth(98);
		table.getColumnModel().getColumn(7).setPreferredWidth(119);
		table.getColumnModel().getColumn(9).setPreferredWidth(105);
		table.setBackground(new Color(252, 237, 237));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 338, 928, 64);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(112, 11, 452, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Archivo");
		btnNewButton.setBackground(new Color(248, 218, 218));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(".");
				fileChooser.showOpenDialog(fileChooser);
				
				
				String ruta = fileChooser.getSelectedFile().getAbsolutePath();                                       
				textField.setText(ruta);
				
			}
		});
		
		
		btnNewButton.setBounds(574, 12, 98, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cargar datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Reserva> listaReservasActual = new ArrayList<>();
				
				File file = new File(textField.getText());
				if (file.exists()) {
					DOMXML dom = new DOMXML();
					Document documento = dom.obtenerDocument("reservas.xml");
					listaReservasActual = dom.leerDocument(documento);
				}
				
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				modelo.setRowCount(0);
				
				for (Reserva r: listaReservasActual) {
					modelo.addRow(new Object[] {r.getNombre(),r.getTelefono(),r.getFechaReserva(),r.getTipoReserva(),r.getNumeroInvitados(),r.getTipoCocina(),r.getNumeroJornadas(),r.getRequiereHabitaciones(),
							r.getComensalesMesa(),r.getTipoMesa()});
				}
				
			}
		});
		btnNewButton_1.setBackground(new Color(248, 218, 218));
		btnNewButton_1.setBounds(682, 12, 108, 23);
		panel_1.add(btnNewButton_1);
	}
}
