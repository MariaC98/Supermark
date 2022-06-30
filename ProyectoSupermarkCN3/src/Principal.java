import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		//falta el menu para registrarse o iniciar sesion 
		
		System.out.println("Ingrese su email: ");
		Scanner entrada = new Scanner (System.in);
		String email=entrada.nextLine();
		
		System.out.println("Ingrese su contraseña: ");
		Scanner entrada2 = new Scanner (System.in);
		String contra=entrada2.nextLine();
		
		Login login = new Login (email,contra);
		
		Usuario user = login.ingresar();
		
		if(user!=null) {
			
			//controlo si el tipo de usuario es 1 (cliente)
			
			System.out.println("Ingreso exitoso");
			System.out.println("Ingrese una opcion: ");
			System.out.println("1 - Seleccionar productos\r\n"
					+ "2 - ver  listado de productos seleccionados.\r\n"
					+ "3 - Autorizar la compra de los productos seleccionados\r\n"
					+ "");
			int opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1 : 
				Conexion conexion = new Conexion();//realizo la conexion
				
				String sql = "select nombre_producto, precio_unit_producto from producto;";
				
				ResultSet rs = conexion.devuelveConsulta(sql);
				
				while(rs.next()) {
					
					String nombre_producto = rs.getString("nombre_producto");
					double precio = rs.getDouble("precio_unit_producto");
					System.out.println("nombre prod: "+nombre_producto+" precio:"+precio );
					
				}
				
				
				break;
			case 2: 
				//implemento...
				break;
			case 3: 
				//implemento...
				break;
			
			default: 
				System.out.println("opcion incorrecta");
			    break;
			}
			
			
		}
		
		
		
		
		//ahora el registro 
		
		
		
		
		
	
		//1 menu principal para registrarse / iniciar sesion 
		
		//2 para el login se instancia un objeto tipo login y se verifica si esta en la bdd
		
		//3 en el caso de registrarse capturar los datos e insertarlos en la tabla de usuarios
		
		//4 una vez logeado con exito, instanciar una clase "home o inicio" 

		//5. dependiendo si es tipo admin o cliente se muestra su menu correspondiente
		
		//6. 
		
		/* Para el cliente: 
		Registrarse.
		Iniciar sesión.
		Seleccionar productos
		ver  listado de productos seleccionados.
		Autorizar la compra de los productos seleccionados */

		/*Para la Administración:
		Cargar productos a la aplicación
		Modificar los datos de los productos cargados
		Ver todos los usuarios que realizaron una compra
		Ver listado de productos seleccionados por el usuario*/
	}

}
