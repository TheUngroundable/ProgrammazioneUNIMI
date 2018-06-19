public class ProvaSuperM{

  public static void main(String args[]){

    Reparto rep1 = new Reparto("Bevande", "Joaco Jackson");
    Reparto rep2 = new Reparto("Cibo", "Giulia Fideos");

    UnitaDiMisura kg = new UnitaDiMisura("chilogrammo", "kg");
    UnitaDiMisura g = new UnitaDiMisura("grammo", "g", kg, 1000);
    UnitaDiMisura l = new UnitaDiMisura("litro", "l");
    UnitaDiMisura ml = new UnitaDiMisura("millilitri", "ml", l, 1000);

    Prodotto birraMoretti = new Prodotto("Birra Moretti classica", rep1, "37712341234AF3", 660, 1.25, ml);

    Offerta offBirraMoretti = new Offerta("PiùBirraPerTutti", birraMoretti, 25, 3, true);

    //System.out.println(birraMoretti);
    System.out.println(offBirraMoretti.prezzo(5, false));
    System.out.println(offBirraMoretti.prezzo(2, true));
    System.out.println(offBirraMoretti.prezzo(3, true));

  }

}
