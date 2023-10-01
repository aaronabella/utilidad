package tp2;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class serie{
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<String> temporadas;

    
    public serie(String titulo, String descripcion, String creador, String genero, ArrayList<String> temporadas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
    }
    public ArrayList<String> getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(ArrayList<String> temporadas) {
        this.temporadas = temporadas;
    }

   

}