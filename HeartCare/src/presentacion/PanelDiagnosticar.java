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
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import dominio.Diagnostico;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PanelDiagnosticar extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel pnlSintomas;
	private JScrollPane scrollPaneSintomas;
	private JButton btnDiagnosticar;
	private JButton btnLimpiarSeleccion;
	private JPanel pnlDiagnostico;
	private JScrollPane scrollPane_1;
	private JTextArea taDiagnostico;
	private JScrollPane scrollPane_2;
	private JTextArea taTratamiento;
	private JButton btnGenerarInforme;
	private JPanel pnlDesSintomas;
	private JLabel lblProblemasDeCorazn;
	private JRadioButton rdbtnArritmias;
	private JRadioButton rdbtnAlteracionesDelRitmo;
	private JRadioButton rdbtnPulsoIrregularO;
	private JLabel lblDoloresOHinchazones;
	private JRadioButton rdbtnDolorDePecho;
	private JRadioButton rdbtnDolorDeBrazo;
	private JRadioButton rdbtnHinchaznEnPies;
	private JRadioButton rdbtnHinchaznEnEl;
	private JRadioButton rdbtnInflamacinEnEl;
	private JRadioButton rdbtnInflamacinEnPiernas;
	private JRadioButton rdbtnInflamacinEnGanglios;
	private JLabel lblErupcionesORojeces;
	private JRadioButton rdbtnErupcionesCutneasO;
	private JRadioButton rdbtnOjosLenguaRojos;
	private JLabel lblSistemaUrinario;
	private JRadioButton rdbtnMiccinExcesivaDurante;
	private JRadioButton rdbtnRetencinDeLquidos;
	private JRadioButton rdbtnBajaProduccinDe;
	private JLabel lblSistemaDigestivo;
	private JRadioButton rdbtnGanasDeVomitar;
	private JRadioButton rdbtnFaltaDeApetito;
	private JLabel lblOtrosSntomas;
	private JRadioButton rdbtnMembranasMucosasEn;
	private JRadioButton rdbtnPalidez;
	private JRadioButton rdbtnSudoracin;
	private JRadioButton rdbtnPrdidaDeConocimiento;
	private JRadioButton rdbtnDebilidad;
	private JRadioButton rdbtnVrtigo;
	private JRadioButton rdbtnMareos;
	private JRadioButton rdbtnCansancio;
	private JRadioButton rdbtnFiebre_1;
	Diagnostico diagnostico;
	private JRadioButton rdbtnDescamacin;
	private JLabel lblSistemaRespiratorio;
	private JRadioButton rdbtnDificultadParaRespirar;
	private JRadioButton rdbtnTos;
	private JRadioButton rdbtnTosConSangre;
	private JRadioButton rdbtnInfeccionesRespiratorias;

	/**
	 * Create the panel.
	 */
	public PanelDiagnosticar() {
		setLayout(new BorderLayout(0, 0));
		diagnostico = new Diagnostico();
		
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
		
		scrollPaneSintomas = new JScrollPane();
		scrollPaneSintomas.setBorder(new TitledBorder(null, "Seleccione los s\u00EDntomas para establecer un diagn\u00F3stico preliminar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPaneSintomas = new GridBagConstraints();
		gbc_scrollPaneSintomas.gridheight = 3;
		gbc_scrollPaneSintomas.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPaneSintomas.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneSintomas.gridx = 0;
		gbc_scrollPaneSintomas.gridy = 0;
		pnlSintomas.add(scrollPaneSintomas, gbc_scrollPaneSintomas);
		
		pnlDesSintomas = new JPanel();
		scrollPaneSintomas.setViewportView(pnlDesSintomas);
		GridBagLayout gbl_pnlDesSintomas = new GridBagLayout();
		gbl_pnlDesSintomas.columnWidths = new int[]{0, 0, 0};
		gbl_pnlDesSintomas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlDesSintomas.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDesSintomas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDesSintomas.setLayout(gbl_pnlDesSintomas);
		
		lblProblemasDeCorazn = new JLabel("Problemas de corazón");
		lblProblemasDeCorazn.setBackground(Color.LIGHT_GRAY);
		lblProblemasDeCorazn.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblProblemasDeCorazn = new GridBagConstraints();
		gbc_lblProblemasDeCorazn.anchor = GridBagConstraints.WEST;
		gbc_lblProblemasDeCorazn.insets = new Insets(0, 0, 5, 5);
		lblProblemasDeCorazn.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblProblemasDeCorazn.gridx = 0;
		gbc_lblProblemasDeCorazn.gridy = 0;
		pnlDesSintomas.add(lblProblemasDeCorazn, gbc_lblProblemasDeCorazn);
		
		rdbtnArritmias = new JRadioButton("Arritmias");
		rdbtnArritmias.addItemListener(new RdbtnArritmiasItemListener());
		rdbtnArritmias.setHorizontalTextPosition(SwingConstants.RIGHT);
		GridBagConstraints gbc_rdbtnArritmias = new GridBagConstraints();
		gbc_rdbtnArritmias.anchor = GridBagConstraints.WEST;
		gbc_rdbtnArritmias.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnArritmias.gridx = 0;
		gbc_rdbtnArritmias.gridy = 1;
		pnlDesSintomas.add(rdbtnArritmias, gbc_rdbtnArritmias);
		
		rdbtnAlteracionesDelRitmo = new JRadioButton("Alteraciones del ritmo cardíaco");
		rdbtnAlteracionesDelRitmo.addItemListener(new RdbtnAlteracionesDelRitmoItemListener());
		GridBagConstraints gbc_rdbtnAlteracionesDelRitmo = new GridBagConstraints();
		gbc_rdbtnAlteracionesDelRitmo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAlteracionesDelRitmo.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnAlteracionesDelRitmo.gridx = 1;
		gbc_rdbtnAlteracionesDelRitmo.gridy = 1;
		pnlDesSintomas.add(rdbtnAlteracionesDelRitmo, gbc_rdbtnAlteracionesDelRitmo);
		
		rdbtnPulsoIrregularO = new JRadioButton("Pulso irregular o acelerado");
		rdbtnPulsoIrregularO.addItemListener(new RdbtnPulsoIrregularOItemListener());
		GridBagConstraints gbc_rdbtnPulsoIrregularO = new GridBagConstraints();
		gbc_rdbtnPulsoIrregularO.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPulsoIrregularO.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPulsoIrregularO.gridx = 0;
		gbc_rdbtnPulsoIrregularO.gridy = 2;
		pnlDesSintomas.add(rdbtnPulsoIrregularO, gbc_rdbtnPulsoIrregularO);
		
		lblDoloresOHinchazones = new JLabel("Dolores o hinchazones físicos");
		GridBagConstraints gbc_lblDoloresOHinchazones = new GridBagConstraints();
		gbc_lblDoloresOHinchazones.anchor = GridBagConstraints.WEST;
		gbc_lblDoloresOHinchazones.insets = new Insets(0, 0, 5, 5);
		lblDoloresOHinchazones.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblDoloresOHinchazones.gridx = 0;
		gbc_lblDoloresOHinchazones.gridy = 3;
		pnlDesSintomas.add(lblDoloresOHinchazones, gbc_lblDoloresOHinchazones);
		
		rdbtnDolorDePecho = new JRadioButton("Dolor de pecho");
		rdbtnDolorDePecho.addItemListener(new RdbtnDolorDePechoItemListener());
		GridBagConstraints gbc_rdbtnDolorDePecho = new GridBagConstraints();
		gbc_rdbtnDolorDePecho.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDolorDePecho.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDolorDePecho.gridx = 0;
		gbc_rdbtnDolorDePecho.gridy = 4;
		pnlDesSintomas.add(rdbtnDolorDePecho, gbc_rdbtnDolorDePecho);
		
		rdbtnDolorDeBrazo = new JRadioButton("Dolor de brazo izquierdo, de cuello, de mandíbula o de espalda");
		rdbtnDolorDeBrazo.addItemListener(new RdbtnDolorDeBrazoItemListener());
		GridBagConstraints gbc_rdbtnDolorDeBrazo = new GridBagConstraints();
		gbc_rdbtnDolorDeBrazo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDolorDeBrazo.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnDolorDeBrazo.gridx = 1;
		gbc_rdbtnDolorDeBrazo.gridy = 4;
		pnlDesSintomas.add(rdbtnDolorDeBrazo, gbc_rdbtnDolorDeBrazo);
		
		rdbtnHinchaznEnPies = new JRadioButton("Hinchazón en pies, tobillos o ambos");
		rdbtnHinchaznEnPies.addItemListener(new RdbtnHinchaznEnPiesItemListener());
		GridBagConstraints gbc_rdbtnHinchaznEnPies = new GridBagConstraints();
		gbc_rdbtnHinchaznEnPies.anchor = GridBagConstraints.WEST;
		gbc_rdbtnHinchaznEnPies.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnHinchaznEnPies.gridx = 0;
		gbc_rdbtnHinchaznEnPies.gridy = 5;
		pnlDesSintomas.add(rdbtnHinchaznEnPies, gbc_rdbtnHinchaznEnPies);
		
		rdbtnHinchaznEnEl = new JRadioButton("Hinchazón en el abdomen");
		rdbtnHinchaznEnEl.addItemListener(new RdbtnHinchaznEnElItemListener());
		GridBagConstraints gbc_rdbtnHinchaznEnEl = new GridBagConstraints();
		gbc_rdbtnHinchaznEnEl.anchor = GridBagConstraints.WEST;
		gbc_rdbtnHinchaznEnEl.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnHinchaznEnEl.gridx = 1;
		gbc_rdbtnHinchaznEnEl.gridy = 5;
		pnlDesSintomas.add(rdbtnHinchaznEnEl, gbc_rdbtnHinchaznEnEl);
		
		rdbtnInflamacinEnEl = new JRadioButton("Inflamación en el abdomen");
		rdbtnInflamacinEnEl.addItemListener(new RdbtnInflamacinEnElItemListener());
		GridBagConstraints gbc_rdbtnInflamacinEnEl = new GridBagConstraints();
		gbc_rdbtnInflamacinEnEl.anchor = GridBagConstraints.WEST;
		gbc_rdbtnInflamacinEnEl.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnInflamacinEnEl.gridx = 0;
		gbc_rdbtnInflamacinEnEl.gridy = 6;
		pnlDesSintomas.add(rdbtnInflamacinEnEl, gbc_rdbtnInflamacinEnEl);
		
		rdbtnInflamacinEnPiernas = new JRadioButton("Inflamación en piernas, pie o tobillos");
		rdbtnInflamacinEnPiernas.addItemListener(new RdbtnInflamacinEnPiernasItemListener());
		GridBagConstraints gbc_rdbtnInflamacinEnPiernas = new GridBagConstraints();
		gbc_rdbtnInflamacinEnPiernas.anchor = GridBagConstraints.WEST;
		gbc_rdbtnInflamacinEnPiernas.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnInflamacinEnPiernas.gridx = 1;
		gbc_rdbtnInflamacinEnPiernas.gridy = 6;
		pnlDesSintomas.add(rdbtnInflamacinEnPiernas, gbc_rdbtnInflamacinEnPiernas);
		
		rdbtnInflamacinEnGanglios = new JRadioButton("Inflamación en ganglios del cuello");
		rdbtnInflamacinEnGanglios.addItemListener(new RdbtnInflamacinEnGangliosItemListener());
		GridBagConstraints gbc_rdbtnInflamacinEnGanglios = new GridBagConstraints();
		gbc_rdbtnInflamacinEnGanglios.anchor = GridBagConstraints.WEST;
		gbc_rdbtnInflamacinEnGanglios.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnInflamacinEnGanglios.gridx = 0;
		gbc_rdbtnInflamacinEnGanglios.gridy = 7;
		pnlDesSintomas.add(rdbtnInflamacinEnGanglios, gbc_rdbtnInflamacinEnGanglios);
		
		lblErupcionesORojeces = new JLabel("Erupciones o rojeces físicas");
		GridBagConstraints gbc_lblErupcionesORojeces = new GridBagConstraints();
		gbc_lblErupcionesORojeces.anchor = GridBagConstraints.WEST;
		gbc_lblErupcionesORojeces.insets = new Insets(0, 0, 5, 5);
		lblErupcionesORojeces.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblErupcionesORojeces.gridx = 0;
		gbc_lblErupcionesORojeces.gridy = 8;
		pnlDesSintomas.add(lblErupcionesORojeces, gbc_lblErupcionesORojeces);
		
		rdbtnOjosLenguaRojos = new JRadioButton("Ojos y lengua rojos");
		rdbtnOjosLenguaRojos.addItemListener(new RdbtnOjosLenguaRojosItemListener());
		GridBagConstraints gbc_rdbtnOjosLenguaRojos = new GridBagConstraints();
		gbc_rdbtnOjosLenguaRojos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnOjosLenguaRojos.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnOjosLenguaRojos.gridx = 0;
		gbc_rdbtnOjosLenguaRojos.gridy = 9;
		pnlDesSintomas.add(rdbtnOjosLenguaRojos, gbc_rdbtnOjosLenguaRojos);
		
		rdbtnErupcionesCutneasO = new JRadioButton("Erupciones cutáneas o descamación");
		rdbtnErupcionesCutneasO.addItemListener(new RdbtnErupcionesCutneasOItemListener());
		GridBagConstraints gbc_rdbtnErupcionesCutneasO = new GridBagConstraints();
		gbc_rdbtnErupcionesCutneasO.anchor = GridBagConstraints.WEST;
		gbc_rdbtnErupcionesCutneasO.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnErupcionesCutneasO.gridx = 1;
		gbc_rdbtnErupcionesCutneasO.gridy = 9;
		pnlDesSintomas.add(rdbtnErupcionesCutneasO, gbc_rdbtnErupcionesCutneasO);
		
		lblSistemaRespiratorio = new JLabel("Sistema respiratorio");
		lblSistemaRespiratorio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSistemaRespiratorio = new GridBagConstraints();
		gbc_lblSistemaRespiratorio.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaRespiratorio.insets = new Insets(0, 0, 5, 5);
		gbc_lblSistemaRespiratorio.gridx = 0;
		gbc_lblSistemaRespiratorio.gridy = 10;
		pnlDesSintomas.add(lblSistemaRespiratorio, gbc_lblSistemaRespiratorio);
		
		rdbtnDificultadParaRespirar = new JRadioButton("Dificultad para respirar");
		rdbtnDificultadParaRespirar.addItemListener(new RdbtnDificultadParaRespirarItemListener());
		GridBagConstraints gbc_rdbtnDificultadParaRespirar = new GridBagConstraints();
		gbc_rdbtnDificultadParaRespirar.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDificultadParaRespirar.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDificultadParaRespirar.gridx = 0;
		gbc_rdbtnDificultadParaRespirar.gridy = 11;
		pnlDesSintomas.add(rdbtnDificultadParaRespirar, gbc_rdbtnDificultadParaRespirar);
		
		rdbtnTos = new JRadioButton("Tos");
		rdbtnTos.addItemListener(new RdbtnTosItemListener());
		GridBagConstraints gbc_rdbtnTos = new GridBagConstraints();
		gbc_rdbtnTos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnTos.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnTos.gridx = 1;
		gbc_rdbtnTos.gridy = 11;
		pnlDesSintomas.add(rdbtnTos, gbc_rdbtnTos);
		
		rdbtnTosConSangre = new JRadioButton("Tos con sangre");
		rdbtnTosConSangre.addItemListener(new RdbtnTosConSangreItemListener());
		GridBagConstraints gbc_rdbtnTosConSangre = new GridBagConstraints();
		gbc_rdbtnTosConSangre.anchor = GridBagConstraints.WEST;
		gbc_rdbtnTosConSangre.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnTosConSangre.gridx = 0;
		gbc_rdbtnTosConSangre.gridy = 12;
		pnlDesSintomas.add(rdbtnTosConSangre, gbc_rdbtnTosConSangre);
		
		rdbtnInfeccionesRespiratorias = new JRadioButton("Infecciones respiratorias");
		rdbtnInfeccionesRespiratorias.addItemListener(new RdbtnInfeccionesRespiratoriasItemListener());
		GridBagConstraints gbc_rdbtnInfeccionesRespiratorias = new GridBagConstraints();
		gbc_rdbtnInfeccionesRespiratorias.anchor = GridBagConstraints.WEST;
		gbc_rdbtnInfeccionesRespiratorias.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnInfeccionesRespiratorias.gridx = 1;
		gbc_rdbtnInfeccionesRespiratorias.gridy = 12;
		pnlDesSintomas.add(rdbtnInfeccionesRespiratorias, gbc_rdbtnInfeccionesRespiratorias);
		
		lblSistemaUrinario = new JLabel("Sistema urinario");
		GridBagConstraints gbc_lblSistemaUrinario = new GridBagConstraints();
		gbc_lblSistemaUrinario.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaUrinario.insets = new Insets(0, 0, 5, 5);
		lblSistemaUrinario.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblSistemaUrinario.gridx = 0;
		gbc_lblSistemaUrinario.gridy = 13;
		pnlDesSintomas.add(lblSistemaUrinario, gbc_lblSistemaUrinario);
		
		rdbtnMiccinExcesivaDurante = new JRadioButton("Micción excesiva durante la noche");
		rdbtnMiccinExcesivaDurante.addItemListener(new RdbtnMiccinExcesivaDuranteItemListener());
		GridBagConstraints gbc_rdbtnMiccinExcesivaDurante = new GridBagConstraints();
		gbc_rdbtnMiccinExcesivaDurante.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMiccinExcesivaDurante.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMiccinExcesivaDurante.gridx = 0;
		gbc_rdbtnMiccinExcesivaDurante.gridy = 14;
		pnlDesSintomas.add(rdbtnMiccinExcesivaDurante, gbc_rdbtnMiccinExcesivaDurante);
		
		rdbtnRetencinDeLquidos = new JRadioButton("Retención de líquidos");
		rdbtnRetencinDeLquidos.addItemListener(new RdbtnRetencinDeLquidosItemListener());
		GridBagConstraints gbc_rdbtnRetencinDeLquidos = new GridBagConstraints();
		gbc_rdbtnRetencinDeLquidos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnRetencinDeLquidos.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnRetencinDeLquidos.gridx = 1;
		gbc_rdbtnRetencinDeLquidos.gridy = 14;
		pnlDesSintomas.add(rdbtnRetencinDeLquidos, gbc_rdbtnRetencinDeLquidos);
		
		rdbtnBajaProduccinDe = new JRadioButton("Baja producción de orina");
		rdbtnBajaProduccinDe.addItemListener(new RdbtnBajaProduccinDeItemListener());
		GridBagConstraints gbc_rdbtnBajaProduccinDe = new GridBagConstraints();
		gbc_rdbtnBajaProduccinDe.anchor = GridBagConstraints.WEST;
		gbc_rdbtnBajaProduccinDe.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnBajaProduccinDe.gridx = 0;
		gbc_rdbtnBajaProduccinDe.gridy = 15;
		pnlDesSintomas.add(rdbtnBajaProduccinDe, gbc_rdbtnBajaProduccinDe);
		
		lblSistemaDigestivo = new JLabel("Sistema digestivo");
		GridBagConstraints gbc_lblSistemaDigestivo = new GridBagConstraints();
		gbc_lblSistemaDigestivo.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaDigestivo.insets = new Insets(0, 0, 5, 5);
		lblSistemaDigestivo.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblSistemaDigestivo.gridx = 0;
		gbc_lblSistemaDigestivo.gridy = 16;
		pnlDesSintomas.add(lblSistemaDigestivo, gbc_lblSistemaDigestivo);
		
		rdbtnGanasDeVomitar = new JRadioButton("Ganas de vomitar");
		rdbtnGanasDeVomitar.addItemListener(new RdbtnGanasDeVomitarItemListener());
		GridBagConstraints gbc_rdbtnGanasDeVomitar = new GridBagConstraints();
		gbc_rdbtnGanasDeVomitar.anchor = GridBagConstraints.WEST;
		gbc_rdbtnGanasDeVomitar.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnGanasDeVomitar.gridx = 0;
		gbc_rdbtnGanasDeVomitar.gridy = 17;
		pnlDesSintomas.add(rdbtnGanasDeVomitar, gbc_rdbtnGanasDeVomitar);
		
		rdbtnFaltaDeApetito = new JRadioButton("Falta de apetito");
		rdbtnFaltaDeApetito.addItemListener(new RdbtnFaltaDeApetitoItemListener());
		GridBagConstraints gbc_rdbtnFaltaDeApetito = new GridBagConstraints();
		gbc_rdbtnFaltaDeApetito.anchor = GridBagConstraints.WEST;
		gbc_rdbtnFaltaDeApetito.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnFaltaDeApetito.gridx = 1;
		gbc_rdbtnFaltaDeApetito.gridy = 17;
		pnlDesSintomas.add(rdbtnFaltaDeApetito, gbc_rdbtnFaltaDeApetito);
		
		lblOtrosSntomas = new JLabel("Otros síntomas");
		GridBagConstraints gbc_lblOtrosSntomas = new GridBagConstraints();
		gbc_lblOtrosSntomas.anchor = GridBagConstraints.WEST;
		gbc_lblOtrosSntomas.insets = new Insets(0, 0, 5, 5);
		lblOtrosSntomas.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblOtrosSntomas.gridx = 0;
		gbc_lblOtrosSntomas.gridy = 18;
		pnlDesSintomas.add(lblOtrosSntomas, gbc_lblOtrosSntomas);
		
		rdbtnCansancio = new JRadioButton("Cansancio");
		rdbtnCansancio.addItemListener(new RdbtnCansancioItemListener());
		GridBagConstraints gbc_rdbtnCansancio = new GridBagConstraints();
		gbc_rdbtnCansancio.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCansancio.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCansancio.gridx = 0;
		gbc_rdbtnCansancio.gridy = 19;
		pnlDesSintomas.add(rdbtnCansancio, gbc_rdbtnCansancio);
		
		rdbtnFiebre_1 = new JRadioButton("Fiebre");
		rdbtnFiebre_1.addItemListener(new RdbtnFiebre_1ItemListener());
		GridBagConstraints gbc_rdbtnFiebre_1 = new GridBagConstraints();
		gbc_rdbtnFiebre_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnFiebre_1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnFiebre_1.gridx = 1;
		gbc_rdbtnFiebre_1.gridy = 19;
		pnlDesSintomas.add(rdbtnFiebre_1, gbc_rdbtnFiebre_1);
		
		rdbtnVrtigo = new JRadioButton("Vértigo");
		rdbtnVrtigo.addItemListener(new RdbtnVrtigoItemListener());
		GridBagConstraints gbc_rdbtnVrtigo = new GridBagConstraints();
		gbc_rdbtnVrtigo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnVrtigo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnVrtigo.gridx = 0;
		gbc_rdbtnVrtigo.gridy = 20;
		pnlDesSintomas.add(rdbtnVrtigo, gbc_rdbtnVrtigo);
		
		rdbtnMareos = new JRadioButton("Mareos");
		rdbtnMareos.addItemListener(new RdbtnMareosItemListener());
		GridBagConstraints gbc_rdbtnMareos = new GridBagConstraints();
		gbc_rdbtnMareos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMareos.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnMareos.gridx = 1;
		gbc_rdbtnMareos.gridy = 20;
		pnlDesSintomas.add(rdbtnMareos, gbc_rdbtnMareos);
		
		rdbtnPrdidaDeConocimiento = new JRadioButton("Pérdida de conocimiento");
		rdbtnPrdidaDeConocimiento.addItemListener(new RdbtnPrdidaDeConocimientoItemListener());
		GridBagConstraints gbc_rdbtnPrdidaDeConocimiento = new GridBagConstraints();
		gbc_rdbtnPrdidaDeConocimiento.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPrdidaDeConocimiento.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPrdidaDeConocimiento.gridx = 0;
		gbc_rdbtnPrdidaDeConocimiento.gridy = 21;
		pnlDesSintomas.add(rdbtnPrdidaDeConocimiento, gbc_rdbtnPrdidaDeConocimiento);
		
		rdbtnDebilidad = new JRadioButton("Debilidad");
		rdbtnDebilidad.addItemListener(new RdbtnDebilidadItemListener());
		GridBagConstraints gbc_rdbtnDebilidad = new GridBagConstraints();
		gbc_rdbtnDebilidad.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDebilidad.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnDebilidad.gridx = 1;
		gbc_rdbtnDebilidad.gridy = 21;
		pnlDesSintomas.add(rdbtnDebilidad, gbc_rdbtnDebilidad);
		
		rdbtnPalidez = new JRadioButton("Palidez");
		rdbtnPalidez.addItemListener(new RdbtnPalidezItemListener());
		GridBagConstraints gbc_rdbtnPalidez = new GridBagConstraints();
		gbc_rdbtnPalidez.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPalidez.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPalidez.gridx = 0;
		gbc_rdbtnPalidez.gridy = 22;
		pnlDesSintomas.add(rdbtnPalidez, gbc_rdbtnPalidez);
		
		rdbtnSudoracin = new JRadioButton("Sudoración");
		rdbtnSudoracin.addItemListener(new RdbtnSudoracinItemListener());
		GridBagConstraints gbc_rdbtnSudoracin = new GridBagConstraints();
		gbc_rdbtnSudoracin.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSudoracin.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnSudoracin.gridx = 1;
		gbc_rdbtnSudoracin.gridy = 22;
		pnlDesSintomas.add(rdbtnSudoracin, gbc_rdbtnSudoracin);
		
		rdbtnMembranasMucosasEn = new JRadioButton("Membranas mucosas en la lengua");
		rdbtnMembranasMucosasEn.addItemListener(new RdbtnMembranasMucosasEnItemListener());
		GridBagConstraints gbc_rdbtnMembranasMucosasEn = new GridBagConstraints();
		gbc_rdbtnMembranasMucosasEn.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMembranasMucosasEn.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnMembranasMucosasEn.gridx = 0;
		gbc_rdbtnMembranasMucosasEn.gridy = 23;
		pnlDesSintomas.add(rdbtnMembranasMucosasEn, gbc_rdbtnMembranasMucosasEn);
		
		rdbtnDescamacin = new JRadioButton("Descamación");
		rdbtnDescamacin.addItemListener(new RdbtnDescamacinItemListener());
		GridBagConstraints gbc_rdbtnDescamacin = new GridBagConstraints();
		gbc_rdbtnDescamacin.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDescamacin.gridx = 1;
		gbc_rdbtnDescamacin.gridy = 23;
		pnlDesSintomas.add(rdbtnDescamacin, gbc_rdbtnDescamacin);
		
		btnDiagnosticar = new JButton("Diagnosticar");
		btnDiagnosticar.addActionListener(new BtnDiagnosticarActionListener());
		btnDiagnosticar.setIcon(new ImageIcon(PanelDiagnosticar.class.getResource("/presentacion/Imagenes/medicine-briefcase (1).png")));
		GridBagConstraints gbc_btnDiagnosticar = new GridBagConstraints();
		gbc_btnDiagnosticar.anchor = GridBagConstraints.SOUTH;
		gbc_btnDiagnosticar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDiagnosticar.insets = new Insets(0, 0, 5, 0);
		gbc_btnDiagnosticar.gridx = 2;
		gbc_btnDiagnosticar.gridy = 0;
		pnlSintomas.add(btnDiagnosticar, gbc_btnDiagnosticar);
		
		btnLimpiarSeleccion = new JButton("Limpiar Selecci\u00F3n");
		btnLimpiarSeleccion.addActionListener(new BtnLimpiarSeleccionActionListener());
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

	private class RdbtnArritmiasItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			 if (e.getStateChange() == ItemEvent.SELECTED) {
			        diagnostico.setArritmias(true);
			    }
			    else if (e.getStateChange() == ItemEvent.DESELECTED) {
			    	diagnostico.setArritmias(false);
			    }
		}
	}
	private class RdbtnAlteracionesDelRitmoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setAlteracionesritmo(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setAlteracionesritmo(false);
		    }
		}
	}
	private class RdbtnPulsoIrregularOItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setPusloirregular(true);;
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setPusloirregular(false);
		    }
		}
	}
	private class RdbtnDolorDePechoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDolordepecho(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDolordepecho(false);
		    }
		}
	}
	private class RdbtnDolorDeBrazoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDolorbrazoizq(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDolorbrazoizq(false);
		    }
		}
	}
	private class RdbtnHinchaznEnPiesItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setHinchazonpies(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setHinchazonpies(false);
		    }
		}
	}
	private class RdbtnHinchaznEnElItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setHinchazonabdomen(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setHinchazonabdomen(false);
		    }
		}
	}
	private class RdbtnInflamacinEnElItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInflamacionabdomen(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInflamacionabdomen(false);
		    }
		}
	}
	private class RdbtnInflamacinEnPiernasItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInflamacionpiernas(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInflamacionpiernas(false);
		    }
		}
	}
	private class RdbtnInflamacinEnGangliosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInflamancionganglios(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInflamancionganglios(false);
		    }
		}
	}
	private class RdbtnOjosLenguaRojosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setOjoslenguarojos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setOjoslenguarojos(false);
		    }
		}
	}
	private class RdbtnErupcionesCutneasOItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setErupcionescutaneas(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setErupcionescutaneas(false);
		    }
		}
	}
	private class RdbtnMiccinExcesivaDuranteItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setMiccionexcesiva(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setMiccionexcesiva(false);
		    }
		}
	}
	private class RdbtnRetencinDeLquidosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setRetencionliquidos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setRetencionliquidos(false);
		    }
		}
	}
	private class RdbtnBajaProduccinDeItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setBajaproduccionorina(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setBajaproduccionorina(false);
		    }
		}
	}
	private class RdbtnGanasDeVomitarItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setGanasvomitar(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setGanasvomitar(false);
		    }
		}
	}
	private class RdbtnFaltaDeApetitoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setFaltaapetito(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setFaltaapetito(false);
		    }
		}
	}
	private class RdbtnCansancioItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setCansancio(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setCansancio(false);
		    }
		}
	}
	private class RdbtnFiebre_1ItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setFiebre(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setFiebre(false);
		    }
		}
	}
	private class RdbtnVrtigoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setVertigo(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setVertigo(false);
		    }
		}
	}
	private class RdbtnMareosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setMareos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setMareos(false);
		    }
		}
	}
	private class RdbtnPrdidaDeConocimientoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setPerdidaconocimiento(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setPerdidaconocimiento(false);
		    }
		}
	}
	private class RdbtnDebilidadItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDebilidad(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDebilidad(false);
		    }
		}
	}
	private class RdbtnPalidezItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setPalidez(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setPalidez(false);
		    }
		}
	}
	private class RdbtnSudoracinItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setSudoracion(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setSudoracion(false);
		    }
		}
	}
	private class RdbtnMembranasMucosasEnItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setMembranasmucosas(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setMembranasmucosas(false);
		    }
		}
	}
	private class BtnLimpiarSeleccionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			rdbtnArritmias.setSelected(false);
			rdbtnAlteracionesDelRitmo.setSelected(false);
			rdbtnPulsoIrregularO.setSelected(false);
			rdbtnDolorDePecho.setSelected(false);
			rdbtnDolorDeBrazo.setSelected(false);
			rdbtnHinchaznEnPies.setSelected(false);
			rdbtnHinchaznEnEl.setSelected(false);
			rdbtnInflamacinEnEl.setSelected(false);
			rdbtnInflamacinEnPiernas.setSelected(false);
			rdbtnInflamacinEnGanglios.setSelected(false);
			rdbtnErupcionesCutneasO.setSelected(false);
			rdbtnOjosLenguaRojos.setSelected(false);
			rdbtnMiccinExcesivaDurante.setSelected(false);
			rdbtnRetencinDeLquidos.setSelected(false);
			rdbtnBajaProduccinDe.setSelected(false);
			rdbtnGanasDeVomitar.setSelected(false);
			rdbtnFaltaDeApetito.setSelected(false);
			rdbtnMembranasMucosasEn.setSelected(false);
			rdbtnPalidez.setSelected(false);
			rdbtnSudoracin.setSelected(false);
			rdbtnPrdidaDeConocimiento.setSelected(false);
			rdbtnDebilidad.setSelected(false);
			rdbtnVrtigo.setSelected(false);
			rdbtnMareos.setSelected(false);
			rdbtnCansancio.setSelected(false);
			rdbtnFiebre_1.setSelected(false);
			rdbtnDescamacin.setSelected(false);;
			
			
		}
	}
	private class BtnDiagnosticarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(diagnostico.isDolordepecho() && diagnostico.isDolorbrazoizq() && diagnostico.isSudoracion() 
					&& diagnostico.isMareos() && diagnostico.isGanasvomitar() && diagnostico.isDificultadrespirar() 
					&& diagnostico.isPerdidaconocimiento()){
				diagnostico.setDiagnostico("Infarto de miocardio o ataque cardíaco.");
				diagnostico.setTratamiento("Se recomienda una dieta para la enfermedad coronaria. "
						+ "Puede recibir nitroglicerina y morfina para el dolor y medicamento para los coágulos de sangre. "
						+ "Hay procedimientos de emergencia como la angioplastia.");
			}else if(diagnostico.isDolordepecho() && diagnostico.isDificultadrespirar() && diagnostico.isCansancio() 
					&& diagnostico.isMareos() && diagnostico.isTos() && diagnostico.isPusloirregular()
					&& diagnostico.isFaltaapetito() && diagnostico.isHinchazonpies()){
				diagnostico.setDiagnostico("Miocardiopatía dilatada.");
				diagnostico.setTratamiento("Limitar la cantidada de bebida alcohólica y la cantidad de sal (sodio)  en la dieta. "
						+ "Tomar medicamentos para ayudar a evitar que la insuficiencia cardíaca empeore. Pueden llevarse a cabo "
						+ "procedimientos como la implantación de un marcapasos, un desfibrilador, una cirugía de revascularización "
						+ "coronaria o una angioplastia para mejorar el flujo de sangre y reparación o reemplazo de válvulas.");
				
			}else if(diagnostico.isDolordepecho() && diagnostico.isPerdidaconocimiento() && diagnostico.isCansancio() 
					&& diagnostico.isMareos() && diagnostico.isVertigo() && diagnostico.isDificultadrespirar()
					&& diagnostico.isPusloirregular()){
				diagnostico.setDiagnostico("Miocardiopatía hipertrófica.");
				diagnostico.setTratamiento("Medicamentos para tratar el ritmo anormal, anticoagulantes, usar un marcapasos permanente "
						+ "para controlar los latidos cardíacos o un desfibrilador que reconozca el ritmo cardíaco.");
				
			}else if(diagnostico.isHinchazonabdomen() && diagnostico.isDificultadrespirar() && diagnostico.isRetencionliquidos()
					&& diagnostico.isTos() && diagnostico.isFaltaapetito() && diagnostico.isPusloirregular() 
					&& diagnostico.isHinchazonpies() && diagnostico.isBajaproduccionorina()){
				diagnostico.setDiagnostico("Miocardiopatía restrictiva.");
				diagnostico.setTratamiento("Se trata la afección causante. Para controlar los síntomas y prevenir problemas se pueden usar "
						+ "medicamentos anticoagulantes, quimioterapia, diuréticos para eliminar líquidos y medicamentos para controlar el "
						+ "ritmo cardíaco.");
				
			}else if(diagnostico.isDificultadrespirar() && diagnostico.isAlteracionesritmo() && diagnostico.isTos() 
					&& diagnostico.isCansancio() && diagnostico.isHinchazonpies() && diagnostico.isInfeccionesrespirar()
					&& diagnostico.isDolordepecho()){
				diagnostico.setDiagnostico("Estenosis mitral.");
				diagnostico.setTratamiento("Las personas con síntomas leves o sin ningún síntoma no necesitan tratamiento. En caso de síntomas "
						+ "graves, los medicamentos que se pueden utilizar son diuréticos, betabloqueadores, inhibidores, digoxina, medicamentos "
						+ "para tratar el ritmo cardíaco y anticoagulantes.");
				
			}else if(diagnostico.isDificultadrespirar() && diagnostico.isArritmias() && diagnostico.isTos()
					&& diagnostico.isCansancio() && diagnostico.isMiccionexcesiva() && diagnostico.isPusloirregular()){
				diagnostico.setDiagnostico("Insuficiencia mitral.");
				diagnostico.setTratamiento("A las personas con hipertensión arterial se les puede administrar medicamentos para reducir la tensión "
						+ "sobre el corazón y aliviar los síntomas. Otros medicamentos que se pueden utilizar son betabloqueadores, inhibidores, "
						+ "anticoagulantes, medicamentos para controlar el ritmo cardíaco y diuréticos. También ayuda una dieta baja en sal (sodio) "
						+ "y reducir la actividad. Se puede necesitar cirugía para reparar o reemplazar la válvula.");
			}else if(diagnostico.isDolordepecho() && diagnostico.isTossangre() && diagnostico.isDificultadrespirar()
					&& diagnostico.isCansancio() && diagnostico.isVertigo() && diagnostico.isMareos()){
				diagnostico.setDiagnostico("Estenosis aórtica.");
				diagnostico.setTratamiento("No practicar deportes competitivos, uso de medicamentos para controlar el ritmo cardíaco, como diuréticos, "
						+ "nitratos y betabloqueadores. También tiene que tratarse la hipertensión arterial. La cirugía también puede usarse en caso de "
						+ "gravedad como el reparo o reemplazo de la válvula");
				
			}else if(diagnostico.isPusloirregular() && diagnostico.isDolordepecho() && diagnostico.isMareos() 
					&& diagnostico.isCansancio() && diagnostico.isDificultadrespirar() && diagnostico.isDebilidad()
					&& diagnostico.isHinchazonpies() && diagnostico.isHinchazonabdomen()){
				diagnostico.setDiagnostico("Insuficiencia aórtica.");
				diagnostico.setTratamiento("Si la presión arterial es alta, se recomienda usar medicamentos antihipertensivos para ayuda a disminuir "
						+ "los síntomas. ");
			}else if(diagnostico.isDolordepecho() && diagnostico.isMareos() && diagnostico.isVertigo() 
					&& diagnostico.isPalidez() && diagnostico.isDificultadrespirar() && diagnostico.isSudoracion()
					&& diagnostico.isPusloirregular()){
				diagnostico.setDiagnostico("Arritmia.");
				diagnostico.setTratamiento("Si la arritmia es grave, se usan técnicas como la terapia de shock eléctrico, la implantación de un marcapasos "
						+ "cardíaco temporal o el uso de medicamentos por vena o por vía oral.");
			}else if(diagnostico.isMiccionexcesiva() && diagnostico.isCansancio() && diagnostico.isDificultadrespirar()
					&& diagnostico.isInflamacionabdomen() && diagnostico.isInflamacionpiernas()){
				diagnostico.setDiagnostico("Amiloidosis cardíaca.");
				diagnostico.setTratamiento("Reducción de sal (sodio) y líquidos en la dieta. Uso de medicamentos como diuréticos para eliminar líquidos, "
						+ "digoxina o betabloqueadores. Otros tratamientos pueden abarcar quimioterapia, uso de desfibriladores, marcapasos o medicamentos "
						+ "antiinflamatorios.");
				
			}else if(diagnostico.isFiebre() && diagnostico.isOjoslenguarojos() && diagnostico.isMembranasmucosas() && diagnostico.isHinchazonpies()
					&& diagnostico.isErupcionescutaneas() && diagnostico.isInflamancionganglios() && diagnostico.isDescamacion()){
				diagnostico.setDiagnostico("Enfermedad de Kawasaki.");
				diagnostico.setTratamiento("El tratamiento estándar para esta enfermedad es la gammaglobulina intravenosa que se administra en dosis altas. "
						+ "También se administra el ácido acetilsalicílico a la vez.");
				
			}else{
				diagnostico.setDiagnostico("Los síntomas seleccionados no especifican un diagnóstico concluyente.");
			}
			taDiagnostico.setText(diagnostico.getDiagnostico());
			taTratamiento.setText(diagnostico.getTratamiento());
			
		}
	}
	private class RdbtnDescamacinItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDescamacion(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDescamacion(false);
		    }
		}
	}
	private class RdbtnDificultadParaRespirarItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDificultadrespirar(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDificultadrespirar(false);
		    }
		}
	}
	private class RdbtnTosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setTos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setTos(false);
		    }
		}
	}
	private class RdbtnTosConSangreItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setTossangre(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setTossangre(false);
		    }
		}
	}
	private class RdbtnInfeccionesRespiratoriasItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInfeccionesrespirar(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInfeccionesrespirar(false);
		    }
		}
	}

	
}
