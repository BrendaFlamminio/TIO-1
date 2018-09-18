import java.util.Vector;

	public class Carta {
		private int remitente;
		private Vector<String> regalos;
		
		public int getRemitente() {
			return this.remitente;
		}
		public void setRegalos(){
			regalos.clear();
			regalos.add("carbon");
		}
		
		public boolean contieneRegalo(String r) {
			return regalos.contains(r);
		}
}
