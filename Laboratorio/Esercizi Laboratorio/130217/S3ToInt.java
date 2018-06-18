import java.util.*;
import java.io.*;
import java.math.*;

//Chiudi il buffer con CTRL-Z

public class S3ToInt{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String numero = in.next();
		int output = 0;

		for(int e = 0; e<numero.length(); e++){

			for(int i = numero.length()-1; i>= 0; i--){

				switch(numero.charAt(i)){

					case 'd':

						output += 2 * (Math.pow(3, e));

					break;

					case 'u':

						output += 1 * (Math.pow(3, e));

					break;

					case 'z':

						output += 0 * (Math.pow(3, e));

					break;
				}				
			}
		}

		System.out.println(output);

	}
	
}