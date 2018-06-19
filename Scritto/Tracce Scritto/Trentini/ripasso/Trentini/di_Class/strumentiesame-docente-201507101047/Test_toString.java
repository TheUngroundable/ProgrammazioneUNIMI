public class Test_toString extends AbstractTest {
    @Override
    public void go() {
        int quantiTest=4;
        setEsito("(se <100% manca qualche toString, verificare ogni classe!)");

        incVal(
            simpleCheckToString(new Autore("mario","rossi","p@p","unimi")) ? 100/quantiTest : 0
        );
        incVal(
            simpleCheckToString(new Revisore("mario","rossi","p@p","sistemi")) ? 100/quantiTest : 0
        );
        incVal(
            simpleCheckToString(new Conferenza()) ? 100/quantiTest : 0
        );
        incVal(
            simpleCheckToString(new Articolo("lorem2.txt")) ? 100/quantiTest : 0
        );
    }
}
