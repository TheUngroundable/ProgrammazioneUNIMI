import java.util.*;
import java.io.*;


public class disegnav{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int s1 = 0;
		int s2 = 2*n-4;
		for(int i = 0; i<n; i++){

			for(int c = 0; c<s1; c++){

				System.out.print(" ");

			}
			System.out.print("*");

			for(int c = s2; c>=0; c--){

				System.out.print(" ");				

			}

			if(s2>=0){

				System.out.print("*");
				
			}

			System.out.println();
			s1++;
			s2-=2;
		}

	}

}