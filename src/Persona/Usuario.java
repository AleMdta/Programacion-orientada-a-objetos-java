package Persona;

//Trabajando con un usuario después de registrarse en una aplicación o red social


public class Usuario {
	
	//1. Atributos
	private String rol; //¿El usuario es un cliente, un dentista, un asistente, un paciente?
	private	String username;
	private String password;

	//Pensando en la lógica del negocio ¿Qué funciones tendría mi usuario, qué opciones tiene para hacer?
	//1. Creación de un nuevo usuario
	//Usar constructr para poder crear un usuario
	public Usuario(String rol, String username, String password) {
		this.rol = rol;
		this.username = username;
		this.password = password;
	}
	
	//2. Recuperación de contraseña
	//Usar un getter(para obtener la contraseña y me la envíe por correo)
	public String getPassword() {
		//Una posible validación: si el usuario registrado coincide con el usuario que paso como parámetro entoces obtengo la contraseña
		return password;
	}
	
	//3. Cambiar contraseña
	//Usar un setter para poner otro valor en el atributo   o password
	public void setPassword(String newPassword) {
		//Si la nueva contraseña es diferente a una cadena vacía y es diferente a la contraseña original
		if (newPassword.length()>= 8 && newPassword != password ) {
			password = newPassword;
			System.out.println("Contraseña cambiada correctamente.");
		}else {
			if (newPassword.length()<8) {
				System.out.println("Su contraseña debe tener al menos 8 caracteres.");
			}else {
				if (newPassword == password) {
					System.out.println("La contraseña no puede ser iagual a la anterior.");
				}else {
					System.out.println("Contraseña inválida.");
				}
			}
			
		}
		
	}
	

}
