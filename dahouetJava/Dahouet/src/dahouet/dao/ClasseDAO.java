package dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dahouet.Fenetre.fenetre2;


public class ClasseDAO {
	public static void rempliClasse(int numserie)
	{
		Connection c = connect.cConnect();
		Statement stmt;
		String sql = "select Nom_classe from classe where Num_serie ="+numserie;
		
		try 
		{ 
			ResultSet rs = null ;  
			stmt = c.createStatement(); 
			rs = stmt.executeQuery(sql); 

			while (rs.next()) 
			{ 
				String nomclasse = rs.getString("Nom_classe");
				fenetre2.comboBox_1.addItem(nomclasse); 
			} 
		}
		catch (Exception ex) 
		{ 
			JOptionPane.showMessageDialog(null, "erreur");
		} 
	}

}
