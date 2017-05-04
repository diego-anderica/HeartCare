package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.PrintWriter;
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
	private JLabel lblProblemasDeCorazon;
	private JCheckBox chckbxArritmias;
	private JCheckBox chckbxAlteracionesDelRitmo;
	private JCheckBox chckbxPulsoIrregular;
	private JLabel lblDoloresOHinchazones;
	private JCheckBox chckbxDolorDePecho;
	private JCheckBox chckbxDolorDeBrazo;
	private JCheckBox chckbxHinchaznEnPies;
	private JCheckBox chckbxHinchazonAbdomen;
	private JCheckBox chckbxInflamacionAbdomen;
	private JCheckBox chckbxInflamacionEnPiernas;
	private JCheckBox chckbxInflamacionEnGanglios;
	private JLabel lblErupcionesORojeces;
	private JCheckBox chckbxErupcionesCutaneas;
	private JCheckBox chckbxOjosLenguaRojos;
	private JLabel lblSistemaUrinario;
	private JCheckBox chckbxMiccionExcesivaNoche;
	private JCheckBox chckbxRetencionDeLiquidos;
	private JCheckBox chckbxBajaProduccionOrina;
	private JLabel lblSistemaDigestivo;
	private JCheckBox chckbxGanasDeVomitar;
	private JCheckBox chckbxFaltaDeApetito;
	private JLabel lblOtrosSntomas;
	private JCheckBox chckbxMembranasMucosasLengua;
	private JCheckBox chckbxPalidez;
	private JCheckBox chckbxSudoracion;
	private JCheckBox chckbxPerdidaDeConocimiento;
	private JCheckBox chckbxDebilidad;
	private JCheckBox chckbxVertigo;
	private JCheckBox chckbxMareos;
	private JCheckBox chckbxCansancio;
	private JCheckBox chckbxFiebre;
	private JCheckBox chckbxDescamacion;
	private JLabel lblSistemaRespiratorio;
	private JCheckBox chckbxDificultadParaRespirar;
	private JCheckBox chckbxTos;
	private JCheckBox chckbxTosConSangre;
	private JCheckBox chckbxInfeccionesRespiratorias;
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
		gbl_pnlSintomas.columnWidths = new int[]{623, 0, 0, 0, 0, 0};
		gbl_pnlSintomas.rowHeights = new int[]{326, 0, 0, 0};
		gbl_pnlSintomas.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
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
		
		lblProblemasDeCorazon = new JLabel("Problemas de coraz\u00f3n");
		lblProblemasDeCorazon.setBackground(Color.LIGHT_GRAY);
		lblProblemasDeCorazon.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblProblemasDeCorazon = new GridBagConstraints();
		gbc_lblProblemasDeCorazon.anchor = GridBagConstraints.WEST;
		gbc_lblProblemasDeCorazon.insets = new Insets(0, 0, 5, 5);
		lblProblemasDeCorazon.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblProblemasDeCorazon.gridx = 0;
		gbc_lblProblemasDeCorazon.gridy = 0;
		pnlDesSintomas.add(lblProblemasDeCorazon, gbc_lblProblemasDeCorazon);
		
		chckbxArritmias = new JCheckBox("Arritmias");
		chckbxArritmias.addItemListener(new chckbxArritmiasItemListener());
		chckbxArritmias.setHorizontalTextPosition(SwingConstants.RIGHT);
		GridBagConstraints gbc_chckbxArritmias = new GridBagConstraints();
		gbc_chckbxArritmias.anchor = GridBagConstraints.WEST;
		gbc_chckbxArritmias.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxArritmias.gridx = 0;
		gbc_chckbxArritmias.gridy = 1;
		pnlDesSintomas.add(chckbxArritmias, gbc_chckbxArritmias);
		
		chckbxAlteracionesDelRitmo = new JCheckBox("Alteraciones del ritmo card\u00edaco");
		chckbxAlteracionesDelRitmo.addItemListener(new chckbxAlteracionesDelRitmoItemListener());
		GridBagConstraints gbc_chckbxAlteracionesDelRitmo = new GridBagConstraints();
		gbc_chckbxAlteracionesDelRitmo.anchor = GridBagConstraints.WEST;
		gbc_chckbxAlteracionesDelRitmo.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxAlteracionesDelRitmo.gridx = 1;
		gbc_chckbxAlteracionesDelRitmo.gridy = 1;
		pnlDesSintomas.add(chckbxAlteracionesDelRitmo, gbc_chckbxAlteracionesDelRitmo);
		
		chckbxPulsoIrregular = new JCheckBox("Pulso irregular o acelerado");
		chckbxPulsoIrregular.addItemListener(new chckbxPulsoIrregularOItemListener());
		GridBagConstraints gbc_chckbxPulsoIrregular = new GridBagConstraints();
		gbc_chckbxPulsoIrregular.anchor = GridBagConstraints.WEST;
		gbc_chckbxPulsoIrregular.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPulsoIrregular.gridx = 0;
		gbc_chckbxPulsoIrregular.gridy = 2;
		pnlDesSintomas.add(chckbxPulsoIrregular, gbc_chckbxPulsoIrregular);
		
		lblDoloresOHinchazones = new JLabel("Dolores o hinchazones f\u00edsicos");
		GridBagConstraints gbc_lblDoloresOHinchazones = new GridBagConstraints();
		gbc_lblDoloresOHinchazones.anchor = GridBagConstraints.WEST;
		gbc_lblDoloresOHinchazones.insets = new Insets(0, 0, 5, 5);
		lblDoloresOHinchazones.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblDoloresOHinchazones.gridx = 0;
		gbc_lblDoloresOHinchazones.gridy = 3;
		pnlDesSintomas.add(lblDoloresOHinchazones, gbc_lblDoloresOHinchazones);
		
		chckbxDolorDePecho = new JCheckBox("Dolor de pecho");
		chckbxDolorDePecho.addItemListener(new chckbxDolorDePechoItemListener());
		GridBagConstraints gbc_chckbxDolorDePecho = new GridBagConstraints();
		gbc_chckbxDolorDePecho.anchor = GridBagConstraints.WEST;
		gbc_chckbxDolorDePecho.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDolorDePecho.gridx = 0;
		gbc_chckbxDolorDePecho.gridy = 4;
		pnlDesSintomas.add(chckbxDolorDePecho, gbc_chckbxDolorDePecho);
		
		chckbxDolorDeBrazo = new JCheckBox("Dolor de brazo izquierdo, de cuello, de mand\u00edbula o de espalda");
		chckbxDolorDeBrazo.addItemListener(new chckbxDolorDeBrazoItemListener());
		GridBagConstraints gbc_chckbxDolorDeBrazo = new GridBagConstraints();
		gbc_chckbxDolorDeBrazo.anchor = GridBagConstraints.WEST;
		gbc_chckbxDolorDeBrazo.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxDolorDeBrazo.gridx = 1;
		gbc_chckbxDolorDeBrazo.gridy = 4;
		pnlDesSintomas.add(chckbxDolorDeBrazo, gbc_chckbxDolorDeBrazo);
		
		chckbxHinchaznEnPies = new JCheckBox("Hinchaz\u00f3n en pies, tobillos o ambos");
		chckbxHinchaznEnPies.addItemListener(new chckbxHinchaznEnPiesItemListener());
		GridBagConstraints gbc_chckbxHinchaznEnPies = new GridBagConstraints();
		gbc_chckbxHinchaznEnPies.anchor = GridBagConstraints.WEST;
		gbc_chckbxHinchaznEnPies.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxHinchaznEnPies.gridx = 0;
		gbc_chckbxHinchaznEnPies.gridy = 5;
		pnlDesSintomas.add(chckbxHinchaznEnPies, gbc_chckbxHinchaznEnPies);
		
		chckbxHinchazonAbdomen = new JCheckBox("Hinchaz\u00f3n en el abdomen");
		chckbxHinchazonAbdomen.addItemListener(new chckbxHinchaznEnElItemListener());
		GridBagConstraints gbc_chckbxHinchazonAbdomen = new GridBagConstraints();
		gbc_chckbxHinchazonAbdomen.anchor = GridBagConstraints.WEST;
		gbc_chckbxHinchazonAbdomen.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxHinchazonAbdomen.gridx = 1;
		gbc_chckbxHinchazonAbdomen.gridy = 5;
		pnlDesSintomas.add(chckbxHinchazonAbdomen, gbc_chckbxHinchazonAbdomen);
		
		chckbxInflamacionAbdomen = new JCheckBox("Inflamaci\u00f3n en el abdomen");
		chckbxInflamacionAbdomen.addItemListener(new chckbxInflamacinEnElItemListener());
		GridBagConstraints gbc_chckbxInflamacionAbdomen = new GridBagConstraints();
		gbc_chckbxInflamacionAbdomen.anchor = GridBagConstraints.WEST;
		gbc_chckbxInflamacionAbdomen.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInflamacionAbdomen.gridx = 0;
		gbc_chckbxInflamacionAbdomen.gridy = 6;
		pnlDesSintomas.add(chckbxInflamacionAbdomen, gbc_chckbxInflamacionAbdomen);
		
		chckbxInflamacionEnPiernas = new JCheckBox("Inflamaci\u00f3n en piernas, pie o tobillos");
		chckbxInflamacionEnPiernas.addItemListener(new chckbxInflamacinEnPiernasItemListener());
		GridBagConstraints gbc_chckbxInflamacionEnPiernas = new GridBagConstraints();
		gbc_chckbxInflamacionEnPiernas.anchor = GridBagConstraints.WEST;
		gbc_chckbxInflamacionEnPiernas.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxInflamacionEnPiernas.gridx = 1;
		gbc_chckbxInflamacionEnPiernas.gridy = 6;
		pnlDesSintomas.add(chckbxInflamacionEnPiernas, gbc_chckbxInflamacionEnPiernas);
		
		chckbxInflamacionEnGanglios = new JCheckBox("Inflamaci\u00f3n en ganglios del cuello");
		chckbxInflamacionEnGanglios.addItemListener(new chckbxInflamacinEnGangliosItemListener());
		GridBagConstraints gbc_chckbxInflamacionEnGanglios = new GridBagConstraints();
		gbc_chckbxInflamacionEnGanglios.anchor = GridBagConstraints.WEST;
		gbc_chckbxInflamacionEnGanglios.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInflamacionEnGanglios.gridx = 0;
		gbc_chckbxInflamacionEnGanglios.gridy = 7;
		pnlDesSintomas.add(chckbxInflamacionEnGanglios, gbc_chckbxInflamacionEnGanglios);
		
		lblErupcionesORojeces = new JLabel("Erupciones o rojeces f\u00edsicas");
		GridBagConstraints gbc_lblErupcionesORojeces = new GridBagConstraints();
		gbc_lblErupcionesORojeces.anchor = GridBagConstraints.WEST;
		gbc_lblErupcionesORojeces.insets = new Insets(0, 0, 5, 5);
		lblErupcionesORojeces.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblErupcionesORojeces.gridx = 0;
		gbc_lblErupcionesORojeces.gridy = 8;
		pnlDesSintomas.add(lblErupcionesORojeces, gbc_lblErupcionesORojeces);
		
		chckbxOjosLenguaRojos = new JCheckBox("Ojos y lengua rojos");
		chckbxOjosLenguaRojos.addItemListener(new chckbxOjosLenguaRojosItemListener());
		GridBagConstraints gbc_chckbxOjosLenguaRojos = new GridBagConstraints();
		gbc_chckbxOjosLenguaRojos.anchor = GridBagConstraints.WEST;
		gbc_chckbxOjosLenguaRojos.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOjosLenguaRojos.gridx = 0;
		gbc_chckbxOjosLenguaRojos.gridy = 9;
		pnlDesSintomas.add(chckbxOjosLenguaRojos, gbc_chckbxOjosLenguaRojos);
		
		chckbxErupcionesCutaneas = new JCheckBox("Erupciones cut\u00e1neas o descamaci\u00f3n");
		chckbxErupcionesCutaneas.addItemListener(new chckbxErupcionesCutneasOItemListener());
		GridBagConstraints gbc_chckbxErupcionesCutaneas = new GridBagConstraints();
		gbc_chckbxErupcionesCutaneas.anchor = GridBagConstraints.WEST;
		gbc_chckbxErupcionesCutaneas.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxErupcionesCutaneas.gridx = 1;
		gbc_chckbxErupcionesCutaneas.gridy = 9;
		pnlDesSintomas.add(chckbxErupcionesCutaneas, gbc_chckbxErupcionesCutaneas);
		
		lblSistemaRespiratorio = new JLabel("Sistema respiratorio");
		lblSistemaRespiratorio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSistemaRespiratorio = new GridBagConstraints();
		gbc_lblSistemaRespiratorio.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaRespiratorio.insets = new Insets(0, 0, 5, 5);
		gbc_lblSistemaRespiratorio.gridx = 0;
		gbc_lblSistemaRespiratorio.gridy = 10;
		pnlDesSintomas.add(lblSistemaRespiratorio, gbc_lblSistemaRespiratorio);
		
		chckbxDificultadParaRespirar = new JCheckBox("Dificultad para respirar");
		chckbxDificultadParaRespirar.addItemListener(new chckbxDificultadParaRespirarItemListener());
		GridBagConstraints gbc_chckbxDificultadParaRespirar = new GridBagConstraints();
		gbc_chckbxDificultadParaRespirar.anchor = GridBagConstraints.WEST;
		gbc_chckbxDificultadParaRespirar.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDificultadParaRespirar.gridx = 0;
		gbc_chckbxDificultadParaRespirar.gridy = 11;
		pnlDesSintomas.add(chckbxDificultadParaRespirar, gbc_chckbxDificultadParaRespirar);
		
		chckbxTos = new JCheckBox("Tos");
		chckbxTos.addItemListener(new chckbxTosItemListener());
		GridBagConstraints gbc_chckbxTos = new GridBagConstraints();
		gbc_chckbxTos.anchor = GridBagConstraints.WEST;
		gbc_chckbxTos.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxTos.gridx = 1;
		gbc_chckbxTos.gridy = 11;
		pnlDesSintomas.add(chckbxTos, gbc_chckbxTos);
		
		chckbxTosConSangre = new JCheckBox("Tos con sangre");
		chckbxTosConSangre.addItemListener(new chckbxTosConSangreItemListener());
		GridBagConstraints gbc_chckbxTosConSangre = new GridBagConstraints();
		gbc_chckbxTosConSangre.anchor = GridBagConstraints.WEST;
		gbc_chckbxTosConSangre.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxTosConSangre.gridx = 0;
		gbc_chckbxTosConSangre.gridy = 12;
		pnlDesSintomas.add(chckbxTosConSangre, gbc_chckbxTosConSangre);
		
		chckbxInfeccionesRespiratorias = new JCheckBox("Infecciones respiratorias");
		chckbxInfeccionesRespiratorias.addItemListener(new chckbxInfeccionesRespiratoriasItemListener());
		GridBagConstraints gbc_chckbxInfeccionesRespiratorias = new GridBagConstraints();
		gbc_chckbxInfeccionesRespiratorias.anchor = GridBagConstraints.WEST;
		gbc_chckbxInfeccionesRespiratorias.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxInfeccionesRespiratorias.gridx = 1;
		gbc_chckbxInfeccionesRespiratorias.gridy = 12;
		pnlDesSintomas.add(chckbxInfeccionesRespiratorias, gbc_chckbxInfeccionesRespiratorias);
		
		lblSistemaUrinario = new JLabel("Sistema urinario");
		GridBagConstraints gbc_lblSistemaUrinario = new GridBagConstraints();
		gbc_lblSistemaUrinario.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaUrinario.insets = new Insets(0, 0, 5, 5);
		lblSistemaUrinario.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblSistemaUrinario.gridx = 0;
		gbc_lblSistemaUrinario.gridy = 13;
		pnlDesSintomas.add(lblSistemaUrinario, gbc_lblSistemaUrinario);
		
		chckbxMiccionExcesivaNoche = new JCheckBox("Micci\u00f3n excesiva durante la noche");
		chckbxMiccionExcesivaNoche.addItemListener(new chckbxMiccinExcesivaDuranteItemListener());
		GridBagConstraints gbc_chckbxMiccionExcesivaNoche = new GridBagConstraints();
		gbc_chckbxMiccionExcesivaNoche.anchor = GridBagConstraints.WEST;
		gbc_chckbxMiccionExcesivaNoche.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMiccionExcesivaNoche.gridx = 0;
		gbc_chckbxMiccionExcesivaNoche.gridy = 14;
		pnlDesSintomas.add(chckbxMiccionExcesivaNoche, gbc_chckbxMiccionExcesivaNoche);
		
		chckbxRetencionDeLiquidos = new JCheckBox("Retenci\u00f3n de l\u00edquidos");
		chckbxRetencionDeLiquidos.addItemListener(new chckbxRetencinDeLquidosItemListener());
		GridBagConstraints gbc_chckbxRetencionDeLiquidos = new GridBagConstraints();
		gbc_chckbxRetencionDeLiquidos.anchor = GridBagConstraints.WEST;
		gbc_chckbxRetencionDeLiquidos.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxRetencionDeLiquidos.gridx = 1;
		gbc_chckbxRetencionDeLiquidos.gridy = 14;
		pnlDesSintomas.add(chckbxRetencionDeLiquidos, gbc_chckbxRetencionDeLiquidos);
		
		chckbxBajaProduccionOrina = new JCheckBox("Baja producci\u00f3n de orina");
		chckbxBajaProduccionOrina.addItemListener(new chckbxBajaProduccinDeItemListener());
		GridBagConstraints gbc_chckbxBajaProduccionOrina = new GridBagConstraints();
		gbc_chckbxBajaProduccionOrina.anchor = GridBagConstraints.WEST;
		gbc_chckbxBajaProduccionOrina.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxBajaProduccionOrina.gridx = 0;
		gbc_chckbxBajaProduccionOrina.gridy = 15;
		pnlDesSintomas.add(chckbxBajaProduccionOrina, gbc_chckbxBajaProduccionOrina);
		
		lblSistemaDigestivo = new JLabel("Sistema digestivo");
		GridBagConstraints gbc_lblSistemaDigestivo = new GridBagConstraints();
		gbc_lblSistemaDigestivo.anchor = GridBagConstraints.WEST;
		gbc_lblSistemaDigestivo.insets = new Insets(0, 0, 5, 5);
		lblSistemaDigestivo.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblSistemaDigestivo.gridx = 0;
		gbc_lblSistemaDigestivo.gridy = 16;
		pnlDesSintomas.add(lblSistemaDigestivo, gbc_lblSistemaDigestivo);
		
		chckbxGanasDeVomitar = new JCheckBox("Ganas de vomitar");
		chckbxGanasDeVomitar.addItemListener(new chckbxGanasDeVomitarItemListener());
		GridBagConstraints gbc_chckbxGanasDeVomitar = new GridBagConstraints();
		gbc_chckbxGanasDeVomitar.anchor = GridBagConstraints.WEST;
		gbc_chckbxGanasDeVomitar.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxGanasDeVomitar.gridx = 0;
		gbc_chckbxGanasDeVomitar.gridy = 17;
		pnlDesSintomas.add(chckbxGanasDeVomitar, gbc_chckbxGanasDeVomitar);
		
		chckbxFaltaDeApetito = new JCheckBox("Falta de apetito");
		chckbxFaltaDeApetito.addItemListener(new chckbxFaltaDeApetitoItemListener());
		GridBagConstraints gbc_chckbxFaltaDeApetito = new GridBagConstraints();
		gbc_chckbxFaltaDeApetito.anchor = GridBagConstraints.WEST;
		gbc_chckbxFaltaDeApetito.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxFaltaDeApetito.gridx = 1;
		gbc_chckbxFaltaDeApetito.gridy = 17;
		pnlDesSintomas.add(chckbxFaltaDeApetito, gbc_chckbxFaltaDeApetito);
		
		lblOtrosSntomas = new JLabel("Otros s\u00edntomas");
		GridBagConstraints gbc_lblOtrosSntomas = new GridBagConstraints();
		gbc_lblOtrosSntomas.anchor = GridBagConstraints.WEST;
		gbc_lblOtrosSntomas.insets = new Insets(0, 0, 5, 5);
		lblOtrosSntomas.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		gbc_lblOtrosSntomas.gridx = 0;
		gbc_lblOtrosSntomas.gridy = 18;
		pnlDesSintomas.add(lblOtrosSntomas, gbc_lblOtrosSntomas);
		
		chckbxCansancio = new JCheckBox("Cansancio");
		chckbxCansancio.addItemListener(new chckbxCansancioItemListener());
		GridBagConstraints gbc_chckbxCansancio = new GridBagConstraints();
		gbc_chckbxCansancio.anchor = GridBagConstraints.WEST;
		gbc_chckbxCansancio.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxCansancio.gridx = 0;
		gbc_chckbxCansancio.gridy = 19;
		pnlDesSintomas.add(chckbxCansancio, gbc_chckbxCansancio);
		
		chckbxFiebre = new JCheckBox("Fiebre");
		chckbxFiebre.addItemListener(new chckbxFiebre_1ItemListener());
		GridBagConstraints gbc_chckbxFiebre = new GridBagConstraints();
		gbc_chckbxFiebre.anchor = GridBagConstraints.WEST;
		gbc_chckbxFiebre.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxFiebre.gridx = 1;
		gbc_chckbxFiebre.gridy = 19;
		pnlDesSintomas.add(chckbxFiebre, gbc_chckbxFiebre);
		
		chckbxVertigo = new JCheckBox("V\u00e9rtigo");
		chckbxVertigo.addItemListener(new chckbxVrtigoItemListener());
		GridBagConstraints gbc_chckbxVertigo = new GridBagConstraints();
		gbc_chckbxVertigo.anchor = GridBagConstraints.WEST;
		gbc_chckbxVertigo.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxVertigo.gridx = 0;
		gbc_chckbxVertigo.gridy = 20;
		pnlDesSintomas.add(chckbxVertigo, gbc_chckbxVertigo);
		
		chckbxMareos = new JCheckBox("Mareos");
		chckbxMareos.addItemListener(new chckbxMareosItemListener());
		GridBagConstraints gbc_chckbxMareos = new GridBagConstraints();
		gbc_chckbxMareos.anchor = GridBagConstraints.WEST;
		gbc_chckbxMareos.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxMareos.gridx = 1;
		gbc_chckbxMareos.gridy = 20;
		pnlDesSintomas.add(chckbxMareos, gbc_chckbxMareos);
		
		chckbxPerdidaDeConocimiento = new JCheckBox("P\u00e9rdida de conocimiento");
		chckbxPerdidaDeConocimiento.addItemListener(new chckbxPrdidaDeConocimientoItemListener());
		GridBagConstraints gbc_chckbxPerdidaDeConocimiento = new GridBagConstraints();
		gbc_chckbxPerdidaDeConocimiento.anchor = GridBagConstraints.WEST;
		gbc_chckbxPerdidaDeConocimiento.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPerdidaDeConocimiento.gridx = 0;
		gbc_chckbxPerdidaDeConocimiento.gridy = 21;
		pnlDesSintomas.add(chckbxPerdidaDeConocimiento, gbc_chckbxPerdidaDeConocimiento);
		
		chckbxDebilidad = new JCheckBox("Debilidad");
		chckbxDebilidad.addItemListener(new chckbxDebilidadItemListener());
		GridBagConstraints gbc_chckbxDebilidad = new GridBagConstraints();
		gbc_chckbxDebilidad.anchor = GridBagConstraints.WEST;
		gbc_chckbxDebilidad.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxDebilidad.gridx = 1;
		gbc_chckbxDebilidad.gridy = 21;
		pnlDesSintomas.add(chckbxDebilidad, gbc_chckbxDebilidad);
		
		chckbxPalidez = new JCheckBox("Palidez");
		chckbxPalidez.addItemListener(new chckbxPalidezItemListener());
		GridBagConstraints gbc_chckbxPalidez = new GridBagConstraints();
		gbc_chckbxPalidez.anchor = GridBagConstraints.WEST;
		gbc_chckbxPalidez.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPalidez.gridx = 0;
		gbc_chckbxPalidez.gridy = 22;
		pnlDesSintomas.add(chckbxPalidez, gbc_chckbxPalidez);
		
		chckbxSudoracion = new JCheckBox("Sudoraci\u00f3n");
		chckbxSudoracion.addItemListener(new chckbxSudoracinItemListener());
		GridBagConstraints gbc_chckbxSudoracion = new GridBagConstraints();
		gbc_chckbxSudoracion.anchor = GridBagConstraints.WEST;
		gbc_chckbxSudoracion.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxSudoracion.gridx = 1;
		gbc_chckbxSudoracion.gridy = 22;
		pnlDesSintomas.add(chckbxSudoracion, gbc_chckbxSudoracion);
		
		chckbxMembranasMucosasLengua = new JCheckBox("Membranas mucosas en la lengua");
		chckbxMembranasMucosasLengua.addItemListener(new chckbxMembranasMucosasEnItemListener());
		GridBagConstraints gbc_chckbxMembranasMucosasLengua = new GridBagConstraints();
		gbc_chckbxMembranasMucosasLengua.anchor = GridBagConstraints.WEST;
		gbc_chckbxMembranasMucosasLengua.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxMembranasMucosasLengua.gridx = 0;
		gbc_chckbxMembranasMucosasLengua.gridy = 23;
		pnlDesSintomas.add(chckbxMembranasMucosasLengua, gbc_chckbxMembranasMucosasLengua);
		
		chckbxDescamacion = new JCheckBox("Descamaci\u00f3n");
		chckbxDescamacion.addItemListener(new chckbxDescamacinItemListener());
		GridBagConstraints gbc_chckbxDescamacion = new GridBagConstraints();
		gbc_chckbxDescamacion.anchor = GridBagConstraints.WEST;
		gbc_chckbxDescamacion.gridx = 1;
		gbc_chckbxDescamacion.gridy = 23;
		pnlDesSintomas.add(chckbxDescamacion, gbc_chckbxDescamacion);
		
		btnDiagnosticar = new JButton("Diagnosticar");
		btnDiagnosticar.addActionListener(new BtnDiagnosticarActionListener());
		btnDiagnosticar.setIcon(new ImageIcon(PanelDiagnosticar.class.getResource("/presentacion/Imagenes/medicine-briefcase (1).png")));
		GridBagConstraints gbc_btnDiagnosticar = new GridBagConstraints();
		gbc_btnDiagnosticar.anchor = GridBagConstraints.SOUTH;
		gbc_btnDiagnosticar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDiagnosticar.insets = new Insets(0, 0, 5, 5);
		gbc_btnDiagnosticar.gridx = 3;
		gbc_btnDiagnosticar.gridy = 0;
		pnlSintomas.add(btnDiagnosticar, gbc_btnDiagnosticar);
		
		btnLimpiarSeleccion = new JButton("Limpiar Selecci\u00F3n");
		btnLimpiarSeleccion.addActionListener(new BtnLimpiarSeleccionActionListener());
		btnLimpiarSeleccion.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnLimpiarSeleccion.setIcon(new ImageIcon(PanelDiagnosticar.class.getResource("/presentacion/Imagenes/double-sided-eraser.png")));
		GridBagConstraints gbc_btnLimpiarSeleccion = new GridBagConstraints();
		gbc_btnLimpiarSeleccion.insets = new Insets(0, 0, 0, 5);
		gbc_btnLimpiarSeleccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiarSeleccion.anchor = GridBagConstraints.NORTH;
		gbc_btnLimpiarSeleccion.gridx = 3;
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
		taDiagnostico.setLineWrap(true);
		taDiagnostico.setFont(new Font("Arial", Font.PLAIN, 15));
		taDiagnostico.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
		taTratamiento.setLineWrap(true);
		taTratamiento.setFont(new Font("Arial", Font.PLAIN, 14));
		taTratamiento.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setViewportView(taTratamiento);
		
		btnGenerarInforme = new JButton("Generar Informe");
		btnGenerarInforme.addActionListener(new BtnGenerarInformeActionListener());
		btnGenerarInforme.setIcon(new ImageIcon(PanelDiagnosticar.class.getResource("/presentacion/Imagenes/file.png")));
		GridBagConstraints gbc_btnGenerarInforme = new GridBagConstraints();
		gbc_btnGenerarInforme.insets = new Insets(0, 0, 5, 5);
		gbc_btnGenerarInforme.gridx = 1;
		gbc_btnGenerarInforme.gridy = 5;
		pnlDiagnostico.add(btnGenerarInforme, gbc_btnGenerarInforme);
	}
	
	private Component getPanel() {
		return tabbedPane;
	}

	private class chckbxArritmiasItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			 if (e.getStateChange() == ItemEvent.SELECTED) {
			        diagnostico.setArritmias(true);
			    }
			    else if (e.getStateChange() == ItemEvent.DESELECTED) {
			    	diagnostico.setArritmias(false);
			    }
		}
	}
	
	private class chckbxAlteracionesDelRitmoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setAlteracionesritmo(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setAlteracionesritmo(false);
		    }
		}
	}
	
	private class chckbxPulsoIrregularOItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setPusloirregular(true);;
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setPusloirregular(false);
		    }
		}
	}
	
	private class chckbxDolorDePechoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDolordepecho(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDolordepecho(false);
		    }
		}
	}
	
	private class chckbxDolorDeBrazoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDolorbrazoizq(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDolorbrazoizq(false);
		    }
		}
	}
	
	private class chckbxHinchaznEnPiesItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setHinchazonpies(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setHinchazonpies(false);
		    }
		}
	}
	
	private class chckbxHinchaznEnElItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setHinchazonabdomen(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setHinchazonabdomen(false);
		    }
		}
	}
	
	private class chckbxInflamacinEnElItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInflamacionabdomen(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInflamacionabdomen(false);
		    }
		}
	}
	
	private class chckbxInflamacinEnPiernasItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInflamacionpiernas(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInflamacionpiernas(false);
		    }
		}
	}
	
	private class chckbxInflamacinEnGangliosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInflamancionganglios(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInflamancionganglios(false);
		    }
		}
	}
	
	private class chckbxOjosLenguaRojosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setOjoslenguarojos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setOjoslenguarojos(false);
		    }
		}
	}
	
	private class chckbxErupcionesCutneasOItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setErupcionescutaneas(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setErupcionescutaneas(false);
		    }
		}
	}
	
	private class chckbxMiccinExcesivaDuranteItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setMiccionexcesiva(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setMiccionexcesiva(false);
		    }
		}
	}
	
	private class chckbxRetencinDeLquidosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setRetencionliquidos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setRetencionliquidos(false);
		    }
		}
	}
	
	private class chckbxBajaProduccinDeItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setBajaproduccionorina(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setBajaproduccionorina(false);
		    }
		}
	}
	
	private class chckbxGanasDeVomitarItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setGanasvomitar(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setGanasvomitar(false);
		    }
		}
	}
	
	private class chckbxFaltaDeApetitoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setFaltaapetito(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setFaltaapetito(false);
		    }
		}
	}
	
	private class chckbxCansancioItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setCansancio(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setCansancio(false);
		    }
		}
	}
	
	private class chckbxFiebre_1ItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setFiebre(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setFiebre(false);
		    }
		}
	}
	
	private class chckbxVrtigoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setVertigo(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setVertigo(false);
		    }
		}
	}
	
	private class chckbxMareosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setMareos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setMareos(false);
		    }
		}
	}
	
	private class chckbxPrdidaDeConocimientoItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setPerdidaconocimiento(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setPerdidaconocimiento(false);
		    }
		}
	}
	
	private class chckbxDebilidadItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDebilidad(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDebilidad(false);
		    }
		}
	}
	
	private class chckbxPalidezItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setPalidez(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setPalidez(false);
		    }
		}
	}
	
	private class chckbxSudoracinItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setSudoracion(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setSudoracion(false);
		    }
		}
	}
	
	private class chckbxMembranasMucosasEnItemListener implements ItemListener {
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
			chckbxArritmias.setSelected(false);
			chckbxAlteracionesDelRitmo.setSelected(false);
			chckbxPulsoIrregular.setSelected(false);
			chckbxDolorDePecho.setSelected(false);
			chckbxDolorDeBrazo.setSelected(false);
			chckbxHinchaznEnPies.setSelected(false);
			chckbxHinchazonAbdomen.setSelected(false);
			chckbxInflamacionAbdomen.setSelected(false);
			chckbxInflamacionEnPiernas.setSelected(false);
			chckbxInflamacionEnGanglios.setSelected(false);
			chckbxErupcionesCutaneas.setSelected(false);
			chckbxOjosLenguaRojos.setSelected(false);
			chckbxMiccionExcesivaNoche.setSelected(false);
			chckbxRetencionDeLiquidos.setSelected(false);
			chckbxBajaProduccionOrina.setSelected(false);
			chckbxGanasDeVomitar.setSelected(false);
			chckbxFaltaDeApetito.setSelected(false);
			chckbxMembranasMucosasLengua.setSelected(false);
			chckbxPalidez.setSelected(false);
			chckbxSudoracion.setSelected(false);
			chckbxPerdidaDeConocimiento.setSelected(false);
			chckbxDebilidad.setSelected(false);
			chckbxVertigo.setSelected(false);
			chckbxMareos.setSelected(false);
			chckbxCansancio.setSelected(false);
			chckbxFiebre.setSelected(false);
			chckbxDescamacion.setSelected(false);
			chckbxDificultadParaRespirar.setSelected(false);
			chckbxTos.setSelected(false);
			chckbxTosConSangre.setSelected(false);
			chckbxInfeccionesRespiratorias.setSelected(false);
			
		}
	}
	
	private class BtnDiagnosticarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(diagnostico.isDolordepecho() && diagnostico.isDolorbrazoizq() && diagnostico.isSudoracion() 
					&& diagnostico.isMareos() && diagnostico.isGanasvomitar() && diagnostico.isDificultadrespirar() 
					&& diagnostico.isPerdidaconocimiento()){
				diagnostico.setDiagnostico("Infarto de miocardio o ataque card\u00edaco.");
				diagnostico.setTratamiento("Se recomienda una dieta para la enfermedad coronaria. "
						+ "Puede recibir nitroglicerina y morfina para el dolor y medicamento para los co\u00e1gulos de sangre. "
						+ "Hay procedimientos de emergencia como la angioplastia.");
			}else if(diagnostico.isDolordepecho() && diagnostico.isDificultadrespirar() && diagnostico.isCansancio() 
					&& diagnostico.isMareos() && diagnostico.isTos() && diagnostico.isPusloirregular()
					&& diagnostico.isFaltaapetito() && diagnostico.isHinchazonpies()){
				diagnostico.setDiagnostico("Miocardiopat\u00eda dilatada.");
				diagnostico.setTratamiento("Limitar la cantidada de bebida alcoh\u00f3lica y la cantidad de sal (sodio) en la dieta. "
						+ "Tomar medicamentos para ayudar a evitar que la insuficiencia card\u00edaca empeore. Pueden llevarse a cabo "
						+ "procedimientos como la implantaci\u00f3n de un marcapasos, un desfibrilador, una cirug\u00eda de revascularizaci\u00f3n "
						+ "coronaria o una angioplastia para mejorar el flujo de sangre y reparaci\u00f3n o reemplazo de v\u00e1lvulas.");
				
			}else if(diagnostico.isDolordepecho() && diagnostico.isPerdidaconocimiento() && diagnostico.isCansancio() 
					&& diagnostico.isMareos() && diagnostico.isVertigo() && diagnostico.isDificultadrespirar()
					&& diagnostico.isPusloirregular()){
				diagnostico.setDiagnostico("Miocardiopat\u00eda hipertr\u00f3fica.");
				diagnostico.setTratamiento("Medicamentos para tratar el ritmo anormal, anticoagulantes, usar un marcapasos permanente "
						+ "para controlar los latidos card\u00edacos o un desfibrilador que reconozca el ritmo card\u00edaco.");
				
			}else if(diagnostico.isHinchazonabdomen() && diagnostico.isDificultadrespirar() && diagnostico.isRetencionliquidos()
					&& diagnostico.isTos() && diagnostico.isFaltaapetito() && diagnostico.isPusloirregular() 
					&& diagnostico.isHinchazonpies() && diagnostico.isBajaproduccionorina()){
				diagnostico.setDiagnostico("Miocardiopat\u00eda restrictiva.");
				diagnostico.setTratamiento("Se trata la afecci\u00f3n causante. Para controlar los s\u00edntomas y prevenir problemas se pueden usar "
						+ "medicamentos anticoagulantes, quimioterapia, diur\u00e9ticos para eliminar l\u00edquidos y medicamentos para controlar el "
						+ "ritmo card\u00edaco.");
				
			}else if(diagnostico.isDificultadrespirar() && diagnostico.isAlteracionesritmo() && diagnostico.isTos() 
					&& diagnostico.isCansancio() && diagnostico.isHinchazonpies() && diagnostico.isInfeccionesrespirar()
					&& diagnostico.isDolordepecho()){
				diagnostico.setDiagnostico("Estenosis mitral.");
				diagnostico.setTratamiento("Las personas con s\u00edntomas leves o sin ning\u00fan s\u00edntoma no necesitan tratamiento. En caso de s\u00edntomas "
						+ "graves, los medicamentos que se pueden utilizar son diur\u00e9ticos, betabloqueadores, inhibidores, digoxina, medicamentos "
						+ "para tratar el ritmo card\u00edaco y anticoagulantes.");
				
			}else if(diagnostico.isDificultadrespirar() && diagnostico.isArritmias() && diagnostico.isTos()
					&& diagnostico.isCansancio() && diagnostico.isMiccionexcesiva() && diagnostico.isPusloirregular()){
				diagnostico.setDiagnostico("Insuficiencia mitral.");
				diagnostico.setTratamiento("A las personas con hipertensi\u00f3n arterial se les puede administrar medicamentos para reducir la tensi\u00f3n "
						+ "sobre el coraz\u00f3n y aliviar los s\u00edntomas. Otros medicamentos que se pueden utilizar son betabloqueadores, inhibidores, "
						+ "anticoagulantes, medicamentos para controlar el ritmo card\u00edaco y diur\u00e9ticos. Tambi\u00e9n ayuda una dieta baja en sal (sodio) "
						+ "y reducir la actividad. Se puede necesitar cirug\u00eda para reparar o reemplazar la v\u00e1lvula.");
				
			}else if(diagnostico.isDolordepecho() && diagnostico.isTossangre() && diagnostico.isDificultadrespirar()
					&& diagnostico.isCansancio() && diagnostico.isVertigo() && diagnostico.isMareos()){
				diagnostico.setDiagnostico("Estenosis a\u00f3rtica.");
				diagnostico.setTratamiento("No practicar deportes competitivos, uso de medicamentos para controlar el ritmo card\u00edaco, como diur\u00e9ticos, "
						+ "nitratos y betabloqueadores. Tambi\u00e9n tiene que tratarse la hipertensi\u00f3n arterial. La cirug\u00eda tambi\u00e9n puede usarse en caso de "
						+ "gravedad como el reparo o reemplazo de la v\u00e1lvula");
				
			}else if(diagnostico.isPusloirregular() && diagnostico.isDolordepecho() && diagnostico.isMareos() 
					&& diagnostico.isCansancio() && diagnostico.isDificultadrespirar() && diagnostico.isDebilidad()
					&& diagnostico.isHinchazonpies() && diagnostico.isHinchazonabdomen()){
				diagnostico.setDiagnostico("Insuficiencia a\u00f3rtica.");
				diagnostico.setTratamiento("Si la presi\u00f3n arterial es alta, se recomienda usar medicamentos antihipertensivos para ayuda a disminuir "
						+ "los s\u00edntomas. ");
				
			}else if(diagnostico.isDolordepecho() && diagnostico.isMareos() && diagnostico.isVertigo() 
					&& diagnostico.isPalidez() && diagnostico.isDificultadrespirar() && diagnostico.isSudoracion()
					&& diagnostico.isPusloirregular()){
				diagnostico.setDiagnostico("Arritmia.");
				diagnostico.setTratamiento("Si la arritmia es grave, se usan t\u00e9cnicas como la terapia de shock el\u00e9ctrico, la implantaci\u00f3n de un marcapasos "
						+ "card\u00edaco temporal o el uso de medicamentos por vena o por v\u00eda oral.");
				
			}else if(diagnostico.isMiccionexcesiva() && diagnostico.isCansancio() && diagnostico.isDificultadrespirar()
					&& diagnostico.isInflamacionabdomen() && diagnostico.isInflamacionpiernas()){
				diagnostico.setDiagnostico("Amiloidosis card\u00edaca.");
				diagnostico.setTratamiento("Reducci\u00f3n de sal (sodio) y l\u00edquidos en la dieta. Uso de medicamentos como diur\u00e9ticos para eliminar l\u00edquidos, "
						+ "digoxina o betabloqueadores. Otros tratamientos pueden abarcar quimioterapia, uso de desfibriladores, marcapasos o medicamentos "
						+ "antiinflamatorios.");
				
			}else if(diagnostico.isFiebre() && diagnostico.isOjoslenguarojos() && diagnostico.isMembranasmucosas() && diagnostico.isHinchazonpies()
					&& diagnostico.isErupcionescutaneas() && diagnostico.isInflamancionganglios() && diagnostico.isDescamacion()){
				diagnostico.setDiagnostico("Enfermedad de Kawasaki.");
				diagnostico.setTratamiento("El tratamiento est\u00e1ndar para esta enfermedad es la gammaglobulina intravenosa que se administra en dosis altas. "
						+ "Tambi\u00e9n se administra el \u00e1cido acetilsalic\u00edlico a la vez.");
				
			}else{
				diagnostico.setDiagnostico("Los s\u00edntomas seleccionados no especifican un diagn\u00f3stico concluyente.");
			}
			
			taDiagnostico.setText(diagnostico.getDiagnostico());
			taTratamiento.setText(diagnostico.getTratamiento());
			
			tabbedPane.setSelectedIndex(1);
			
		}
	}
	
	private class chckbxDescamacinItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDescamacion(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDescamacion(false);
		    }
		}
	}
	
	private class chckbxDificultadParaRespirarItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setDificultadrespirar(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setDificultadrespirar(false);
		    }
		}
	}
	
	private class chckbxTosItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setTos(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setTos(false);
		    }
		}
	}
	
	private class chckbxTosConSangreItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setTossangre(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setTossangre(false);
		    }
		}
	}
	
	private class chckbxInfeccionesRespiratoriasItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		        diagnostico.setInfeccionesrespirar(true);
		    }
		    else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    	diagnostico.setInfeccionesrespirar(false);
		    }
		}
	}

	private class BtnGenerarInformeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (JOptionPane.showConfirmDialog(getPanel(),
					"\u00BFDesea guardar los datos del diagn\u00f3stico en un fichero de texto?", "Guardar...",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				FileWriter fichero = null;
				PrintWriter pw = null;
				try {
					fichero = new FileWriter("Diagn\u00f3stico preliminar.txt");
					pw = new PrintWriter(fichero);

					pw.println("Resultado: " + taDiagnostico.getText());
					
					if (taTratamiento.getText().length() != 0){
						pw.println();
						pw.print("Tratamiento: " + taTratamiento.getText());
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (null != fichero){
							fichero.close();
						}
						
						JOptionPane.showMessageDialog(getPanel(), "El archivo ha sido guardado correctamente", "Guardar...",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		}
	}

}
