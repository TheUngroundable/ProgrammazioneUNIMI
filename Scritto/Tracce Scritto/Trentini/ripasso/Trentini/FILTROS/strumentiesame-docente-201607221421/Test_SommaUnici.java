public class Test_SommaUnici extends AbstractTest {

    public void go() {

        Operazione unici=new SommaUnici();
        unici.addOperando(new Operando(4));
        unici.addOperando(new Operando(3));
        unici.addOperando(new Operando(5));
        unici.addOperando(new Operando(4));

        double ret=unici.calcola();
        //if(unici.getRisultato()==(4+3+5) && ret==(4+3+5))
        if(ret==(4+3+5))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato calcolo");
        }
    }
}
