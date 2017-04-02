package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblIcono;
	private JLabel lblHeartcare;
	private JLabel lblIdentificacion;
	private JLabel lblClave;
	private JTextField txtIndentificacion;
	private JLabel lblFoto;
	private JTextField txtClave;
	private JButton btnSalir;
	private JButton btnEntrar;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/presentacion/Imagenes/cardiograma24.png")));
		setTitle("Login - HeartCare");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 103, 107, 237, 49, 105, 0, 0};
		gbl_contentPane.rowHeights = new int[]{75, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		txtIndentificacion = new JTextField();
		GridBagConstraints gbc_txtIndentificacion = new GridBagConstraints();
		gbc_txtIndentificacion.gridwidth = 2;
		gbc_txtIndentificacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtIndentificacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIndentificacion.gridx = 2;
		gbc_txtIndentificacion.gridy = 1;
		contentPane.add(txtIndentificacion, gbc_txtIndentificacion);
		txtIndentificacion.setColumns(10);
		
		lblClave = new JLabel("Clave");
		lblClave.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblClave = new GridBagConstraints();
		gbc_lblClave.anchor = GridBagConstraints.EAST;
		gbc_lblClave.insets = new Insets(0, 0, 5, 5);
		gbc_lblClave.gridx = 1;
		gbc_lblClave.gridy = 2;
		contentPane.add(lblClave, gbc_lblClave);
		
		txtClave = new JTextField();
		txtClave.setEnabled(false);
		GridBagConstraints gbc_txtClave = new GridBagConstraints();
		gbc_txtClave.gridwidth = 2;
		gbc_txtClave.insets = new Insets(0, 0, 5, 5);
		gbc_txtClave.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClave.gridx = 2;
		gbc_txtClave.gridy = 2;
		contentPane.add(txtClave, gbc_txtClave);
		txtClave.setColumns(10);
		
		btnSalir = new JButton("Salir");
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalir.gridx = 1;
		gbc_btnSalir.gridy = 4;
		contentPane.add(btnSalir, gbc_btnSalir);
		
		btnEntrar = new JButton("Entrar");
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.gridx = 5;
		gbc_btnEntrar.gridy = 4;
		contentPane.add(btnEntrar, gbc_btnEntrar);
	}

}
