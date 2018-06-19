public class numPerfetto{

  public static void main(String args[]){

    int numero = Integer.parseInt(args[0]);
    int isPerfect = 1;

    for(int i = 2; i<numero; i++) if(numero%i==0) isPerfect +=i;

    if(isPerfect==numero) System.out.println("Si, il numero " + numero + " e' perfetto");
    else System.out.println("No, il numero " + numero + " NON e' perfetto");


  }

}
