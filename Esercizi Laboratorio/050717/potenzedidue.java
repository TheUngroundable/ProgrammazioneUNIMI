
import java.util.*;
import java.io.*;

public class potenzedidue{

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		boolean success = false;
		int counter = 0;
		boolean empty = false;

		if(args.length == 0){

			System.out.println("Nessun input");
			empty = true;

		}

		if(!empty){

			for(int i = 0; i< args.length; i++){

				int numero = Integer.valueOf(args[i]);

				do{

					if(numero % 2 == 0){

						numero /= 2;

					} else {

						break;

					}

					if(numero / 2 == 1){

						success = true;

					}

				}while(numero >= 2);

				if(success){

					counter++;
					success = false;
				
				}

			}

			System.out.println(counter);		

		}

		

	}


}