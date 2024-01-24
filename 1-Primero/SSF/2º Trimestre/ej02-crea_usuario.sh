#############################################
#Crear un script llamado ej02-crea_usuario.sh al que se le pasan tres parámetros (1: nombre, 2: apellidos, 3: usuario). El script imprimirá el siguiente mensaje en pantalla:
#Bienvenido, {nombre}
#Tus datos son: {nombre} {apellidos}
#Vamos a crear tu usuario: {usuario}
#Tu nueva ID es {aleatorio}
#############################################

celsius=$1
resultado=$(($1*1.8)+32)

echo "El resultado de los celsius introducidos a Fahrenheit es $resultado"
