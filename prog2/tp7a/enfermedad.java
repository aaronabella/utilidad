package tp7a;

import java.util.ArrayList;

public class enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;
    
    public String getNombre() {
        return nombre;
    }
    public ArrayList<String> getEstadosPatologicos() {
        return new ArrayList<>(estadosPatologicos) ;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public enfermedad(){
        setNombre(nombre);
        estadosPatologicos = new ArrayList<>();
    }
    public void agregarNuevoEstadoPatologico(String estadoPatologico){
        if((estadoPatologico != null)&&(!estadosPatologicos.contains(estadoPatologico))){
            estadosPatologicos.add(estadoPatologico);
        }
    }
}
