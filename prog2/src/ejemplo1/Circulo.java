package ejemplo1;

public class Circulo {
    
	String nombre;
	double radio;
	
	public Circulo(double rad) {
		nombre = "Circulo";
		radio = rad;
	}
	
	public double getRadio() {
		return radio;
	}
	/**
	 * Crea un Objeto del tipo Circulo
	 * @param radio es el radio del circulo
	 */
	public void setRadio(double radio) {
		if (radio > 0 )
			this.radio = radio;
		else {
			this.radio = -radio;
		}
	}
	public String getNombre() {
		return nombre;
	}
	
	public double getArea() {
		return Math.PI* radio*radio;
	}
	public double getDiametro() {
		return radio*2;
	}
	public double getPerimetro() {
		return Math.PI*getDiametro();
	}
}
