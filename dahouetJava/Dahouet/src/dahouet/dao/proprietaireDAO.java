package dahouet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dahouet.Fenetre.Newproprio;
import dahouet.Fenetre.fenetre2;
import dahouet.Model.Club;
import dahouet.Model.Newpropriocreate;
import dahouet.Model.Proprietaire;

public class proprietaireDAO {
	public static void rempli_comboBoxProprio()
	{
		Connection c = connect.cConnect();
		Statement stmt;
		String sql = "select * from proprietaire";
		
		try 
		{ 
			ResultSet rs = null ;  
			stmt = c.createStatement(); 
			rs = stmt.executeQuery(sql); 

			while (rs.next()) 
			{ 
				int id = rs.getInt("Num_proprietaire");
				int club = rs.getInt("Num_club");
				String nomProprio = rs.getString("Nom_proprietaire");
				String coord = rs.getString("Coordonnees_proprietaire");
				Proprietaire proprio = new Proprietaire(id, club, nomProprio, coord);
				fenetre2.comboBox_2.addItem(proprio); 
			} 
		}
		catch (Exception ex) 
		{ 
			JOptionPane.showMessageDialog(null, "erreur");
		} 
	}
	
	public static void rempli_comboBoxClub(){
		Connection c = connect.cConnect();
		Statement stmt;
		String sql = "select * from club";
		
		try 
		{ 
			ResultSet rs = null ;  
			stmt = c.createStatement(); 
			rs = stmt.executeQuery(sql); 

			while (rs.next()) 
			{ 
				int id = rs.getInt("Num_club");
				String nomClub = rs.getString("nom_club");
				Club club = new Club(id, nomClub);
				Newproprio.comboBox.addItem(club);
			} 
		}
		catch (Exception ex) 
		{ 
			JOptionPane.showMessageDialog(null, "erreur");
		} 
	}
		
	



public static void createProprio(  Proprietaire p) {

	Connection c = connect.cConnect();
	PreparedStatement stm;
	try {
		stm = c.prepareStatement("INSERT INTO proprietaire (Num_club, Nom_Proprietaire, Coordonnees_proprietaire) VALUES (?,?,?)");

		stm.setInt(1, p.getNumClub());
		stm.setString(2, p.getNomProprio());
		stm.setString(3, p.getCoord());
		
		stm.execute();
		

		stm.close();

	} catch (SQLException e) {
		e.printStackTrace();
		throw new RuntimeException();
	}

}
}







