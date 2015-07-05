package dahouet.Fenetre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;

import dahouet.Model.Newpropriocreate;
import dahouet.Model.Voilier;
import dahouet.Model.Proprietaire;
import dahouet.dao.ClasseDAO;
import dahouet.dao.VoilierDAO;
import dahouet.dao.proprietaireDAO;
import dahouet.dao.serieDAO;

import javax.swing.JTextField;

public class fenetre2 extends JFrame {

	public static JComboBox<String> comboBox = new JComboBox<String>();
	public static JComboBox<String> comboBox_1 = new JComboBox<String>();
	public static JComboBox<Proprietaire> comboBox_2 = new JComboBox<Proprietaire>();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetre2 frame = new fenetre2();
					frame.pack();
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
	public fenetre2() {
		setTitle("Dahouet V.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblEnregistrementDeVoilier = new JLabel(
				"ENREGISTREMENT DE VOILIER");
		GridBagConstraints gbc_lblEnregistrementDeVoilier = new GridBagConstraints();
		gbc_lblEnregistrementDeVoilier.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnregistrementDeVoilier.gridx = 1;
		gbc_lblEnregistrementDeVoilier.gridy = 1;
		contentPane.add(lblEnregistrementDeVoilier,
				gbc_lblEnregistrementDeVoilier);

		JLabel lblNomVoilier = new JLabel("Nom du voilier");
		GridBagConstraints gbc_lblNomVoilier = new GridBagConstraints();
		gbc_lblNomVoilier.anchor = GridBagConstraints.EAST;
		gbc_lblNomVoilier.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomVoilier.gridx = 0;
		gbc_lblNomVoilier.gridy = 3;
		contentPane.add(lblNomVoilier, gbc_lblNomVoilier);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblNomDeLa = new JLabel("Nom de la serie");
		GridBagConstraints gbc_lblNomDeLa = new GridBagConstraints();
		gbc_lblNomDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblNomDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomDeLa.gridx = 0;
		gbc_lblNomDeLa.gridy = 4;
		contentPane.add(lblNomDeLa, gbc_lblNomDeLa);

		comboBox = new JComboBox<String>();
		serieDAO.remplirSerie();

		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 4;
		contentPane.add(comboBox, gbc_comboBox_4);

		JLabel lblNomClasse = new JLabel("Nom de la classe");
		GridBagConstraints gbc_lblNomClasse = new GridBagConstraints();
		gbc_lblNomClasse.anchor = GridBagConstraints.EAST;
		gbc_lblNomClasse.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomClasse.gridx = 0;
		gbc_lblNomClasse.gridy = 5;
		contentPane.add(lblNomClasse, gbc_lblNomClasse);

		comboBox_1 = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String choix = valcomboSerie();

				switch (choix) {
				case "Habitables":
					comboBox_1.removeAllItems();
					ClasseDAO.rempliClasse(1);
					break;

				case "Quillards de sport":
					comboBox_1.removeAllItems();
					ClasseDAO.rempliClasse(2);
					break;
				}
			}
		});
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		contentPane.add(comboBox_1, gbc_comboBox_1);

		JLabel lblNomProprietaire = new JLabel("Nom du Proprietaire");
		GridBagConstraints gbc_lblNomProprietaire = new GridBagConstraints();
		gbc_lblNomProprietaire.anchor = GridBagConstraints.EAST;
		gbc_lblNomProprietaire.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomProprietaire.gridx = 0;
		gbc_lblNomProprietaire.gridy = 6;
		contentPane.add(lblNomProprietaire, gbc_lblNomProprietaire);

		comboBox_2 = new JComboBox<Proprietaire>();
		proprietaireDAO.rempli_comboBoxProprio();

		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 6;
		contentPane.add(comboBox_2, gbc_comboBox_2);

		JButton button_2 = new JButton("+");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 6;
		contentPane.add(button_2, gbc_button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Newproprio newFrame = new Newproprio();
				newFrame.pack();
				newFrame.setVisible(true);

			}
		});

		JLabel lblNumeroDeVoile = new JLabel("Numero de voile");
		GridBagConstraints gbc_lblNumeroDeVoile = new GridBagConstraints();
		gbc_lblNumeroDeVoile.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroDeVoile.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDeVoile.gridx = 0;
		gbc_lblNumeroDeVoile.gridy = 7;
		contentPane.add(lblNumeroDeVoile, gbc_lblNumeroDeVoile);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 7;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		JButton btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(0, 0, 0, 5);
		gbc_btnValider.gridx = 0;
		gbc_btnValider.gridy = 9;
		contentPane.add(btnValider, gbc_btnValider);
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Proprietaire proprio = (Proprietaire) comboBox_2.getSelectedItem();
				Voilier voilier = new Voilier(Integer.parseInt(textField.getText()), proprio.getId(), (String)comboBox_1.getSelectedItem(), textField_2.getText());
				VoilierDAO.createVoilier(voilier);
				JOptionPane jop2 = new JOptionPane();
				JOptionPane.showMessageDialog(null, "enregistrement réussi",
						"MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});

		JButton btnQuitter = new JButton("Quitter");
		GridBagConstraints gbc_btnQuitter = new GridBagConstraints();
		gbc_btnQuitter.gridx = 2;
		gbc_btnQuitter.gridy = 9;
		contentPane.add(btnQuitter, gbc_btnQuitter);
		btnQuitter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}

		});
	}

	/*public String valcomboSerie() {
		return (String) this.comboBox.getSelectedItem();*/
		

		public static String valcomboSerie() {
			return (String) comboBox.getSelectedItem();	
	}
		
	
		
		
		
		
		
}
