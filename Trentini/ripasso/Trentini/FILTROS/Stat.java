import java.util.*;

public class Stat{

  public static void main (String args[]){

    if(args.length%2!=0){
      System.out.println("Error");
      System.exit(0);
    }

    float total = 0;

    ArrayList<Integer> voti = new ArrayList<Integer>();
    ArrayList<Float> prob = new ArrayList<Float>();

    for(int i = 0; i<args.length; i++){

      if(i%2==0){

        if(Integer.parseInt(args[i])<18 || Integer.parseInt(args[i])>30){
          System.out.println("Error");
          System.exit(0);
        }else{
          voti.add(Integer.parseInt(args[i]));
        }

      }else{

        if(Float.parseFloat(args[i])<0.0 || Float.parseFloat(args[i])>1.0){
          System.out.println("Error");
          System.exit(0);
        }else{
          prob.add(Float.parseFloat(args[i]));
        }


      }

    }

    for(int e = 0; e<args.length/2; e++) total+=(float)voti.get(e)*prob.get(e);
    System.out.println(total);



  }

}
