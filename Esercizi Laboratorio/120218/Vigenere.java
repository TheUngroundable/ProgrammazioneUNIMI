import java.lang.*;
import java.util.*;
import java.io.*;

public class Vigenere{
	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(new File("text.txt"));

		String chiave="";

		try{
			chiave=args[0];

			String testo="";

			while(input.hasNext()){
				testo+=input.nextLine()+'\n';
			}

			String testoDec=testo.toUpperCase();
			String chiaveUp=chiave.toUpperCase();

			char a, b, def;
			int uno, due, tre;

			for(int i=0; i<testoDec.length(); i++){
				for(int k=0; k<chiaveUp.length(); k++){
					a=testoDec.charAt(i);
					b=chiaveUp.charAt(k);

					uno=a;
					due=b;

					if(Character.isLetter(a)){

						if(('A'+due)>('A'+25)){
							tre=due;
							def=(char)(tre);
							System.out.println(a+"+"+b+"="+def);
						}
						else{
							tre='A'+due;
							def=(char)(tre);
							System.out.println(a+"+"+b+"="+def);
						}
						testoDec.replace(a,def);
					}
				}
			}


			System.out.println("Il testo:");
			System.out.println(testo);
			System.out.println("Con verme:");
			System.out.println(chiave);
			System.out.println("Diventa:");
			System.out.println(testoDec);


		}

		catch(Exception e){
			System.out.println("Chiave non fornita");
		}

		
	}
}