public class Test_PesceDacquaDolce extends AbstractTest {

    public void go() {
        setNrTestDaFare(2); // IMPORTANTE!!!

        PesceDacquaDolce p1=new PesceDacquaDolce("nemo",.0001f);
        giusto();

/*
        if(p1.isVivo()) giusto();
        else
            System.err.println("non risulta vivo...");
*/

        if(p1.toString().contains("nemo"))
            giusto();
        else
            System.err.println("manca toString?");

    }
}
