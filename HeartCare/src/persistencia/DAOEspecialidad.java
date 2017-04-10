package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.Especialidad;
import dominio.Especialista;

public class DAOEspecialidad {
	public Especialidad read(int id) throws SQLException{
		String sql = "SELECT * FROM Especialidad WHERE Id = " + id + ";";
		DAOEspecialista de = new  DAOEspecialista();
		ResultSet rs = DBBroker.getInstance().read(sql);
		rs.next();
		Especialista jefe = de.readOnlyName(rs.getInt(3));
		return new Especialidad(rs.getString(2), jefe);
		
	}
	
}
