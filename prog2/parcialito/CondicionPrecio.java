package parcialito;

public class CondicionPrecio extends Condicion{
	  private double precio;

	  public CondicionPrecio(double precio){
	    this.precio = precio;
	  }
	  
	@Override
	public boolean esValida(Producto producto) {
		return producto.getPrecio() > precio;
	}
}