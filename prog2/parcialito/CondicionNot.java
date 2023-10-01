package parcialito;

class CondicionNot extends Condicion {

	private Condicion c1;
	
	public CondicionNot(Condicion c1) {
		this.c1 = c1;
	}
	
	@Override
	public boolean esValida(Producto producto) {
		return !this.c1.esValida(producto);
	}

}
