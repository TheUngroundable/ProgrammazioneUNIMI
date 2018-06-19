public class Test_Autostrada extends AbstractTest {
    @Override
    public void go() throws Exception {
        int quantiTest=2;
        setEsito("(prova un veicolo che passa e uno che dovrebbe scatenare eccezione)");

        Autostrada au=new Autostrada(50,100,.20f,50);  // 50km, 100km/h
        Auto a=new Auto("MI...", 45); // questa non passa
        Camion t=new Camion("MI...", 500);

        try {
            au.pedaggio(a);
        } catch(Exception ex) {
            incVal(100/quantiTest);
        }
        //System.out.println(au.pedaggio(a));

        incVal(
            //au.pedaggio(t)==15 ? 100/quantiTest : 0
            (int)(au.pedaggio(t))==15 ? 100/quantiTest : 0
        );
        //System.out.println(au.pedaggio(t));

    }
}
