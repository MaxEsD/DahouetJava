package dahouet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {

		private static Connection c=null;
	
	  final static String URL = "jdbc:mysql://localhost/dahouet_java";

    /**
     * 
     * @return RunTimeException() if any pb
     */
 public static Connection  cConnect () 
 {
	 if (c ==null){

      try
      {
    	  Class.forName("com.mysql.jdbc.Driver").newInstance();

        // 
         c= DriverManager.getConnection(URL,"root","");
      }
        catch(SQLException sqlE)
        {
        	//TODO Logging
            System.out.println("Sql Erreur " + sqlE.getMessage());
            throw new RuntimeException();
        }
        catch(Exception e)
        {
           e.printStackTrace();
           throw new RuntimeException();
        }
 }
 return c;
 }
}


