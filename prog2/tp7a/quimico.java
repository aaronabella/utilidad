package tp7a;

import java.util.ArrayList;


public class quimico {
    private String nombre;
    private ArrayList<cultivo> cultivosNoRecomendados;
    private ArrayList<String> estadosPatologicosaTratar;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public quimico(){
        setNombre(nombre);
        cultivosNoRecomendados = new ArrayList<>();
        estadosPatologicosaTratar = new ArrayList<>();

    }
    public void agregarNuevoCultivo(cultivo nuevoCultivo){
        if((nuevoCultivo != null)&&(!cultivosNoRecomendados.contains(nuevoCultivo))){
            cultivosNoRecomendados.add(nuevoCultivo);
        }
    }

    public void agregarNuevoEstadoPatologico(String estadoPatologico){
        if((estadoPatologico != null)&&(!estadosPatologicosaTratar.contains(estadoPatologico))){
            estadosPatologicosaTratar.add(estadoPatologico);
        }
    }

    /**
     * @param enfermedad
     * @return
     */
    public boolean trataEnfermedad(enfermedad enfermedad){
        return estadosPatologicosaTratar.containsAll(enfermedad.getEstadosPatologicos());
    }

    /**
     * @param cultivo
     * @return
     */
    public boolean sePuedeAplicar(cultivo cultivo){
        return !cultivosNoRecomendados.contains(cultivo);
    }

    /**
     * @param enfermedadesPosibles
     * @return
     */
    public boolean trataEnfermedadFrecuente(ArrayList<enfermedad> enfermedadesPosibles){
        for(enfermedad enfermedadActual : enfermedadesPosibles){
            if(trataEnfermedad(enfermedadActual)){
                return true;
            }
        }
        return false;
    }

} 
