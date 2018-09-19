
public class ImpuestoCondicion extends Impuesto{
	private double porcentaje;
	private double montoFijo;
	private Condicion condicion;


public double getImpuesto(Producto p) {
	if(!condicion.cumple()) {
		montoFijo = 0;
	}
	return super.getImpuesto(p);
}

}
