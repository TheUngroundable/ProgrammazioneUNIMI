import java.util.*;
public  class Massimo extends Operazione {
    public double calcola() {
        if(getNumeroOperandi()==0) throw new RuntimeException("Zero operandi!");
        /* anna:
        	I valori degli operandi possono anche essere negativi,
        	vero? (l'implementazione di Massimo prevede che siano solo >=0)
        	Ma avendo sort, non è un problema. Va aggiunto un test su valori
        	negativi.
        	DONE
        */
        double max=Double.NEGATIVE_INFINITY;
        double val=0;
        for (Operando o: this) {
            val=o.getValore();
            if(val>max)
                max = val;
        }
        //setRisultato(max);
        //return getRisultato();
        return max;
    }
}
