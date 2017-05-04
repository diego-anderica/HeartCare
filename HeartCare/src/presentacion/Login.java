package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Especialista;
import persistencia.DAOEspecialista;

import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	private JLabel lblIcono;
	private JLabel lblHeartcare;
	private JLabel lblIdentificacion;
	private JLabel lblClave;
	private JTextField txtIdentificacion;
	private JLabel lblFoto;
	private JButton btnSalir;
	private JButton btnEntrar;
	private JPanel contentPane;
	private JLabel lblClaveIncorrecta;
	private JPasswordField pwdClave;
	
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private List<Especialista> especialistas;
	private DAOEspecialista daoEspecialista = new DAOEspecialista();
	private Especialista especialista;
	private JLabel lblNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/presentacion/Imagenes/cardiograma24.png")));
		setTitle("Login - HeartCare");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 103, 107, 237, 49, 105, 0, 0};
		gbl_contentPane.rowHeights = new int[]{75, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(Login.class.getResource("/presentacion/Imagenes/cardiograma64.png")));
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 1;
		gbc_lblIcono.gridy = 0;
		contentPane.add(lblIcono, gbc_lblIcono);
		
		lblHeartcare = new JLabel("HeartCare");
		lblHeartcare.setFont(new Font("Calibri", Font.BOLD, 30));
		GridBagConstraints gbc_lblHeartcare = new GridBagConstraints();
		gbc_lblHeartcare.anchor = GridBagConstraints.WEST;
		gbc_lblHeartcare.gridwidth = 2;
		gbc_lblHeartcare.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeartcare.gridx = 2;
		gbc_lblHeartcare.gridy = 0;
		contentPane.add(lblHeartcare, gbc_lblHeartcare);
		
		lblFoto = new JLabel("");
		lblFoto.setVisible(false);
		lblFoto.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblFoto.setIcon(new ImageIcon(Login.class.getResource("/presentacion/Imagenes/Cara.gif")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridheight = 3;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 5;
		gbc_lblFoto.gridy = 0;
		contentPane.add(lblFoto, gbc_lblFoto);
		
		lblIdentificacion = new JLabel("Identificaci\u00F3n");
		lblIdentificacion.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblIdentificacion = new GridBagConstraints();
		gbc_lblIdentificacion.anchor = GridBagConstraints.EAST;
		gbc_lblIdentificacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificacion.gridx = 1;
		gbc_lblIdentificacion.gridy = 1;
		contentPane.add(lblIdentificacion, gbc_lblIdentificacion);
		
		txtIdentificacion = new JTextField();
		txtIdentificacion.addKeyListener(new TxtIdentificacionKeyListener());
		txtIdentificacion.addFocusListener(new MiFocusListener());
		GridBagConstraints gbc_txtIdentificacion = new GridBagConstraints();
		gbc_txtIdentificacion.gridwidth = 2;
		gbc_txtIdentificacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdentificacion.gridx = 2;
		gbc_txtIdentificacion.gridy = 1;
		contentPane.add(txtIdentificacion, gbc_txtIdentificacion);
		txtIdentificacion.setColumns(10);
		
		lblClave = new JLabel("Clave");
		lblClave.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblClave = new GridBagConstraints();
		gbc_lblClave.anchor = GridBagConstraints.EAST;
		gbc_lblClave.insets = new Insets(0, 0, 5, 5);
		gbc_lblClave.gridx = 1;
		gbc_lblClave.gridy = 2;
		contentPane.add(lblClave, gbc_lblClave);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new BtnSalirActionListener());
		
		pwdClave = new JPasswordField();
		pwdClave.setEnabled(false);
		GridBagConstraints gbc_pwdClave = new GridBagConstraints();
		gbc_pwdClave.gridwidth = 2;
		gbc_pwdClave.insets = new Insets(0, 0, 5, 5);
		gbc_pwdClave.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdClave.gridx = 2;
		gbc_pwdClave.gridy = 2;
		contentPane.add(pwdClave, gbc_pwdClave);
		
		lblNombre = new JLabel("");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 5;
		gbc_lblNombre.gridy = 3;
		contentPane.add(lblNombre, gbc_lblNombre);
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalir.gridx = 1;
		gbc_btnSalir.gridy = 4;
		contentPane.add(btnSalir, gbc_btnSalir);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.gridx = 5;
		gbc_btnEntrar.gridy = 4;
		contentPane.add(btnEntrar, gbc_btnEntrar);
		
		lblClaveIncorrecta = new JLabel("");
		GridBagConstraints gbc_lblClaveIncorrecta = new GridBagConstraints();
		gbc_lblClaveIncorrecta.insets = new Insets(0, 0, 0, 5);
		gbc_lblClaveIncorrecta.gridx = 5;
		gbc_lblClaveIncorrecta.gridy = 5;
		contentPane.add(lblClaveIncorrecta, gbc_lblClaveIncorrecta);
		
		try {
			especialistas = daoEspecialista.readall();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private Component getPanel() {
		return contentPane;
	}
	
	private class TxtIdentificacionKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent arg0) {
			for(int i = 0; i < especialistas.size(); i++){
				if (txtIdentificacion.getText().equals(especialistas.get(i).getDni())) {
					txtIdentificacion.setBorder(bordeVerde);
					pwdClave.setEnabled(true);
					lblFoto.setVisible(true);
					lblNombre.setText(especialistas.get(i).getNombre());
					especialista = especialistas.get(i);
					break;
				} else {
					txtIdentificacion.setBorder(bordeRojo);
					pwdClave.setEnabled(false);
					lblFoto.setVisible(false);
					lblNombre.setText("");
				}
			}
		}
	}
	
	private class MiFocusListener extends FocusAdapter {

		@Override
		public void focusGained(FocusEvent arg0) {
			arg0.getComponent().setBackground(new Color(250, 250, 210));
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250, 250, 250));
		}

	}
	
	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(JOptionPane.showConfirmDialog(getPanel(), "\u00BFRealmente desea salir?", "Salir...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}
	
	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String pass = especialista.getPass();
			char[] claveCorrecta = pass.toCharArray();
			char[] claveIntroducida = pwdClave.getPassword();

			if (claveIntroducida.length != claveCorrecta.length) {
				lblClaveIncorrecta.setText("Clave Incorrecta");
				lblClaveIncorrecta.setFont(new Font("Calibri", Font.BOLD, 14));
				lblClaveIncorrecta.setForeground(Color.RED);
				pwdClave.setBorder(bordeRojo);
			} else {
				if (Arrays.equals(claveCorrecta, claveIntroducida) == true) {						
					VentanaPrincipal ventana = new VentanaPrincipal(especialista);
					ventana.getFrame().setVisible(true);
					dispose();
				} else {
					lblClaveIncorrecta.setText("Clave Incorrecta");
					lblClaveIncorrecta.setFont(new Font("Calibri", Font.BOLD, 14));
					lblClaveIncorrecta.setForeground(Color.RED);
					pwdClave.setBorder(bordeRojo);
				}
			}
			
		}
	}
}
