/**
Leggere parole da un file, il cui nome è dato sulla linea di comando

Per ogni parola

	- se è tutta lettere, stampare 'L'
	- se è tutta cifre, stampare 'D'
	- se contiene almeno uno dei caratteri "( ) * /", stampare 'O'
	- tutte le altre, stampare 'A'

	inoltre calcolare diff media ascii rispetto alla precedente

*/
import java.util.*;
import java.io.*;

public class FiltroB {
    public static void main(String[] arg)
    throws Exception {
        Scanner sorgente=new Scanner(new File(arg[0]));
        String prec="";

        while(sorgente.hasNext()) {
            String token=sorgente.next();
            System.out.print(token);
            System.out.print(":");
            System.out.print(aveAscii(token)-aveAscii(prec));
            /*
            System.out.print(sumAscii(token));
            System.out.print(", ");
            System.out.print(prec!=null ? sumAscii(prec) : "");
            */
            System.out.print(",");
            if(allLetters(token))
                System.out.println("L"); // Letters
            else if(allDigits(token))
                System.out.println("D"); // Digits
            else if(containsSpecial(token))
                System.out.println("S"); // Special
            else
                System.out.println("O"); // Other

            prec=token;
        }
    }

    public static boolean allLetters(String s) {
        for(char c: s.toCharArray()) { // who cares for efficiency ;)
            if(!Character.isLetter(c)) return false;
        }
        return true;
    }

    public static boolean allDigits(String s) {
        for(char c: s.toCharArray()) { // who cares for efficiency ;)
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static boolean containsSpecial(String s) {
        for(char c: s.toCharArray()) { // who cares for efficiency ;)
            if("()*/".indexOf(c)>=0) return true;
        }
        return false;
    }

    public static int aveAscii(String s) {
        if(s.length() ==0)
            return 0;
        int sum=0;
        for(char c: s.toCharArray()) { // who cares for efficiency ;)
            sum+=c;
        }
        return sum/s.length();
    }
}
