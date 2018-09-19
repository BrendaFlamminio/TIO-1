import java.util.Vector;

public class Producto {
	private String nombre;
	private double precio;
	private Vector<Impuesto> impuestos;
	
	public double getPrecio() {
		return precio;
	}
	public double getPrecioGravado() {
		double total = 0;
		for(int i=0; i<impuestos.size(); i++)
			total+=impuestos.elementAt(i).getImpuesto(this);
		return total;
	}
	
}
