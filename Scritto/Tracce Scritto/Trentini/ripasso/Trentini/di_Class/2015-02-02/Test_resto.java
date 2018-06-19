public class Test_resto extends AbstractTest
{
    public void go() throws Exception {
        Cassa c=new Cassa();

        c.passa(new Prodotto("prova",56));
        c.passa(new Prodotto("prova2",57));
        c.paga(new Banconota(5));
        c.paga(new Moneta(10));
        c.paga(new Moneta(10));

        //System.out.println(c);

        if(c.calcolaResto().inCentesimi()==(5*100+10+10-56-57))
            setBoth(100,"resto ok");
        else
            setBoth(0,"resto mal calcolato?");

    }
}
