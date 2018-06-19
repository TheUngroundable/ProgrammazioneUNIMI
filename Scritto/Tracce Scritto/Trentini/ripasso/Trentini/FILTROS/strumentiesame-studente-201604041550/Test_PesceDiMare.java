public class Test_PesceDiMare extends AbstractTest {

    public void go() {
        setNrTestDaFare(2); // IMPORTANTE!!!

        PesceDiMare p1=new PesceDiMare("dory",.01f);
        giusto();

/*
        if(p1.isVivo()) giusto();
        else
            System.err.println("non risulta vivo...");
*/

        if(p1.toString().contains("dory"))
            giusto();
        else
            System.err.println("manca toString?");

    }
}
