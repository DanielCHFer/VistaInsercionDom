package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazInicial frame = new InterfazInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazInicial() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 79);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setBackground(new Color(248, 218, 218));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Salón Habana");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		lblNewLabel_1.setAlignmentY(0.0f);
		panel.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JLabel lblSeleccinDeInterfaz = new JLabel("Selección de interfaz");
		lblSeleccinDeInterfaz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccinDeInterfaz.setFont(new Font("Bahnschrift", Font.ITALIC, 18));
		lblSeleccinDeInterfaz.setAlignmentY(0.0f);
		panel.add(lblSeleccinDeInterfaz, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 78, 434, 90);
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 5, 0));
		
		JButton botonInsertarDatos = new JButton("Insertar Datos");
		botonInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazInsercion interfazInsercion = new InterfazInsercion();
				interfazInsercion.setVisible(true);
				dispose();
			}
		});
		botonInsertarDatos.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonInsertarDatos.setBackground(new Color(255, 179, 179));
		panel_5.add(botonInsertarDatos);
		
		JButton botonConsultarDatos = new JButton("Consultar Datos");
		botonConsultarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazConsulta interfazConsulta = new InterfazConsulta();
				interfazConsulta.setVisible(true);
				dispose();
			}
		});
		
		botonConsultarDatos.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonConsultarDatos.setBackground(new Color(255, 179, 179));
		panel_5.add(botonConsultarDatos);
	}
}
