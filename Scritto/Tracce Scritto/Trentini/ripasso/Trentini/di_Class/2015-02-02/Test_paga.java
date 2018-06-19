public class Test_paga extends AbstractTest
{
    public void go() throws Exception {
        Cassa c=new Cassa();

        c.passa(new Prodotto("prova",56));
        c.passa(new Prodotto("prova2",57));
        c.paga(new Banconota(5));

        //System.out.println(c);

        if(c.pagato())
            setBoth(100,"pagamento ok");
        else
            setBoth(0,"pagamento mal calcolato?");

    }
}
