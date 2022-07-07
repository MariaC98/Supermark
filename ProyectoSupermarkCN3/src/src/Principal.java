import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner (System.in);
		System.out.println("<<< Supermark >>>");
		System.out.println("Ingrese una opcion: ");
		System.out.println("1 - Ingresar\n2 - Registrarse");
		int opcion=entrada.nextInt();

		if(opcion==1) {
		
		System.out.println("Ingrese su email: ");
		String email=entrada.next();
		
		System.out.println("Ingrese su contraseña: ");
		String contra=entrada.next();
		
		Login login = new Login (email,contra);
		Usuario user = login.ingresar();
		
		if(user!=null) { //controlo que tipo de cliente es
			
		if(user.getTipo_usuario()==1) { //1 para cliente y 2 para admin (segun mi bd)
			InicioUsuario iniU = new InicioUsuario();
			
			iniU.menu(user);
			}
		else {
			InicioAdmin iniA = new InicioAdmin();}
		 //en proceso
		}
		}
		else {
			System.out.println("Registro");
			Registro registro1 = new Registro();
			registro1.validaDatos();
		}

		/*Para la Administración:
		Cargar productos a la aplicación
		Modificar los datos de los productos cargados
		Ver todos los usuarios que realizaron una compra
		Ver listado de productos seleccionados por el usuario*/
	

}
}