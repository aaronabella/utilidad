package prog2_2023.tp5;

import java.util.ArrayList;

public class alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<alumno> familiares;
    private boolean tieneCasa;
    private casa casaEscuela;

    public alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
        this.tieneCasa = false;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }
    public void addCualidades(String cualidad) {
        cualidades.add(cualidad);
    }
    public ArrayList<alumno> getFamiliares() {
        return new ArrayList<>(familiares);
    }
    public void addFamiliares(alumno familiar) {
        familiares.add(familiar);
    }
    
    public boolean isTieneCasa() {
        return tieneCasa;
    }

    public void setTieneCasa(boolean tieneCasa) {
        this.tieneCasa = tieneCasa;
    }
    public void setCasa(casa casa){
        this.casaEscuela = casa;
    }
    public String getCasa(){
        return casaEscuela.getNombre();
    }


}
