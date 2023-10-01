package ejemplo1;

public class AdminFiguras {

	public void imprimir(Circulo cc) {
		System.out.println(cc.getNombre() + "- " + cc.getArea());
	    
	}
	
	public void imprimir(Rectangulo rr) {
		System.out.println(rr.getNombre() + "- " + rr.getArea());
	    
	}
	
	
	
	public static void main(String[] args) {
		
		AdminFiguras admin = new AdminFiguras();
		Circulo c1 = new Circulo(10);
		Circulo c2 = new Circulo(100);
		admin.imprimir(c2);
		
		Rectangulo r1 = new Rectangulo(5,5);
		admin.imprimir(r1);
		
		
		
	}
}
