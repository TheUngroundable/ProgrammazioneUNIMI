public class Test_AcquarioDiMare extends AbstractTest {

    public void go() {
        setNrTestDaFare(6); // IMPORTANTE!!!

        AcquarioDiMare d1=new AcquarioDiMare(10,10,10);
        giusto();

        try {
            AcquarioDiMare d2=new AcquarioDiMare(100,100,100);
            System.err.println("non lancia eccezione se troppo grande");
        } catch(Exception e) {
            giusto();
        }

        PesceDiMare pdm1=new PesceDiMare("dory",.01f);
        if(d1.aggiungi(pdm1)) giusto();
        else
            System.err.println("non accettato?");

        PesceDacquaDolce pda1=new PesceDacquaDolce("nemo",.1f);
        if(!d1.aggiungi(pda1)) giusto();
        else
            System.err.println("accettato lo stesso...");

        if(pdm1.isVivo(d1)) giusto();
        else
            System.err.println("non risulta vivo...");

        if(d1.toString().contains("dory"))
            giusto();
        else
            System.err.println("manca toString?");

    }
}
