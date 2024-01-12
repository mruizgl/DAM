#!/bin/bash
##############################################################
#Crear un script llamado ej01-resta.sh al que le pasemos dos argumentos y nos devuelva la resta
#
#
###########################################################

valor1=$1
valor2=$2

resultado=$(( valor1-valor2 ))
echo "El resultado de la operacion es $resultado"
