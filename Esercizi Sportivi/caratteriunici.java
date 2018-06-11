import java.util.*;
import java.io.*;


public class caratteriunici{

	public static void main(String[] args){

		String parola = args[0];
		String output = "";

		for(int i = 0; i<parola.length(); i++){

			if(output.indexOf(parola.charAt(i)) == -1){

				output += parola.charAt(i);

			}

		}

		System.out.println(output);

	}

}