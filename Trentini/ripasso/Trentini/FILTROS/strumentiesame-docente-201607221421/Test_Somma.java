public class Test_Somma extends AbstractTest {

    public void go() {

        Operazione somma=new Somma();
        somma.addOperando(new Operando(4.7));
        somma.addOperando(new Operando(7));
        somma.addOperando(new Operando(56));
        somma.addOperando(new Operando(99));
        somma.addOperando(new Operando(2.9));
        somma.addOperando(new Operando(1211212));

        //somma.calcola();
        if(somma.calcola()==(4.7+7+56+99+2.9+1211212))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato calcolo");
        }

        somma.addOperando(new Operando(777));
        /*
        if(somma.getRisultato()==(4.7+7+56+99+2.9+1211212)) // deve rimanere al vecchio valore!!!
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("calcola all'add invece di aspettare l'invocazione di calcola()");
        }
        */

        double ret=somma.calcola(); // ora si aggiorna!!!
        //if(somma.getRisultato()==(4.7+7+56+99+2.9+1211212+777) && ret==(4.7+7+56+99+2.9+1211212+777))
        if(ret==(4.7+7+56+99+2.9+1211212+777))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato calcolo post aggiunta operando");
        }
    }
}
