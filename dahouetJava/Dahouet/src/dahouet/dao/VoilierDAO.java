package dahouet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dahouet.Model.Voilier;

public class VoilierDAO {

	
	
	public static void createVoilier( Voilier v) {

		Connection c = connect.cConnect();
		PreparedStatement stm;
		try {
			stm = c.prepareStatement("INSERT INTO voilier (Num_voile, Num_Proprietaire, Nom_classe, Nom_voilier) VALUES (?,?,?,?)");

			stm.setInt(1, v.getNum_voile());
			stm.setInt(2, v.getNum_proprietaire());
			stm.setString(3, v.getNom_classe());
			stm.setString(4, v.getNom_voilier());
		
			stm.execute();
			

			stm.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}
	}

