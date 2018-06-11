import java.util.*;
import java.io.*;

//per il commento guarda il filtro A

public class coefficientebinomiale{

	public static void main(String[] args) throws Exception {

		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);

		//(n k) = n!/((n-k)!*k!)

		//(n k) = (n-1 k-1) + (n-1 k)

		//(n k) = { (n-1)! / [(n-1)-(k-1)]! * (k-1)! } + { (n-1)! / [(n-1-k)! * k!] }

		System.out.println((fattoriale(n-1) / (fattoriale((n-1)-(k-1)) * fattoriale(k-1))) + (fattoriale(n-1) / (fattoriale((n-1)-k) * fattoriale(k))));

	}
	
	private static int binomio(int n, int k){

		if(k==0){

			return 1;

		} else if(n==0) {

			return 0;

		} else {

			return binomio(n-1, k-1) + binomio(n-1, k);
			
		}

	}

	private static int fattoriale(int n){

		if(n == 0){

			return 1;

		} else {

			return (n * fattoriale(n-1));

		}

	}

}

