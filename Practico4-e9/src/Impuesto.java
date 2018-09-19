
public  class Impuesto {
	private double porcentaje;
	private double montoFijo;
	

	public double getImpuesto(Producto p) {
		return p.getPrecio()*porcentaje+montoFijo;
	}
}
