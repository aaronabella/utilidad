package filesystem;

import java.util.Comparator;

public class ComparadorPeso implements Comparator<Archivo> {
    @Override
    public int compare(Archivo o1, Archivo o2) {
        return (int) o1.getTamanio() - (int) o2.getTamanio();
    }
}
