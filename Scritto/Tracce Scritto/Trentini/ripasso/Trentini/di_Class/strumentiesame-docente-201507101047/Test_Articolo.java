public class Test_Articolo extends AbstractTest {
    @Override
    public void go() {
        int quantiTest=4;

        Articolo a=new Articolo("lorem1.txt");

        /*
        System.err.println(a);
        System.err.println(a.righe(20));
        System.err.println(a.pagine(3,20));
        */

        incVal(
            a.righe(20)>0 ? 100/quantiTest : 0
        );

        incVal(
            a.pagine(3,20)>0 ? 100/quantiTest : 0
        );

        incVal(
            a.getTitolo().length()>0 ? 100/quantiTest : 0
        );

        incVal(
            a.getAutore()!=null ? 100/quantiTest : 0
        );

    }
}
