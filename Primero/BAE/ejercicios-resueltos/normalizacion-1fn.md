<div>

# Normalización. 
## Primera Forma Normal.

### Recuerda:
Una tabla está en primera forma normal si: 
- Todos los datos son atómicos.
- Todos los atributos o columnas son del mismo tipo de datos.   

### Ejercicio 1
Se tiene la siguiente tabla:    
| Nombre | Apellido | Edad | Dirección |   |
|:------:|:--------:|:----:|:---------:|---|
| Juan   | Pérez    | 30   | Calle 123 |   |
| María  | López    | 25   | Calle 456 |   |
| Pedro  | García   | 40   | Calle 789 |   |

¿Está esta tabla en 1FN?    
__RESPUESTA:__  
Sí, porque todos los datos son atómicos y los atributos son del mismo tipo de datos.    

### Ejercicio 2
Se tiene la siguiente tabla:        
| Nombre | Apellido | Edad | Fecha de nacimiento |   |
|:------:|:--------:|:----:|:-------------------:|---|
| Juan   | Pérez    | 30   | 1993-07-20          |   |
| María  | López    | 25   | 1998-08-25          |   |
| Pedro  | García   | 40   | 1983-09-10          |   |

¿Está esta tabla en 1FN?   
Sí, porque todos los datos son atómmicos y los atributos son del mismo tipo de datos.   

## Ejercicio 3
Se tiene la siguiente tabla:
| Nombre | Apellido | Edad | Dirección |   Teléfono   |
|:------:|:--------:|:----:|:---------:|:------------:|
| Juan   | Pérez    | 30   | Calle 123 | 555-555-5555 |
| María  | López    | 25   | Calle 456 | 555-555-5556 |
| Pedro  | García   | 40   | Calle 789 | 555-555-5557 |

¿Está esta tabla en 1FN?    
Sí, porque todos los datos son atómmicos y los atributos son del mismo tipo de datos. 
  

### Ejercicio 4
Se tiene la siguiente tabla:
|  Ciudad  | HabCiudad_M |      Pais    | HabPais_M | PerteneceUE | codAeropuerto | NombreAeropuerto      | Distancia_km |
|:--------:|:-----------:|:------------:|:---------:|:-----------:|---------------|-----------------------|--------------|
| Madrid   | 3           | España       | 45        | Verdadero   | MAD           | Barajas               | 13           |
|  Paris   | 13          | Francia      | 66        | Verdadero   | CDG  ORY      | Roissy De Gaulle Orly | 23  16       |
| Londres  | 8,3         | Gran Bretaña | 60        | Verdadero   | LHT  LTN      | Heathrow  Luton       | 28 48        |
| Belgrado | 1,3         | Serbia       | 7,5       | Falso       | BEG           | NIkola Tesla          | 12           |
| Viena    | 1,8         | Austria      | 8,5       | Verdadero   | VIE           | Schwechat             | 18           |

¿Está esta tabla en 1FN?    
Como podemos observar las columnas de codAeropuerto, NombreAeropuerto y Distancia_km no son atómicos, por lo que generaremos una nuebla tabla que divida estos elementos y lo relacionaremos con la tabla original utilizando su clave primaria (en este caso __ciudad__). Quedaría así la nueva tabla:     
### Ciudad_Aeropuerto    
| Ciudad   | CodAeropuerto | NombreAeropuerto | Distancia_km |
|----------|---------------|------------------|--------------|
| Madrid   | MAD           | Barajas          | 13           |
| Paris    | CDG           | Roissy de Gaulle | 23           |
| Paris    | ORY           | Orly             | 16           |
| Londres  | LHT           | Heathrow         | 28           |
| Londres  | LTN           | Luton            | 48           |
| Belgrado | BEG           | Nikola Tesla     | 12           |
| Viena    | VIE           | Schwechat        | 18           |

Ejercicio 5     

Se tiene la siguiente tabla:

¿Está esta tabla en 1FN?






Ejercicio 6
Se tiene la siguiente tabla:

¿Está esta tabla en 1FN?
Ejercicio 7

¿Está esta tabla en 1FN?
Ejercicio 8

¿Está esta tabla en 1FN?

</div>