import java.util.*;
public  class Moltiplicazione extends Operazione {
    public double calcola() {
        double finale=1;

        for (Operando o: this) {
            finale *= o.getValore();
        }
        //setRisultato(finale);
        //return getRisultato();
        return finale;
    }
}
