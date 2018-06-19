import java.util.*;
public  class Somma extends Operazione {
    public double calcola() {
        double finale=0;

        for (Operando o: this) {
            finale += o.getValore();
        }
        //setRisultato(finale);
        //return getRisultato();
        return finale;
    }
}
