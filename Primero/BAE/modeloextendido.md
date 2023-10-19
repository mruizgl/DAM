<div>

# Actividad. Modelo E/R extendido.
Realiza un diagrama de estructuras en el modelo E/R para los siguientes enunciados.

Para la realización de estos modelos se deberá seguir y exponer el desarrollo

siguiendo las pautas que a continuación se detalla:

1. Marcar en el enunciado las posibles entidades y las relaciones.

2. Proponer las frases que describan el problema.

3. Generar los modelos de cada frase.

4. Identificación de entidades y analizar su fortaleza.

5. Realizar un estudio de cardinalidad.

6. Generar el modelo completo E/R.

7. Colocar los atributos a cada entidad e interrelación.


## Enunciado: 
----------------------------
El Consejero de Medio Ambiente de la Comunidad Autónoma Canaria ha decidido crear un sistema de información sobre los parques naturales que gestiona cada cabildo insular. Después de realizar un detallado análisis, se han establecido las siguientes conclusiones:

• Un Cabildo Insular (CI) puede tener varios parques naturales. En todos los Cabildos existe uno y sólo un organismo responsable de los parques. 

• Un Parque natural se identifica por un nombre, fue declarado en una fecha, se compone de varias áreas identificadas por un nombre y caracterizadas por una determinada extensión. Por motivos de eficiencia se desea favorecer las consultas referentes al número de parques existentes en cada Cabildo y la superficie total declarada parque natural de cada Cabildo.

• En cada área forzosamente residen especies que pueden ser de tres tipos: vegetales, animales y minerales. Cada especie tiene una denominación científica, una denominación vulgar y un número inventariado de individuos por área. De las especies vegetales se desea saber si tienen floración y en qué periodo se produce ésta; de los animales se desea saber su tipo de alimentación (herbívora, carnívora u omnívora) y sus periodos de celo;  de los minerales se desea saber si se trata de cristales o de rocas. Además interesa registrar qué especies sirven de alimento a otras especies, teniendo en cuenta que ninguna especie mineral se considera alimento de cualquier otra especie y que una especie vegetal no se alimenta de ninguna especie.

• Del personal de parque se guarda su DNI, número de la seguridad social, nombre y apellidos, dirección, teléfonos (domicilio y móvil) y sueldo. Se distinguen los siguientes tipos de personal:

• Personal de gestión: registra los datos de los visitantes del parque y están destinados en una entrada del parque (Las entradas se identifican por un número).
• Personal de vigilancia: vigila un área determinada del parque que recorre en un vehículo (Tipo y matrícula).
• Personal de conservación: mantiene y conserva un área determinada del parque. Cada uno lo realiza en una especialidad determinada (Limpieza, caminos, …)
• Personal investigador: Tiene una titulación que ha de recogerse y pueden realizar proyectos (incluso conjuntamente) de investigación sobre una determinada especie.

• Un proyecto de investigación tiene un presupuesto y un periodo de realización.

• Un visitante (DNI, nombre, domicilio, profesión  y teléfono) también puede alojarse dentro de los alojamientos de que dispone el parque; éstos tienen una capacidad limitada y tienen una determinada categoría.

---------------------
### 1. MARCAR POSIBLES ENTIDADES, ATRIBUTOS Y RELACIONES
Entidades: 
- __Cabildo Insular__ --> Número de parques, Superficie total declarada parque natural
- __Parque Natural__ --> Nombre, Fecha de declaración, Nombres áreas, Extensión de área
- __Especie(fuerte)__ --> Denominación científica, una denominación vulgar y un número inventariado de individuos por área
- __Vegetales(débil)__ --> ¿Tienen floración?, en qué periodo se produce ésta
- __Animales(débil)__ --> Tipo de alimentación(herbívora, carnívora u omnívora) y sus periodos de celo
- __Minerales(débil)__ --> Tipo mineral (cristal o roca)
- __Personal del parque(fuerte)__ --> DNI, número de la seguridad social, nombre y apellidos, dirección, teléfonos (domicilio y móvil) y sueldo.
- __Personal de gestión(débil)__ --> Datos de los visitantes del parque, Número identificación entrada
- __Personal de vigilancia(débil)__ --> Área de vigilancia, Vehículo (Tipo y matrícula)
- __Personal de conservación(débil)__ --> Área mantenimiento, Especialidad (Limpieza, caminos...)
- __Personal investigador(débil)__ --> Titulación
- __Proyecto de investigación__ --> Presupuesto, Período de realización
- __Visitante__ --> DNI, Nombre, Domicilio, Profesión, Teléfono
- __Alojamiento__ --> Capacidad, Categoría

### Relaciones:
| Frase | Relación | 
|----------|----------|
| Un __Cabildo Insular__ (CI) *puede* tener varios __parques naturales__. En todos los Cabildos existe uno y sólo un organismo responsable de los parques.   | Relación 1:N   |
| __Personal investigador__ *pueden realizar* __proyectos__ (incluso conjuntamente) de investigación sobre una determinada especie.    | Relación N:M   |
| Un __visitante__ *puede alojarse* dentro de los __alojamientos__ de que dispone el parque.    | Relación N:1   | 





</div>