package Persona;

public class TestUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar de usuario
		Usuario Ale = new Usuario("Doctora","aleNickname" , "pass1234");
		
		//Cambiar contraseña
		//Ale.setPassword(""); //Caso en el que el password está vacío
		//Ale.setPassword("pass123"); //Caso en el que el password es menor a 8 caracteres
		//Ale.setPassword("pass1234");//Caso en el que la contraseña es igual a la original
		Ale.setPassword("newPs9876");//Caso contraseña que cumple con los requisitos
		
	

	}

}
