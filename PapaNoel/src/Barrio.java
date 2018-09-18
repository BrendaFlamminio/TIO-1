import java.util.Vector;

public class Barrio {
private Vector<Buzon> buzones;
	
	public float getPorcentajeRegalo(String regalo) {
		float contador = 0;
		for (int i=0; i<buzones.size(); i++) {
		contador+= buzones.elementAt(i).getPorcentajeRegalo(regalo);
		}
		return contador/buzones.size()*100;
	}
}
