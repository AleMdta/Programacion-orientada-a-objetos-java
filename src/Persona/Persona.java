package Persona;



public class Persona {
	
	// 1. Atributos (info de cómo se mostrará mi objeto cuando se instancie)
	
	String nombre;
	String apellido;
	byte edad; //Ya que la edad no sobrepasa los 127, que es el máximo de byte, para una correcta asignación de memoria.
	String telefono;
	String email;
	
	//2. Constructor
	
	//En Java no se utiliza constrcutor como palabra reservada, ya que solo con utilizar el nombre de mi clase, Java entienede que se trata de un cosntructor
	//Contructor con parámetros
	Persona(String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}
	
	//3. Métodos (lo que podrá hacer mi objeto)
	void imprimirInfo (){//función vacía que no necesita parámetros, no hará operaciones, solo imprimirá un dato.
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El teléfono es: " + telefono);
		System.out.println("El email es: " + email);
	}
	
	void saludar () {
		System.out.println("Hola, te mando saluditos.");
	}
	
	
	
	// Método principal
	public static void main(String[] args) {// static = estático-fijo
		
	}
	
	//4. Intancia

}
