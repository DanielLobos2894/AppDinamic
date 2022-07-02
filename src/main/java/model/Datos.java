package model;

import java.sql.Date;

public class Datos {

	private int id;
	private String rutE ;
	private String nombreE;
	private String emailE;
	private String telefonoE;
	private Date fechaM;
	private int codigoC;
	private String nombreC;
	private String nombreF;
	private String emailF;
	private String telefonoF;
	
	public Datos() {
		super();
	}

	public Datos(int id, String rutE, String nombreE, String emailE, String telefonoE, Date fechaM, int codigoC,
			String nombreC, String nombreF, String emailF, String telefonoF) {
		super();
		this.id = id;
		this.rutE = rutE;
		this.nombreE = nombreE;
		this.emailE = emailE;
		this.telefonoE = telefonoE;
		this.fechaM = fechaM;
		this.codigoC = codigoC;
		this.nombreC = nombreC;
		this.nombreF = nombreF;
		this.emailF = emailF;
		this.telefonoF = telefonoF;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutE() {
		return rutE;
	}

	public void setRutE(String rutE) {
		this.rutE = rutE;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getEmailE() {
		return emailE;
	}

	public void setEmailE(String emailE) {
		this.emailE = emailE;
	}

	public String getTelefonoE() {
		return telefonoE;
	}

	public void setTelefonoE(String telefonoE) {
		this.telefonoE = telefonoE;
	}

	public Date getFechaM() {
		return fechaM;
	}

	public void setFechaM(Date fechaM) {
		this.fechaM = fechaM;
	}

	public int getCodigoC() {
		return codigoC;
	}

	public void setCodigoC(int codigoC) {
		this.codigoC = codigoC;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public String getNombreF() {
		return nombreF;
	}

	public void setNombreF(String nombreF) {
		this.nombreF = nombreF;
	}

	public String getEmailF() {
		return emailF;
	}

	public void setEmailF(String emailF) {
		this.emailF = emailF;
	}

	public String getTelefonoF() {
		return telefonoF;
	}

	public void setTelefonoF(String telefonoF) {
		this.telefonoF = telefonoF;
	}
	
	
	
}
	