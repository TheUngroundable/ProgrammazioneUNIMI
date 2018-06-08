import java.util.*;
import java.io.*;
import java.math.*;

//Chiudi il buffer con CTRL-Z

public class calcolagiorno{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String dataRaw = in.nextLine();

		String[] dataString = dataRaw.split(" ");

		int[] data = new int[3];

		for(int i = 0; i<data.length; i++){

			data[i] = Integer.parseInt(dataString[i]);
			System.out.println(data[i]);
		
		}

	}
	
}