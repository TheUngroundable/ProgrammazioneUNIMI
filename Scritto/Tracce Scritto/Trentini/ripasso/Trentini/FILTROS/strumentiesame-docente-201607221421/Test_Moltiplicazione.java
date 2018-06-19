public class Test_Moltiplicazione extends AbstractTest {

    public void go() {
        Operazione moltip=new Moltiplicazione();
        moltip.addOperando(new Operando(4));
        moltip.addOperando(new Operando(3));
        moltip.addOperando(new Operando(55));

        double ret=moltip.calcola();
        //if(moltip.getRisultato()==(4*3*55) && ret==(4*3*55))
        if(ret==(4*3*55))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato calcolo");
        }
    }
}
