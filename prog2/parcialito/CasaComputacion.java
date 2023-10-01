package parcialito;

import java.util.ArrayList;

public class CasaComputacion {
	
	private ArrayList<Producto> productos;
	
	public CasaComputacion() {
		this.productos = new ArrayList<>();
		
	}
	public ArrayList<Producto> buscar(Condicion condicion) {
		ArrayList<Producto> resultado = new ArrayList<Producto>();
		
		for (int index = 0; index < this.productos.size(); index++) {
			Producto producto = this.productos.get(index);
			if (condicion.esValida(producto))
				resultado.add(producto);
		}
		
		return resultado;
	}
}
