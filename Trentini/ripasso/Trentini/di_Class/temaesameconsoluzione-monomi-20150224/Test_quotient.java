/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorenzo
 */
public class Test_quotient extends AbstractTest  {

    @Override
    public void go() {
        int punteggio = 0;
        String  s0 = "0a1b2", //monomio nullo
                s1 = "-2a1b3",
                s2 = "3a1c1",
                s3 = "-6a2b1b2c1";

        Monomial m0, m1, m2, m3, res;
        m0 = new Monomial(s0);
        m1 = new Monomial(s1);
        m2 = new Monomial(s2);
        m3 = new Monomial(s3);

        res = m0.quotient(m1);
        if (res != null && res.equals(m0)) { //m0 is a null monomial
            punteggio += 25;
        }

        if (m1.quotient(m0) == null) {
            punteggio += 25;
        }

        res = m3.quotient(m1);
        if (res != null && res.equals(m2)) {
            punteggio += 25;
        }

        if (m1.quotient(m3) == null) {
            punteggio += 25;
        }

        setVal(punteggio);
    }
}
