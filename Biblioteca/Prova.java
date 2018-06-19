public class Prova{

  public static void main (String args[]){

  //  System.out.println();
    //Usuarios y datas
    Data miCumple = new Data(30, 06, 1996);
    Utente usr1 = new Utente("Joaco", "Cwd", miCumple);
  //  System.out.println(usr1);

    //System.out.println();

    Data suCumple = new Data(30, 04, 1999);
    Utente usr2 = new Utente("Giulia", "myLove", suCumple);
  //  System.out.println(usr2);

    Data fecha1 = new Data(12, 10, 1966);

    System.out.println(fecha1.giorniDa(new Data()));
    Data fecha2 = new Data(05, 01, 2018);

    //Libros
    String lala[] = {usr1.getNome(), usr2.getNome(), "Someone"};
    Libro libro1 = new Libro("Sun is the hell", lala);

    Libro libro2 = new Libro("Las aventuras qualcosa", usr2.getNome(), true);
/*

    System.out.println(libro1);
    System.out.println();
    System.out.println(libro2);
    System.out.println();

    Data fecha99 = new Data(20, 05, 2018);
    if(p1.riguardaData(fecha99)) System.out.println("Sei a posto");
    else System.out.println("scaduto");
    if(p1.riguardaLibro(libro2)) System.out.println("si c'è");
    else System.out.println("non c'è");

    Prestito p1 = new Prestito(libro1, usr1, fecha1);
    Prestito p2 = new Prestito(libro2, usr2, fecha2);

    Biblioteca laBiblio = new Biblioteca("laBiblio");

    laBiblio.nuovoUtente(usr1);
    laBiblio.nuovoUtente(usr2);

    laBiblio.nuovoLibro(libro1);
    laBiblio.nuovoLibro(libro2);

    System.out.println("Numero utenti: " + laBiblio.numeroUtenti());
    System.out.println("Numero libri: " + laBiblio.numeroLibri());

    laBiblio.daiInPrestito(libro1, usr1);
    laBiblio.daiInPrestito(libro2, usr1);

    System.out.println(laBiblio.quantiPrestiti(usr1));
    */
    //if(laBiblio.disponibile(libro2)) System.out.println("Libro disponible");
  //  else System.out.println("Libro no disponible");

  }


}
