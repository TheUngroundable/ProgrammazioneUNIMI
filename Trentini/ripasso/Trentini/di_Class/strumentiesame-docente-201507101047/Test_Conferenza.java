public class Test_Conferenza extends AbstractTest {
    @Override
    public void go() {
        int quantiTest=6;

        Conferenza c=new Conferenza();

        incVal(100/quantiTest);

        Articolo a2=new Articolo("lorem2.txt");
        Articolo a3=new Articolo("lorem3.txt");
        Articolo ag=new Articolo("loremGrosso.txt");

        incVal(
            c.submit(a2)!=-1 ? 100/quantiTest : 0
        );


        incVal(
            c.submit(a3)!=-1 ? 100/quantiTest : 0
        );

        incVal(
            c.submit(ag)==-1 ? 100/quantiTest : 0
        );

        incVal(
            c.quantiArticoliNonHannoRevisore()==c.nrArticoli() ? 100/quantiTest : 0
        );

        incVal(
            c.autori().length>0 ? 100/quantiTest : 0
        );

        System.err.println(c);

    }
}
