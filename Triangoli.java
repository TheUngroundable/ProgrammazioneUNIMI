import java.lang.*;
import java.util.*;

public class Triangoli{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		//creo array int mentre controllo se parametri numerici e positivi

		int[] num=new int[args.length];
		int x=0, p=0;
		char c;

		for(x=0; x<args.length; x++){
			c=args[x].charAt(0);
			if(!Character.isDigit(c)){
				break;
			}
			else{
				p=Integer.parseInt(args[x]);
				if(p<0)
					break;
				else
					num[x]=p;
			}

		}



		//controllo condizioni per break programma se no proseguo

		if(num.length!=6||x<6)
			System.out.println("Dati non validi");
		else{

			if(isTriangolo(num[0],num[1],num[2]))
				System.out.println("["+num[0]+", "+num[1]+", "+num[2]+"] è un triangolo");
			else
				System.out.println("["+num[0]+", "+num[1]+", "+num[2]+"] non è un triangolo");

			if(isTriangolo(num[3],num[4],num[5]))
				System.out.println("["+num[3]+", "+num[4]+", "+num[5]+"] è un triangolo");
			else
				System.out.println("["+num[3]+", "+num[4]+", "+num[5]+"] non è un triangolo");

			int[] tri1={num[0],num[1],num[2]};
			int[] tri2={num[3],num[4],num[5]};

			if(areEquals(tri1, tri2))
				System.out.println("Sono uguali");
			else
				System.out.println("Non sono uguali");
		}		
	}

	public static boolean isTriangolo(int a, int b, int c){
		boolean tri;

		if(a<b+c&&b<a+c&&c<a+b)
			tri=true;
		else
			tri=false;

		return tri;
	}

	public static boolean areEquals(int[] triangolo1, int[] triangolo2){
		boolean val=true;

		for(int i=0; i<triangolo1.length; i++){
			for(int k=0; k<triangolo2.length; k++){
				if(triangolo1[i]==triangolo2[k]){
					triangolo2[k]=0;
				}
			}
		}

		for(int i=0; i<triangolo2.length; i++){
			if(triangolo2[i]==0)
				val=true;
			else{
				val=false;
				break;
			}
		}

		return val;
	}
}