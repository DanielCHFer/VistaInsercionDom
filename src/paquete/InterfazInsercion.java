package paquete;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.LineBorder;

import org.w3c.dom.Document;

import javax.swing.JComboBox;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class InterfazInsercion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField textoNombre;
	private JTextField textoTelefono;
	private JTextField textoFechaReserva;
	private JTextField textoNumeroInvitados;
	private JTextField textoComensalesMesa;
	private JTextField textoNumJornadas;

	public InterfazInsercion() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setBackground(new Color(248, 218, 218));
		panel.setBounds(0, 0, 621, 80);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(5, 0));
		
		lblNewLabel_1 = new JLabel("Salón Habana");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		panel.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Solicitud de reserva");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.ITALIC, 18));
		panel.add(lblNewLabel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new EmptyBorder(7, 7, 7, 7));
		panel_1.setBounds(0, 79, 621, 87);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Datos de contacto");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblNewLabel_2.setAlignmentY(0.0f);
		panel_1.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new EmptyBorder(15, 10, 15, 10));
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(1, 0, 25, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1 = new JLabel("Nombre");
		lblNewLabel_4_1.setBackground(new Color(248, 218, 218));
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Gadugi", Font.BOLD, 13));
		panel_3.add(lblNewLabel_4_1, BorderLayout.CENTER);
		
		textoNombre = new JTextField();
		panel_2.add(textoNombre);
		textoNombre.setColumns(10);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Teléfono");
		lblNewLabel_4_1_1.setOpaque(true);
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_4_1_1.setBackground(new Color(248, 218, 218));
		panel_3_1.add(lblNewLabel_4_1_1, BorderLayout.CENTER);
		
		textoTelefono = new JTextField();
		panel_2.add(textoTelefono);
		textoTelefono.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setBorder(new EmptyBorder(7, 7, 7, 7));
		panel_1_1.setBounds(0, 166, 621, 128);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("Datos de reserva");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblNewLabel_2_1.setAlignmentY(0.0f);
		panel_1_1.add(lblNewLabel_2_1, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBorder(new EmptyBorder(15, 10, 15, 10));
		panel_1_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(2, 4, 25, 15));
		
		JPanel panel_3_2_1_2 = new JPanel();
		panel_3_2_1_2.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_4.add(panel_3_2_1_2);
		panel_3_2_1_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Fecha reserva");
		lblNewLabel_4_1_2.setOpaque(true);
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_4_1_2.setBackground(new Color(248, 218, 218));
		panel_3_2_1_2.add(lblNewLabel_4_1_2, BorderLayout.CENTER);
		
		textoFechaReserva = new JTextField();
		textoFechaReserva.setColumns(10);
		panel_4.add(textoFechaReserva);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_4.add(panel_3_2_1);
		panel_3_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Tipo reserva");
		lblNewLabel_4_1_3.setOpaque(true);
		lblNewLabel_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_4_1_3.setBackground(new Color(248, 218, 218));
		panel_3_2_1.add(lblNewLabel_4_1_3, BorderLayout.CENTER);
		
		JComboBox comboBoxTipoReserva = new JComboBox();
		
		comboBoxTipoReserva.setModel(new DefaultComboBoxModel(new String[] {"Congreso", "Banquete", "Jornada"}));
		panel_4.add(comboBoxTipoReserva);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_4.add(panel_3_2);
		panel_3_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Num. invitados");
		lblNewLabel_4_1_4.setOpaque(true);
		lblNewLabel_4_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_4.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_4_1_4.setBackground(new Color(248, 218, 218));
		panel_3_2.add(lblNewLabel_4_1_4, BorderLayout.CENTER);
		
		textoNumeroInvitados = new JTextField();
		textoNumeroInvitados.setColumns(10);
		panel_4.add(textoNumeroInvitados);
		
		JPanel panel_3_2_1_1 = new JPanel();
		panel_3_2_1_1.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_4.add(panel_3_2_1_1);
		panel_3_2_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1_5 = new JLabel("Tipo cocina");
		lblNewLabel_4_1_5.setOpaque(true);
		lblNewLabel_4_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_5.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_4_1_5.setBackground(new Color(248, 218, 218));
		panel_3_2_1_1.add(lblNewLabel_4_1_5, BorderLayout.CENTER);
		
		JComboBox comboBoxTipoCocina = new JComboBox();
		comboBoxTipoCocina.setModel(new DefaultComboBoxModel(new String[] {"Bufé", "Carta", "Pedir cita con chef", "No precisa"}));
		panel_4.add(comboBoxTipoCocina);
		
		JPanel cardPanelContenedor = new JPanel();
		cardPanelContenedor.setBounds(0, 284, 621, 53);
		contentPane.add(cardPanelContenedor);
		cardPanelContenedor.setLayout(new CardLayout(0, 0));
		
		JPanel Congreso = new JPanel();
		Congreso.setBackground(new Color(255, 255, 255));
		Congreso.setBorder(new EmptyBorder(14, 15, 14, 15));
		cardPanelContenedor.add(Congreso, "Congreso");
		Congreso.setLayout(new GridLayout(0, 2, 20, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_8.setBackground(new Color(255, 255, 255));
		Congreso.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 2, 25, 0));
		
		JPanel panel_3_2_1_2_1 = new JPanel();
		panel_3_2_1_2_1.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_8.add(panel_3_2_1_2_1);
		panel_3_2_1_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Num. Jornadas");
		lblNewLabel_4_1_2_1.setOpaque(true);
		lblNewLabel_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_1.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_4_1_2_1.setBackground(new Color(248, 218, 218));
		panel_3_2_1_2_1.add(lblNewLabel_4_1_2_1, BorderLayout.CENTER);
		
		textoNumJornadas = new JTextField();
		textoNumJornadas.setColumns(10);
		panel_8.add(textoNumJornadas);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel_9.setBorder(new EmptyBorder(0, 15, 0, 15));
		Congreso.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JCheckBox checkboxRequiereHabitaciones = new JCheckBox("  Requiere habitaciones");
		checkboxRequiereHabitaciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkboxRequiereHabitaciones.setBackground(new Color(255, 255, 255));
		panel_9.add(checkboxRequiereHabitaciones, BorderLayout.CENTER);
		
		JPanel Banquete = new JPanel();
		cardPanelContenedor.add(Banquete, "Banquete");
		GridBagLayout gbl_Banquete = new GridBagLayout();
		gbl_Banquete.columnWidths = new int[] {0, 1};
		gbl_Banquete.rowHeights = new int[]{0, 0};
		gbl_Banquete.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_Banquete.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		Banquete.setLayout(gbl_Banquete);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setBackground(new Color(255, 255, 255));
		panel_3_3_1.setBorder(new EmptyBorder(14, 15, 14, 15));
		GridBagConstraints gbc_panel_3_3_1 = new GridBagConstraints();
		gbc_panel_3_3_1.fill = GridBagConstraints.BOTH;
		gbc_panel_3_3_1.gridx = 0;
		gbc_panel_3_3_1.gridy = 0;
		Banquete.add(panel_3_3_1, gbc_panel_3_3_1);
		panel_3_3_1.setLayout(new GridLayout(0, 4, 20, 0));
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBorder(new LineBorder(new Color(241, 184, 184)));
		panel_3_3_1.add(panel_3_4);
		panel_3_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1_2_2 = new JLabel("Comensales mesa");
		lblNewLabel_4_1_2_2.setOpaque(true);
		lblNewLabel_4_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_2.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_4_1_2_2.setBackground(new Color(248, 218, 218));
		panel_3_4.add(lblNewLabel_4_1_2_2, BorderLayout.CENTER);
		
		textoComensalesMesa = new JTextField();
		textoComensalesMesa.setColumns(10);
		panel_3_3_1.add(textoComensalesMesa);
		
		JRadioButton botonMesaRectangular = new JRadioButton("Mesa rectangular");
		
		botonMesaRectangular.setBackground(new Color(255, 255, 255));
		panel_3_3_1.add(botonMesaRectangular);
		
		JRadioButton botonMesaRedonda = new JRadioButton("Mesa redonda");
		botonMesaRedonda.setBackground(new Color(255, 255, 255));
		panel_3_3_1.add(botonMesaRedonda);
		
		botonMesaRectangular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botonMesaRedonda.isSelected()) {
					botonMesaRedonda.setSelected(false);
				}
			}
		});
		
		botonMesaRedonda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botonMesaRectangular.isSelected()) {
					botonMesaRectangular.setSelected(false);
				}
			}
		});
		
		JPanel Jornada = new JPanel();
		Jornada.setBackground(new Color(255, 255, 255));
		cardPanelContenedor.add(Jornada, "Jornada");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBorder(new EmptyBorder(5, 15, 5, 5));
		panel_5.setBounds(0, 337, 615, 54);
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 5, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_7);
		
		JButton btnNewButton = new JButton("Enviar reserva");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Reserva> listaReservasActual = new ArrayList<>();
				
				File file = new File("reservas.xml");
				if (file.exists()) {
					DOMXML dom = new DOMXML();
					Document documento = dom.obtenerDocument("reservas.xml");
					listaReservasActual = dom.leerDocument(documento);
				}
				
				String requiereHabitaciones = "false";
				if (checkboxRequiereHabitaciones.isSelected()) {
					requiereHabitaciones = "true";
				}
				String tipoMesa = "";
				if (botonMesaRedonda.isSelected()) {
					tipoMesa = "redonda";
				} else if (botonMesaRectangular.isSelected()) {
					tipoMesa = "rectangular";
				}
				
				Reserva reservaActual = new Reserva(textoNombre.getText(), textoTelefono.getText(), textoFechaReserva.getText(), comboBoxTipoReserva.getSelectedItem().toString(),
						textoNumeroInvitados.getText(), comboBoxTipoCocina.getSelectedItem().toString(), textoNumJornadas.getText(), requiereHabitaciones, 
						textoComensalesMesa.getText(), tipoMesa);
				listaReservasActual.add(reservaActual);
				
				DOMXML dom2 = new DOMXML();
				Document documentoEscribir = dom2.obtenerDocument();
				
				
				dom2.escribirDocument(documentoEscribir, listaReservasActual);
				dom2.escribirArchivo(documentoEscribir);
				JOptionPane.showMessageDialog(null, "La reserva se ha añadido");
				limpiarFormulario();
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(230, 117, 117));
		panel_5.add(btnNewButton);
		
		comboBoxTipoReserva.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanelContenedor.getLayout();
                cardLayout.show(cardPanelContenedor, (String) comboBoxTipoReserva.getSelectedItem());
            }
		});
	}
	
	public void limpiarFormulario() {
		textoNombre.setText("");
		textoTelefono.setText("");
		textoFechaReserva.setText("");
		textoNumeroInvitados.setText("");
		textoNumJornadas.setText("");
		textoComensalesMesa.setText("");
	}
}
