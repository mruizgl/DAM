package es.ies.puerto.presentacion.app;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;

import java.text.ParseException;
import java.util.Scanner;
public class AppTienda {
    static ProductoAbstracts productoAbstracts;
    static TiendaNegocio tiendaNegocio = new TiendaNegocio();

    public static void main(String[] args) throws ParseException {
        tiendaNegocio.obtenerProductos();
        menu();

    }

    public static void menu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println
                ("Bienvenido a la aplicación. ¿Qué acción desea realizar?\n" +
                "1. Añadir producto\n" +
                "2. Eliminar producto\n" +
                "3. Modificar producto\n" +
                "4. Detalles de producto\n" +
                "5. Precios de cada sección\n" +
                "6. Ganancias de cada sección");
        int respuesta = scanner.nextInt();

        switch (respuesta){
            case 1:
                addProductoMenu();
                break;
            case 2:
                removeProductMenu();
                break;
            case 3:
                modifificarProductoMenu();
                break;
            case 4:
                mostrarMenuProducto();
                break;
            case 5:
                precioMenu();
                break;
            case 6:
                gananciasMenu();
                break;
            default:
                System.out.println("Opción inválida. Inténtelo de nuevo");
        }
    }

    public static void addProductoMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué desea agregar?\n" +
                "1. Alimento\n" +
                "2. Aparatos\n" +
                "3. Cuidado Personal\n" +
                "4. Souvenir");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                 productoAbstracts = new Alimento(pedirNombre(), pedirPrecio(), pedirFechaEntrada(),
                         solicitarUDI(), pedirFechaCaducidad());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
                break;
            case 2:
                productoAbstracts = new Aparato(pedirNombre(), pedirPrecio(), solicitarUDI(), pedirFechaCaducidad());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
                break;
            case 3:
                productoAbstracts = new CuidadoPersonal(pedirNombre(), pedirPrecio(), pedirFechaEntrada(),
                        solicitarUDI(), popularidad());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
                break;
            case 4:
                productoAbstracts = new Souvenir(pedirNombre(), pedirPrecio(), pedirFechaEntrada(), solicitarUDI());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    public static void removeProductMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué desea eliminar?\n" +
                "1. Alimento\n" +
                "2. Aparatos\n" +
                "3. Cuidado personal\n" +
                "4. Souvenir\n");
        int respuesta = scanner.nextInt();

        switch (respuesta){
            case 1:
                productoAbstracts = new Alimento(pedirNombre(), pedirPrecio(), pedirFechaEntrada(), solicitarUDI(),
                        pedirFechaCaducidad());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));
                break;

            case 2:
                productoAbstracts = new Aparato(pedirNombre(), pedirPrecio(), pedirFechaEntrada(), solicitarUDI());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));
                break;

            case 3:
                productoAbstracts = new CuidadoPersonal(pedirNombre(), pedirPrecio(), pedirFechaEntrada(),
                        solicitarUDI(), popularidad());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));
                break;

            case 4:
                productoAbstracts = new Souvenir(pedirNombre(), pedirPrecio(), pedirFechaEntrada(),
                        solicitarUDI());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));
                break;

            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4)");
        }
    }

    public static void modifificarProductoMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué desea modificar?\n" +
                "1. Alimento\n" +
                "2. Aparato\n" +
                "3. Cuidado personal\n" +
                "4. Souvenir");
        int respuesta = scanner.nextInt();
        System.out.println("Inserte el id del producto que desea modificar: ");
        String udi = solicitarUDI();

        productoAbstracts = tiendaNegocio.obtenerProductoUDI(udi);
        if (productoAbstracts != null){
        switch (respuesta){
            case 1:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new Alimento(pedirNombre(), pedirPrecio(), pedirFechaEntrada(), udi,
                            pedirFechaCaducidad());
                tiendaNegocio.addProducts(productoAbstracts);
                break;
            case 2:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new Aparato(pedirNombre(), pedirPrecio(), pedirFechaEntrada(), udi);
                tiendaNegocio.addProducts(productoAbstracts);
                break;
            case 3:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new CuidadoPersonal(pedirNombre(), pedirPrecio(), pedirFechaEntrada(), udi,
                            popularidad());
                tiendaNegocio.addProducts(productoAbstracts);
                break;
            case 4:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new Souvenir(pedirNombre(), pedirPrecio(), pedirFechaEntrada(), udi);
                tiendaNegocio.addProducts(productoAbstracts);
                break;
            default:
                System.out.println("Opción inválida. Inténtelo de nuevo");
        }
            System.out.println("Producto modificado correctamente!");
        } else {
            System.out.println("Lamentablemente este producto no existe");
        }
    }

    public static void mostrarMenuProducto() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué desea ver?\n" +
                "1. Alimento\n" +
                "2. Aparatos\n" +
                "3. Cuidado Personal\n" +
                "4. Productos recomendados\n" +
                "5. Souvenir\n" +
                "6. Todos los productos\n" +
                "7. Only available products\n" +
                "8. Lengths");
        int respuesta = scanner.nextInt();
        switch (respuesta){
            case 1:
                System.out.println(tiendaNegocio.obstenerListaAlimentos());
                break;
            case 2:
                System.out.println(tiendaNegocio.obtenerListaAparatos());
                break;
            case 3:
                System.out.println(tiendaNegocio.obtenerListaCuidadosPersonales());
                break;
            case 4:
                System.out.println(tiendaNegocio.popularidad());
                break;
            case 5:
                System.out.println(tiendaNegocio.obtenerListaSouvenir());
                break;
            case 6:
                System.out.println(tiendaNegocio.obtenerProductos());
                break;
            case 7:
                System.out.println(tiendaNegocio.mostrarProductosDisponibles());
                break;
            case 8:
                showLength();
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    public static void precioMenu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué precio total desea visualizar\n" +
                "1. Alimento\n" +
                "2. Aparatos\n" +
                "3. Cuidado Personal\n" +
                "4. Productos recomendados\n" +
                "5. Souvenir");
        int respuesta = scanner.nextInt();
        switch (respuesta){
            case 1:
                System.out.println(tiendaNegocio.precioTotalAlimentos());
                break;
            case 2:
                System.out.println(tiendaNegocio.precioTotalAparatos());
                break;
            case 3:
                System.out.println(tiendaNegocio.precioTotalCuidadoPersonal());
                break;
            case 4:
                System.out.println(tiendaNegocio.precioTotalSouvenirs());
                break;
            case 5:
                System.out.println(tiendaNegocio.precioTotalProductos());
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    public static void gananciasMenu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué ganancias desea ver?\n" +
                "1. Alimento\n" +
                "2. Aparatos\n" +
                "3. Cuidado Personal\n" +
                "4. Souvenirs\n" +
                "5. Todo");
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println(tiendaNegocio.gananciasAlimentos());
                break;
            case 2:
                System.out.println(tiendaNegocio.gananciasAparatos());
                break;
            case 3:
                System.out.println(tiendaNegocio.gananciasCuidadoPersonal());
                break;
            case 4:
                System.out.println(tiendaNegocio.gananciasSouvenir());
                break;
            case 5:
                System.out.println(tiendaNegocio.totalGanancias());
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }


    public static void showLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué desea ver?\n" +
                "1. Alimento\n" +
                "2. Aparatos\n" +
                "3. Cuidado Personal\n" +
                "4. Souvenir\n" +
                "5. Todos los productos");
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println(tiendaNegocio.lengthAlimentoList());
                break;
            case 2:
                System.out.println(tiendaNegocio.lengthAparatosList());
                break;
            case 3:
                System.out.println(tiendaNegocio.lengthCuidadosList());
                break;
            case 4:
                System.out.println(tiendaNegocio.lengthSouvenirsList());
                break;
            case 5:
                System.out.println(tiendaNegocio.lengthAllProductsList());
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
    public static String pedirNombre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre (string): ");
        return scanner.next();
    }

    public static float pedirPrecio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Precio (Float): ");
        return scanner.nextFloat();
    }

    public static String pedirFechaEntrada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fecha de entrada (string): ");
        return scanner.next();
    }

    public static String solicitarUDI(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("UDI (string): ");
        return scanner.next();
    }
    public static String pedirFechaCaducidad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fecha caducidad (string): ");
        return scanner.next();
    }

    public static int popularidad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Popularidad (int): ");
        return scanner.nextInt();
    }

}

