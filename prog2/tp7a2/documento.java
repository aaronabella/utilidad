package tp7a2;

import java.util.ArrayList;

public class documento {
    private String titulo;
    private String contenido;
    
    private ArrayList<String> autores;
    private ArrayList<String> palabrasClave;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    public documento(){
        setTitulo(titulo);
        setContenido(contenido);
        autores = new ArrayList<>();
        palabrasClave = new ArrayList<>();
    }

    public void agregarNuevaPalabraClave(String palabraClave){
        if((palabraClave != null)&&(!palabrasClave.contains(palabraClave))){
            palabrasClave.add(palabraClave);
        }
    }
    
    public void agregarNuevoAutor(String autorNuevo){
        if((autorNuevo != null)&&(!autores.contains(autorNuevo))){
            autores.add(autorNuevo);
        }
    }
    public boolean tieneAutor(String autor){
        return autores.contains(autor);
    }
    
    public boolean tienePalabra(String palabraBuscada){
        return palabrasClave.contains(palabraBuscada);
    }
    
    


}
