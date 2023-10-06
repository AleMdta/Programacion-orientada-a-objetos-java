package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		
		
		//Intancia con datos obligatorios del paciente
		Paciente Masiosare = new Paciente("MAS45639", false, false);
		System.out.println("**************************");
		System.out.println(Masiosare);//En esta impresión no tiene seguro médico
		*/
		
		//Cambiar el falso de seguroMedico a true
		//Masiosare.seguroGastosMedicos = true;
		//System.out.println(Masiosare);//En esta otra impresión con la reasignación de datos, ya tiene seguro médico
		//Si modifico el atributo y lo pongo como privado, no se puede hacer la reasignación de datos de esta forma.
		//Para poder cambiar este dato se necesita crear un getter y un setter
		
		/************************************************************/
		
		//IMPLEMENTACIÓN DE COLECCIONES (ArrayList de Dentistas)
		List <Dentista> listaDentistasArrayList = new ArrayList<>();
		
		//Método para agregar dentistas a la lista
		listaDentistasArrayList.add(new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "23695874", "500", "avanzado", "matutino", 500)); 
		//A mi lista añade un nuevo dentista que se llame Dr. Simi. se apellide Lares...etc
		
		//Si agrego la instancia a una varible, puedo imprimir su info usando toString o un método. Pero si genero la instancia y la agreg directamente al arrayList, para sacer el dato deberé utilizar un foEach o un ciclo para obtener cada dato
		
		Dentista drChapatin = new Dentista("Dr. Chapa", "Teen", (byte)60, "987456321", "chapa@teen.com", "General", "236987546", "89", "básco", "vespertino", 300);//Primero genero la instancia
		listaDentistasArrayList.add(drChapatin);//Agrego a mi lsta de Dentistas utilizando solo lavariable donde guardé la instancia
		
		
		//IMPLEMENTACIÓN DE LISTA DE DENTIOSTA CON HASHSET
		Set <Dentista> conjuntoDentistas = new HashSet<>();
		
		//Agregando un dentista a mi conjunto
		conjuntoDentistas.add(new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "23695874", "500", "avanzado", "matutino", 500));
		
		//IMPLEMENTACIOÓN DE UN HASHMAP DE DENTISTAS
		//Mi map tiene un dati de tipo String y otro de tipo Denstista(objeto)
		Map<String, Dentista> mapaDentista = new HashMap<>();
		
		//Agregar un dentista  a mi mapa
		mapaDentista.put("Dr. House", new Dentista("Dr. Gregory", "House", (byte)48, "12588945", "grego@house.com", "Neurodontología", "845454184", "62", "avanzado", "nocturno", 1500));
		//Mi Key es el nombre del Dr. y mi Value sería la instancia del objeto
		
		//Imprimir el objeto Dr. House
		Dentista doctorBuscado = mapaDentista.get("Dr. House");
		System.out.println(doctorBuscado);
		
			
		
	}

}
