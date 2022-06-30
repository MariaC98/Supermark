
public class Producto {

	private String nombre_p;
	private double precio;
	private int stock;
	public Producto(String nombre_p, double precio, int stock) {
		
		this.nombre_p = nombre_p;
		this.precio = precio;
		this.stock = stock;
	}
	public String getNombre_p() {
		return nombre_p;
	}
	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}	
	
}
