package ejemplo1;



public class Rectangulo {
	String nombre;
	double lado1;
	double lado2;
	
	public Rectangulo(double lado1, double lado2) {
        this.setLado1(lado1);
        this.setLado2(lado2);
		nombre = "Rectangulo";
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1>= 0) {
			this.lado1 = lado1;
		}
		else {
			this.lado1 = -lado1;
	       // System.out.println("Era Negativo");
		}
		   
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2>= 0)
			this.lado2 = lado2;
		else
			this.lado2 = -lado2;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getArea() {
		return lado1*lado2;
	}
	public double getPerimetro() {
		return lado1*2+lado2*2;
	}
	

	public static void main(String[] args) {
		Rectangulo c = new Rectangulo (10,10);
		System.out.println(c.getArea());
		c.setLado1(-5);
		System.out.println(c.getArea());
		c.setLado1(90);
		System.out.println(c.getArea());
	}
}
