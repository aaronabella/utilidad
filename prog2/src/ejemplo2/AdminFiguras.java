package ejemplo2;



public class AdminFiguras {

	public void imprimir(Figura cc) {
		System.out.println(cc.getNombre() + "- " + cc.getArea());
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura r1 = new Figura("XXX") ;
		
		r1.getNombre();
		
		Rectangulo r2 = new Rectangulo(10,10);
		
		AdminFiguras admin = new AdminFiguras();
		
		admin.imprimir(r2);
		admin.imprimir(r1);
		admin.imprimir(new Circulo(10));
		System.out.println(r1.getValoresFinales());
		System.out.println(r1.getValoresArreglo()[0]);
		System.out.println(r1.getValoresArreglo()[1]);
	}

}
