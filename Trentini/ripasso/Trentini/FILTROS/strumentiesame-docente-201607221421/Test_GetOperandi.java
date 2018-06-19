import java.util.*;
public class Test_GetOperandi extends AbstractTest {

    public void go() {
        Operando check=new Operando(2.9);
        Operazione somma=new Somma();
        somma.addOperando(new Operando(4.7));
        somma.addOperando(check);
        somma.addOperando(new Operando(1211212));
        somma.addOperando(new Operando(7));
        somma.addOperando(new Operando(56));
        somma.addOperando(new Operando(99));

        List estrazione=somma.getOperandi();

        if(estrazione.contains(check))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliata estrazione");
        }

        if(estrazione.contains(new Operando(2.9)))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato equals");
        }
    }
}
