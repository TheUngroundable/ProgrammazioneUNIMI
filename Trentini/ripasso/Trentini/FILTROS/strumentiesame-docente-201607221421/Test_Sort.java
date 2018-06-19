public class Test_Sort extends AbstractTest {

    public void go() {
        //setNrTestDaFare(1); // IMPORTANTE!!!

        Operazione somma=new Somma();
        somma.addOperando(new Operando(4.7));
        somma.addOperando(new Operando(2.9));
        somma.addOperando(new Operando(1211212));
        somma.addOperando(new Operando(7));
        somma.addOperando(new Operando(56));
        somma.addOperando(new Operando(99));

        somma.sort();
        //System.err.println(somma.ultimo());
        if(somma.ultimo()==1211212 || somma.ultimo()==2.9) //potrebbero usare sort ascending/descending
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato sort o ultimo");
        }
    }
}
