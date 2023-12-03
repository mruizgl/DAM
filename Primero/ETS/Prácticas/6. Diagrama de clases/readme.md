<div align="justify">



## Descripción del ejercicio

Una biblioteca tiene copias de libros. Estos últimos se caracterizan por su nombre, tipo (ingeniería, literatura, informática, historia ...), editorial, año y autor.

Los autores se caracterizan por su nombre, nacionalidad y fecha de nacimiento.

Cada copia tiene un identificador, y puede estar en la biblioteca, prestada, con retraso o en reparación.

Los lectores pueden tener un máximo de 3 libros en préstamo.

Cada libro se presta un máximo de 30 días, y por cada día de retraso, se impone una “multa” de dos días sin posibilidad de coger un nuevo libro.


Se pide:
- Realizar un diagrama de clases y añade los métodos necesarios para realizar el préstamo y devolución de libros. 
- Realizar un diagrama de casos de usos.

## Diagrama de Casos de Uso

## Actores
<img src=images/actores.png>

|  Actor | Bibliotecario                            |
|---|------------------------------------------|
| Descripción  | Bibliotecario del sistema                |
| Características  |                                          |
| Relaciones | _Gestionar Prestamos, Ver Estado Copia._ |
| Referencias | _C.U.1, C.U.2_                           |   
|  Notas |                                          |
| Autor  | _Melissa Ruiz_                           |
|Fecha | _03/12/2023_                             |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

|  Actor | Lector                                                  |
|---|---------------------------------------------------------|
| Descripción  | Usuario que utiliza los servicios de préstamo de libros |
| Características  |                                                         |
| Relaciones | _Pedir Prestamo De Libro, Devolver Libro._              |
| Referencias | _C.U.3, C.U4_                                           |   
|  Notas |                                                         |
| Autor  | _Melissa Ruiz_                                          |
|Fecha | _03/12/2023_                                            |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |
## Casos de Uso
*C.U. 1:* Gestionar préstamos 

*C.U. 2:* Ver estado copia  

*C.U. 3:* Pedir préstamo de libro 

*C.U. 4:* Devolver libro

 |  Caso de Uso	CU | C.U.1: Gestionar préstamos                                                                |
  |---|-------------------------------------------------------------------------------------------|
  | Fuentes  | _https://github.com/jpexposito/docencia/blob/master/Primero/ETS/DIAGRAMAS/DIAGRAMAS-CLASES/Ejemplos/biblioteca.md_ |
  | Actor  | _Bibliotecario_                                                                           |
  | Descripción |                                                                                           |
  | Flujo básico |                                                                                           |
  | Pre-condiciones |                                                                                           |  
  | Post-condiciones  |                                                                                           |  
  |  Requerimientos |                                                                                           |
  |  Notas |                                                                                           |
| Autor  | _Melissa Ruiz_                                                                            |
|Fecha | _03/12/2023_                                                                              |

 |  Caso de Uso	CU | C.U.2: Gestionar Prestamos                                                               |
  |---|------------------------------------------------------------------------------------------|
  | Fuentes  | _https://github.com/jpexposito/docencia/blob/master/Primero/ETS/DIAGRAMAS/DIAGRAMAS-CLASES/Ejemplos/biblioteca.md_ |
  | Actor  | _Bibliotecario_                                                                          |
  | Descripción |                                                                                          |
  | Flujo básico |                                                                                          |
  | Pre-condiciones |                                                                                          |  
  | Post-condiciones  |                                                                                          |  
  |  Requerimientos |                                                                                          |
  |  Notas |                                                                                          |
| Autor  | _Melissa Ruiz_                                                                           |
|Fecha | _03/12/2023_                                                                             |

 |  Caso de Uso	CU | C.U.2: Gestionar Prestamos                                                                                         |
  |---|--------------------------------------------------------------------------------------------------------------------|
  | Fuentes  | _https://github.com/jpexposito/docencia/blob/master/Primero/ETS/DIAGRAMAS/DIAGRAMAS-CLASES/Ejemplos/biblioteca.md_ |
  | Actor  | _Bibliotecario_                                                                                                    |
  | Descripción |                                                                                                                    |
  | Flujo básico |                                                                                                                    |
  | Pre-condiciones |                                                                                                                    |  
  | Post-condiciones  |                                                                                                                    |  
  |  Requerimientos |                                                                                                                    |
  |  Notas |                                                                                                                    |
| Autor  | _Melissa Ruiz_                                                                                                     |
|Fecha | _03/12/2023_                                                                                                       |

 |  Caso de Uso	CU | C.U.2: Ver Estado Copia                                                                   |
  |---|-------------------------------------------------------------------------------------------|
  | Fuentes  | _https://github.com/jpexposito/docencia/blob/master/Primero/ETS/DIAGRAMAS/DIAGRAMAS-CLASES/Ejemplos/biblioteca.md_ |
  | Actor  | _Bibliotecario_                                                                           |
  | Descripción |                                                                                           |
  | Flujo básico |                                                                                           |
  | Pre-condiciones |                                                                                           |  
  | Post-condiciones  |                                                                                           |  
  |  Requerimientos |                                                                                           |
  |  Notas |                                                                                           |
| Autor  | _Melissa Ruiz_                                                                            |
|Fecha | _03/12/2023_                                                                              |

 |  Caso de Uso	CU | C.U.3: Pedir Prestamo de Libro                                                            |
  |---|-------------------------------------------------------------------------------------------|
  | Fuentes  | _https://github.com/jpexposito/docencia/blob/master/Primero/ETS/DIAGRAMAS/DIAGRAMAS-CLASES/Ejemplos/biblioteca.md_ |
  | Actor  | _Lector_                                                                                  |
  | Descripción |                                                                                           |
  | Flujo básico |                                                                                           |
  | Pre-condiciones |                                                                                           |  
  | Post-condiciones  |                                                                                           |  
  |  Requerimientos |                                                                                           |
  |  Notas |                                                                                           |
| Autor  | _Melissa Ruiz_                                                                            |
|Fecha | _03/12/2023_                                                                              |

 |  Caso de Uso	CU | C.U.4: Devolver Libro                                                                     |
  |---|-------------------------------------------------------------------------------------------|
  | Fuentes  | _https://github.com/jpexposito/docencia/blob/master/Primero/ETS/DIAGRAMAS/DIAGRAMAS-CLASES/Ejemplos/biblioteca.md_ |
  | Actor  | _Lector_                                                                                  |
  | Descripción |                                                                                           |
  | Flujo básico |                                                                                           |
  | Pre-condiciones |                                                                                           |  
  | Post-condiciones  |                                                                                           |  
  |  Requerimientos |                                                                                           |
  |  Notas |                                                                                           |
| Autor  | _Melissa Ruiz_                                                                            |
|Fecha | _03/12/2023_                                                                              |
## Diagrama de casos de uso
<img src=images/cu.PNG>

## Diagrama de clases
<img src=images/diagrama-clases.png>

</div>