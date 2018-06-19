public class Test_toString extends AbstractTest {
    @Override
    public void go() throws Exception {
        int quantiTest=4;
        setEsito("(se <100% manca qualche toString, verificare ogni classe!)");

        incVal(
            simpleCheckToString(new Strada(50,50)) ? 100/quantiTest : 0
        );
        incVal(
            simpleCheckToString(new StradaPedaggio(50,50,50)) ? 100/quantiTest : 0
        );
        incVal(
            simpleCheckToString(new Autostrada(50,50,50,50)) ? 100/quantiTest : 0
        );


        //incVal(
        //simpleCheckToString(new Veicolo()) ? 100/quantiTest : 0
        //);
        incVal(
            simpleCheckToString(new Auto("MI...", 90)) ? 100/quantiTest : 0
        );
    }
}
