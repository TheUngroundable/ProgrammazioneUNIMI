public class Test_Indirizzo extends AbstractTest {

    public void go() {
        setNrTestDaFare(6); // IMPORTANTE!!!

        Indirizzo i1=new Indirizzo("bussi","via bianchi",5,"20100","Milano");
        giusto();

        try {
            Indirizzo iNoCity=new Indirizzo("bussi","via bianchi",5,"20100","");
        }
        catch(Exception e) {
            giusto();
        }
        try {
            Indirizzo iNoName=new Indirizzo("","via bianchi",5,"20100","Milano");
        }
        catch(Exception e) {
            giusto();
        }
        try {
            Indirizzo iNoVia=new Indirizzo("bussi","",5,"20100","milano");
        }
        catch(Exception e) {
            giusto();
        }
        try {
            Indirizzo iCivicoSbagliato=new Indirizzo("bussi","via bianchi",-5,"20100","milano");
        }
        catch(Exception e) {
            giusto();
        }

        if(i1.toString().equals(new Indirizzo("bussi","via bianchi",5,20100,"Milano").toString()))
            giusto();
        else System.err.println("errato confronto");

    }
}
