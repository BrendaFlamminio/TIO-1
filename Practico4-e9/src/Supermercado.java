import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class Supermercado {
	private Hashtable<Producto, Integer> productos;
	private Hashtable<Producto, Integer> ticket;
	private int minimoStock;
	
	
	public void setStock(Hashtable<Producto, Integer> cambios) {
		ArrayList<Producto> lista = new ArrayList<Producto>(cambios.keySet());
		
	for (int i=0; i<lista.size(); i++) {
		Integer cantidad =productos.get(lista.get(i));
		if(cantidad==null)
			productos.put(lista.get(i), cambios.get(lista.get(i)));
		else {
			cantidad += cambios.get(lista.get(i));
			productos.put(lista.get(i), cantidad);
		}
		
	}	
	}
}
