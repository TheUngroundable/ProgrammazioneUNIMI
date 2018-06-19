import java.util.*;
public class Test_Monomio extends AbstractTest {

    public void go() {
        Monomio m1=new Monomio(3,new int[] {2,4,7,5,6});

        if(m1.coefficiente()==3)
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato coefficiente");
        }

        if(m1.opposto().coefficiente()==-3)
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato opposto");
        

        if(m1.getEsponente('b')==4)
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato getEsponente");
        }

        if(m1.toString().contains("a2"))
            giustoConIncrementoTotTest();
        else {
            sbagliatoConIncrementoTotTest();
            System.err.println("sbagliato toString");
        }

        try {
            new Monomio(3,new int[] {2,4,7,5});
            sbagliatoConIncrementoTotTest();
            System.err.println("non controlla nr. esponenti");
        } catch(Exception e) {
            giustoConIncrementoTotTest();
            //e.printStackTrace();
        }
           
        try {
              new Monomio(3,new int[] {-2,4,7,5});
              sbagliatoConIncrementoTotTest();
              System.err.println("non controlla segno esponenti");
        } catch(Exception e) {
              giustoConIncrementoTotTest();
              //e.printStackTrace();
        }
           
           
           try {
              m1.getEsponente('g');
              sbagliatoConIncrementoTotTest();
              System.err.println("non controlla i simboli");
           } catch(Exception e) {
              giustoConIncrementoTotTest();
              //e.printStackTrace();
           }
           
           try {
              m1.setEsponente('g', 5);
              sbagliatoConIncrementoTotTest();
              System.err.println("non controlla il simbolo");
           } catch(Exception e) {
              giustoConIncrementoTotTest();
              //e.printStackTrace();
           }
           
           try {
              m1.setEsponente('b', -5);
              sbagliatoConIncrementoTotTest();
              System.err.println("non controlla segno esponente");
           } catch(Exception e) {
              giustoConIncrementoTotTest();
              //e.printStackTrace();
           }
        }   
    }
}
