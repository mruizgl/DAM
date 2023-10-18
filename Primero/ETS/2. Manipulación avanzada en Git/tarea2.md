<div>

## Manipulación de Git avanzada |  Melissa Ruiz
### Ejercicio 1
- Mostrar el historial de cambios del repositorio. __Repositorio seleccionado__ -> "*libros*" clonando https://github.com/jpexposito/libro
- Crear la carpeta capítulos y crear dentro de ella el fichero capitulo1.txt con el siguiente texto:
```
Git es un sistema de control de versiones ideado por Linus Torvalds.
```
- Añadir los cambios a la zona de intercambio temporal. 
- Hacer un commit de los cambios con el mensaje Añadido capítulo 1. 
- Volver a mostrar el historial de cambios del repositorio.

__Mostramos el historial de cambios del repositorio__    
Para realizar esta acción se debe ejecutar el comando: 
```
git show
```
En pantalla nos muestra lo siguiente:
<img src = "capturas/output2.png">
  
Vamos a crear la carpeta 'capítulos' y dentro de ella el fichero capitulo1.txt, para ello vamos a utilizar el siguiente comando: 
```
mkdir capitulos
cat > capitulos/capitulo1.txt
Git es un sistema de control de versiones ideado por Linus Torvalds.
```
>__Nota__: __Ctrol+D__ para salir del cat   

  
 

 Y además vamos a hacer un commit de los cambios con el mensaje *añadido capítulo 1*. Con este comando: 
 ```
 git add .
 git commit -m "Añadido capítulo 1."
 git log
 ```
  __Output:__  
 <img src = "capturas/output3.png">   

 ## Ejercicio 2
 - Crear el fichero capitulo2.txt en la carpeta capítulos con el siguiente texto:
 ```
El flujo de trabajo básico con Git consiste en: 
1- Hacer cambios en el repositorio. 
2- Añadir los cambios a la zona de intercambio temporal. 
3- Hacer un commit de los cambios.
 ```
 Usamos el siguiente comando para hacerlo:
 ```
 cat > capitulos/capitulo2.txt
 El flujo de trabajo básico con Git consiste en:
 1- Hacer cambios en el repositorio.
 2- Añadir los cambios a la zona de intercambio temporal.
 3- Hacer un commit de los cambios.
 ```
 - Añadir los cambios a la zona de intercambio temporal. 
 - Hacer un commit de los cambios con el mensaje *Añadido capítulo 2.*
 Para ello usamos 
 ```
 git add .
git commit -m "Añadido capítulo 2."
 ```
 Output de todo lo realizado anteriormente: 
 <img src = "capturas/output5.png">
 - Mostrar las diferencias entre la última versión y dos versiones anteriores. Para ello usamos 
 ```
 git diff HEAD~2..HEAD
 ```
 Output de las diferencias: 
 <img src = "capturas/output4.png">

 ## Ejercicio 3
  - Crear el fichero capitulo3.txt en la carpeta capítulos con el siguiente texto.

```console
Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.
```

 - Añadir los cambios a la zona de intercambio temporal.
 - Hacer un commit de los cambios con el mensaje _Añadido capítulo 3._
 - Mostrar las diferencias entre la primera y la última versión del repositorio.

 Para crear el fichero ejecutamos lo siguiente:
 ```
 cat > capitulos/capitulo3.txt
 Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.
 ```
 Añadimos los cambios, hacemos commit con el mensaje *añadido capitulo 3* y mostramos diferencias entre la primera y la última versión del respositorio.
 Para ello usaremos: 
 ```
git add .
git commit -m "Añadido capítulo 3."
git log
git diff <codigo hash de la primera version>..HEAD
 ```

 __Output__:
 <img src = "capturas/output6.png">
 
 ## Ejercicio 4
 - Crea el fichero índice.txt la siguiente línea:
```console
Indice de los cápitulos, con conceptos avanzados de git
```
- Añadir los cambios a la zona de intercambio temporal.
- Hacer un commit de los cambios con el mensaje _"Indice de los cápitulos, con conceptos avanzados de git_.
- Mostrar quién ha hecho cambios sobre el fichero _indice.txt_.

Para ello usaremos el siguiente código: 
```
 cat > indice.txt
 git add .
 git commit -m "Se crea el indice."
 echo "Indice de los cápitulos, con conceptos avanzados de git" >> indice.txt
 git add .
 git commit -m "Añadido el índice ."
 git annotate indice.txt
```
__Output__:     
<img src = "capturas/output7.png">

## Ejercicio 5
Crear una nueva rama bibliografía y mostrar las ramas del repositorio.  
Para ello utilizaremos el siguiente código: 
```
  git branch bibliografia
  git branch -av
```
__Output__: 

<img src = "capturas/output8.png">

## Ejercicio 6
 - Crear el fichero capitulos/capitulo4.txt y añadir el texto siguiente:

```console
  En este capítulo veremos cómo usar GitHub para alojar repositorios en remoto.
```

 - Añadir los cambios a la zona de intercambio temporal.
 - Hacer un commit con el mensaje “Añadido capítulo 4.”
 - Mostrar la historia del repositorio incluyendo todas las ramas.

 Para ello utilizaremos el siguiente código: 
 ```
 cat > capitulos/capitulo4.txt
En este capítulo veremos cómo usar GitHub para alojar repositorios en remoto.
git add .
git commit -m "Añadido capítulo 4."
git log --graph --all --oneline
 ```
 __Output__:
 <img src = "capturas/output10.png">

 ## Ejercicio 7
  - Cambiar a la rama bibliografía.
 - Crear el fichero bibliografia.txt y añadir la siguiente referencia:
```console
Chacon, S. and Straub, B. Pro Git. Apress.
```
 - Añadir los cambios a la zona de intercambio temporal.
 - Hacer un commit con el mensaje “Añadida primera referencia bibliográfica.”
 - Mostrar la historia del repositorio incluyendo todas las ramas.
    
Para ello utilizaremos el siguiente código:
```
git checkout bibliografia
cat > bibliografia.txt
 - Chacon, S. and Straub, B. Pro Git. Apress.
git add .
git commit -m "Añadida primera referencia bibliográfica."
git log --graph --all --oneline
```
__Output__:
<img src = "capturas/output11.png">  

## Ejercicio 8
 - Fusionar la rama bibliografía con la rama main.
 - Mostrar la historia del repositorio incluyendo todas las ramas.
 - Eliminar la rama bibliografía.
 - Mostrar de nuevo la historia del repositorio incluyendo todas las ramas.

 Para ello utilizaremos el siguiente código: 
 ```
git checkout main
git merge bibliografia
git log --graph --all --oneline
git branch -d bibliografia
git log --graph --all --oneline
 ```

 __Output__:
 <img src = "capturas/output13.png">

 ## Ejercicio 9
  - Crear la rama bibliografía.
 - Cambiar a la rama bibliografía.
 - Cambiar el fichero bibliografia.txt para que contenga las siguientes referencias:
```cosole
Scott Chacon and Ben Straub. Pro Git. Apress.
Ryan Hodson. Ry’s Git Tutorial. Smashwords (2014)
```
 - Cambiar a la rama main.
 - Cambiar el fichero bibliografia.txt para que  - contenga las siguientes referencias:
```console
Chacon, S. and Straub, B. Pro Git. Apress.
Loeliger, J. and McCullough, M. Version control with Git. O’Reilly.
```
 - Añadir los cambios a la zona de intercambio temporal y hacer un commit con el mensaje “Añadida nueva referencia bibliográfica.”
 - Fusionar la rama bibliografía con la rama main.
 - Resolver el conflicto dejando el fichero bibliografia.txt con las referencias:
```console
Chacon, S. and Straub, B. Pro Git. Apress.
Loeliger, J. and McCullough, M. Version control with Git. O’Reilly.
Hodson, R. Ry’s Git Tutorial. Smashwords (2014)
```
 - Añadir los cambios a la zona de intercambio temporal y hacer un commit con el mensaje “Resuelto conflicto de bibliografía.”
 - Mostrar la historia del repositorio incluyendo todas las ramas.

 Para ello haremos lo siguiente: 
 ```
git branch bibliografia
git checkout bibliografia
```
 cat > bibliografia.txt
 - Scott Chacon and Ben Straub. Pro Git. Apress.
 - Ryan Hodson. Ry's Git Tutorial. Smashwords (2014)
git commit -a -m "Añadida nueva referencia bibliográfica."
 git checkout main
 cat > bibliografia.txt
 - Chacon, S. and Straub, B. Pro Git. Apress.
 - Loeliger, J. and McCullough, M. Version control with Git. O'Reilly.
git commit -a -m "Añadida nueva referencia bibliográfica."
git merge bibliografia
git nano bibliografia
 # Hacer los cambios indicados en el fichero
 ```
git commit -a -m "Solucionado conflicto bibliografía."
git log --graph --all --oneline
 ```
 __Output__: 
 <img src = "capturas/output15.png">
 <img src = "capturas/output16.png">
 
</div>
