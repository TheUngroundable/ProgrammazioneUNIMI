
public class Test_product extends AbstractTest  {

    @Override
    public void go() {
        int punteggio = 0;
        String  s0 = "0a1b2", //monomio nullo
                s1 = "-2a1b2",
                s2 = "2",
                s3 = "3a1b1b1";

        Monomial m0, m1, m2, m3, res;
        m0 = new Monomial(s0);
        m1 = new Monomial(s1);
        m2 = new Monomial(s2);
        m3 = new Monomial(s3);

        res = m0.product(m1);
        if (res.equals(m0)) { //m0 is a null monomial
            punteggio += 25;
        }

        res = m1.product(m2);
        if (res.equals(new Monomial("-4a1b2"))) {
            punteggio += 25;
        }

        res = m1.product(m3);
        if (res.equals(new Monomial("-6a2b4"))) {
            punteggio += 25;
        }

        res = m3.product(m1);
        if (res.equals(new Monomial("-6a2b4"))) {
            punteggio += 25;
        }

        setVal(punteggio);
    }
}
