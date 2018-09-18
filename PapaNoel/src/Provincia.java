import java.util.Vector;

public class Provincia {
	private Vector<Localidad> localidades;
	
	public float getPorcentajeRegalo(String regalo) {
		float contador = 0;
		for (int i=0; i<localidades.size(); i++) {
		contador+= localidades.elementAt(i).getPorcentajeRegalo(regalo);
		}
		return contador/localidades.size()*100;
	}
}
