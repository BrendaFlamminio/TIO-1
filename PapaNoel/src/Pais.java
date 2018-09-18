import java.util.Vector;

public  class Pais {
	private Vector<Provincia> provincias;
	
	public float getPorcentajeRegalo(String regalo) {
		float contador = 0;
		for (int i=0; i<provincias.size(); i++) {
		contador+= provincias.elementAt(i).getPorcentajeRegalo(regalo);
		}
		return contador/provincias.size()*100;
	}
}
