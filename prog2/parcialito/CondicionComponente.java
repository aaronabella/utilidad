package parcialito;

class CondicionComponente extends Condicion {
	private String componente;
	
	public CondicionComponente(String componente) {
		this.componente = componente;
	}

	@Override
	public boolean esValida(Producto producto) {
		return producto.tieneComponente(this.componente);
		
	}

}
