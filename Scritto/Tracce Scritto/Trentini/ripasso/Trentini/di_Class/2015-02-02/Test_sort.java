public class Test_sort extends AbstractTest
{
    public void go() throws Exception{
        Cassa c=new Cassa();
        Prodotto piu;
        c.passa(new Prodotto("prova",56));
        c.passa(piu=new Prodotto("prova2",357));
        c.passa(new Prodotto("prova3",157));
        c.passa(new Prodotto("prova4",57));

        if(piu==c.piuCostoso()) setBoth(100,"ok sort");
        else setBoth(0,"non e' il piu' costoso...");
    }
}
