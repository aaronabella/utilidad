package prog2_2023.tp5;

import java.util.ArrayList;

public class casaElitista extends casa{

    public casaElitista(int cantMaxima, String nombre) {
        super(cantMaxima, nombre);
        this.cualidadesRequeridas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    @Override
    public void addAlumnos(alumno alumno){
        if(alumnos.size() < cantMaxima){
            boolean cumpleTodas = cualidadesRequeridas.containsAll(a.getCualidades());
                if((cumpleTodas)&&())
        }
    }

}
