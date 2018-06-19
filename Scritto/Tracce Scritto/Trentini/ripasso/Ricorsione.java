import java.util.*;

public class Ricorsione{

  public static void main (String[] args){

    Scanner in=new Scanner(System.in);
    System.out.println(parola(args[0]));

  }

  public static String parola(String s){

    if(s.length()<=1) return g+=s;
    else{
      if(s.charAt(0)==s.charAt(1)) return parola(s.substring(1));
      else return g + parola(s.substring(1));
    }

  }

  }
}
