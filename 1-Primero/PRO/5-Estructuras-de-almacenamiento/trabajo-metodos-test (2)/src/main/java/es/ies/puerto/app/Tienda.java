package es.ies.puerto.app;

import es.ies.puerto.abstractas.Producto;
import es.ies.puerto.impl.Alimento;
import es.ies.puerto.impl.Aparato;
import es.ies.puerto.impl.CuidadoPersonal;
import es.ies.puerto.impl.Souvenir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Tienda {
    static ArrayList<Alimento> alimentos = new ArrayList<>();
    static ArrayList<Aparato> aparatos;
    static ArrayList<CuidadoPersonal> cuidadosPersonales;
    static ArrayList<Souvenir> souvenirs;

    public static void main(String[] args) {

        alimentos = new ArrayList<>();
        aparatos = new ArrayList<>();
        cuidadosPersonales = new ArrayList<>();
        souvenirs = new ArrayList<>();

        Alimento alimento1 = new Alimento("Lechuga", 7.95f, "20/02/2024", "udi", "09/02/2024");
        Alimento alimento2 = new Alimento("Tomate", 7.95f, "19/02/2024", "udi2", "09/02/2024");




        precioTotalAlimentos(alimentos);

        Scanner scanner = new Scanner(System.in);
        int opcionScanner;
        do {
            System.out.println("---Menú----");
            System.out.println("\nSeleccione la categoría del producto");
            System.out.println("\n1. Alimento");
            System.out.println("\n2. Aparato");
            System.out.println("\n3. Cuidado Personal");
            System.out.println("\n4. Souvenir");
            System.out.println("\n5. Salir");
            opcionScanner = scanner.nextInt();
            if (opcionScanner > 5 || opcionScanner < 0) {
                System.out.println("Elección incorrecta. Se reinicia el programa. Por favor, elija una opción válida.");
            }
            switch(opcionScanner) {
                case 1:
                    manejoAccionAlimento();
                    break;
                case 2:
                    manejoAccionAparato();
                    break;
                case 3:
                    manejoAccionCuidadoPersonal();
                    break;
                case 4:
                    manejoAccionSouvenir();
            }
        }while(opcionScanner != 5);

    }

    public static boolean existeAlimento(Alimento alimento) {
        if (alimentos == null || alimentos.isEmpty()) {
            return false;
        }
        if (alimentos.contains(alimento)) {
            return false;
        }
        return true;
    }
    public static void addAlimento (Alimento alimento) {
        if (!existeAlimento(alimento)) {
            alimentos.add(alimento);
        }
    }

    public static void removeAlimento (Alimento alimento) {
        if (existeAlimento(alimento)) {
            alimentos.remove(alimento);
        }
    }

    public static String mostrarAlimento(Alimento alimento) {
        if (existeAlimento(alimento)) {
            return "La información del alimento es la siguiente: " + alimento.toString();
        }
        return "El alimento no existe";
    }

    public static boolean existeAparato(Aparato aparato) {
        if (aparatos == null || aparatos.isEmpty()) {
            return false;
        }
        if (aparatos.contains(aparato)) {
            return false;
        }
        return true;
    }

    public static void addAparato (Aparato aparato) {
        if (!existeAparato(aparato)) {
            aparatos.add(aparato);
        }
    }

    public static void removeAparato (Aparato aparato) {
        if (existeAparato(aparato)) {
            aparatos.remove(aparato);
        }
    }

    public static String mostrarAparato (Aparato aparato) {
        if (existeAparato(aparato)) {
            return "La información del artículo es: " + aparato.toString();
        }
        return "El artículo no existe";
    }

    public static boolean existeCuidadoPersonal(CuidadoPersonal cuidadoPersonal) {
        if (cuidadosPersonales == null || cuidadosPersonales.isEmpty()) {
            return false;
        }
        if (cuidadosPersonales.contains(cuidadoPersonal)) {
            return false;
        }
        return true;
    }

    public static void addcuidadoPersonal (CuidadoPersonal cuidadoPersonal) {
        if (!existeCuidadoPersonal(cuidadoPersonal)) {
            cuidadosPersonales.add(cuidadoPersonal);
        }
    }

    public static void removeCuidadoPersonal (CuidadoPersonal cuidadoPersonal) {
        if (existeCuidadoPersonal(cuidadoPersonal)) {
            cuidadosPersonales.remove(cuidadoPersonal);
        }
    }

    public static String obtenerCuidadoPersonal (CuidadoPersonal cuidadoPersonal) {
        if (!cuidadosPersonales.contains(cuidadosPersonales)) {
            System.out.println("El artículo no existe");
        }
        return "El artículo: "+cuidadoPersonal.getNombre();
    }

    public static boolean existeSouvenir (Souvenir souvenir) {
        if (souvenirs == null || souvenirs.isEmpty()) {
            return false;
        }
        if (souvenirs.contains(souvenir)) {
            return false;
        }
        return true;
    }

    public static void addSouvenir (Souvenir souvenir) {
        if (!existeSouvenir(souvenir)) {
            addSouvenir(souvenir);
        }
    }

    public static void removeSouvenir (Souvenir souvenir) {
        if (existeSouvenir(souvenir)) {
            removeSouvenir(souvenir);
        }
    }

    public static String obtenerSouvenir (Souvenir souvenir) {
        if (!souvenirs.contains(souvenir)) {
            System.out.println("El artículo no existe");
        }
        return "El artículo: "+souvenir.getNombre();
    }

    public static float precioTotalAlimentos (ArrayList<Alimento> alimentos) {
        float sumaAlimentos = 0;
        for (Alimento alimento : alimentos) {
            sumaAlimentos += alimento.getPrecio();
        }
        return sumaAlimentos;
    }

    public static float precioTotalAparatos (ArrayList<Aparato> aparatos) {
        float sumaAparatos = 0;
        for (Aparato aparato : aparatos) {
            sumaAparatos += aparato.getPrecio();
        }
        return sumaAparatos;
    }

    public static float precioTotalCuidadoPersonal (ArrayList<CuidadoPersonal> cuidadosPersonales) {
        float sumaCuidados = 0;
        for (CuidadoPersonal cuidadoPersonal : cuidadosPersonales) {
            sumaCuidados += sumaCuidados;
        }
        return sumaCuidados;
    }

    public static float precioTotalSouvenir (ArrayList<Aparato> aparatos) {
        float sumaSouvenir = 0;
        for (Aparato aparato : aparatos) {
            sumaSouvenir += aparato.getPrecio();
        }
        return sumaSouvenir;
    }

    public static float precioTotalProductos() {

        return 0; //suma de precio total souvenir, cuidado personal, alimentos y aparatos...
    }

    /*
    public static void manejoCategorias () {
        Scanner scanner = new Scanner(System.in);
        int opcionScanner;
        do {
            System.out.println("---Menú----");
            System.out.println("\nSeleccione la categoría del producto");
            System.out.println("\n1. Alimento");
            System.out.println("\n2. Aparato");
            System.out.println("\n3. Cuidado Personal");
            System.out.println("\n4. Souvenir");
            System.out.println("\n5. Salir");
            opcionScanner = scanner.nextInt();
            if (opcionScanner < 5 || opcionScanner > 0) {
                System.out.println("Elección incorrecta. Se reinicia el programa. Por favor, elija una opción válida.");
            }
            switch(opcionScanner) {
                case 1:
                    manejoAccionAlimento();
                    break;
                case 2:
                    manejoAccionAparato();
                    break;
                case 3:
                    manejoAccionCuidadoPersonal();
                    break;
                case 4:
                    manejoAccionSouvenir();
            }
        }while(opcionScanner != 5);
    }

     */

    public static void manejoAccionAlimento () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ha elegido usted la categoría de Alimentos"+"\n¿Qué acción desea realizar?"+
                "\n1. Agregar alimento"+
                "\n2. Eliminar alimento"+
                "\n3. Obtener y mostrar información de alimento a través de su UDI"+
                "\n4. Salir");
        int opcion = scanner.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Vamos a agregar el alimento" + "\nIntroduzca su nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduzca su precio");
                    float precio = scanner.nextFloat();
                    System.out.println("Introduzca su fecha de entrada (formato dd/MM/yyyy");
                    String fechaentrada = scanner.nextLine();
                    System.out.println("Introduzca su UDI");
                    String udi = scanner.nextLine();
                    System.out.println("Introduzca fecha de caducidad");
                    String fechaCaducidad = scanner.nextLine();
                    Alimento alimento = new Alimento(nombre, precio, fechaentrada, udi, fechaCaducidad);
                        if (existeAlimento(alimento)) {
                            addAlimento(alimento);
                        }
                    break;
                case 2:
                    System.out.println("Vamos a eliminar el alimento");
                    System.out.println("Introduzca el udi del artículo que desea eliminar");
                    break;
                case 3:
                    System.out.println("Obtener y mostrar informacion del alimento");
                    break;
                case 4:
                    System.out.println("Salir del programa.");
                    break;
                default:
                    throw new IllegalStateException("Opción incorrecta: " + opcion);
            }

    }

    public static void manejoAccionAparato() {
        System.out.println("Ha elegido usted la categoría de Alimentos"+"\n¿Qué acción desea realizar?"+
                "\n1. Agregar aparato"+
                "\n2. Eliminar aparato"+
                "\n3. Obtener y mostrar información de aparato a través de su UDI"+
                "\n4. Salir");
    }

    public static void manejoAccionCuidadoPersonal() {
        System.out.println("Ha elegido usted la categoría de Cuidado Personal"+"\n¿Qué acción desea realizar?"+
                "\n1. Agregar artículo de cuidado personal"+
                "\n2. Eliminar artículo de cuidado personal"+
                "\n3. Obtener y mostrar información del artículo a través de su UDI"+
                "\n4. Salir");

    }

    public static void manejoAccionSouvenir () {
        System.out.println("Ha elegido usted la categoría de Cuidado Personal"+"\n¿Qué acción desea realizar?"+
                "\n1. Agregar artículo de souvenir"+
                "\n2. Eliminar artículo de souvenir"+
                "\n3. Obtener y mostrar información del souvenir a través de su UDI"+
                "\n4. Salir");
    }



}
