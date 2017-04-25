package dominio;

public class Diagnostico {
	
	private boolean dolordepecho = false, dolorbrazoizq = false, hinchazonpies = false, hinchazonabdomen = false;
	private boolean inflamacionabdomen = false, inflamacionpiernas = false, inflamancionganglios = false;
	private boolean erupcionescutaneas = false, ojoslenguarojos = false;
	private boolean dificultadrespirar = false, tos = false, tossangre = false, infeccionesrespirar = false;
	private boolean arritmias = false, alteracionesritmo = false, pusloirregular = false;
	private boolean miccionexcesiva = false, retencionliquidos = false, bajaproduccionorina = false;
	private boolean ganasvomitar = false, faltaapetito = false, fiebre = false, cansancio = false;
	private boolean mareos = false, vertigo = false, debilidad = false, perdidaconocimiento = false, sudoracion = false;
	private boolean palidez = false, membranasmucosas = false, descamacion = false;
	
	private String diagnostico;
	private String tratamiento;
	
	public Diagnostico(){
		
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	
	public boolean isDescamacion() {
		return descamacion;
	}

	public void setDescamacion(boolean descamacion) {
		this.descamacion = descamacion;
	}

	public boolean isDolordepecho() {
		return dolordepecho;
	}

	public void setDolordepecho(boolean dolordepecho) {
		this.dolordepecho = dolordepecho;
	}

	public boolean isDolorbrazoizq() {
		return dolorbrazoizq;
	}

	public void setDolorbrazoizq(boolean dolorbrazoizq) {
		this.dolorbrazoizq = dolorbrazoizq;
	}

	public boolean isHinchazonpies() {
		return hinchazonpies;
	}

	public void setHinchazonpies(boolean hinchazonpies) {
		this.hinchazonpies = hinchazonpies;
	}

	public boolean isHinchazonabdomen() {
		return hinchazonabdomen;
	}

	public void setHinchazonabdomen(boolean hinchazonabdomen) {
		this.hinchazonabdomen = hinchazonabdomen;
	}

	public boolean isInflamacionabdomen() {
		return inflamacionabdomen;
	}

	public void setInflamacionabdomen(boolean inflamacionabdomen) {
		this.inflamacionabdomen = inflamacionabdomen;
	}

	public boolean isInflamacionpiernas() {
		return inflamacionpiernas;
	}

	public void setInflamacionpiernas(boolean inflamacionpiernas) {
		this.inflamacionpiernas = inflamacionpiernas;
	}

	public boolean isInflamancionganglios() {
		return inflamancionganglios;
	}

	public void setInflamancionganglios(boolean inflamancionganglios) {
		this.inflamancionganglios = inflamancionganglios;
	}

	public boolean isErupcionescutaneas() {
		return erupcionescutaneas;
	}

	public void setErupcionescutaneas(boolean erupcionescutaneas) {
		this.erupcionescutaneas = erupcionescutaneas;
	}

	public boolean isOjoslenguarojos() {
		return ojoslenguarojos;
	}

	public void setOjoslenguarojos(boolean ojoslenguarojos) {
		this.ojoslenguarojos = ojoslenguarojos;
	}

	public boolean isDificultadrespirar() {
		return dificultadrespirar;
	}

	public void setDificultadrespirar(boolean dificultadrespirar) {
		this.dificultadrespirar = dificultadrespirar;
	}

	public boolean isTos() {
		return tos;
	}

	public void setTos(boolean tos) {
		this.tos = tos;
	}

	public boolean isTossangre() {
		return tossangre;
	}

	public void setTossangre(boolean tossangre) {
		this.tossangre = tossangre;
	}

	public boolean isInfeccionesrespirar() {
		return infeccionesrespirar;
	}

	public void setInfeccionesrespirar(boolean infeccionesrespirar) {
		this.infeccionesrespirar = infeccionesrespirar;
	}

	public boolean isArritmias() {
		return arritmias;
	}

	public void setArritmias(boolean arritmias) {
		this.arritmias = arritmias;
	}

	public boolean isAlteracionesritmo() {
		return alteracionesritmo;
	}

	public void setAlteracionesritmo(boolean alteracionesritmo) {
		this.alteracionesritmo = alteracionesritmo;
	}

	public boolean isPusloirregular() {
		return pusloirregular;
	}

	public void setPusloirregular(boolean pusloirregular) {
		this.pusloirregular = pusloirregular;
	}

	public boolean isMiccionexcesiva() {
		return miccionexcesiva;
	}

	public void setMiccionexcesiva(boolean miccionexcesiva) {
		this.miccionexcesiva = miccionexcesiva;
	}

	public boolean isRetencionliquidos() {
		return retencionliquidos;
	}

	public void setRetencionliquidos(boolean retencionliquidos) {
		this.retencionliquidos = retencionliquidos;
	}

	public boolean isBajaproduccionorina() {
		return bajaproduccionorina;
	}

	public void setBajaproduccionorina(boolean bajaproduccionorina) {
		this.bajaproduccionorina = bajaproduccionorina;
	}

	public boolean isGanasvomitar() {
		return ganasvomitar;
	}

	public void setGanasvomitar(boolean ganasvomitar) {
		this.ganasvomitar = ganasvomitar;
	}

	public boolean isFaltaapetito() {
		return faltaapetito;
	}

	public void setFaltaapetito(boolean faltaapetito) {
		this.faltaapetito = faltaapetito;
	}

	public boolean isFiebre() {
		return fiebre;
	}

	public void setFiebre(boolean fiebre) {
		this.fiebre = fiebre;
	}

	public boolean isCansancio() {
		return cansancio;
	}

	public void setCansancio(boolean cansancio) {
		this.cansancio = cansancio;
	}

	public boolean isMareos() {
		return mareos;
	}

	public void setMareos(boolean mareos) {
		this.mareos = mareos;
	}

	public boolean isVertigo() {
		return vertigo;
	}

	public void setVertigo(boolean vertigo) {
		this.vertigo = vertigo;
	}

	public boolean isDebilidad() {
		return debilidad;
	}

	public void setDebilidad(boolean debilidad) {
		this.debilidad = debilidad;
	}

	public boolean isPerdidaconocimiento() {
		return perdidaconocimiento;
	}

	public void setPerdidaconocimiento(boolean perdidaconocimiento) {
		this.perdidaconocimiento = perdidaconocimiento;
	}

	public boolean isSudoracion() {
		return sudoracion;
	}

	public void setSudoracion(boolean sudoracion) {
		this.sudoracion = sudoracion;
	}

	public boolean isPalidez() {
		return palidez;
	}

	public void setPalidez(boolean palidez) {
		this.palidez = palidez;
	}

	public boolean isMembranasmucosas() {
		return membranasmucosas;
	}

	public void setMembranasmucosas(boolean membranasmucosas) {
		this.membranasmucosas = membranasmucosas;
	}
	
	
	

}
