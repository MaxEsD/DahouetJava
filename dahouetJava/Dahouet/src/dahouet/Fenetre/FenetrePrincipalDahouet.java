package dahouet.Fenetre;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JSeparator;

public class FenetrePrincipalDahouet extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					FenetrePrincipalDahouet frame = new FenetrePrincipalDahouet();

					setBackgroundImage(frame, new File("img/800x600.jpg"));

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static JPanel setBackgroundImage(JFrame frame, final File img)
			throws IOException {
		JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1;

			private BufferedImage buf = ImageIO.read(img);

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(buf, 0, 0, null);
			}
		};

		frame.setContentPane(panel);

		return panel;
	}

	/**
	 * Create the frame.
	 */
	public FenetrePrincipalDahouet() {
		setTitle("Dahou\u00EBt V.1.0 - Enregistrement d'un voilier");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);

		JMenuItem mntmNouveau = new JMenuItem("Nouveau");
		mntmNouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
				InputEvent.CTRL_MASK));
		mnFichier.add(mntmNouveau);
		mntmNouveau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fenetre2 newFrame = new fenetre2();
				newFrame.pack();
				newFrame.setVisible(true);

			}
		});

		mnFichier.add(mntmNouveau);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				InputEvent.CTRL_MASK));
		mnFichier.add(mntmSave);

		JSeparator separator = new JSeparator();
		mnFichier.add(separator);

		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
				InputEvent.CTRL_MASK));
		mnFichier.add(mntmQuit);
		mntmQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				;
			}
		});

		JMenu mnAide = new JMenu("Aide");
		menuBar.add(mnAide);

		JMenuItem mntmAide = new JMenuItem("Aide");
		mnAide.add(mntmAide);
		mntmAide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane jop2;
				jop2 = new JOptionPane();
				ImageIcon img = new ImageIcon("img/aide.png");
				JOptionPane.showMessageDialog(null, "T'es alone mon gars !!",
						"AIDE", JOptionPane.INFORMATION_MESSAGE, img);
			}
		});

		JMenuItem mntmAPropos = new JMenuItem("a propos...");
		mntmAPropos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
		mnAide.add(mntmAPropos);
		mntmAPropos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane jop1;
				jop1 = new JOptionPane();
				ImageIcon img = new ImageIcon("img/icon.png");
				JOptionPane.showMessageDialog(null,
						"Dahouet\n (C) Maxime ESBENS 2015\n Version 1.0",
						"A propos de Dahouët", JOptionPane.INFORMATION_MESSAGE,
						img);
			}
		});

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}
}
