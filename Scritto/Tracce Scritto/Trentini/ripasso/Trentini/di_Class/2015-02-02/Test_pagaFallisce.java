public class Test_pagaFallisce extends AbstractTest
{
    public void go() throws Exception{
        Cassa c=new Cassa();

        c.passa(new Prodotto("prova",56));
        c.passa(new Prodotto("prova2",57));
        c.passa(new Prodotto("prova3",23356));
        c.paga(new Banconota(5));

        //System.out.println(c);

        if(!c.pagato())
            setBoth(100,"pagamento non sufficiente, corretto");
        else
            setBoth(0,"pagamento mal calcolato?");

    }
}
