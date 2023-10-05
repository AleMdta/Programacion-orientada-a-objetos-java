package Persona;

public class Dentista extends Persona { // Mi dentista es una persona, por lo que persona hereda sus atributos a Dentrista
	
	//1. Atributos
	/*
	 * No es necesario crear los valores de nombre, apellido, edad, etc, porque los voy a heredar de la clase persona.
	 * */
	String especialidad;
	String cedula;
	String consultorioAsigando;
	String experiencia;
	String turno;
	int salario;
	
	
	//2. Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad, String cedula, String consultorioAsigando, String experiencia, String turno, int salario) {
		
		super(nombre, apellido, edad, telefono, email);//Atributos que trae de mi clase Persona
		
		//Información de la clase Paciente
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsigando = consultorioAsigando;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}
	
	//3. Metodos (Metodo para calcular salario basado en la experiencia
		//Experiencia  = basico, intermedio, avanzado 
		
		//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40000, si es avanzado gana 50000
	void calcularSalario() {
		//Lógica para calcular
		if (experiencia.equals("basico")) {
			salario = 30000;
		}else if (experiencia.equals("intermedio")) {
			salario = 40000;	
		}else if (experiencia.equals("avanzado")) {
			salario = 50000;	
		}
	}
	
	// Método para imprimir info
	void imprimirInfoDentista() {
		System.out.println("La especialidad: " + especialidad);
		System.out.println("El salario es: " + salario);
	}
	
	
		

}
