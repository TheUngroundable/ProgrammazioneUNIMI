
import java.util.*;

public class Ripasso{

  public static void main(String args[]){

    Scanner keyboard = new Scanner(System.in);

    while(keyboard.hasNextLine()){

      String frase = keyboard.nextLine();

      if(isPalindroma(normalizzatore(frase))) System.out.println("Es palindroma");
      else System.out.println("No es palindroma");

      System.out.print("Siguiente frase: ");
    }

  }

  public static boolean isPalindroma(String frase){

    int fraseLength = frase.length()-1;
    if(fraseLength<1) return true;

    if(frase.charAt(0)==frase.charAt(fraseLength)){
      if(fraseLength==2) return true;
      else isPalindroma(frase.substring(1,fraseLength-1));
    }

    return false;

  }

  public static String normalizzatore(String str){

    String strPulita = "";
    str = str.trim();
    for(int i = 0; i<str.length(); i++){
      if(Character.isAlphabetic(str.charAt(i))) strPulita+= str.charAt(i);
    }

    return strPulita.toLowerCase();
  }
}
