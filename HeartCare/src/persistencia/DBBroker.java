package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBBroker {
	private static String rutaDB = ".\\HeartCare_Database.accdb;";
	private static String usuarioBD="";
	private static String passwordBD="";
	private static DBBroker instance = null;
	private static Connection conexion;
	

	public DBBroker() {

		//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		try {
			// http://ucanaccess.sourceforge.net/site.html
			conexion=DriverManager.getConnection("jdbc:ucanaccess://"+this.rutaDB,this.usuarioBD,this.passwordBD);
			//System.out.println(": Successfully connected to database. Data source name:\n  " 
			//		+ conexion.getMetaData().getURL());
		} catch (Exception err) {
			System.out.println(": Exception: " + err.getMessage());
		}
		
	}
	
	public static DBBroker getInstance(){
		if(instance == null){
			instance = new DBBroker();
		}
		return instance;
	}
	
	public ResultSet read(String sql) throws SQLException{
		Statement st = conexion.createStatement();
		ResultSet rs=st.executeQuery(sql);
		return rs;
	}
	

}
