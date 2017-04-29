package presentacion;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import dominio.Especialista;
import persistencia.DAOEspecialista;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;

public class ContactarEspecialista extends JFrame {
	private JTextField txtAsunto;
	private JPanel contentPane;
	private JTextArea txtCuerpo = new JTextArea();
	private JList listaAdjuntos;
	private JLabel lblPara;
	private JLabel lblAsunto;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnAdjuntarArchivo;
	private JButton btnEliminarAdjunto;
	private JButton btnDescartarConsulta;
	private JButton btnEnviarConsulta;
	private DefaultListModel modeloLista;
	private DefaultComboBoxModel modelocombo_1;
	private DefaultComboBoxModel modelocombo_2;
	private JComboBox cbPara;
	private List<Especialista> especialistas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactarEspecialista frame = new ContactarEspecialista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @param especialistas
	 */
	public ContactarEspecialista() {
		addWindowListener(new ThisWindowListener());
		setResizable(false);
		setTitle("Contactar Especialista");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 639, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 142, 164, 279, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 242, 76, 46, 15, 46, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblPara = new JLabel("Para:");
		GridBagConstraints gbc_lblPara = new GridBagConstraints();
		gbc_lblPara.anchor = GridBagConstraints.WEST;
		gbc_lblPara.insets = new Insets(0, 0, 5, 5);
		gbc_lblPara.gridx = 0;
		gbc_lblPara.gridy = 0;
		contentPane.add(lblPara, gbc_lblPara);

		DAOEspecialista daoEspecialista = new DAOEspecialista();
		try {
			especialistas = daoEspecialista.readall();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		cbPara = new JComboBox();
		modelocombo_1 = new DefaultComboBoxModel();
		for (int i = 0; i < especialistas.size(); i++) {
			modelocombo_1.addElement(especialistas.get(i).getNombre() + " - " + especialistas.get(i).getEmail());
		}
		cbPara.setModel(modelocombo_1);

		GridBagConstraints gbc_cbPara = new GridBagConstraints();
		gbc_cbPara.gridwidth = 2;
		gbc_cbPara.insets = new Insets(0, 0, 5, 0);
		gbc_cbPara.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbPara.gridx = 1;
		gbc_cbPara.gridy = 0;
		contentPane.add(cbPara, gbc_cbPara);

		lblAsunto = new JLabel("Asunto");
		GridBagConstraints gbc_lblAsunto = new GridBagConstraints();
		gbc_lblAsunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsunto.gridx = 0;
		gbc_lblAsunto.gridy = 1;
		contentPane.add(lblAsunto, gbc_lblAsunto);

		txtAsunto = new JTextField();
		GridBagConstraints gbc_txtAsunto = new GridBagConstraints();
		gbc_txtAsunto.gridwidth = 2;
		gbc_txtAsunto.insets = new Insets(0, 0, 5, 0);
		gbc_txtAsunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAsunto.gridx = 1;
		gbc_txtAsunto.gridy = 1;
		contentPane.add(txtAsunto, gbc_txtAsunto);
		txtAsunto.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null,
				"Cuerpo del Mensaje",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);

		txtCuerpo = new JTextArea();
		scrollPane.setViewportView(txtCuerpo);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new TitledBorder(null,
				"Archivos Adjuntos",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 3;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);

		listaAdjuntos = new JList();
		modeloLista = new DefaultListModel();
		listaAdjuntos.setModel(modeloLista);
		scrollPane_1.setViewportView(listaAdjuntos);

		btnAdjuntarArchivo = new JButton("Adjuntar Archivo");
		btnAdjuntarArchivo.setSize(new Dimension(130, 0));
		btnAdjuntarArchivo.setMaximumSize(new Dimension(130, 23));
		btnAdjuntarArchivo.setMinimumSize(new Dimension(130, 23));
		btnAdjuntarArchivo.addActionListener(new BtnAdjuntarArchivoActionListener());
		btnAdjuntarArchivo
				.setIcon(new ImageIcon(ContactarEspecialista.class.getResource("/presentacion/Imagenes/anadir.png")));
		GridBagConstraints gbc_btnAdjuntarArchivo = new GridBagConstraints();
		gbc_btnAdjuntarArchivo.fill = GridBagConstraints.BOTH;
		gbc_btnAdjuntarArchivo.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdjuntarArchivo.gridx = 2;
		gbc_btnAdjuntarArchivo.gridy = 3;
		contentPane.add(btnAdjuntarArchivo, gbc_btnAdjuntarArchivo);

		btnEliminarAdjunto = new JButton("Eliminar Adjunto");
		btnEliminarAdjunto.setMinimumSize(new Dimension(130, 23));
		btnEliminarAdjunto.addActionListener(new BtnEliminarAdjuntoActionListener());
		btnEliminarAdjunto
				.setIcon(new ImageIcon(ContactarEspecialista.class.getResource("/presentacion/Imagenes/Eliminar.png")));
		GridBagConstraints gbc_btnEliminarAdjunto = new GridBagConstraints();
		gbc_btnEliminarAdjunto.fill = GridBagConstraints.BOTH;
		gbc_btnEliminarAdjunto.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminarAdjunto.gridx = 2;
		gbc_btnEliminarAdjunto.gridy = 4;
		contentPane.add(btnEliminarAdjunto, gbc_btnEliminarAdjunto);

		btnDescartarConsulta = new JButton("Descartar Consulta");
		btnDescartarConsulta
				.setIcon(new ImageIcon(ContactarEspecialista.class.getResource("/presentacion/Imagenes/cancelar.png")));
		btnDescartarConsulta.addActionListener(new DescartarActionListener());
		GridBagConstraints gbc_btnDescartarConsulta = new GridBagConstraints();
		gbc_btnDescartarConsulta.fill = GridBagConstraints.VERTICAL;
		gbc_btnDescartarConsulta.anchor = GridBagConstraints.WEST;
		gbc_btnDescartarConsulta.gridwidth = 2;
		gbc_btnDescartarConsulta.insets = new Insets(0, 0, 0, 5);
		gbc_btnDescartarConsulta.gridx = 0;
		gbc_btnDescartarConsulta.gridy = 6;
		contentPane.add(btnDescartarConsulta, gbc_btnDescartarConsulta);

		btnEnviarConsulta = new JButton("Enviar Consulta");
		btnEnviarConsulta.addActionListener(new BtnEnviarConsultaActionListener());
		btnEnviarConsulta
				.setIcon(new ImageIcon(ContactarEspecialista.class.getResource("/presentacion/Imagenes/aceptar.png")));
		GridBagConstraints gbc_btnEnviarConsulta = new GridBagConstraints();
		gbc_btnEnviarConsulta.fill = GridBagConstraints.BOTH;
		gbc_btnEnviarConsulta.gridx = 2;
		gbc_btnEnviarConsulta.gridy = 6;
		contentPane.add(btnEnviarConsulta, gbc_btnEnviarConsulta);
	}

	private Component getPanel() {
		return contentPane;
	}

	private class DescartarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.showConfirmDialog(getPanel(),
					"Se va a descartar el mensaje",
					"Descartar...",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				dispose();
			}
		}
	}

	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			if (txtCuerpo.getText().length() != 0) {
				if (JOptionPane.showConfirmDialog(getPanel(),
						"El cuerpo del mensaje no está vacío!\nDescartando... ",
						"Cerrar...",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					dispose();
				}
			} else {
				if (JOptionPane.showConfirmDialog(getPanel(),
						"Se va a descartar el mensaje",
						"Descartar...",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		}
	}

	private class BtnAdjuntarArchivoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(getPanel());
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				modeloLista.addElement(file.getName());
			}
		}
	}

	private class BtnEliminarAdjuntoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (listaAdjuntos.getSelectedIndex() != -1) {
				if (JOptionPane.showConfirmDialog(getPanel(),
						"Se va a eliminar el archivo seleccionado",
						"Eliminar...",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					modeloLista.removeElementAt(listaAdjuntos.getSelectedIndex());
				}
			}
		}
	}

	private class BtnEnviarConsultaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (txtAsunto.getText().length() == 0) {
				if (JOptionPane.showConfirmDialog(getPanel(), "Se va a enviar el mensaje sin asunto", "Enviar...",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(getPanel(), "El mensaje ha sido enviado", "Enviar...",
							JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
			} else {
				JOptionPane.showMessageDialog(getPanel(), "El mensaje ha sido enviado", "Enviar...",
						JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}
		}
	}
}
