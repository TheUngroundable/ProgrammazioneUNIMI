public class Test_Autore extends AbstractTest {
    @Override
    public void go() {
        int quantiTest=2;

        try {
            // questa deve fallire per ente vuoto
            new Autore("mario","rossi","pippo@pippo","");
        } catch(Exception e) {
            incVal(100/quantiTest);
        }

        try {
            // questa deve fallire per mail sbagliata
            new Autore("mario","rossi","pippo","unimi");
        } catch(Exception e) {
            incVal(100/quantiTest);
        }


    }
}
