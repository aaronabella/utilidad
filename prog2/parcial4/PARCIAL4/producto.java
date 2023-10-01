package PARCIAL4;
import java.util.ArrayList;

public class producto extends componente{
    private String nombre;
    private String descripcion;
    private double precio;
    private ArrayList <String> componente

	public int getNombre() {
		return this.nombre;
	}

	public int getDescripcion() {
		return this.descripcion;
	}
    
	public double getPrecio() {
		return this.precio;
	}
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}