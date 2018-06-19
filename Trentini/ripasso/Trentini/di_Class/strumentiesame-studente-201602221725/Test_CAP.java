public class Test_CAP extends AbstractTest {

    public void go() {
        setNrTestDaFare(4); // IMPORTANTE!!!

        CAP c1=new CAP(20100);
        giusto();

        try {
            CAP c2=new CAP(20);
        }
        catch(Exception e) {
            giusto();
        }

        try {
            CAP c2=new CAP("20");
        }
        catch(Exception e) {
            giusto();
        }

        if(c1.toString().equals(new CAP("20100").toString()))
            giusto();

    }
}
