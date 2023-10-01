package prog2_2023.tp5;

import java.util.ArrayList;

public class casa {
    private String nombre;
    private int cantMaxima;
    private ArrayList<String> cualidadesRequeridas;
    private ArrayList<alumno> alumnos;

    public casa(int cantMaxima, String nombre) {
        this.nombre = nombre;
        this.cantMaxima = cantMaxima;
        this.cualidadesRequeridas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }
    public int getCantMaxima() {
        return cantMaxima;
    }
    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }
    public String getNombre(){
        return nombre;
    }
    public ArrayList<String> getCualidadesRequeridas() {
        return new ArrayList<>(cualidadesRequeridas);
    }
    public void addCualidadesRequeridas(String cualidadRequerida) {
        cualidadesRequeridas.add(cualidadRequerida);
    }
    public ArrayList<alumno> getAlumnos() {
        return new ArrayList<>(alumnos);
    }
        public void addAlumnos(alumno a) {
            if(alumnos.size()<cantMaxima){
                boolean cumpleTodas = cualidadesRequeridas.containsAll(a.getCualidades());
                if(cumpleTodas){
                    alumnos.add(a);
                    a.setTieneCasa(true);
                    a.setCasa(this);
                }
                else{
                    System.out.println("el alumno no cumple con todas las cualidades requeridas");
                }
            }
            else{
                System.out.println("La casa no tiene lugar para mas alumnos");
            }    
        }
    
}
