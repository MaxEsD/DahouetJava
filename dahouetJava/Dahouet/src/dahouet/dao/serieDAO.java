package dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import dahouet.Fenetre.fenetre2;

public class serieDAO {

	public static void remplirSerie() {
		Connection c = connect.cConnect();
		String sql = "select Nom_serie from serie ";
		Statement stmt;
		
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			/*ResultSet rs = null;
			stmt = c.createStatement();
			rs = stmt.executeQuery(sql);*/

			while (rs.next()) {
				/*String nomserie = rs.getString("Nom_serie");*/
				/*fenetre2.comboBox.addItem(nomserie);*/
				fenetre2.comboBox.addItem(rs.getString("Nom_serie"));
		
			}
			/*stmt.close();*/
			rs.close();
		} catch (SQLException e) { e.printStackTrace();
			JOptionPane.showMessageDialog(null, "bug");
		}

	}
}
