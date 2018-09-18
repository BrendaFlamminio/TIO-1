import java.util.Vector;

public class Buzon extends Pais{
	private Vector<Carta> cartas;
	private Vector<Integer> niniosBuenos;
	private Vector<Integer> niniosMalos;
	
	public boolean esBueno(Carta c) {
		if(niniosBuenos.contains(c.getRemitente()))
			return true;
		else {
			c.setRegalos();
			niniosMalos.add(c.getRemitente());
			return false;
			
		}		
	}
	public float getPorcentajeRegalo(String regalo) {
		float contador = 0;
		for (int i=0; i<cartas.size(); i++) {
			if(cartas.elementAt(i).contieneRegalo(regalo)) {
				contador++;
			}
		}
		return contador/cartas.size()*100;
	}
	public int getNiniosMalos() {
		return niniosMalos.size();
	}
	
	public int getCartas() {
		return cartas.size();
	}
}
