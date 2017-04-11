package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;

public class PanelDiagnosticar extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel pnlSintomas;
	private JScrollPane scrollPane;
	private JList lstSintomas;
	private JButton btnDiagnosticar;
	private JButton btnLimpiarSeleccion;
	private JPanel pnlDiagnostico;
	private JScrollPane scrollPane_1;
	private JTextArea taDiagnostico;
	private JScrollPane scrollPane_2;
	private JTextArea taTratamiento;
	private JButton btnGenerarInforme;

	/**
	 * Create the panel.
	 */
	public PanelDiagnosticar() {
		setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setName("");
		add(tabbedPane, BorderLayout.CENTER);
		
		pnlSintomas = new JPanel();
		tabbedPane.addTab("S\u00EDntomas", null, pnlSintomas, null);
		GridBagLayout gbl_pnlSintomas = new GridBagLayout();
		gbl_pnlSintomas.columnWidths = new int[]{623, 0, 0, 0};
		gbl_pnlSintomas.rowHeights = new int[]{326, 0, 0, 0};
		gbl_pnlSintomas.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlSintomas.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlSintomas.setLayout(gbl_pnlSintomas);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Seleccione los s\u00EDntomas para establecer un diagn\u00F3stico preliminar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		pnlSintomas.add(scrollPane, gbc_scrollPane);
		
		lstSintomas = new JList();
		scrollPane.setViewportView(lstSintomas);
		
		btnDiagnosticar = new JButton("Diagnosticar");
		btnDiagnosticar.setIcon(new ImageIcon(PanelDiagnosticar.class.getResource("/presentacion/Imagenes/medicine-briefcase (1).png")));
		GridBagConstraints gbc_btnDiagnosticar = new GridBagConstraints();
		gbc_btnDiagnosticar.anchor = GridBagConstraints.SOUTH;
		gbc_btnDiagnosticar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDiagnosticar.insets = new Insets(0, 0, 5, 0);
		gbc_btnDiagnosticar.gridx = 2;
		gbc_btnDiagnosticar.gridy = 0;
		pnlSintomas.add(btnDiagnosticar, gbc_btnDiagnosticar);
		
		btnLimpiarSeleccion = new JButton("Limpiar Selecci\u00F3n");
		btnLimpiarSeleccion.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnLimpiarSeleccion.setIcon(new ImageIcon(PanelDiagnosticar.class.getResource("/presentacion/Imagenes/double-sided-eraser.png")));
		GridBagConstraints gbc_btnLimpiarSeleccion = new GridBagConstraints();
		gbc_btnLimpiarSeleccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiarSeleccion.anchor = GridBagConstraints.NORTH;
		gbc_btnLimpiarSeleccion.gridx = 2;
		gbc_btnLimpiarSeleccion.gridy = 2;
		pnlSintomas.add(btnLimpiarSeleccion, gbc_btnLimpiarSeleccion);
		
		pnlDiagnostico = new JPanel();
		tabbedPane.addTab("Diagn\u00F3stico", null, pnlDiagnostico, null);
		GridBagLayout gbl_pnlDiagnostico = new GridBagLayout();
		gbl_pnlDiagnostico.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlDiagnostico.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlDiagnostico.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDiagnostico.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDiagnostico.setLayout(gbl_pnlDiagnostico);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new TitledBorder(null, "Diagn\u00F3stico", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		pnlDiagnostico.add(scrollPane_1, gbc_scrollPane_1);
		
		taDiagnostico = new JTextArea();
		scrollPane_1.setViewportView(taDiagnostico);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new TitledBorder(null, "Tratamiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 3;
		pnlDiagnostico.add(scrollPane_2, gbc_scrollPane_2);
		
		taTratamiento = new JTextArea();
		scrollPane_2.setViewportView(taTratamiento);
		
		btnGenerarInforme = new JButton("Generar Informe");
		btnGenerarInforme.setIcon(new ImageIcon(PanelDiagnosticar.class.getResource("/presentacion/Imagenes/file.png")));
		GridBagConstraints gbc_btnGenerarInforme = new GridBagConstraints();
		gbc_btnGenerarInforme.insets = new Insets(0, 0, 5, 5);
		gbc_btnGenerarInforme.gridx = 1;
		gbc_btnGenerarInforme.gridy = 5;
		pnlDiagnostico.add(btnGenerarInforme, gbc_btnGenerarInforme);

	}

}
