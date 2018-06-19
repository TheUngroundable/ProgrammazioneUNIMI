#!/bin/bash

/bin/rm *.class

clear
cat <<HERE
==================================================================================
	ATTENZIONE!!! ATTENZIONE!!! ATTENZIONE!!! ATTENZIONE!!! ATTENZIONE!!!

	Questo script compila tutti i sorgenti java nella directory corrente
	ed esegue una serie di test (le classi Test_*) che
	stressano vari aspetti del vostro elaborato.

	*** Il fatto di passare questi test NON equivale a passare l'esame! ***

	Altri test non inclusi qui verranno effettuati, inoltre
	il sorgente verra' comunque analizzato e valutato dai docenti.

	Questo script serve piu' che altro a voi come verifica di
	non aver inserito macroerrori.

	P.S. se puo' essere utile viene creata la documentazione
	di tutti i sorgenti (javadoc) nella dir "doc"
==================================================================================
HERE
echo "*** Creo documentazione..."
javadoc -d doc -quiet *java
echo ==================================================================================

echo "*** Compilo tutto...  (il warning su AbstractTest e' OK)"

#uso for perche' altrimenti si fermerebbe troppo presto
for nome in Test_*java
do
 javac $nome 2>&1
done


# cosi' si ferma molto presto, col for di sopra tenta di compilare ogni singolo test
#if
# ! javac *java 2>&1
#then
#  echo "!!! Errori di compilazione !!! ESCO !!!"
#  exit 1
#fi

echo ==================================================================================
echo "*** Lancio i test..."
#echo -e Dir=$(basename $PWD)

for classfile in Test_*.java  # cerco i java perche' cosi' vedo quelli non compilati
do
 classe=$(basename $classfile .java)
 echo -en $(basename $PWD)":\t"
 if
  test -f $classe.class
 then
  java AbstractTest $classe $1 2>&1
 else
  echo -e "$classe \t\tMANCA!!! (non compilato)"
 fi
done
echo ==================================================================================
