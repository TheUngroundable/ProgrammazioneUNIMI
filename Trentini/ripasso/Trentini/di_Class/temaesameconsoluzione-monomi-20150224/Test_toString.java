public class Test_toString extends AbstractTest
{
    @Override
    public void go() {
        int punteggio = 0;
        String s0 = "0b2c2", //monomio nullo
               s1 = "-2a1b2a1",
               s2 = "3",
               s3 = "3b2c0";
        Monomial m;

        m = new Monomial(s0);
        if (m.toString().equals("0")) {
            punteggio += 25;
        }

        m = new Monomial(s1);
        if (m.toString().equals("-2a2b2") || m.toString().equals("-2b2a2")) {
            punteggio += 25;
        }


        m = new Monomial(s2);
        if (m.toString().equals("3")) {
            punteggio += 25;
        }

        m = new Monomial(s3);
        if (m.toString().equals("3b2")) {
            punteggio += 25;
        }

        setVal(punteggio);
    }
}
