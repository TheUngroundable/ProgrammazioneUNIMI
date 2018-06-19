public class Test_Media extends AbstractTest {

    public void go() {
        Operazione media=new Media();
        media.addOperando(new Operando(4));
        media.addOperando(new Operando(3));
        media.addOperando(new Operando(55));

        double ret=media.calcola();
        //if(media.getRisultato()==((4+3+55)/3.0) && ret==((4+3+55)/3.0))
        if(ret==((4+3+55)/3.0))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato calcolo");
        }
    }
}
