<div align="justify">

## Manipulación básica en Git
### Melissa Ruiz


### Configuración
Primero vamos a configurar Git definiendo el nombre del usuario, el correo electrónico y activar el coloreado de salida.
```
  git config --global user.name "Your-Full-Name"
  git config --global user.email "your-email-address"
```
Para el color
```
  git config --global color.ui auto
  git config --list
```
Salida:     
<image src = "output1.png">

## Creación de un repositorio 
Crear un repositorio nuevo con el nombre *dpl* y mostrar su contenido
```
 mkdir dpl 
 cd dpl
 git init
 ls -la
 ```

__Nota:__ mkdir crea un directorio. cd entra dentro del directorio y ls -la lista el contenido del directorio. 


Salida:  
<image src = "output2.png">

## Comprobar el estado del repositorio
- Comprobar el estado del repositorio
- Crear un fichero indice.txt con el siguiente contenido:       
Capítulo 1: Instalación de Git por la alumna Melissa.     
Capítulo 2: Flujo de trabajo básico.
- Añadir el fichero a la zona de intercambio temporal. 
- Volver a comprobar una vez más el estado del repositorio.     

Salida:      

<image src = "output3.png">

## Realizando Commits
Realizar un commit de los últimos cambios con el mensaje __Añadido índice de la asignatura DPL.__ y ver el estado del repositorio. 
```
git commit -m "Añadido índice de la asignatura DPL."
git status
```
Salida:     
<image src = "output4.png">

## Modificación de ficheros 
- Cambiar el fichero indice.txt para que contenga lo siguiente:     
  - Capítulo 1: Instalación de Git por el alumno Melissa
  - Capítulo 2: Flujo de trabajo básico
  - Capítulo 3: Gestión de ramas
  - Capítulo 4: Repositorios remotos
- Mostrar los cambios con respecto a la última versión guardada en el repositorio.
- Hacer un commit de los cambios con el mensaje __Añadidos los capitulos 3 y 4__
```
nano indice.txt
```
Después Ctrol+X Y guardar cambios. 
Mostramos las diferencias que existen con:
```
git diff
```
Incluimos el fichero en la zona: 
```
git add indice.txt
```
Añadimos el commit y el mensaje descriptivo. 
```
git commit -m "Añadido los capitulos 3 y 4"   
```     

Salida de nano para la modificación de texto:


<image src = "nano.png">
Salida de todo lo demás: 



<image src = "output5.png">

## Historial
- Mostrar los cambios de la última versión del repositorio con respecto a la anterior.
- Cambiar el mensaje del último commit por "Añadido el capitulo sobre gestión de ramas al índice" 
- Volver a mostrar los últimos cambios del repositorio. 
Mostrar el historial de las operaciones que hemos realizado 
```
git show
```
Añadimos un nuevo mensaje descriptivo 
```
git commit --ammend -m "Añadido el capitulo sobre gestión de ramas al índice." 
```
Mostramos cambios realizados con: 
```
git show
```

__Resultados:__ 
<image src = "output6.png">
</div>