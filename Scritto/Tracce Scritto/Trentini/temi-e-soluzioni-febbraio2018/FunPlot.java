/**
 * plotta una funzione (tan, exp, log, pow3, pow4, resto10, 3x+2, abs?)
 *
 * prende su linea di comando:
 * - xmin, xmax, xstep
 * - funzione da plottare tra quelle in parentesi
 *
 * plotta (a caratteri, in verticale) la funzione scelta usando i range specificati
 * deve essere robusta agli errori di calcolo (non tutte le funzioni hanno valori sensati su tutti i range)
 *
 * >>> forma OUTPUT <<<
 * per ogni xi:
 * il valore xi
 * seguito da “:” e da un asterisco opportunamente distanziato
 * seguito dal valore yi
 * Se il valore yi non appartiene all’intervallo (-39, 40), yi verra` visualizzato subito dopo “:”.
 */


public class FunPlot {
    public static void main(String[] arg) {

        double xmin,xmax,xstep,fvalue;
        String fun;

        if(arg.length != 4) {
            System.out.println("Dati non validi");
            System.exit(1);
        }

        try {
            xmin=Double.parseDouble(arg[0]);
            xmax=Double.parseDouble(arg[1]);
            xstep=Double.parseDouble(arg[2]);

            int ymin= -40; //Double.parseDouble(arg[3]);
            int ymax= 40; //Double.parseDouble(arg[4]);

            fun=arg[3];

            System.out.println("Parametri: "+ xmin+","+xmax+","+xstep+","+fun);

            for(double x=xmin; x<=xmax; x+=xstep) {
                switch(fun) {

                case "ident":
                    fvalue=x;
                    break;

                case "abs-sin": // NO
                    fvalue=Math.abs(Math.sin(x));
                    break;

                case "cos": // NO
                    fvalue=Math.cos(x);
                    break;

                case "tan":
                    fvalue=Math.tan(x);
                    break;

                case "exp":
                    fvalue=Math.exp(x);
                    break;

                case "log":
                    fvalue=Math.log(x);
                    break;

                case "3x2":
                    fvalue=3*x+2;
                    break;

                case "square": // NO
                    fvalue=x*x;
                    break;

                case "pow4":
                    fvalue=Math.pow(x,4);
                    break;

                case "pow3":
                    fvalue=Math.pow(x,3);
                    break;

                case "sqrt-abs": // NO
                    fvalue=Math.sqrt(Math.abs(x));
                    break;

                case "resto10": // era "abs-resto10":
                    fvalue= x%10;  //Math.abs(x%10);
                    break;

                default:
                    fvalue=0;
                    System.err.println("Funzione NON implementata");

                }

                //System.err.println(x+": "+fvalue);
                System.out.format("%.2f: ",x);
                if(fvalue>=ymin && fvalue<=ymax) {
                    //double value=map(fvalue,ymin,ymax,0,80);
                    //System.err.println("in range, diventa: "+value);
                    for(int i=ymin; i<fvalue; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("* ");
                }

                System.out.format("%.2f\n",fvalue);
            }
        } catch(Exception ex) {
            System.out.println("Dati non validi");
        }
    }
}
