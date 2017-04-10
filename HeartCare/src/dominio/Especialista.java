package dominio;

public class Especialista {
	private String nombre;
	private String pass;
	private int edad;
	private char sexo;
	private String consulta;
	private String edificio;
	private String ciudad;
	private int ext_tel;
	private String email;
	private String horario;
	private Especialidad especialidad;
	private Boolean operar;
	private String dni;
	
	public Especialista(String nombre, String pass, int edad, char sexo, String consulta, String edificio,
			String ciudad, int ext_tel, String email, String horario, Especialidad especialidad, Boolean operar,
			String dni) {
		super();
		this.nombre = nombre;
		this.pass = pass;
		this.edad = edad;
		this.sexo = sexo;
		this.consulta = consulta;
		this.edificio = edificio;
		this.ciudad = ciudad;
		this.ext_tel = ext_tel;
		this.email = email;
		this.horario = horario;
		this.especialidad = especialidad;
		this.operar = operar;
		this.dni = dni;
	}

	public Especialista(String nombre) {
		super();
		this.nombre = nombre;
		this.horario = "No disponible";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		ciudad = ciudad;
	}

	public int getExt_tel() {
		return ext_tel;
	}

	public void setExt_tel(int ext_tel) {
		this.ext_tel = ext_tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Boolean getOperar() {
		return operar;
	}

	public void setOperar(Boolean operar) {
		this.operar = operar;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
