package Persona;

//Clase para testear nuestras clases o métodos
public class Test {
	
	
	//Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		/*
		// nombreClase nombreObjeto =  new invocarMetodoConstructorQue GenralemneteSeLlamaIgualQueLaClase(); (palabra reservada new indica que estamos creando un nuevo objeto)
		
		//instacia de persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "552698745", "felipe@mail.com");
		System.out.println(Felipe); //Persona.Persona@5b480cf9 -> esto es lo que imprime, que es una referencia de espacio o lugar en memoria, @ es un separador entre la clase y la memoria
		Felipe.imprimirInfo(); // Con el método imprimirInfo sí se ve la información en consola y no el lugar en memoria.
		
		Felipe.saludar();//Imprime lo que hay en el método de saludar()
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "23695874", "500", "avanzado", "matutino", 500);
		System.out.println("*****************");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		//Testeando a la clase paciente
		//Instancia con todos los datos del paciente
		Paciente Rodri = new Paciente("SS123659", "AB-", true, true, "05/Oct/2023", "Dr.Simi Lares", false);
		System.out.println("*************************");
		System.out.println(Rodri);
		*/
		
		
		//Intancia con datos obligatorios del paciente
		Paciente Masiosare = new Paciente("MAS45639", false, false);
		System.out.println("**************************");
		System.out.println(Masiosare);//En esta impresión no tiene seguro médico
		
		
		//Cambiar el falso de seguroMedico a true
		//Masiosare.seguroGastosMedicos = true;
		//System.out.println(Masiosare);//En esta otra impresión con la reasignación de datos, ya tiene seguro médico
		//Si modifico el atributo y lo pongo como privado, no se puede hacer la reasignación de datos de esta forma.
		//Para poder cambiar este dato se necesita crear un getter y un setter
		
	}

}
