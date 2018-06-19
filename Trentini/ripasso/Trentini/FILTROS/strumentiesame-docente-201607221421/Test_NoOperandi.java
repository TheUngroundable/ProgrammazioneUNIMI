public class Test_NoOperandi extends AbstractTest {

    public void go() {
        try {
            new Somma().calcola();
            sbagliatoConIncrementoTotTest();
            System.err.println("Somma non lancia eccezione con zero operandi");
        } catch(Throwable t) {
            giustoConIncrementoTotTest();
        }

        try {
            new SommaUnici().calcola();
            sbagliatoConIncrementoTotTest();
            System.err.println("SommaUnici non lancia eccezione con zero operandi");
        } catch(Throwable t) {
            giustoConIncrementoTotTest();
        }

        try {
            new Massimo().calcola();
            sbagliatoConIncrementoTotTest();
            System.err.println("Massimo non lancia eccezione con zero operandi");
        } catch(Throwable t) {
            giustoConIncrementoTotTest();
        }

        try {
            new Moltiplicazione().calcola();
            sbagliatoConIncrementoTotTest();
            System.err.println("Moltiplicazione non lancia eccezione con zero operandi");
        } catch(Throwable t) {
            giustoConIncrementoTotTest();
        }

        try {
            new Media().calcola();
            sbagliatoConIncrementoTotTest();
            System.err.println("Media non lancia eccezione con zero operandi");
        } catch(Throwable t) {
            giustoConIncrementoTotTest();
        }
    }
}
