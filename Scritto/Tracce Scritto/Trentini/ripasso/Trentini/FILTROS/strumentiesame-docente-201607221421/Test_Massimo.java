public class Test_Massimo extends AbstractTest {

    public void go() {
        Operazione massimo=new Massimo();
        massimo.addOperando(new Operando(4.7));
        massimo.addOperando(new Operando(7));
        massimo.addOperando(new Operando(-7));
        massimo.addOperando(new Operando(56));
        massimo.addOperando(new Operando(99));
        massimo.addOperando(new Operando(2.9));
        massimo.addOperando(new Operando(1211212));

        double ret=massimo.calcola();
        //if(massimo.getRisultato()==1211212 && ret==1211212)
        if(ret==1211212)
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato calcolo");
        }

        if(massimo.toString().contains("121"))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato toString");
        }

    }
}
