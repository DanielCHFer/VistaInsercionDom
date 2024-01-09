package paquete;

public class Reserva {
	
	private String nombre;
	private String telefono;
	private String fechaReserva;
	private String tipoReserva;
	private String numeroInvitados;
	private String tipoCocina;
	
	private String numeroJornadas;
	private String requiereHabitaciones;
	
	private String comensalesMesa;
	private String tipoMesa;
	
	public Reserva() {
		
	}
	
	public Reserva(String nombre, String telefono, String fechaReserva, String tipoReserva, String numeroInvitados,
			String tipoCocina, String numeroJornadas, String requiereHabitaciones, String comensalesMesa,
			String tipoMesa) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaReserva = fechaReserva;
		this.tipoReserva = tipoReserva;
		this.numeroInvitados = numeroInvitados;
		this.tipoCocina = tipoCocina;
		this.numeroJornadas = numeroJornadas;
		this.requiereHabitaciones = requiereHabitaciones;
		this.comensalesMesa = comensalesMesa;
		this.tipoMesa = tipoMesa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

	public String getNumeroInvitados() {
		return numeroInvitados;
	}

	public void setNumeroInvitados(String numeroInvitados) {
		this.numeroInvitados = numeroInvitados;
	}

	public String getTipoCocina() {
		return tipoCocina;
	}

	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}

	public String getNumeroJornadas() {
		return numeroJornadas;
	}

	public void setNumeroJornadas(String numeroJornadas) {
		this.numeroJornadas = numeroJornadas;
	}

	public String getRequiereHabitaciones() {
		return requiereHabitaciones;
	}

	public void setRequiereHabitaciones(String requiereHabitaciones) {
		this.requiereHabitaciones = requiereHabitaciones;
	}

	public String getComensalesMesa() {
		return comensalesMesa;
	}

	public void setComensalesMesa(String comensalesMesa) {
		this.comensalesMesa = comensalesMesa;
	}

	public String getTipoMesa() {
		return tipoMesa;
	}

	public void setTipoMesa(String tipoMesa) {
		this.tipoMesa = tipoMesa;
	}
	
	public void informarReservaRellenada() {
		System.out.println("Se ha creado una reserva de tipo "+getTipoReserva()+" a nombre de "+getNombre()+".");
	}
}
