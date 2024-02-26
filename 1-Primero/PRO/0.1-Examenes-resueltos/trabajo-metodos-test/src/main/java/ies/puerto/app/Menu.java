package ies.puerto.app;

import ies.puerto.implementacion.Alimento;
import ies.puerto.implementacion.CuidadoPersonal;
import ies.puerto.implementacion.Tienda;
// no me dio tiempo a menu 
public class Menu {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.agregarCP( new CuidadoPersonal("Champú",3.99f,"2024-02-09","CUI001"));
        tienda.agregarCP( new CuidadoPersonal("Crema hidratante",5.49f,"2024-02-09","CUI002"));
        
        System.out.println(tienda.getCuidadosPersonales());
        System.out.println(tienda.preciototalCP());
        


    }
    
}
