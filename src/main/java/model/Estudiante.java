package model;

public class Estudiante {

	
	private int id;
	private String rut;
	private String nombre;
	private String email;
	private String telefono;
	
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(int id, String rut, String nombre, String email, String telefono) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
	
	
	
}
