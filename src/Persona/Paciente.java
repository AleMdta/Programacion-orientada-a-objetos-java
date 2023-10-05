package Persona;

public class Paciente {
	
	// 1. Atributos
	String numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	private boolean seguroGastosMedicos;//Agregando el modificador de acceso private
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	
	// 2. Constructores
	/*
	 * Sobrecarga de métodos:
	 * 2 constructores con el mismo nombre pero con una cantidad distinta de parámetros
	 * */
	//2.1 Necesito un constructor que recopile todos los datos
	Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos,
			String cita, String doctorAsignado, boolean alergias) {
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}
	
	
	//2.2 Otro constructor que recoplite solo los datos requeridos (que sean campos obligatorios para poder hacer el registro del paciente)
	Paciente(String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos){
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
	}

	
	// 3. Métodos (click derecho>source>Generate toString)
	@Override //Sobreescritura
	//Método llamado toString que utiliza datos del tipo String
	public String toString() {
		return "Paciente [numeroSeguroSocial=" + numeroSeguroSocial + ", tipoSangre=" + tipoSangre + ", expediente="
				+ expediente + ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	}

	
	//Getter-obtener (Sacamos una copia del dato seguroGastosMedicos)
	public boolean getSeguroGastosMedicos() {
		return seguroGastosMedicos;
	}

	
	//Setter-poner
	public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
		this.seguroGastosMedicos = seguroGastosMedicos;
	}
	
	
	

}
