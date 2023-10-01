package tp7a.filtro;

import tp7a.cultivo;
import tp7a.quimico;

public class condicionCultivo extends condicion {
    private cultivo cultivo;

    public condicionCultivo(cultivo cultivo){
        this.cultivo = cultivo;
    }

    @Override
    public boolean cumple(quimico quimico) {
        return quimico.sePuedeAplicar(cultivo);
    }

}
