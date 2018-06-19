import java.util.*;
/**
 * somma tutti gli operandi ESCLUDENDO le ripetizioni, cioe' ad esempio:
 * 2 4 6 2 4 8
 * deve dare
 * 20
 * e non
 * 26
 */
public  class SommaUnici extends Operazione {
    public double calcola() {
        ArrayList<Operando> tmp=new ArrayList<Operando>(); //copia temporanea, metto solo una volta ogni valore
        double finale=0;

        for (Operando o: this) {
            //System.err.println(tmp);
            if(!tmp.contains(o))
            {
                tmp.add(o);

                finale += o.getValore();
            }
        }
        //setRisultato(finale);
        //return getRisultato();
        return finale;
    }
}
