public class Test_azzera extends AbstractTest
{
    public void go() throws Exception{
        Cassa c=new Cassa();

        c.passa(new Prodotto("prova",56));
        c.passa(new Prodotto("prova2",57));
        c.paga(new Banconota(5));
        c.paga(new Moneta(10));
        c.paga(new Moneta(10));

		//System.out.println(c);
        if(c.azzeramento().inCentesimi()==520)
        {
			//System.out.println(c);
			if(c.quanti()==0)
				setBoth(100,"azzeramento ok");
			else
				setBoth(50,"resto ok, ma non azzerato");
		}
        else
            setBoth(0,"azzeramento mal calcolato?");

    }
}
