#!/bin/bash

###########################################################################
# TEMPLATE DA MODIFICARE PER OGNI SESSIONE, metterlo nella dir dell'esame #
###########################################################################

# prova con qualche input i vari esercizi
# va lanciato nella directory dello studente

shopt -s expand_aliases

if
 uname | grep -qi linux
then
 alias tj='timeout -s SIGKILL 10 java '  # forse ammazza anche il pid padre? fallisce su chi chiede input invece di linea comando
else
 echo 'ATTENZIONE, versione MAC!!!'
 alias tj='java '
fi

###########################################################################
filtro()
{	
#J=$(echo Filtro*java|cut -f1 -d" "|sed 's/\.java//g')
J=$1
echo -e "\n\n================== $J FILTRO"

if
 ! test -s $J.java
then
 echo $J MANCANTE
 return
fi

if
 javac $J.java
then

TMP=$(mktemp)

echo -e "\n+++ test 1 +++\n"
cat > $TMP << HERE
pari dispari pari dispari dispari
dispari dispari pari dispari dispari
dispari dispari pari dispari dispari
dispari pari dispari dispari
HERE
echo STDIN|tj $J $TMP

echo -e "\n+++ test 2 +++\n"
cat > $TMP << HERE
Lorem ipsum dolor sit amet, consectetur

adipiscing elit, sed do eiusmod tempor incididunt




ut labore et dolore magna aliqua.
Ut enim ad minim veniam, quis nostrud exercitation ullamco

laboris nisi ut aliquip ex ea commodo consequat.

Duis aute irure dolor in reprehenderit in
voluptate velit esse cillum dolore eu fugiat nulla pariatur.


Excepteur sint occaecat cupidatat non proident, sunt in culpa qui
officia deserunt mollit anim id est laborum.
HERE
echo STDIN|tj $J $TMP

echo -e "\n+++ test 3 +++\n"
cat > $TMP << HERE
tutteminuscole
TUTTEMAIUSCOLE

paperin12 prova pari dispari cavoloneso

minuscolecon1numero 

12345			pippo=pluto

PAP)(

wqeuiyq!dkajh

<kjhaks  !92837127
HERE
echo STDIN|tj $J $TMP

else
 echo "non compila!"
fi
}


###########################################################################
vigenere()
{	
J=Vigenere

echo -e "\n\n================== $J "

if
 ! test -s $J.java
then
 echo $J MANCANTE
 return
fi

if
 javac $J.java
then

echo -e "\n+ Test 0 (errore): "
tj $J  <<HERE
aa
HERE

echo -e "\n+ Test 1: "
tj $J VERMISSIMO <<HERE
AAAAAAAAAAAAAAA
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
aa
HERE

echo -e "\n+ Test 2: "
tj $J VERME <<HERE
RAPPORTOIMMEDIATO
HERE

echo -e "\n+ Test 3: "
tj $J vermenormaleminuscolo <<HERE
Lorem ipsum dolor sit amet, consectetur

adipiscing elit, sed do eiusmod tempor incididunt

ut labore et dolore magna aliqua.
Ut enim ad minim veniam, quis nostrud exercitation ullamco

laboris nisi ut aliquip ex ea commodo consequat.

Duis aute irure dolor in reprehenderit in
voluptate velit esse cillum dolore eu fugiat nulla pariatur.


Excepteur sint occaecat cupidatat non proident, sunt in culpa qui
officia deserunt mollit anim id est laborum.
HERE

else
 echo "non compila!"
fi

}


###########################################################################
triangoli()
{	
J=Triangoli

echo -e "\n\n================== $J "

if
 ! test -s $J.java
then
 echo $J MANCANTE
 return
fi

if
 javac $J.java
then

while
 read linea
do
 echo -e "\n+ Test: " $linea
 echo STDIN|tj $J $linea
done <<HERE
3 4 5
6 7 9 -1 3 3
3 4 fsl 5 6 7
3 4 5 4 5 3
4 3 5 6 5 4
3 4 5 15  4 7
6 2 1 7 9 12
5 1 4 56 4 7
HERE

else
 echo "non compila!"
fi
}


###########################################################################
funplot()
{
J=FunPlot

echo -e "\n\n================== $J"

if
 ! test -s $J.java
then
 echo $J MANCANTE
 return
fi

if
 javac $J.java
then

while
 read linea
do
 echo -e "\n+ Test: " $linea
 echo STDIN|tj $J $linea
done <<HERE
0 5 .1 tan
-20 20 1 3x2
-4 4  .1 square
-3 3  .1 pow4
-20 20  1 resto10
HERE
#0 5 .1 ident
#-20 20  1 pippo

else
 echo "non compila!"
fi
}

lanciaFiltro(){
if
 test $# -ne 1
then
 echo Usage: $0 '<nome classe filtro> (se si vuole lanciare anche filtro)'
else
 filtro $1
fi
}

############################################################################
rm *.class

lanciaFiltro $1
funplot
vigenere
triangoli
