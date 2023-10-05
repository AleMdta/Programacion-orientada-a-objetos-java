package Persona;

public class TestAsistenteD {
	public static void main(String[] args) {
		
		//Instancia de nuestro asistente
		AsistenteDental Frank = new AsistenteDental("05/10/2023", 826.62d);
		
		//mpresión de la información de nuestro asistente Frank
		Frank.mostrarDatosAsistente(); //Si mi cosntructor fuera privdo, me generaría un error aquí
		
		//El sueldo de Frank no es de 826.62, es de 500.00
		//Cambio de salario
		//Frank.salario = 500.00d; //Me genera un error porque el salario es privado, un atributo generado en mi clase AsistenteDental. Para arreglarlo tendría que generar mis setters y getters
		//Cambiar salario después del setter
		//Frank.setSalario(0); //Si pongo 0 pesos como el nuevo salario, me deja el salario asignado previamante, ya que no cumple la condición hecha dentro del setSalrio en mi clase AsistenteDental
		Frank.setSalario(500.00d);
		
		//Mostrar solo el sueldo antes del getter
		//System.out.println(Frank.salario);//No puedo acceder a un atributo en específico sí este es privado y está en otra clase. (Genera error)
		
		//Mostrar sueldo con getter (Accedo al objeto(Frank), luego al método get donde tengo el salario)
		System.out.println("El nuevo salario del asistente es: " + Frank.getSalario());
	}
	

}
