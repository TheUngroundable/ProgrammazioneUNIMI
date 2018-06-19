public class Test_AcquarioDolce extends AbstractTest {

    public void go() {
        setNrTestDaFare(7); // IMPORTANTE!!!

        AcquarioDolce d1=new AcquarioDolce(10,10,10);
        giusto();

        PesceDiMare pdm1=new PesceDiMare("dory",.01f);
        if(!d1.aggiungi(pdm1)) giusto();
        else
            System.err.println("accettato lo stesso...");

        PesceDacquaDolce pda1=new PesceDacquaDolce("nemo",.001f);
        if(d1.aggiungi(pda1)) giusto();
        else
            System.err.println("non accettato?");




        if(pda1.isVivo(d1)) giusto();
        else
            System.err.println("non risulta vivo...");

        if(d1.toString().contains("nemo"))
            giusto();
        else
            System.err.println("manca toString?");

        boolean last=true;
        for(int i=0; i<200; i++) {
            last=d1.aggiungi(new PesceDacquaDolce("nemo"+i,.1f));
        }
        if(!last) giusto();
        else
            System.err.println("non ha smesso di accettare pesci...");


        if(!pda1.isVivo(d1)) giusto();
        else
            System.err.println("densita' non calcolata?");

        System.err.print("quanti:");
        System.err.println(d1.quanti());
        System.err.print("densita':");
        System.err.println(d1.densita());
        System.err.print("pesce:");
        System.err.println(pda1);

    }
}
