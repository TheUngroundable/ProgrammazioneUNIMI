public class Test_inserimento extends AbstractTest
{
    public void go() throws Exception{
        Cassa c=new Cassa();
        c.passa(new Prodotto("prova",56));
        int prima=c.quanti();
        c.passa(new Prodotto("prova2",57));
        int dopo=c.quanti();
        if((dopo-prima)==1) setBoth(100,"contenuto aumentato");
        else setBoth(0,"contenuto NON aumentato");
    }
}
