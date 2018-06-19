public class Test_constructor extends AbstractTest
{
    @Override
    public void go() {
        int punteggio = 0;
        String s0 = "-1b2c2a2a-1", //esponente negativo
               s1 = "-2b2c2a2a1",
               s2 = "3",
               s3 = "-1b2c2a2a1c0b1";
        Monomial m;
        try {
            m = new Monomial(s0);
        }
        catch (Exception e) {
            punteggio += 25;
        }

        try {
            m = new Monomial(s1);
            punteggio += 25;
        }
        catch (Exception e) {
            // errore
        }

        try {
            m = new Monomial(s2);
            punteggio += 25;
        }
        catch (Exception e) {
            // errore
        }

        try {
            m = new Monomial(s3);
            punteggio += 25;
        }
        catch (Exception e) {
            // errore
        }

        setVal(punteggio);
    }
}
