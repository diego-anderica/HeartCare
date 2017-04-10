package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Especialidad;
import dominio.Especialista;

public class DAOEspecialista {
	private List<Especialista> especialistas;
	Especialista especialista;
	
	public List<Especialista> readall() throws SQLException{
		String sql = "SELECT * FROM Especialista";
		especialistas = new ArrayList<Especialista>();
		DAOEspecialidad de = new DAOEspecialidad();
		
		ResultSet rs = DBBroker.getInstance().read(sql);
		
		while(rs.next()){
			Especialidad especialidad = de.read(rs.getInt(12));
			Especialista e = new Especialista(rs.getString(2),rs.getString(3),rs.getInt(4),
					rs.getString(5).charAt(0),rs.getString(6),rs.getString(7),rs.getString(8),
					rs.getInt(9),rs.getString(10),rs.getString(11), especialidad,
					rs.getBoolean(13), rs.getString(14));
			especialistas.add(e);
		}
		
		
		return especialistas;		
	}

	public Especialista readOnlyName(int id) throws SQLException {
		String sql = "SELECT * FROM Especialista WHERE Id = " + id + ";";
		
		ResultSet rs = DBBroker.getInstance().read(sql);
		rs.next();
		especialista = new Especialista(rs.getString(2));
		return especialista;
	}

	public Especialista readId(int id) throws SQLException {
		String sql =  "SELECT * FROM Especialista WHERE Id = " + id + ";";
		DAOEspecialidad de = new DAOEspecialidad();
		
		ResultSet rs = DBBroker.getInstance().read(sql);
		
		rs.next();
		Especialidad especialidad = de.read(rs.getInt(12));
		especialista = new Especialista(rs.getString(2),rs.getString(3),rs.getInt(4),
				rs.getString(5).charAt(0),rs.getString(6),rs.getString(7),rs.getString(8),
				rs.getInt(9),rs.getString(10),rs.getString(11), especialidad,
				rs.getBoolean(13), rs.getString(14));

		return especialista;
	}

}
