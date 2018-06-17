import java.util.*;
import java.io.*;

public class vigenere{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("Inserire verme: ");
		String verme = in.next().toUpperCase();

		System.out.println("Inserire parola");
		String parola = in.next().toUpperCase();
		LinkedList<Character> output = new LinkedList<Character>();

		for(int i = 0; i<parola.length();i++){

			int temp = (Integer.valueOf(parola.charAt(i)) + Integer.valueOf(verme.charAt(i)))% 26;

			output.add((char)temp);


		}

		for(Character lettera : output){

			System.out.print(lettera);

		}

	}

}