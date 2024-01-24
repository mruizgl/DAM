<div>

# Instalación de IntelliJ en Linux
## ¿Qué es IntelliJ?
IntelliJ es un IDE popular entre los programadores Java, en esta práctica vamos a instalarlo en nuestra máquina virtual linux, vamos a ello.
## Comprobamos que tengamos Java instalado
Para realizar la comprobación utilizamos el siguiente comando: 
```
java -version
```
Al hacerlo en mi máquina comprobamos que tenemos correctamente instalado Java porque nos muestra lo siguiente: 
```
openjdk version "11.0.17" 2022-10-18
OpenJDK Runtime Environment (build 11.0.17+8-post-Ubuntu-1ubuntu222.04)
OpenJDK 64-Bit Server VM (build 11.0.17+8-post-Ubuntu-1ubuntu222.04, mixed mode, sharing)
```
## Instalación
Pasos para instalar:

1. Descargar intellij https://www.jetbrains.com/es-es/idea/download/#section=linux
2. Descomprimimos el archivo y lo generamos en la carpeta /opt/ con el siguiente comando:
```
sudo tar -xvf ~/Descargas/ideaIC-2021.2.2.tar.gz -C /opt/
```
SALIDA EN MI CONSOLA AL EJECUTAR COMANDO: 
```
idea-IC-232.10203.10/jbr/legal/jdk.unsupported.desktop/
idea-IC-232.10203.10/jbr/legal/jdk.unsupported.desktop/ADDITIONAL_LICENSE_INFO
idea-IC-232.10203.10/jbr/legal/jdk.unsupported.desktop/LICENSE
idea-IC-232.10203.10/jbr/legal/jdk.unsupported.desktop/ASSEMBLY_EXCEPTION
idea-IC-232.10203.10/jbr/legal/jdk.crypto.ec/
idea-IC-232.10203.10/jbr/legal/jdk.crypto.ec/ADDITIONAL_LICENSE_INFO
idea-IC-232.10203.10/jbr/legal/jdk.crypto.ec/LICENSE
idea-IC-232.10203.10/jbr/legal/jdk.crypto.ec/ASSEMBLY_EXCEPTION
idea-IC-232.10203.10/jbr/legal/jdk.dynalink/
idea-IC-232.10203.10/jbr/legal/jdk.dynalink/ADDITIONAL_LICENSE_INFO
idea-IC-232.10203.10/jbr/legal/jdk.dynalink/dynalink.md
idea-IC-232.10203.10/jbr/legal/jdk.dynalink/LICENSE
idea-IC-232.10203.10/jbr/legal/jdk.dynalink/ASSEMBLY_EXCEPTION
idea-IC-232.10203.10/jbr/legal/java.management/
idea-IC-232.10203.10/jbr/legal/java.management/ADDITIONAL_LICENSE_INFO
idea-IC-232.10203.10/jbr/legal/java.management/LICENSE
idea-IC-232.10203.10/jbr/legal/java.management/ASSEMBLY_EXCEPTION
idea-IC-232.10203.10/jbr/legal/java.sql.rowset/
idea-IC-232.10203.10/jbr/legal/java.sql.rowset/ADDITIONAL_LICENSE_INFO
idea-IC-232.10203.10/jbr/legal/java.sql.rowset/LICENSE
idea-IC-232.10203.10/jbr/legal/java.sql.rowset/ASSEMBLY_EXCEPTION
idea-IC-232.10203.10/jbr/conf/
idea-IC-232.10203.10/jbr/conf/net.properties
idea-IC-232.10203.10/jbr/conf/security/
idea-IC-232.10203.10/jbr/conf/security/policy/
idea-IC-232.10203.10/jbr/conf/security/policy/limited/
idea-IC-232.10203.10/jbr/conf/security/policy/limited/exempt_local.policy
idea-IC-232.10203.10/jbr/conf/security/policy/limited/default_US_export.policy
idea-IC-232.10203.10/jbr/conf/security/policy/limited/default_local.policy
idea-IC-232.10203.10/jbr/conf/security/policy/unlimited/
idea-IC-232.10203.10/jbr/conf/security/policy/unlimited/default_US_export.policy
idea-IC-232.10203.10/jbr/conf/security/policy/unlimited/default_local.policy
idea-IC-232.10203.10/jbr/conf/security/policy/README.txt
idea-IC-232.10203.10/jbr/conf/security/java.policy
idea-IC-232.10203.10/jbr/conf/security/java.security
idea-IC-232.10203.10/jbr/conf/logging.properties
idea-IC-232.10203.10/jbr/conf/sound.properties
idea-IC-232.10203.10/jbr/conf/management/
idea-IC-232.10203.10/jbr/conf/management/jmxremote.password.template
idea-IC-232.10203.10/jbr/conf/management/jmxremote.access
idea-IC-232.10203.10/jbr/conf/management/management.properties
idea-IC-232.10203.10/jbr/conf/sdp/
idea-IC-232.10203.10/jbr/conf/sdp/sdp.conf.template
idea-IC-232.10203.10/
idea-IC-232.10203.10/product-info.json
```
Se crea una carpeta en la carpeta /opt/ con el nombre de idea-IC-212.5284.40

Para observar el nombre la la carpeta generada utilizamos el siguiente comando:
```
ls -l /opt/
```
SALIDA EN MI CONSOLA: 
```
 ssf  ~  SIGINT  ls -l /opt/
total 8
drwxr-xr-x 7 root root 4096 ene 20  1970 idea-IC-232.10203.10
drwxr-xr-x 8 root root 4096 nov 21  2022 VBoxGuestAdditions-6.1.40
```
3. Renombramos a intellij
```
sudo mv /opt/idea-IC-232.10203.10 /opt/intellij
```
4. Ejecutarmos el instalador con el siguiente comando:
```
/opt/intellij/bin/idea.sh
```
Seguimos los pasos de instalacion y se elije crear acceso directo en escritorio

Con esto ya estaría instalador. Si por casualidad quisieramos desinstalarlo sería con el siguiente comando: 

```
sudo rm -Rf /opt/intellij 
/usr/share/applications/jetbrains-idea-ce.desktop 
.local/share/JetBrains/IdeaIC2021.2 
.cache/JetBrains/IdeaIC2021.2 
.config/JetBrains/IdeaIC2021.2 
~/.local/share/JetBrains/consentOptions/accepted
```


</div>