public class Test_monetaFalsa extends AbstractTest
{
    public void go() throws Exception{
        try {
            new Banconota(3);
            setBoth(0,"permette moneta falsa!!! non lancia eccezione");
        }
        catch(Exception e) {
            //e.printStackTrace();
            setBoth(100,"impedisce moneta falsa");
        }

        try {
            new Moneta(3);
            setBoth(0,"permette moneta falsa!!! non lancia eccezione");
        }
        catch(Exception e) {
            //e.printStackTrace();
            setBoth(100,"impedisce moneta falsa");
        }
    }
}
