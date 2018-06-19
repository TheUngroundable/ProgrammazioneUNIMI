public class Test_Operando extends AbstractTest {

    public void go() {

        Operando op1=new Operando();
        Operando op2=new Operando(0);

        if(op1.equals(op2))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato equals");
        }

        Operando op3=new Operando(4.7);
        if(op3.getValore()==4.7)
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato getValore");
        }

        Operando op4=new Operando(287336212);
        if(op4.toString().contains("33"))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato toString");
        }

    }
}
