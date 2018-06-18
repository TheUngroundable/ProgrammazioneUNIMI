import java.util.*;
import java.io.*;

public class triangoli{

	public static void main(String[] args){

		//Gestione dei dati

		boolean error = false;

		if(args.length != 6){

			error = true;

		}

		for(int i = 0; i < args.length; i++){

			if(!Character.isDigit(args[i].charAt(0))){

				error = true;
				break;
			}

			if(Integer.parseInt(args[i])<=0){

				error = true;
				break;

			}

		}

		//Tutto rego
		if(!error){

			//Primo triangolo
			int[] triangolo1 = new int[3];
			for(int i = 0; i<3; i++){

				triangolo1[i] = Integer.parseInt(args[i]);

			}

			//Secondo triangolo
			int[] triangolo2 = new int[3];
			for(int i = 3; i<6; i++){

				triangolo2[i%3] = Integer.parseInt(args[i]);

			}

			boolean isTriangolo = false;

			//Triangolo 1
			if(triangolo1[0] < triangolo1[1]+triangolo1[2]){

				isTriangolo = true;

			}


			if(triangolo1[1] < triangolo1[2]+triangolo1[0]){

				isTriangolo = true;

			}


			if(triangolo1[2] < triangolo1[0]+triangolo1[1]){

				isTriangolo = true;

			}

			System.out.println("["+triangolo1[0]+", "+triangolo1[1]+", "+triangolo1[2]+"]");
			
			if(isTriangolo){

				System.out.println("è un triangolo");

			} else {

				System.out.println("non è un triangolo");

			}

			//Triangolo 2
			if(triangolo2[0] < triangolo2[1]+triangolo2[2]){

				isTriangolo = true;

			}


			if(triangolo2[1] < triangolo2[2]+triangolo2[0]){

				isTriangolo = true;

			}


			if(triangolo2[2] < triangolo2[0]+triangolo2[1]){

				isTriangolo = true;

			}

			System.out.println("["+triangolo2[0]+", "+triangolo2[1]+", "+triangolo2[2]+"]");
			
			if(isTriangolo){

				System.out.println("è un triangolo");

			} else {

				System.out.println("non è un triangolo");

			}


		} else {

			System.out.println("Errore!!!");

		}

	}

}