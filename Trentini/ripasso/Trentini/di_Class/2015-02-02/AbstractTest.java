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
public abstract class AbstractTest
{
	public final static char sepa='\t';

    private String esito;
    public void setEsito(String esito) {
        this.esito=esito;
    }
    private int valutazionePercentuale;
    public void setVal(int val) {
        this.valutazionePercentuale=val;
    }
    public void setBoth(int val,String esito) {
        setVal(val);
        setEsito(esito);
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        //sb.append("Class=");
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

    /**
     * serve come bootstrap, per istanziare le varie classi di test
     *
     * arg = nome classe
     */
    public static void main(String[] arg) {
        try {
            if(arg.length==1)
                if(arg[0].indexOf("Test_")==0) {
                    Object o=Class.forName(arg[0]).newInstance();
                    if(o instanceof AbstractTest) {
                        ((AbstractTest)o).go();
                        //System.out.print(arg[0]);
                        //System.out.print(": ");
                        System.out.println(o);
                    }
                }
        }
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
    }
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }
}
