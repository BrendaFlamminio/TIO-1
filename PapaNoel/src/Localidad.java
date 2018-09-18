import java.util.Vector;

public class Localidad {
private Vector<Barrio> barrios;
	
	public float getPorcentajeRegalo(String regalo) {
		float contador = 0;
		for (int i=0; i<barrios.size(); i++) {
		contador+= barrios.elementAt(i).getPorcentajeRegalo(regalo);
		}
		return contador/barrios.size()*100;
	}
}
