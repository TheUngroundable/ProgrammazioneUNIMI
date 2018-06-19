import java.util.*;

public class Data{

  private int giorno;
  private int mese;
  private int anno;
  private int giorniTrascorsi;
  private int giorniMancanti;

  public Data(int g, int m, int a){

   this.giorno = g;
   this.mese = m;
   this.anno = a;
   if(m>1){
		for (int i=1; i<m; i++)
			this.giorniTrascorsi+=giorniMese(m, a);
      }
		this.giorniTrascorsi+=g;
		this.giorniMancanti=isBisestile(a)? 366-giorniTrascorsi : 365-giorniTrascorsi;
   }

  public Data(){
    this(Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.MONTH)+1, Calendar.getInstance().get(Calendar.YEAR) );
  }

  public static boolean isBisestile(int a){
    boolean flag = a%4==0 && a%100!=0 || a%400==0;
    return flag;
	}

  public static int giorniMese(int m, int a){
    int gMese = 0;
    switch(m){
			case 11: case 4: case 6: case 9: gMese = 30;
			case 2:
				if(isBisestile(a)) gMese = 29;
        else gMese = 28;
			default: gMese = 31;

		}
    return gMese;
  }

  public static int giorniAnno(int a){
    return isBisestile(a)? 366 : 365;

  }

  public int getGT(){
    return this.giorniTrascorsi;
  }

  public int getGM(){
    return this.giorniMancanti;
  }

  public int giorniDa(Data d){

    if(this.equals(d)) return 0;
    else{
      int giorni = 0;
      Data min = this.vienePrimaDi(d)? this : d;
      Data max = this.vienePrimaDi(d)? d : this;

      for(int i = min.anno+1; i<max.anno; i++) giorni+= giorniAnno(i);
      giorni+= min.anno==max.anno? max.getGT()-min.getGT() : min.getGM()+max.getGT();
      return this.vienePrimaDi(d)? giorni : giorni*(-1);
    }

  }

  public int giorniDaEpoca(){
    return this.giorniDa(new Data(1, 1, 1970) );
  }

  public boolean vienePrimaDi(Data d){

    if(this.equals(d)) return false;

    if(this.anno>d.anno) return false;

    if(this.anno==d.anno && this.mese>d.mese) return false;

    if(this.anno==d.anno && this.mese==d.mese && this.giorno>d.giorno) return false;

    return true;

  }

  public Data successiva(){
    int newMese = this.mese+2;
    int newAnno = this.anno;
    if(newMese>12){
      newMese-=12;
      newAnno++;
    }
    return new Data(01, newMese, newAnno);
  }

  @Override
  public boolean equals(Object x){
    if(!(x instanceof Data)) return false;
    Data d = (Data)x;
    return this.giorno == d.giorno && this.mese == d.mese && this.anno == d.anno;
  }

  @Override
  public int hashCode(){
    return this.giorno+this.mese+this.anno;
  }

  @Override
  public String toString(){
    return this.giorno + "/" + this.mese + "/" + this.anno;
  }


}
