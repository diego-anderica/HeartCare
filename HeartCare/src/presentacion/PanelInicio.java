package presentacion;

import javax.swing.JPanel;

import dominio.Especialista;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;

public class PanelInicio extends JPanel {
	private Especialista especialista;
	private JLabel lblLogo;
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JLabel lblMyHorario;
	private JLabel lblMyNombre;
	private JLabel lblHorario;
	private JLabel lblFechaltimoAcceso;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public PanelInicio(Especialista especialista) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{114, 154, 30, 0, 0};
		gridBagLayout.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblLogo = new JLabel("MediHealth");
		lblLogo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLogo.setIcon(new ImageIcon(PanelInicio.class.getResource("/presentacion/Imagenes/cardiograma64.png")));
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.gridwidth = 2;
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridx = 1;
		gbc_lblLogo.gridy = 0;
		add(lblLogo, gbc_lblLogo);
		
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(PanelInicio.class.getResource("/presentacion/Imagenes/cara.gif")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 2;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 1;
		gbc_lblFoto.gridy = 2;
		add(lblFoto, gbc_lblFoto);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		lblMyNombre = new JLabel(especialista.getNombre());
		lblMyNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMyNombre = new GridBagConstraints();
		gbc_lblMyNombre.anchor = GridBagConstraints.WEST;
		gbc_lblMyNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblMyNombre.gridx = 2;
		gbc_lblMyNombre.gridy = 3;
		add(lblMyNombre, gbc_lblMyNombre);
		
		lblHorario = new JLabel("Horario:");
		lblHorario.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblHorario = new GridBagConstraints();
		gbc_lblHorario.anchor = GridBagConstraints.EAST;
		gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorario.gridx = 1;
		gbc_lblHorario.gridy = 4;
		add(lblHorario, gbc_lblHorario);
		
		lblMyHorario = new JLabel(especialista.getHorario());
		lblMyHorario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMyHorario = new GridBagConstraints();
		gbc_lblMyHorario.anchor = GridBagConstraints.WEST;
		gbc_lblMyHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lblMyHorario.gridx = 2;
		gbc_lblMyHorario.gridy = 4;
		add(lblMyHorario, gbc_lblMyHorario);
		
		lblFechaltimoAcceso = new JLabel("Fecha \u00DAltimo Acceso:");
		lblFechaltimoAcceso.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblFechaltimoAcceso = new GridBagConstraints();
		gbc_lblFechaltimoAcceso.anchor = GridBagConstraints.EAST;
		gbc_lblFechaltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaltimoAcceso.gridx = 1;
		gbc_lblFechaltimoAcceso.gridy = 5;
		add(lblFechaltimoAcceso, gbc_lblFechaltimoAcceso);
		
		label = new JLabel("18/12/2016");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 5;
		add(label, gbc_label);

	}

}
