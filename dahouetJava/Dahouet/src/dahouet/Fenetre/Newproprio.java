package dahouet.Fenetre;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import dahouet.Model.Club;
import dahouet.Model.Newpropriocreate;
import dahouet.Model.Proprietaire;
import dahouet.dao.proprietaireDAO;

import javax.swing.JComboBox;

public class Newproprio extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;
	public static JComboBox<Club> comboBox;
	public Newproprio() {
		
		setTitle("Nouveau Proprietaire");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblEnregistrementDunNouveau = new JLabel(
				"Enregistrement d'un nouveau Proprietaire");
		GridBagConstraints gbc_lblEnregistrementDunNouveau = new GridBagConstraints();
		gbc_lblEnregistrementDunNouveau.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnregistrementDunNouveau.gridx = 2;
		gbc_lblEnregistrementDunNouveau.gridy = 1;
		getContentPane().add(lblEnregistrementDunNouveau,
				gbc_lblEnregistrementDunNouveau);

		JLabel lblNom = new JLabel("Nom :");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.anchor = GridBagConstraints.EAST;
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.gridx = 1;
		gbc_lblNom.gridy = 3;
		getContentPane().add(lblNom, gbc_lblNom);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblAdresse = new JLabel("adresse :");
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.gridx = 1;
		gbc_lblAdresse.gridy = 4;
		getContentPane().add(lblAdresse, gbc_lblAdresse);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblClub = new JLabel("Club :");
		GridBagConstraints gbc_lblClub = new GridBagConstraints();
		gbc_lblClub.anchor = GridBagConstraints.EAST;
		gbc_lblClub.insets = new Insets(0, 0, 5, 5);
		gbc_lblClub.gridx = 1;
		gbc_lblClub.gridy = 5;
		getContentPane().add(lblClub, gbc_lblClub);

		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 5;
		getContentPane().add(comboBox, gbc_comboBox);
		proprietaireDAO.rempli_comboBoxClub();

		JButton btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(0, 0, 0, 5);
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 11;
		getContentPane().add(btnValider, gbc_btnValider);

		JButton btnAnnuler = new JButton("annuler");
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.gridx = 2;
		gbc_btnAnnuler.gridy = 11;
		getContentPane().add(btnAnnuler, gbc_btnAnnuler);

		btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}

		});

		btnValider.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Club club = (Club) comboBox.getSelectedItem();
				Proprietaire proprio = new Proprietaire(0, club.getId(), textField_1.getText(),textField_2.getText());
				proprietaireDAO.createProprio(proprio);
				JOptionPane jop2;
				jop2 = new JOptionPane();
				JOptionPane.showMessageDialog(null, "enregistrement réussi",
						"MESSAGE", JOptionPane.INFORMATION_MESSAGE);

			}
		});

	}

	

}
