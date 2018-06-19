#!/bin/bash

NOMECLASSE=Stat
INPUT1="18 0.15 20 0.15 23 0.05 24 0.05 25 0.24 26 0.06 28 0.18 30 0.12"
EXPR1=" 18*0.15+20*0.15+23*0.05+24*0.05+25*0.24+26*0.06+28*0.18+30*0.12"

INPUT2="18 0.2 20 0.1 23 0.05 24 0.05 25 0.20 27 0.1 28 0.18 30 0.12"
EXPR2=" 18*0.2+20*0.1+23*0.05+24*0.05+25*0.20+27*0.1+28*0.18+30*0.12"

INPUT3="15 0.2 20 0.1 23 0.05 24 0.05 25 0.20 27 0.1 28 0.18 30 0.12"
EXPR3=" 15*0.2+20*0.1+23*0.05+24*0.05+25*0.20+27*0.1+28*0.18+30*0.12"

echo ================================================
echo INPUT
echo 1: $INPUT1
echo 2: $INPUT2
echo risultato:
echo $EXPR1 |bc
echo $EXPR2 |bc
echo ERRORE SU INPUT
echo ================================================
echo ================================================

find -name $NOMECLASSE.java| while
 read file
do
 echo ================================================
 echo $file
 dir=$(dirname $file)
 pushd $dir
 if
  test -s $NOMECLASSE.java
 then
  javac $NOMECLASSE.java
  echo INPUT DA STDIN | java $NOMECLASSE $INPUT1
  echo '---------------------'
  echo INPUT DA STDIN | java $NOMECLASSE $INPUT2
  echo '---------------------'
  echo INPUT DA STDIN | java $NOMECLASSE $INPUT3
 fi
 popd >/dev/null
done
