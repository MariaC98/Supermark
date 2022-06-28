import java.util.Scanner;

public class Registro {
	
	private String nombre;
	private String apellido;
	private String email;
	private String pass;
	private String tipo;
	private boolean tieneT;
	
	
	public Registro() { //pido los datos aqui!!
		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Ingrese nombre: ");
		this.nombre=entrada.next();
		
		System.out.println("Ingrese apellido: ");
		this.apellido=entrada.next();
		
		System.out.println("Ingrese email: ");
		this.apellido=entrada.next();
		
		System.out.println("Ingrese password: ");
		this.apellido=entrada.next();
		
	}
	
	public Usuario validarReg() {
		
		Usuario user = null;
		
		if(this.nombre!=""&&this.apellido!=""&&this.email!=""&&this.pass!="") {
			//podriamos verificar si el email esta en la bdd!!
			 user = new Usuario(7,this.nombre,this.apellido,this.email,this.pass,1,true
			);
		}
		
		return user;
	}
	
	
	
	

}
