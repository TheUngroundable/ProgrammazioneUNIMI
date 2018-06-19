public class Test_AutostradaCalcoloPedaggio extends AbstractTest {
    @Override
    public void go() throws Exception {
        int quantiTest=4;
        setEsito("(prova qualche veicolo, con calcolo finale)");

        Autostrada au=new Autostrada(50,100,.20f,50);  // 50km, 100km/h
        Auto a1=new Auto("MI...", 80);
        Auto a2=new Auto("PV...", 90);
        Tir t1=new Tir("MI...", 500);
        Tir t2=new Tir("BO...", 600);

        
        // entrano...
        au.ingresso(a1);
        au.ingresso(a2);
        au.ingresso(t1);
        au.ingresso(t2);
        
        incVal(
            au.quantiVeicoli()==4 ? 100/quantiTest : 0
        );
        //System.out.println(au.quantiVeicoli());

        incVal(
            au.potenzaMedia()==(80+90+500+600)/4f ? 100/quantiTest : 0
        );
        //System.out.println(au.potenzaMedia());
        

        try {
            au.uscita(new Auto("CO...", 90)); // non c'e'  [OK!]
        } catch(Exception ex) {
            incVal(100/quantiTest);
        }


        try {
			Thread.sleep(1000);
            au.uscita(a1);
            //au.uscita(new Auto("CO...", 1f, 4f, 4, 90)); // non c'e'  [OK!]
        } catch(MultaException ex) {
			//System.err.println(ex);
            incVal(100/quantiTest);
        }

    }
}
