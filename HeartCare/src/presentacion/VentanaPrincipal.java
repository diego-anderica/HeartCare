package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;

import dominio.Especialista;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class VentanaPrincipal {

	private Especialista especialista;
	private JFrame frmHeartCare;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmAcercaDe;
	private JPanel pnlBotones;
	private JPanel pnlContenido;
	private JButton btnInicio;
	private JButton btnDiagnosticar;
	private JButton btnEspecialistas;
	private JPanel pnlInicio;
	private JPanel pnlEspecialistas;
	private JPanel pnlDiagnosticar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal(new Especialista("Admin"));
					window.frmHeartCare.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal(Especialista especialista) {
		this.especialista = especialista;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHeartCare = new JFrame();
		frmHeartCare.addWindowListener(new FrmHeartCareWindowListener());
		frmHeartCare.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/presentacion/Imagenes/cardiograma24.png")));
		frmHeartCare.setTitle("HeartCare - Sistema Experto");
		frmHeartCare.setBounds(100, 100, 1005, 763);
		frmHeartCare.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		menuBar = new JMenuBar();
		frmHeartCare.setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new SalirActionListener());
		mnArchivo.add(mntmSalir);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDe = new JMenuItem("Acerca de...");
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String autores = "HeartCare\u00A9\nAutores\nDiego And\u00E9rica Richard\nRuth Rodr\u00EDguez-Manzaneque L\u00f3pez";
				JOptionPane.showMessageDialog(null, autores, "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnAyuda.add(mntmAcercaDe);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{128, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frmHeartCare.getContentPane().setLayout(gridBagLayout);
		
		pnlBotones = new JPanel();
		GridBagConstraints gbc_pnlBotones = new GridBagConstraints();
		gbc_pnlBotones.insets = new Insets(0, 0, 0, 5);
		gbc_pnlBotones.fill = GridBagConstraints.BOTH;
		gbc_pnlBotones.gridx = 0;
		gbc_pnlBotones.gridy = 0;
		frmHeartCare.getContentPane().add(pnlBotones, gbc_pnlBotones);
		pnlBotones.setLayout(new GridLayout(3, 0, 0, 0));
		
		btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new CambiarPanelActionListener());
		btnInicio.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnInicio.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInicio.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Imagenes/forma-de-usuario-negro.png")));
		pnlBotones.add(btnInicio);
		
		btnDiagnosticar = new JButton("Diagnosticar");
		btnDiagnosticar.addActionListener(new CambiarPanelActionListener());
		btnDiagnosticar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDiagnosticar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Imagenes/estetoscopio.png")));
		btnDiagnosticar.setVerticalTextPosition(SwingConstants.BOTTOM);
		pnlBotones.add(btnDiagnosticar);
		
		btnEspecialistas = new JButton("Especialistas");
		btnEspecialistas.addActionListener(new CambiarPanelActionListener());
		btnEspecialistas.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Imagenes/especialista.png")));
		btnEspecialistas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnEspecialistas.setHorizontalTextPosition(SwingConstants.CENTER);
		pnlBotones.add(btnEspecialistas);
		
		pnlContenido = new JPanel();
		GridBagConstraints gbc_pnlContenido = new GridBagConstraints();
		gbc_pnlContenido.fill = GridBagConstraints.BOTH;
		gbc_pnlContenido.gridx = 1;
		gbc_pnlContenido.gridy = 0;
		frmHeartCare.getContentPane().add(pnlContenido, gbc_pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		pnlInicio = new PanelInicio(especialista);
		pnlContenido.add(pnlInicio, "Inicio");
		
		pnlEspecialistas = new PanelEspecialistas();
		pnlContenido.add(pnlEspecialistas, "Especialistas");
		
		pnlDiagnosticar = new PanelDiagnosticar();
		pnlContenido.add(pnlDiagnosticar, "Diagnosticar");
	}

	public Window getFrame() {
		return frmHeartCare;
	}
	
	private class SalirActionListener implements ActionListener  {
		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.showConfirmDialog(getFrame(), "Cerrar esta ventana provocar\u00E1 su cierre de sesi\u00F3n", "Salir...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(getFrame(), "Se ha cerrado su sesi\u00F3n", "Cierre de sesi\u00F3n", JOptionPane.PLAIN_MESSAGE);
				mostrarLogin();
			}
		}
	}
	
	private void mostrarLogin (){
		Login frmLogin = new Login ();
		frmLogin.setVisible(true);
		getFrame().dispose();
	}
	
	private class CambiarPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String panel_str = (arg0.getActionCommand());
			String panel = "";
			if (panel_str.equalsIgnoreCase("Inicio")){
				panel = "Inicio";
			}else if (panel_str.equalsIgnoreCase("Diagnosticar")){
				panel = "Diagnosticar";
			}else if (panel_str.equalsIgnoreCase("Especialistas")){
				panel = "Especialistas";
			}
			
			((CardLayout)pnlContenido.getLayout()).show(pnlContenido, panel);
		}
	}
	
	private class FrmHeartCareWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(getFrame(), "Se ha cerrado su sesi\u00F3n", "Cierre de sesi\u00F3n", JOptionPane.PLAIN_MESSAGE);
			mostrarLogin();
		}
	}
	
	
}
