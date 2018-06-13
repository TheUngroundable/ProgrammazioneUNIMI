# Programmazione UNIMI

Repo degli esercizi tratti dalle tracce d'Esame di Programmazione

## Indice

* [Perchè](#perchè)

## Perchè

L' unico modo per avere sempre con te gli esercizi di programmazione con tanto di svolgimento.
Non sarò il programmatore più bravo al mondo... ma in fondo me la cavo, dai!

### Prerequisiti

Prima di tutto hai bisogno di java installato.

## Struttura

### Le Cartelle

Sono presenti varie cartelle tra cui:
* [Esercizi Scritto] Dove vengono organizzate le tracce d' esame per data
* [Esercizi Laboratorio] Dove vengono organizzate le tracce d' esame per data
* [Esercizi Sportivi] Dove vengono proposti degli esercizi alternativi o piccoli progetti
* [Tracce Laboratorio] Dove vengono archiviate le tracce d' esame non ancora svolte o completate
* [Tracce Scritto] Dove vengono archiviate le tracce d' esame non ancora svolte o completate

# Guida Galattica per Programmatori v2.0
## Esame di Laboratorio

### *Struttura e Manipolazione Dati*

Le librerie da importare sono:
* import java.util.*;
* import java.io.*;

#### *Per Leggere da Standard Input*

Se ti viene richiesto di leggere da standard input è necessario un oggetto Scanner così dichiarato

```
Scanner input = new Scanner(System.in);
```

Dove *System.in* si riferisce allo standard input, la tastiera

#### *Per Leggere da File*

Se ti viene invece richiesto di leggere da File è necessario un oggetto Scanner con un oggetto File reader a cui viene passato il path del file

```
Scanner file = new Scanner(new FileReader("./testo.txt"));
```

Dove *./testo.txt* si riferisce al percorso relativo (o assoluto) del file **COME STRINGA**


#### *Leggere dallo Scanner*
Avendo dichiarato correttamente lo Scanner:

* Un Numero Intero: 
```
int numero = input.nextInt();
```

* Un Numero Decimale: 
```
float numeroDecimale = input.nextFloat();
```

* Una Parola (troncata al primo *whitespace*): 
```
String parola = input.next();
```

* Una Frase: 
```
String frase = input.nextLine();
```

* Un Carattere: 
```
char lettera = in.next().charAt(0);
```
**Questi Metodi sono validi anche per la lettura da FILE**

#### *Manipolazione di un testo di lunghezza NON NOTA*

Per manipolare un testo di lunghezza NON NOTA è necessario usare un ciclo do...while in modo tale che peschi riga per riga fintanto che ci sono righe nel buffer.

Per pescare riga per riga usiamo .nextLine(), per verificare se c'è ancora una riga usiamo .hasNextLine() che ritorna true se è presente ancora una riga nel buffer

Analogamente questo procedimento funziona anche per manipolare parola per parola, ma in questo caso pescheremo le nostre parole con .next() e verificheremo se ci sono ancora parole con .hasNext() nel nostro *while*


#### *Interropmere il flusso di Standard Input*

Per interrompere un flusso di Standard Input, **su Windows**, bisogna, su riga vuota, premere CTRL-Z ed Invio

#### *Piccoli Esempi*
> Dato un testo contenuto in un file di lunghezza non noto, determinare da quante righe è costituito

```
Scanner file = new Scanner(new FileReader("./testo.txt"));

int counter = 0;

do{

	String line = file.nextLine();
	counter++;

}while(file.hasNextLine());

System.out.println("Numero di righe: "+counter);

```


### Classi fondamentali e metodi

* Scanner
  - Next()
  - NextLine()

* String
* Character
* Integer


Per sopravvivere all' esame di laboratorio è necessario conoscere alcune classi fondamentali e saper manipolarne determinati metodi.

## Come Funziona

### Per Compilare il Codice:

```
javac nomefile.java
```

### Per Eseguire il Codice:

```
java nomefile args[0], args[1], ...
```


## Debug

Non c'è molto da dire... LEGGI LA CONSOLE!

## Built With

* [JAVA JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java per compilare e eseguire
* [JAVA Doc](http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html) - Documentazione
* [Stack Overflow](https://stackoverflow.com/) - Poco da aggiungere
* [Sublime Text](https://www.sublimetext.com/) - Il mio unico vero amore
* [Passione](https://github.com/TheUngroundable/) - Il mio profilo GitHub
