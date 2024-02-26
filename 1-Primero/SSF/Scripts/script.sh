#!/bin/bash
###########################################################
# Autor: Melissa Ruiz y Samuel Hernández
# Nombre: script.sh
# Objetivo: Instalar, eliminar o comprobar paquete deseado
# Entrada: null
# Salida: null
#############################################################


# Verifica si el paquete está instalado
comprobar_instalacion() {
    dpkg -s "$1" &> /dev/null
    return $?
}

# Busca información del paquete en los repositorios
buscar_paquete() {
    apt-cache show "$1"
}

# Instala el paquete
instalar_paquete() {
    sudo apt-get install "$1"
}

# Muestra la versión del paquete instalado
ver_version() {
    dpkg -l | grep "^ii  $1 "
}

# Reinstala el paquete
reinstalar_paquete() {
    sudo apt-get install --reinstall "$1"
}

# Actualiza el paquete
actualizar_paquete() {
    sudo apt-get install --only-upgrade "$1"
}

# Elimina el paquete manteniendo la configuración
eliminar_paquete_manteniendo_config() {
    sudo apt-get remove "$1"
}

# Elimina completamente el paquete
eliminar_paquete_completamente() {
    sudo apt-get purge "$1"
}

# Sincroniza el listado de software local
sudo apt-get update

# Verifica si se ha pasado un argumento
if [ $# -eq 0 ]; then
    read -p "Por favor, introduce el nombre del paquete: " nombre_paquete
else
    nombre_paquete=$1
fi

# Verifica si el paquete está instalado
if comprobar_instalacion "$nombre_paquete"; then
    echo "El paquete $nombre_paquete está instalado."
    echo "¿Qué acción deseas realizar?"
    echo "1. Mostrar la versión"
    echo "2. Reinstalar"
    echo "3. Actualizar"
    echo "4. Eliminar (manteniendo la configuración)"
    echo "5. Eliminar completamente"
    read -p "Selecciona una opción (1-5): " eleccion

    case $eleccion in
        1) ver_version "$nombre_paquete";;
        2) reinstalar_paquete "$nombre_paquete";;
        3) actualizar_paquete "$nombre_paquete";;
        4) eliminar_paquete_manteniendo_config "$nombre_paquete";;
        5) eliminar_paquete_completamente "$nombre_paquete";;
        *) echo "Opción no válida.";;
    esac
else
    echo "El paquete $nombre_paquete no está instalado."
    echo "Buscando información del paquete en los repositorios..."
    buscar_paquete "$nombre_paquete"
    read -p "¿Deseas instalar el  paquete? (s/n): " eleccion_instalacion
    if [[ "$eleccion_instalacion" == "s" ]]; then
        instalar_paquete "$nombre_paquete"
    else
        echo "Saliendo del programa."
    fi
fi
