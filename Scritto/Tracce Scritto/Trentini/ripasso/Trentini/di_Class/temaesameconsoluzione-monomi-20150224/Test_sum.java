/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorenzo
 */
public class Test_sum extends AbstractTest {

    @Override
    public void go() {
        int punteggio = 0;
        String  s0 = "0a1b2", //monomio nullo
                s1 = "-2a1b2",
                s2 = "2",
                s3 = "3a1b2";

        Monomial m0, m1, m2, m3, res;
        m0 = new Monomial(s0);
        m1 = new Monomial(s1);
        m2 = new Monomial(s2);
        m3 = new Monomial(s3);

        res = m0.sum(m1);
        if (res == null) { //m0 is a null monomial
            punteggio += 25;
        }

        res = m1.sum(m3);
        if (res != null && res.equals(new Monomial("1a1b2"))) {
            punteggio += 25;
        }

        if (m1.sum(m2) == null) {
            punteggio += 25;
        }

        res = m2.sum(m0);
        if (res != null && res.equals(new Monomial("2"))) {
            punteggio += 25;
        }

        setVal(punteggio);
    }
}
