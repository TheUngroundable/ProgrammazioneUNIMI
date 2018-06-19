public class Test_rimozione extends AbstractTest
{
    public void go() throws Exception{
        Cassa c=new Cassa();
        Prodotto p=new Prodotto("darimuovere",678);
        c.passa(new Prodotto("prova",56));
        c.passa(new Prodotto("prova2",57));
        c.passa(p);
        int prima=c.quanti();
        c.storna(1);
        c.storna(p);
        int dopo=c.quanti();
        if((prima-dopo)==2) setBoth(100,"contenuto diminuito");
        else setBoth(0,"contenuto NON diminuito");
    }
}
