import java.util.*;

public class Digits{

  public static void main(String args[]){

    for(int i = 0; i<args.length; i++){

      int somma = 0;
      String numero = args[i];
      int e = 0;

      while(e<numero.length()){
        somma+= Integer.valueOf(Integer.parseInt(numero.charAt(e)+""));
        e++;
      }

      System.out.println(args[i] +" : somma " + somma);

    }

  }

}
