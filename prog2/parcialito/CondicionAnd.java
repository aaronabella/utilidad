package parcialito;

public class CondicionAnd extends Condicion {

	private Condicion c1;
	private Condicion c2;
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean esValida(Producto producto) {
		return this.c1.esValida(producto) && this.c2.esValida(producto);
	}

}