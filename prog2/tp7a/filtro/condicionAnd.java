package tp7a.filtro;

import tp7a.quimico;

public class condicionAnd extends condicion{
    private condicion c1;
    private condicion c2;

    public condicionAnd(condicion c1, condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    
    @Override
public boolean cumple(quimico quimico) {
   return c1.cumple(quimico) && c2.cumple(quimico);
}
}

