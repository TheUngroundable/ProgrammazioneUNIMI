public class Test_StradaPedaggio extends AbstractTest {
    @Override
    public void go() throws Exception {
        int quantiTest=2;
        setEsito("(prova a calcolare due pedaggi, uno semplice e uno basato sul numero di assi)");

        StradaPedaggio s=new StradaPedaggio(50,100,.20f);  // 50km, 100km/h
        Auto a=new Auto("MI...", 90);
        Tir t=new Tir("MI...", 500);

        incVal(
            s.pedaggio(a)==10 ? 100/quantiTest : 0
        );
        //System.out.println(s.pedaggio(a));

        incVal(
            s.pedaggio(t)==15 ? 100/quantiTest : 0
        );
        //System.out.println(s.pedaggio(t));

    }
}
