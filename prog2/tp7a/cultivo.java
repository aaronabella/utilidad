package tp7a;

import java.util.ArrayList;

public class cultivo {
    private String nombre;
    private ArrayList<enfermedad> enfermedadesPosibles;

    public String getNombre() {
        return nombre;
    }
    public ArrayList<enfermedad> getEnfermedadesPosibles() {
        return new ArrayList<>(enfermedadesPosibles);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public cultivo(){
        setNombre(nombre);
        enfermedadesPosibles = new ArrayList<>();   
    }

    public void agregarNuevaEnfermedad(enfermedad nuevaEnfermedad){
        if((nuevaEnfermedad != null)&&(!enfermedadesPosibles.contains(nuevaEnfermedad))){
            enfermedadesPosibles.add(nuevaEnfermedad);
        }
    }

    /**
     * @param quimico
     * @return
     */
    public boolean esUtil(quimico quimico){
        if(quimico.sePuedeAplicar(this)&&(quimico.trataEnfermedadFrecuente(this.getEnfermedadesPosibles()))){
            return true;
        }
        return false;
    }
    
}
