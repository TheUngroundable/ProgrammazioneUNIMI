/**
strade a pedaggio e non
- limite velocita
- lunghezza km
- tariffa a km
- calcolo pedaggio (fino a 3 assi semplice, poi aumenta, si puo' complicare ad libitum introducendo peso, rimorchi, etc.)
- calcolo velocità media (dati ingresso e uscita, in secondi)
*/


public class Strada {
    private int limite; // km/h
    private int lunghezza; // km

    public Strada(int lunghezza, int limite) {
        this.lunghezza=lunghezza;
        this.limite=limite;
    }

    public int getLimite() {
        return limite;
    }
    public int getLunghezza() {
        return lunghezza;
    }


    /*
        public boolean accessibile(Veicolo veicolo) {
            return true;
        }
    */

    public float orePercorrenzaVelocitaCodice() {
        return ((float)lunghezza)/limite;
    }

    public float velocitaMediaDatoTempoPercorrenzaInSec(float percorrenza) {
        return lunghezza/(percorrenza/3600);
    }

    public boolean superatoLimiteDatoTempoPercorrenzaInSec(float percorrenza) {
        return velocitaMediaDatoTempoPercorrenzaInSec(percorrenza)>getLimite();
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(");
        sb.append(limite);
        sb.append(", ");
        sb.append(lunghezza);
        sb.append(")");
        return sb.toString();
    }
}
