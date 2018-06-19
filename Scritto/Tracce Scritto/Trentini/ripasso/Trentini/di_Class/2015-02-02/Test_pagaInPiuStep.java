public class Test_pagaInPiuStep extends AbstractTest
{
    public void go() throws Exception {
        Cassa c=new Cassa();

        c.passa(new Prodotto("prova",56));
        c.passa(new Prodotto("prova2",57));
        c.paga(new Banconota(100));
        c.paga(new Moneta(10));
        c.paga(new Moneta(10));

        //System.out.println(c);

        if(c.pagato())
            setBoth(100,"pagamento in piu' passi ok");
        else
            setBoth(0,"pagamento in piu' passi mal calcolato?");

    }
}
