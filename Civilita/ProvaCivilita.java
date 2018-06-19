public class ProvaCivilita{

  public static void main(String args[]){

    Risorsa petrolio = new Risorsa ("Petrolio", 500);
  	Risorsa oro = new Risorsa ("Oro", 400);
    Risorsa acciaio = new Risorsa ("Acciaio", 350);
    Risorsa legno = new Risorsa ("Legno", 300);
  	Risorsa cibo = new Risorsa ("Cibo", 200);
    Risorsa pietra = new Risorsa ("Pietra", 200);

    Civilta nord = new Civilta("Nord");
    Civilta sud = new Civilta("Sud");


    sud.fondaCitta("Palermo", pietra);
    sud.fondaCitta("Napoli", acciaio);
    sud.fondaCitta("Roma", legno);

    nord.fondaCitta("Milano", oro);
    nord.fondaCitta("Firenze", petrolio);
    nord.fondaCitta("Torino", cibo);

    sud.aggiungiDenaro(2000);
    nord.aggiungiDenaro(3000);


    Storia italia = new Storia();
    italia.addCivilta(nord);
    italia.addCivilta(sud);

    italia.evolvi(5);

    System.out.println(nord);

    System.out.println("-----------------------------");

    System.out.println(sud);

  }



}
