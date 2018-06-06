
import java.util.*;
import java.io.*;

public class pappagallo{

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		String pappagallo;
		char exitcode;

		do{

			in.nextLine();
			System.out.println("Inserisci una parola da far ripetere al pappagallo");

			pappagallo = in.nextLine();

			System.out.println(pappagallo);

			System.out.println("Vuoi far parlare di nuovo il pappagallo? Y/N");

			exitcode = in.next().charAt(0);

			Character.toUpperCase(exitcode);

		}while(exitcode != 'N');

		System.out.println("Pappagallo!!!");

	}

}
}