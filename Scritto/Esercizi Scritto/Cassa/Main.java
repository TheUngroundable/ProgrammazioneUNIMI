import java.util.*;

public class Main{

	public static void main(String[] args){

		Cassa cassa = new Cassa();

		System.out.println(cassa.toString());

		System.out.println("Aggiungo una banconota da 10 euro alla cassa");
		cassa.inserisciInCassa(new Euro(10));

		System.out.println("Aggiungo una banconota da 5 euro alla cassa");
		cassa.inserisciInCassa(new Euro(5));

		System.out.println("Imposto un pagamento");
		cassa.impostaPagamento(12);

		System.out.println("Aggiungo una banconota da 5 euro per pagare");
		cassa.inserisci(new Euro(5));

		System.out.println("Aggiungo una banconota da 5 euro per pagare");
		cassa.inserisci(new Euro(5));

		System.out.println("Aggiungo una banconota da 5 euro per pagare");
		cassa.inserisci(new Euro(5));

		if(cassa.paga()){

			System.out.println("Resto: "+cassa.getResto());

		} else {

			System.out.println("Non sono state inserite abbastanza banconote");

		}

		cassa.emettiResto();
		System.out.println("Resto: "+cassa.getResto());


		System.out.println(cassa.toString());


	}

}