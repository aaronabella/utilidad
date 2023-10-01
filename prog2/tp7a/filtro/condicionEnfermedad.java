package tp7a.filtro;

import tp7a.enfermedad;
import tp7a.quimico;

public class condicionEnfermedad extends condicion{
    private enfermedad enfermedad;

    public condicionEnfermedad(enfermedad enfermedad){
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(quimico quimico) {
        return quimico.trataEnfermedad(enfermedad);
    }
}
