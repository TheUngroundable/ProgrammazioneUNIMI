import java.util.*;
public class Test_Monomio_Operazioni extends AbstractTest {

    public void go() {
        Monomio m1=new Monomio(3,new int[] {2,4,7,5,6});
        Monomio similar_m1=new Monomio(6,new int[] {2,4,7,5,6});

        Monomio m2=new Monomio(4,new int[] {3,1,4,6,8});
        //System.err.println(m1.product(m2)); // 12a5b5c11d11e14
        
        Monomio dividendo=new Monomio(4,new int[] {3,1,4,6,8});
        Monomio divisore=new Monomio(2,new int[] {3,1,2,2,2});
        //System.err.println(dividendo.quotient(divisore)); // 2c2d4e6

        Monomio eq_m1=new Monomio(3,new int[] {2,4,7,5,6});
        
        //System.err.println(m1.prodotto(m2));
        if(m1.prodotto(m2).toString().equals("12.0a5b5c11d11e14"))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("potrebbe essere sbagliato prodotto");
        }

        if(dividendo.quoziente(divisore).toString().equals("2.0c2d4e6"))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("potrebbe essere sbagliato quoziente");
        }

        if(m1.equals(m1.opposto().opposto()))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato opposto");
        }

        if(m1.equals(eq_m1))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato equals");
        }

        if(m1.simile(similar_m1))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato simile");
        }

        if(m1.somma(similar_m1).coefficiente()==9)
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato somma");
        }
       
       Monomio m3=new Monomio(2,new int[] {2,0,7,0,6});
       Monomio m4=new Monomio(3,new int[] {0,3,4,1,0});
       if(m3.somma(m4) == null)
          giustoConIncrementoTotTest();
       else {
          sbagliatoConIncrementoTotTest();
          System.err.println("sbagliato somma");
       }
       
       if(m3.prodotto(m4).toString().equals("6.0a2b3c11d1e6"))
          giustoConIncrementoTotTest();
       else {
          sbagliatoConIncrementoTotTest();
          System.err.println("potrebbe essere sbagliato prodotto");
       }
       

/*
        try {
            new Monomio(3,new int[] {2,4,7,5});
            sbagliatoConIncrementoTotTest();
            System.err.println("non controlla nr. esponenti");
        } catch(Exception e) {
            giustoConIncrementoTotTest();
            //e.printStackTrace();
        }
*/
    }
}
