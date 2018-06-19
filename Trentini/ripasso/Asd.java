public class Asd{

  public static void main(String args[]){

  Scanner input = new Scanner(new File(args[0]));

  ArrayList<String> righe = new ArrayList<String>();

    while(input.hasNextLine()){
      righe.add(input.nextLine());
    }

    for(int i = 0; i<righe.size(); i++){
      qualcosa(righe.get(i));
    }
  }

  public static int qualcosa(String riga){

    Scanner input22 = new Scanner(riga);

    while(input22.hasNext()){


    }


  }


}
