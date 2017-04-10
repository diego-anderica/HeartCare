package dominio;

public class Especialidad {
	private String nombre;
	private Especialista jefe;
	
	public Especialidad(String nombre, Especialista jefe) {
		super();
		this.nombre = nombre;
		this.jefe = jefe;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Especialista getJefe() {
		return jefe;
	}
	
	public void setJefe(Especialista jefe) {
		this.jefe = jefe;
	}
	

}
