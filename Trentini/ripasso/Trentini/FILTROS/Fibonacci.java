public class Fibonacci{

  public static void main(String args[]){

    int num = Integer.parseInt(args[0]);
    if(num<=1) System.exit(0);
    else stampaPattern(num);

  }

  public static int fibonacci(int n){
    if(n==0) return 1;
    if(n==1) return 1;
    else return fibonacci(n-2) + fibonacci(n-1);
  }

  public static void stampaPattern(int n){
    for(int i = 0; i<n; i++){
      for(int e = 0; e<fibonacci(i); e++) System.out.print("*");
      System.out.println();
    }
  }

}
