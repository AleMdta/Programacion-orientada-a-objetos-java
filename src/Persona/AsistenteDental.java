package Persona;

//TRABAJANDO CON ENCAPSULAMIENTO (protección de los datos, cambiando los modificadores de acceso(private, potected, public))
//Es utilizado en el cambio y creación de contraseñas

public class AsistenteDental {
	
	//1. Atributos privados
	private String fechaIngreso;
	private double salario; //Si creamos un atributo privado, debemos crear automaticamnte métodos setter y getter para poder acceder a él.
	
	
	//2. Constructor
	public AsistenteDental(String fechaIngreso, double salario) { //Generalmente el constructor se mantiene público para poder acceder a él facilmente desde cualquier lado, al menos que se trate de un banco donde los datos deben ser muy bien protegidos
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
		
	}
	
	//3. Métodos
	//Método para imprimir información
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salarios del asistente es: " + salario);
		
	}
	 
	//Getters y Setter para poder acceder a mis datps privados y poder realizar operaciones con ellos
	//Sin getters, la información me aparece en null
	//Sin setters, no puedo cambiar la info
	
	//Son públicos para poder acceder a ellos desde otras clases
	public String getFechaIngreso() { //Permite sacar el dato de la fecha de ingreso
		return fechaIngreso;
	}
	
	public double getSalario() { //Permite sacar el dato del salario
		return salario;
	}
	
	
	//Un setter para poder asignar un nuevo salario al atributo de tipo privado llamado salario.
	public void setSalario(double nuevoSalario) {
		if (nuevoSalario > 0) {//Para evitar que el nuevo salario sea de 0 pesos, en caso de que hubiera un error
			salario = nuevoSalario;	
		}
	}
	
	

	
	

}
