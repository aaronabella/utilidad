package tp2;
public class episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;
    
    

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

   
    public int getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public episodio(String titulo, String descripcion, boolean visto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = calificacion;

    }

    if(visto){
        calificacion = this.calificacion;
    }
    else{
        this.calificacion = -1;
    }
    if(visto){
        this.calificacion = calificacion;
        if(calificacion<5 && calificacion>1){
            this.calificacion= calificacion;
        }
        else{
            System.out.println("El valor de la calificaion debe ser entre 1 y 5");
        }
    }
}

