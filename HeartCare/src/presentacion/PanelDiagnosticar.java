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

public class PanelDiagnosticar extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel pnlSintomas;
	private JScrollPane scrollPane;
	private JButton btnDiagnosticar;
	private JButton btnLimpiarSeleccion;
	private JPanel pnlDiagnostico;
	private JScrollPane scrollPane_1;
	private JTextArea taDiagnostico;
	private JScrollPane scrollPane_2;
	private JTextArea taTratamiento;
	private JButton btnGenerarInforme;
	private JPanel panel;
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
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Seleccione los s\u00EDntomas para establecer un diagn\u00F3stico preliminar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		pnlSintomas.add(scrollPane, gbc_scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblProblemasDeCorazn = new JLabel("Problemas de corazón");
		lblProblemasDeCorazn.setBackground(Color.LIGHT_GRAY);
		lblProblemasDeCorazn.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblProblemasDeCorazn = new GridBagConstraints();
		gbc_lblProblemasDeCorazn.anchor = GridBagConstraints.WEST;
		gbc_lblProblemasDeCorazn.insets = new Insets(0, 0, 5, 5);
		lblProblemasDeCorazn.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblProblemasDeCorazn.gridx = 0;
		gbc_lblProblemasDeCorazn.gridy = 0;
		panel.add(lblProblemasDeCorazn, gbc_lblProblemasDeCorazn);
		
		rdbtnArritmias = new JRadioButton("Arritmias");
		rdbtnArritmias.addItemListener(new RdbtnArritmiasItemListener());
		rdbtnArritmias.setHorizontalTextPosition(SwingConstants.RIGHT);
		GridBagConstraints gbc_rdbtnArritmias = new GridBagConstraints();
		gbc_rdbtnArritmias.anchor = GridBagConstraints.WEST;
		gbc_rdbtnArritmias.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnArritmias.gridx = 0;
		gbc_rdbtnArritmias.gridy = 1;
		panel.add(rdbtnArritmias, gbc_rdbtnArritmias);
		
		rdbtnAlteracionesDelRitmo = new JRadioButton("Alteraciones del ritmo cardíaco");
		rdbtnAlteracionesDelRitmo.addItemListener(new RdbtnAlteracionesDelRitmoItemListener());
		GridBagConstraints gbc_rdbtnAlteracionesDelRitmo = new GridBagConstraints();
		gbc_rdbtnAlteracionesDelRitmo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAlteracionesDelRitmo.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnAlteracionesDelRitmo.gridx = 1;
		gbc_rdbtnAlteracionesDelRitmo.gridy = 1;
		panel.add(rdbtnAlteracionesDelRitmo, gbc_rdbtnAlteracionesDelRitmo);
		
		rdbtnPulsoIrregularO = new JRadioButton("Pulso irregular o acelerado");
		rdbtnPulsoIrregularO.addItemListener(new RdbtnPulsoIrregularOItemListener());
		GridBagConstraints gbc_rdbtnPulsoIrregularO = new GridBagConstraints();
		gbc_rdbtnPulsoIrregularO.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPulsoIrregularO.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPulsoIrregularO.gridx = 0;
		gbc_rdbtnPulsoIrregularO.gridy = 2;
		panel.add(rdbtnPulsoIrregularO, gbc_rdbtnPulsoIrregularO);
		
		lblDoloresOHinchazones = new JLabel("Dolores o hinchazones físicos");
		GridBagConstraints gbc_lblDoloresOHinchazones = new GridBagConstraints();
		gbc_lblDoloresOHinchazones.anchor = GridBagConstraints.WEST;
		gbc_lblDoloresOHinchazones.insets = new Insets(0, 0, 5, 5);
		lblDoloresOHinchazones.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblDoloresOHinchazones.gridx = 0;
		gbc_lblDoloresOHinchazones.gridy = 3;
		panel.add(lblDoloresOHinchazones, gbc_lblDoloresOHinchazones);
		
		rdbtnDolorDePecho = new JRadioButton("Dolor de pecho");
		rdbtnDolorDePecho.addItemListener(new RdbtnDolorDePechoItemListener());
		GridBagConstraints gbc_rdbtnDolorDePecho = new GridBagConstraints();
		gbc_rdbtnDolorDePecho.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDolorDePecho.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDolorDePecho.gridx = 0;
		gbc_rdbtnDolorDePecho.gridy = 4;
		panel.add(rdbtnDolorDePecho, gbc_rdbtnDolorDePecho);
		
		rdbtnDolorDeBrazo = new JRadioButton("Dolor de brazo izquierdo, de cuello, de mandíbula o de espalda");
		rdbtnDolorDeBrazo.addItemListener(new RdbtnDolorDeBrazoItemListener());
		GridBagConstraints gbc_rdbtnDolorDeBrazo = new GridBagConstraints();
		gbc_rdbtnDolorDeBrazo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDolorDeBrazo.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnDolorDeBrazo.gridx = 1;
		gbc_rdbtnDolorDeBrazo.gridy = 4;
		panel.add(rdbtnDolorDeBrazo, gbc_rdbtnDolorDeBrazo);
		
		rdbtnHinchaznEnPies = new JRadioButton("Hinchazón en pies, tobillos o ambos");
		rdbtnHinchaznEnPies.addItemListener(new RdbtnHinchaznEnPiesItemListener());
		GridBagConstraints gbc_rdbtnHinchaznEnPies = new GridBagConstraints();
		gbc_rdbtnHinchaznEnPies.anchor = GridBagConstraints.WEST;
		gbc_rdbtnHinchaznEnPies.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnHinchaznEnPies.gridx = 0;
		gbc_rdbtnHinchaznEnPies.gridy = 5;
		panel.add(rdbtnHinchaznEnPies, gbc_rdbtnHinchaznEnPies);
		
		rdbtnHinchaznEnEl = new JRadioButton("Hinchazón en el abdomen");
		rdbtnHinchaznEnEl.addItemListener(new RdbtnHinchaznEnElItemListener());
		GridBagConstraints gbc_rdbtnHinchaznEnEl = new GridBagConstraints();
		gbc_rdbtnHinchaznEnEl.anchor = GridBagConstraints.WEST;
		gbc_rdbtnHinchaznEnEl.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnHinchaznEnEl.gridx = 1;
		gbc_rdbtnHinchaznEnEl.gridy = 5;
		panel.add(rdbtnHinchaznEnEl, gbc_rdbtnHinchaznEnEl);
		
		rdbtnInflamacinEnEl = new JRadioButton("Inflamación en el abdomen");
		rdbtnInflamacinEnEl.addItemListener(new RdbtnInflamacinEnElItemListener());
		GridBagConstraints gbc_rdbtnInflamacinEnEl = new GridBagConstraints();
		gbc_rdbtnInflamacinEnEl.anchor = GridBagConstraints.WEST;
		gbc_rdbtnInflamacinEnEl.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnInflamacinEnEl.gridx = 0;
		gbc_rdbtnInflamacinEnEl.gridy = 6;
		panel.add(rdbtnInflamacinEnEl, gbc_rdbtnInflamacinEnEl);
		
		rdbtnInflamacinEnPiernas = new JRadioButton("Inflamación en piernas, pie o tobillos");
		rdbtnInflamacinEnPiernas.addItemListener(new RdbtnInflamacinEnPiernasItemListener());
		GridBagConstraints gbc_rdbtnInflamacinEnPiernas = new GridBagConstraints();
		gbc_rdbtnInflamacinEnPiernas.anchor = GridBagConstraints.WEST;
		gbc_rdbtnInflamacinEnPiernas.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnInflamacinEnPiernas.gridx = 1;
		gbc_rdbtnInflamacinEnPiernas.gridy = 6;
		panel.add(rdbtnInflamacinEnPiernas, gbc_rdbtnInflamacinEnPiernas);
		
		rdbtnInflamacinEnGanglios = new JRadioButton("Inflamación en ganglios del cuello");
		rdbtnInflamacinEnGanglios.addItemListener(new RdbtnInflamacinEnGangliosItemListener());
		GridBagConstraints gbc_rdbtnInflamacinEnGanglios = new GridBagConstraints();
		gbc_rdbtnInflamacinEnGanglios.anchor = GridBagConstraints.WEST;
		gbc_rdbtnInflamacinEnGanglios.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnInflamacinEnGanglios.gridx = 0;
		gbc_rdbtnInflamacinEnGanglios.gridy = 7;
		panel.add(rdbtnInflamacinEnGanglios, gbc_rdbtnInflamacinEnGanglios);
		
		lblErupcionesORojeces = new JLabel("Erupciones o rojeces físicas");
		GridBagConstraints gbc_lblErupcionesORojeces = new GridBagConstraints();
		gbc_lblErupcionesORojeces.anchor = GridBagConstraints.WEST;
		gbc_lblErupcionesORojeces.insets = new Insets(0, 0, 5, 5);
		lblErupcionesORojeces.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblErupcionesORojeces.gridx = 0;
		gbc_lblErupcionesORojeces.gridy = 8;
		panel.add(lblErupcionesORojeces, gbc_lblErupcionesORojeces);
		
		rdbtnOjosLenguaRojos = new JRadioButton("Ojos y lengua rojos");
		rdbtnOjosLenguaRojos.addItemListener(new RdbtnOjosLenguaRojosItemListener());
		GridBagConstraints gbc_rdbtnOjosLenguaRojos = new GridBagConstraints();
		gbc_rdbtnOjosLenguaRojos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnOjosLenguaRojos.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnOjosLenguaRojos.gridx = 0;
		gbc_rdbtnOjosLenguaRojos.gridy = 9;
		panel.add(rdbtnOjosLenguaRojos, gbc_rdbtnOjosLenguaRojos);
		
		rdbtnErupcionesCutneasO = new JRadioButton("Erupciones cutáneas o descamación");
		rdbtnErupcionesCutneasO.addItemListener(new RdbtnErupcionesCutneasOItemListener());
		GridBagConstraints gbc_rdbtnErupcionesCutneasO = new GridBagConstraints();
		gbc_rdbtnErupcionesCutneasO.anchor = GridBagConstraints.WEST;
		gbc_rdbtnErupcionesCutneasO.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnErupcionesCutneasO.gridx = 1;
		gbc_rdbtnErupcionesCutneasO.gridy = 9;
		panel.add(rdbtnErupcionesCutneasO, gbc_rdbtnErupcionesCutneasO);
		
		lblSistemaUrinario = new JLabel("Sistema urinario");
		GridBagConstraints gbc_lblSistemaUrinario = new GridBagConstraints();
		gbc_lblSistemaUrinario.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaUrinario.insets = new Insets(0, 0, 5, 5);
		lblSistemaUrinario.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblSistemaUrinario.gridx = 0;
		gbc_lblSistemaUrinario.gridy = 10;
		panel.add(lblSistemaUrinario, gbc_lblSistemaUrinario);
		
		rdbtnMiccinExcesivaDurante = new JRadioButton("Micción excesiva durante la noche");
		rdbtnMiccinExcesivaDurante.addItemListener(new RdbtnMiccinExcesivaDuranteItemListener());
		GridBagConstraints gbc_rdbtnMiccinExcesivaDurante = new GridBagConstraints();
		gbc_rdbtnMiccinExcesivaDurante.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMiccinExcesivaDurante.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMiccinExcesivaDurante.gridx = 0;
		gbc_rdbtnMiccinExcesivaDurante.gridy = 11;
		panel.add(rdbtnMiccinExcesivaDurante, gbc_rdbtnMiccinExcesivaDurante);
		
		rdbtnRetencinDeLquidos = new JRadioButton("Retención de líquidos");
		rdbtnRetencinDeLquidos.addItemListener(new RdbtnRetencinDeLquidosItemListener());
		GridBagConstraints gbc_rdbtnRetencinDeLquidos = new GridBagConstraints();
		gbc_rdbtnRetencinDeLquidos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnRetencinDeLquidos.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnRetencinDeLquidos.gridx = 1;
		gbc_rdbtnRetencinDeLquidos.gridy = 11;
		panel.add(rdbtnRetencinDeLquidos, gbc_rdbtnRetencinDeLquidos);
		
		rdbtnBajaProduccinDe = new JRadioButton("Baja producción de orina");
		rdbtnBajaProduccinDe.addItemListener(new RdbtnBajaProduccinDeItemListener());
		GridBagConstraints gbc_rdbtnBajaProduccinDe = new GridBagConstraints();
		gbc_rdbtnBajaProduccinDe.anchor = GridBagConstraints.WEST;
		gbc_rdbtnBajaProduccinDe.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnBajaProduccinDe.gridx = 0;
		gbc_rdbtnBajaProduccinDe.gridy = 12;
		panel.add(rdbtnBajaProduccinDe, gbc_rdbtnBajaProduccinDe);
		
		lblSistemaDigestivo = new JLabel("Sistema digestivo");
		GridBagConstraints gbc_lblSistemaDigestivo = new GridBagConstraints();
		gbc_lblSistemaDigestivo.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaDigestivo.insets = new Insets(0, 0, 5, 5);
		lblSistemaDigestivo.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblSistemaDigestivo.gridx = 0;
		gbc_lblSistemaDigestivo.gridy = 13;
		panel.add(lblSistemaDigestivo, gbc_lblSistemaDigestivo);
		
		rdbtnGanasDeVomitar = new JRadioButton("Ganas de vomitar");
		rdbtnGanasDeVomitar.addItemListener(new RdbtnGanasDeVomitarItemListener());
		GridBagConstraints gbc_rdbtnGanasDeVomitar = new GridBagConstraints();
		gbc_rdbtnGanasDeVomitar.anchor = GridBagConstraints.WEST;
		gbc_rdbtnGanasDeVomitar.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnGanasDeVomitar.gridx = 0;
		gbc_rdbtnGanasDeVomitar.gridy = 14;
		panel.add(rdbtnGanasDeVomitar, gbc_rdbtnGanasDeVomitar);
		
		rdbtnFaltaDeApetito = new JRadioButton("Falta de apetito");
		rdbtnFaltaDeApetito.addItemListener(new RdbtnFaltaDeApetitoItemListener());
		GridBagConstraints gbc_rdbtnFaltaDeApetito = new GridBagConstraints();
		gbc_rdbtnFaltaDeApetito.anchor = GridBagConstraints.WEST;
		gbc_rdbtnFaltaDeApetito.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnFaltaDeApetito.gridx = 1;
		gbc_rdbtnFaltaDeApetito.gridy = 14;
		panel.add(rdbtnFaltaDeApetito, gbc_rdbtnFaltaDeApetito);
		
		lblOtrosSntomas = new JLabel("Otros síntomas");
		GridBagConstraints gbc_lblOtrosSntomas = new GridBagConstraints();
		gbc_lblOtrosSntomas.anchor = GridBagConstraints.WEST;
		gbc_lblOtrosSntomas.insets = new Insets(0, 0, 5, 5);
		lblOtrosSntomas.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblOtrosSntomas.gridx = 0;
		gbc_lblOtrosSntomas.gridy = 15;
		panel.add(lblOtrosSntomas, gbc_lblOtrosSntomas);
		
		rdbtnCansancio = new JRadioButton("Cansancio");
		rdbtnCansancio.addItemListener(new RdbtnCansancioItemListener());
		GridBagConstraints gbc_rdbtnCansancio = new GridBagConstraints();
		gbc_rdbtnCansancio.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCansancio.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCansancio.gridx = 0;
		gbc_rdbtnCansancio.gridy = 16;
		panel.add(rdbtnCansancio, gbc_rdbtnCansancio);
		
		rdbtnFiebre_1 = new JRadioButton("Fiebre");
		rdbtnFiebre_1.addItemListener(new RdbtnFiebre_1ItemListener());
		GridBagConstraints gbc_rdbtnFiebre_1 = new GridBagConstraints();
		gbc_rdbtnFiebre_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnFiebre_1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnFiebre_1.gridx = 1;
		gbc_rdbtnFiebre_1.gridy = 16;
		panel.add(rdbtnFiebre_1, gbc_rdbtnFiebre_1);
		
		rdbtnVrtigo = new JRadioButton("Vértigo");
		rdbtnVrtigo.addItemListener(new RdbtnVrtigoItemListener());
		GridBagConstraints gbc_rdbtnVrtigo = new GridBagConstraints();
		gbc_rdbtnVrtigo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnVrtigo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnVrtigo.gridx = 0;
		gbc_rdbtnVrtigo.gridy = 17;
		panel.add(rdbtnVrtigo, gbc_rdbtnVrtigo);
		
		rdbtnMareos = new JRadioButton("Mareos");
		rdbtnMareos.addItemListener(new RdbtnMareosItemListener());
		GridBagConstraints gbc_rdbtnMareos = new GridBagConstraints();
		gbc_rdbtnMareos.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMareos.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnMareos.gridx = 1;
		gbc_rdbtnMareos.gridy = 17;
		panel.add(rdbtnMareos, gbc_rdbtnMareos);
		
		rdbtnPrdidaDeConocimiento = new JRadioButton("Pérdida de conocimiento");
		rdbtnPrdidaDeConocimiento.addItemListener(new RdbtnPrdidaDeConocimientoItemListener());
		GridBagConstraints gbc_rdbtnPrdidaDeConocimiento = new GridBagConstraints();
		gbc_rdbtnPrdidaDeConocimiento.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPrdidaDeConocimiento.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPrdidaDeConocimiento.gridx = 0;
		gbc_rdbtnPrdidaDeConocimiento.gridy = 18;
		panel.add(rdbtnPrdidaDeConocimiento, gbc_rdbtnPrdidaDeConocimiento);
		
		rdbtnDebilidad = new JRadioButton("Debilidad");
		rdbtnDebilidad.addItemListener(new RdbtnDebilidadItemListener());
		GridBagConstraints gbc_rdbtnDebilidad = new GridBagConstraints();
		gbc_rdbtnDebilidad.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDebilidad.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnDebilidad.gridx = 1;
		gbc_rdbtnDebilidad.gridy = 18;
		panel.add(rdbtnDebilidad, gbc_rdbtnDebilidad);
		
		rdbtnPalidez = new JRadioButton("Palidez");
		rdbtnPalidez.addItemListener(new RdbtnPalidezItemListener());
		GridBagConstraints gbc_rdbtnPalidez = new GridBagConstraints();
		gbc_rdbtnPalidez.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPalidez.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPalidez.gridx = 0;
		gbc_rdbtnPalidez.gridy = 19;
		panel.add(rdbtnPalidez, gbc_rdbtnPalidez);
		
		rdbtnSudoracin = new JRadioButton("Sudoración");
		rdbtnSudoracin.addItemListener(new RdbtnSudoracinItemListener());
		GridBagConstraints gbc_rdbtnSudoracin = new GridBagConstraints();
		gbc_rdbtnSudoracin.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSudoracin.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnSudoracin.gridx = 1;
		gbc_rdbtnSudoracin.gridy = 19;
		panel.add(rdbtnSudoracin, gbc_rdbtnSudoracin);
		
		rdbtnMembranasMucosasEn = new JRadioButton("Membranas mucosas en la lengua");
		rdbtnMembranasMucosasEn.addItemListener(new RdbtnMembranasMucosasEnItemListener());
		GridBagConstraints gbc_rdbtnMembranasMucosasEn = new GridBagConstraints();
		gbc_rdbtnMembranasMucosasEn.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMembranasMucosasEn.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnMembranasMucosasEn.gridx = 0;
		gbc_rdbtnMembranasMucosasEn.gridy = 20;
		panel.add(rdbtnMembranasMucosasEn, gbc_rdbtnMembranasMucosasEn);
		
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

	
}
