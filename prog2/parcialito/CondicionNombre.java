package parcialito;

public class CondicionNombre extends Condicion {
	
	private String nombre;
	
	public CondicionNombre(String nombre){
		    this.nombre = nombre;
		  }

	@Override
	public boolean esValida(Producto producto) {
		return producto.getnombre() == this.nombre;
	}

}
