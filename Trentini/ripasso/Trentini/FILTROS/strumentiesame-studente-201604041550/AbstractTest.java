/**
 * derivare questa per creare un test per stressare le classi degli studenti
 *
 * ATTENZIONE! le sottoclassi vanno nominate col pattern "Test_*"
 * perche' lo script lancia tutte quelle che iniziano cosi'
 *
 * meglio usare termini che richiamino l'aspetto che viene testato, ad es.
 * - Test_ereditarieta
 * - Test_accessoFile
 * - Test_eccezioni
 * - ...
 *
 * Copyright 2014 Andrea Trentini
 * Licenza: GPLv3
 *
 * Versione:	0.2
 */
public abstract class AbstractTest extends Thread {
    public final static int ASPETTA=2000; // attesa della terminazione
    public final static char sepa='\t'; // separatore
    public static String verbosity="";

    private String esito="(vedere sorgente di questo test)";
    public void setEsito(String esito) {
        this.esito=esito;
    }

    private int valutazionePercentuale;
    public void setVal(int val) {
        if(val<0)
            valutazionePercentuale=0;
        /*        else if(val>100)
                    valutazionePercentuale=100;*/     //rimuovo perche' cosi' mi accorgo se vado oltre
        else
            valutazionePercentuale=val;
    }
    public void incVal(int val) {
        setVal(valutazionePercentuale+val);
    }
    public void setBoth(int val,String esito) {
        setVal(val);
        setEsito(esito);
    }

    private int nrTest;
    public void setNrTestDaFare(int t) {
        nrTest=t;
    }

    private int nrGiusti;
    public void giusto() {
        nrGiusti++;
        calcolaValutazione();
    }

    /** solo in base al rapporto giusti/sbagliati, imposta il valore
     */
    public void calcolaValutazione() {
        /*
        System.err.print(nrGiusti);
        System.err.print(" su ");
        System.err.println(nrTest);
        */
        setVal((int)((nrGiusti*100.0)/nrTest));
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        //sb.append("Class=");
        //sb.append("["+super.toString()+"] ");
        sb.append(padRight(getClass().getName(),20));
        sb.append(sepa/*+"val="*/);
        sb.append(valutazionePercentuale);
        sb.append("%"+sepa/*+"note="*/);
        sb.append(esito);
        return sb.toString();
    }

    /** da implementare nei vari test
     *
     * set valore 0-100 come valutazione del run del test
     */
    public abstract void go() throws Exception;

    public void run() {
        //System.out.print("run: ");System.out.println(Thread.currentThread());
        //yield();

        try {
            go();
        } catch(Throwable e) {
            if("verbose".equalsIgnoreCase(verbosity)) {
                e.printStackTrace();
            } else {
                System.err.println(e);
            }
        }
        //notifyAll(); // ci mettesse meno...
    }

    public void aspetta() throws Exception {
        /*
        System.err.print("aspetta: ");
        System.out.print(Thread.currentThread());
        System.out.print(" - ");
        System.out.println(this);
        */

        join(ASPETTA);
        //interrupt(); // gracefully (non funziona su un loop-studente)
        stop(); // deprecato ma funzionale nel nostro caso!

        //System.err.println("interrompe:"+isAlive());
    }

    /**
     * serve come bootstrap, per istanziare le varie classi di test
     *
     * arg = nome classe
     */
    public static void main(String[] arg) {
        if(arg.length>1) verbosity=arg[1];
        //System.out.println("\n------------------\n");

        try {
            if(arg[0].indexOf("Test_")==0) {
                Object o=Class.forName(arg[0]).newInstance();
                if(o instanceof AbstractTest) {
                    AbstractTest at=(AbstractTest)o;

                    // old, diretto
                    //at.go();

                    // new, con thread
                    at.start();
                    at.aspetta();

                    System.out.println(at); // c'e' percentuale

                    //System.out.print(arg[0]);
                    //System.out.print(": ");
                }
            }
        } catch(Throwable e) {
            if("verbose".equalsIgnoreCase(verbosity)) {
                e.printStackTrace();
            } else {
                System.err.println(e);
            }
        }
        /*
        catch(ClassNotFoundException e)
        {
            System.err.println("manca classe, non compilata? "+e);
        }
        catch(InstantiationException e)
        {
            System.err.println("fallisce new: "+e);
        }
        catch(IllegalAccessException e)
        {
            System.err.println("fallisce invocazione: "+e);
        }
        catch(Exception e)
        {
            System.err.println("eccezione generica: "+e);
        }
        */
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static boolean simpleCheckToString(Object o) {
        return !o.toString().equals(( o.getClass().getName() + '@' + Integer.toHexString(o.hashCode())));
    }


    /*
    public static String esito(int punteggio) {
        return  qualetest + (punteggio == 100 ? " superato" :
                punteggio > 0 ? " superato in parte" : " non superato");
    }
    */
}
