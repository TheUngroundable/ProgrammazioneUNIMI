import java.util.*;
import java.io.*;


public class triangoli{

	public static void main(String[] args) {

		//Variabile per il numero triangolare
		int n;
		//Se il passaggio da linea di comando è assente
		if(args.length<1){
			//Setta n a 0
			n = 0;

		} else {
			//Altrimenti fai il parse di args[0]
			n = Integer.parseInt(args[0]);

		}


		//Stampa chiamando la funzione passando n
		System.out.println("Triangolare di : "+triangolare(n));

	}

	public static int triangolare(int n){
		//Il numero triangolare di 0 è 0
		if(n==0){

			return 0;

		} else {
			//Il numero triangolare è n + il numero triangolare di n-1
			return n + (triangolare(n-1));
			
		}

	}

}