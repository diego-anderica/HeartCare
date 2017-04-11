package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import dominio.Especialista;
import persistencia.DAOEspecialista;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.ImageIcon;

public class PanelEspecialistas extends JPanel {
	private JTable tablaEspecialistas;
	private DefaultTableModel model;
	private List<Especialista> especialistas;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtSexo;
	private JTextField txtConsulta;
	private JTextField txtEdificio;
	private JTextField txtCiudad;
	private JTextField txtExtension;
	private JTextField txtEmail;
	private JTextField txtHorario;
	private JTextField txtEspecialidad;
	private JTextField txtJefe;
	private JTextField txtOperar;

	/**
	 * Create the panel.
	 */
	public PanelEspecialistas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 230, 633, 219, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 74, 114, 105, 48, 162, 98, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Especialistas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

		tablaEspecialistas = new JTable();
		model = new DefaultTableModel(new Object[][] {}, new String[] { "M\u00E9dico", "Especialidad", "Consulta" }) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tablaEspecialistas.setModel(model);
		scrollPane.setViewportView(tablaEspecialistas);
		DAOEspecialista daoEspecialista = new DAOEspecialista();
		try {
			especialistas = daoEspecialista.readall();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		rellenarTabla();
		tablaEspecialistas.getSelectionModel().addListSelectionListener(new TablaActionListener());

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridwidth = 3;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 5;
		add(tabbedPane, gbc_tabbedPane);

		JPanel panelInfo = new JPanel();
		tabbedPane.addTab("Informaci\u00F3n", null, panelInfo, null);
		GridBagLayout gbl_panelInfo = new GridBagLayout();
		gbl_panelInfo.columnWidths = new int[]{0, 0, 152, 199, 207, 210, 239, 0, 0};
		gbl_panelInfo.rowHeights = new int[]{0, 0, 0, 0, 40, 0, 0, 0};
		gbl_panelInfo.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelInfo.setLayout(gbl_panelInfo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		panelInfo.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		panelInfo.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.anchor = GridBagConstraints.EAST;
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 3;
		gbc_lblEdad.gridy = 1;
		panelInfo.add(lblEdad, gbc_lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setEditable(false);
		GridBagConstraints gbc_txtEdad = new GridBagConstraints();
		gbc_txtEdad.insets = new Insets(0, 0, 5, 5);
		gbc_txtEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEdad.gridx = 4;
		gbc_txtEdad.gridy = 1;
		panelInfo.add(txtEdad, gbc_txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 5;
		gbc_lblSexo.gridy = 1;
		panelInfo.add(lblSexo, gbc_lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setEditable(false);
		GridBagConstraints gbc_txtSexo = new GridBagConstraints();
		gbc_txtSexo.insets = new Insets(0, 0, 5, 5);
		gbc_txtSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSexo.gridx = 6;
		gbc_txtSexo.gridy = 1;
		panelInfo.add(txtSexo, gbc_txtSexo);
		txtSexo.setColumns(10);
		
		JLabel lblConsulta = new JLabel("Consulta");
		GridBagConstraints gbc_lblConsulta = new GridBagConstraints();
		gbc_lblConsulta.anchor = GridBagConstraints.EAST;
		gbc_lblConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsulta.gridx = 1;
		gbc_lblConsulta.gridy = 2;
		panelInfo.add(lblConsulta, gbc_lblConsulta);
		
		txtConsulta = new JTextField();
		txtConsulta.setEditable(false);
		GridBagConstraints gbc_txtConsulta = new GridBagConstraints();
		gbc_txtConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_txtConsulta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtConsulta.gridx = 2;
		gbc_txtConsulta.gridy = 2;
		panelInfo.add(txtConsulta, gbc_txtConsulta);
		txtConsulta.setColumns(10);
		
		JLabel lblEdificio = new JLabel("Edificio");
		GridBagConstraints gbc_lblEdificio = new GridBagConstraints();
		gbc_lblEdificio.anchor = GridBagConstraints.EAST;
		gbc_lblEdificio.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdificio.gridx = 3;
		gbc_lblEdificio.gridy = 2;
		panelInfo.add(lblEdificio, gbc_lblEdificio);
		
		txtEdificio = new JTextField();
		txtEdificio.setEditable(false);
		GridBagConstraints gbc_txtEdificio = new GridBagConstraints();
		gbc_txtEdificio.insets = new Insets(0, 0, 5, 5);
		gbc_txtEdificio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEdificio.gridx = 4;
		gbc_txtEdificio.gridy = 2;
		panelInfo.add(txtEdificio, gbc_txtEdificio);
		txtEdificio.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.anchor = GridBagConstraints.EAST;
		gbc_lblCiudad.gridx = 5;
		gbc_lblCiudad.gridy = 2;
		panelInfo.add(lblCiudad, gbc_lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setEditable(false);
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.gridx = 6;
		gbc_txtCiudad.gridy = 2;
		panelInfo.add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblExtension = new JLabel("Ext. Telef\u00F3nica");
		GridBagConstraints gbc_lblExtension = new GridBagConstraints();
		gbc_lblExtension.anchor = GridBagConstraints.EAST;
		gbc_lblExtension.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtension.gridx = 1;
		gbc_lblExtension.gridy = 3;
		panelInfo.add(lblExtension, gbc_lblExtension);
		
		txtExtension = new JTextField();
		txtExtension.setEditable(false);
		GridBagConstraints gbc_txtExtension = new GridBagConstraints();
		gbc_txtExtension.insets = new Insets(0, 0, 5, 5);
		gbc_txtExtension.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtExtension.gridx = 2;
		gbc_txtExtension.gridy = 3;
		panelInfo.add(txtExtension, gbc_txtExtension);
		txtExtension.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 3;
		gbc_lblEmail.gridy = 3;
		panelInfo.add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 4;
		gbc_txtEmail.gridy = 3;
		panelInfo.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblHorario = new JLabel("Horario Disponibilidad");
		GridBagConstraints gbc_lblHorario = new GridBagConstraints();
		gbc_lblHorario.anchor = GridBagConstraints.EAST;
		gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorario.gridx = 5;
		gbc_lblHorario.gridy = 3;
		panelInfo.add(lblHorario, gbc_lblHorario);
		
		txtHorario = new JTextField();
		txtHorario.setEditable(false);
		GridBagConstraints gbc_txtHorario = new GridBagConstraints();
		gbc_txtHorario.insets = new Insets(0, 0, 5, 5);
		gbc_txtHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHorario.gridx = 6;
		gbc_txtHorario.gridy = 3;
		panelInfo.add(txtHorario, gbc_txtHorario);
		txtHorario.setColumns(10);
		
		JLabel lblInformacinSobreEspecialidad = new JLabel("Informaci\u00F3n sobre Especialidad");
		lblInformacinSobreEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblInformacinSobreEspecialidad = new GridBagConstraints();
		gbc_lblInformacinSobreEspecialidad.anchor = GridBagConstraints.SOUTH;
		gbc_lblInformacinSobreEspecialidad.gridwidth = 6;
		gbc_lblInformacinSobreEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacinSobreEspecialidad.gridx = 1;
		gbc_lblInformacinSobreEspecialidad.gridy = 4;
		panelInfo.add(lblInformacinSobreEspecialidad, gbc_lblInformacinSobreEspecialidad);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		GridBagConstraints gbc_lblEspecialidad = new GridBagConstraints();
		gbc_lblEspecialidad.anchor = GridBagConstraints.EAST;
		gbc_lblEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidad.gridx = 1;
		gbc_lblEspecialidad.gridy = 5;
		panelInfo.add(lblEspecialidad, gbc_lblEspecialidad);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setEditable(false);
		GridBagConstraints gbc_txtEspecialidad = new GridBagConstraints();
		gbc_txtEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_txtEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEspecialidad.gridx = 2;
		gbc_txtEspecialidad.gridy = 5;
		panelInfo.add(txtEspecialidad, gbc_txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		JLabel lblJefe = new JLabel("Jefe de Especialidad");
		GridBagConstraints gbc_lblJefe = new GridBagConstraints();
		gbc_lblJefe.anchor = GridBagConstraints.EAST;
		gbc_lblJefe.insets = new Insets(0, 0, 5, 5);
		gbc_lblJefe.gridx = 3;
		gbc_lblJefe.gridy = 5;
		panelInfo.add(lblJefe, gbc_lblJefe);
		
		txtJefe = new JTextField();
		txtJefe.setEditable(false);
		GridBagConstraints gbc_txtJefe = new GridBagConstraints();
		gbc_txtJefe.insets = new Insets(0, 0, 5, 5);
		gbc_txtJefe.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtJefe.gridx = 4;
		gbc_txtJefe.gridy = 5;
		panelInfo.add(txtJefe, gbc_txtJefe);
		txtJefe.setColumns(10);
		
		JLabel lblOperar = new JLabel("Puede Operar");
		GridBagConstraints gbc_lblOperar = new GridBagConstraints();
		gbc_lblOperar.anchor = GridBagConstraints.EAST;
		gbc_lblOperar.insets = new Insets(0, 0, 5, 5);
		gbc_lblOperar.gridx = 5;
		gbc_lblOperar.gridy = 5;
		panelInfo.add(lblOperar, gbc_lblOperar);
		
		txtOperar = new JTextField();
		txtOperar.setEditable(false);
		GridBagConstraints gbc_txtOperar = new GridBagConstraints();
		gbc_txtOperar.insets = new Insets(0, 0, 5, 5);
		gbc_txtOperar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOperar.gridx = 6;
		gbc_txtOperar.gridy = 5;
		panelInfo.add(txtOperar, gbc_txtOperar);
		txtOperar.setColumns(10);

		JButton btnContactarEspecialista = new JButton("Contactar Especialista");
		btnContactarEspecialista
				.setIcon(new ImageIcon(PanelEspecialistas.class.getResource("/presentacion/Imagenes/mensaje.png")));
		btnContactarEspecialista.addActionListener(new ContactarActionListener());
		GridBagConstraints gbc_btnContactarEspecialista = new GridBagConstraints();
		gbc_btnContactarEspecialista.fill = GridBagConstraints.BOTH;
		gbc_btnContactarEspecialista.insets = new Insets(0, 0, 0, 5);
		gbc_btnContactarEspecialista.gridx = 2;
		gbc_btnContactarEspecialista.gridy = 6;
		add(btnContactarEspecialista, gbc_btnContactarEspecialista);

	}

	private void rellenarTabla() {
		Object[] fila = new Object [model.getColumnCount()];
		
		for (int i = 0; i < especialistas.size(); i++){
			fila[0] = especialistas.get(i).getNombre();			
			fila[1] = especialistas.get(i).getEspecialidad().getNombre();
			fila[2] = especialistas.get(i).getConsulta();
			model.addRow(fila);
		}
		
	}

	private class ContactarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ContactarEspecialista ventana = new ContactarEspecialista();
			ventana.setVisible(true);
		}
	}
	
	private class TablaActionListener implements ListSelectionListener{
		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			if (tablaEspecialistas.getSelectedRow() > -1) {
	            // print first column value from selected row
	            rellenarDatosEspecialista(tablaEspecialistas.getSelectedRow());
	        }
			
		}

		private void rellenarDatosEspecialista(int fila) {
			Especialista e = especialistas.get(fila);
			txtNombre.setText(e.getNombre());
			txtEdad.setText(String.valueOf(e.getEdad()));
			txtSexo.setText(Character.toString(e.getSexo()));
			txtConsulta.setText(e.getConsulta());
			txtEdificio.setText(e.getEdificio());
			txtCiudad.setText(e.getCiudad());
			txtExtension.setText(String.valueOf(e.getExt_tel()));
			txtEmail.setText(e.getEmail());
			txtHorario.setText(e.getHorario());
			txtEspecialidad.setText(e.getEspecialidad().getNombre());
			txtJefe.setText(e.getEspecialidad().getJefe().getNombre());
			if (e.getOperar() == true){
				txtOperar.setText("Si");
			}else{
				txtOperar.setText("No");
			}
		}

	}

}
