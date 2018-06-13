# Programmazione UNIMI

Repo degli esercizi tratti dalle tracce d'Esame di Programmazione

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

### Struttura e Manipolazione Dati

Le librerie da importare sono:
* import java.util.*;
* import java.io.*;

#### Leggere da Standard Input

Se ti viene richiesto di leggere da standard input è necessario un oggetto Scanner così dichiarato

```
Scanner input = new Scanner(System.in);
```

Dove *System.in* si riferisce allo standard input, la tastiera

#### Leggere da File

Se ti viene invece richiesto di leggere da File è necessario un oggetto Scanner con un oggetto File reader a cui viene passato il path del file

```
Scanner file = new Scanner(new FileReader("./testo.txt"));
```

Dove *./testo.txt* si riferisce al percorso relativo (o assoluto) del file **COME STRINGA**


#### Leggere dallo Scanner
Avendo dichiarato correttamente lo Scanner:

* Un Numero Intero: 
```
int numero = input.nextInt();
```

* Un Numero Decimale: 
```
floats numeroDecimale = input.nextFloat();
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


#### Interropmere il flusso di Standard Input



#### Piccoli Esempi
> Stampare il numero di righe inserite da standard input

```
Scanner input = new Scanner(System.in);
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
