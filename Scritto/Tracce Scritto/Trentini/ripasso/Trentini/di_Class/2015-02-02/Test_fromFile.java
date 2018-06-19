public class Test_fromFile extends AbstractTest
{
    public void go() throws Exception{
        Cassa c=new Cassa();

        try {
            c.salvatempo("nonesiste");
        }
        catch(Exception e) {
            //deve lanciarla
            setBoth(50,"lancia eccezione correttamente");
        }

        try {
            c.salvatempo("prodotti.csv");
        }
        catch(Exception e) {
            //non deve lanciarla
            setBoth(0,"lancia eccezione ma non dovrebbe");
            return; // ESCE!!!
        }

        if(c.totaleInCentesimi()>0)
            setBoth(100,"file ok");
        else
            setBoth(0,"file non letto?");

    }
}
