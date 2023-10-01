import java.util.ArrayList;

import tp7a2.documento;

public class coleccion {
    private ArrayList<documento> documentos;

    public coleccion(){
        documentos = new ArrayList<>();
    }

    public void agregarDocumento(documento nuevoDocumento){
        if((nuevoDocumento != null)&&(!documentos.contains(nuevoDocumento))){
            documentos.add(nuevoDocumento);
        }
    }

    public boolean contienePalabraClave(String palabra){
        for (documento palabra : palabra) {
            
        }
    }
}
