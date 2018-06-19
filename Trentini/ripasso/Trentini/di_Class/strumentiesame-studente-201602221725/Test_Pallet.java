public class Test_Pallet extends AbstractTest {

    public void go() {
        setNrTestDaFare(5); // IMPORTANTE!!!

        Pallet p1=new Pallet(1000,1000);
        giusto();

        p1.metti(new Cilindrico(1,2));
        p1.metti(new Cilindrico(1,4));
        p1.metti(new Cilindrico(1,5));
        p1.metti(new Cilindrico(1,3));
        p1.metti(new Cilindrico(1,6));
        if(p1.quanti()!=5) System.err.println(p1);
        else giusto();

        p1.metti(new Cilindrico(1000,6000));
        if(p1.quanti()!=5) System.err.println(p1);
        else giusto();

        p1.togli(1);
        if(p1.quanti()!=4) System.err.println(p1);
        else giusto();

        String prima=p1.toString();
        System.err.println("prima");
        System.err.println(p1);
        p1.ordina();
        if(!prima.equals(p1.toString())) giusto(); //non verissimo, pero' se e' cambiato almeno e' cambiato ;)
        System.err.println("dopo");
        System.err.println(p1);


        /*
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
                */

    }
}
