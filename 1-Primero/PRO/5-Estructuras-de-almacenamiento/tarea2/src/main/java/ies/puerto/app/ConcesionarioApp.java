package ies.puerto.app;

import ies.puerto.impl.*;

import java.util.*;


public class ConcesionarioApp {

    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        Coche coche1 = new Coche("ABC123", "Toyota", "Corolla", 60);
        Coche coche2 = new Coche("XYZ789", "Honda", "Civic", 75);
        Coche coche3 = new Coche("DEF456", "Ford", "Mustang", 100);
        Coche coche4 = new Coche("GHI789", "Chevrolet", "Impala", 80);
        Coche coche5 = new Coche("JKL012", "Volkswagen", "Golf", 65);
        HashSet<Coche> coches = new HashSet<>();
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);


        Motocicleta motocicleta1 = new Motocicleta("MNO345", "Harley-Davidson", "Sportster", 50);
        Motocicleta motocicleta2 = new Motocicleta("PQR678", "Yamaha", "YZF R6", 90);
        Motocicleta motocicleta3 = new Motocicleta("STU901", "Ducati", "Monster", 70);
        Motocicleta motocicleta4 = new Motocicleta("VWX234", "Suzuki", "GSX-R750", 80);
        Motocicleta motocicleta5 = new Motocicleta("ZAB567", "Kawasaki", "Ninja", 85);
        ArrayList<Motocicleta> motocicletas = new ArrayList<>();
        motocicletas.add(motocicleta1);
        motocicletas.add(motocicleta2);
        motocicletas.add(motocicleta3);
        motocicletas.add(motocicleta4);
        motocicletas.add(motocicleta5);


        Camion camion1 = new Camion("Chevrolet","Silverado","UVW567",150);
        Camion camion2 = new Camion("Ford","Ranger","LMN890",130);
        Camion camion3 = new Camion("Toyota","Hilux","PQR123",140);
        Camion camion4 = new Camion("Nissan","Navara","ABC456",145);
        Camion camion5 = new Camion("Dodge","Ram","XYZ789",160);

        Map<String,Camion> camiones =  new HashMap<>();
        camiones.put(camion1.getMatricula(),camion1);
        camiones.put(camion2.getMatricula(),camion2);
        camiones.put(camion3.getMatricula(),camion3);
        camiones.put(camion4.getMatricula(),camion4);
        camiones.put(camion5.getMatricula(),camion5);


        Bicicleta bicicleta1 = new Bicicleta("Trek","MountainBike","PQR456",30);
        Bicicleta bicicleta2 = new Bicicleta("Giant","CityBike","MNO789",25);
        Bicicleta bicicleta3 = new Bicicleta("Specialized","RoadBike","JKL012",28);
        Bicicleta bicicleta4 = new Bicicleta("Cannondale","HybridBike","DEF345",26);
        Bicicleta bicicleta5 = new Bicicleta("Schwinn","Cruiser","MNO678",22);

        Map<String,Bicicleta> bicicletas =  new HashMap<>();
        bicicletas.put(bicicleta1.getMatricula(),bicicleta1);
        bicicletas.put(bicicleta2.getMatricula(),bicicleta2);
        bicicletas.put(bicicleta3.getMatricula(),bicicleta3);
        bicicletas.put(bicicleta4.getMatricula(),bicicleta4);
        bicicletas.put(bicicleta5.getMatricula(),bicicleta5);
        Scanner scanner = new Scanner(System.in);

        int opcion;
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Mostrar información");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Modificar vehículo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de vehículo:");
                    System.out.println("1. Coche");
                    System.out.println("2. Camión");
                    System.out.println("3. Motocicleta");
                    System.out.println("4. Bicicleta");
                    int tipoVehiculo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoVehiculo == 1) {
                        System.out.println("Ingrese marca del coche:");
                        String marcaCoche = scanner.nextLine();
                        System.out.println("Ingrese modelo del coche:");
                        String modeloCoche = scanner.nextLine();
                        System.out.println("Ingrese matrícula del coche:");
                        String matriculaCoche = scanner.nextLine();
                        System.out.println("Ingrese velocidad máxima del coche:");
                        int velocidadCoche = scanner.nextInt();

                        Coche coche = new Coche(marcaCoche, modeloCoche, matriculaCoche, velocidadCoche);
                        if (concesionario.addCoche(coche)) {
                            System.out.println("Coche agregado con éxito.");
                        } else {
                            System.out.println("La matrícula ya existe. No se pudo agregar el coche.");
                        }
                    } else if (tipoVehiculo == 2) {
                    } else if (tipoVehiculo == 3) {
                        System.out.println("Ingrese marca de la motocicleta:");
                        String marcaMoto = scanner.nextLine();
                        System.out.println("Ingrese modelo de la motocicleta:");
                        String modeloMoto = scanner.nextLine();
                        System.out.println("Ingrese matrícula de la motocicleta:");
                        String matriculaMoto = scanner.nextLine();
                        System.out.println("Ingrese velocidad máxima de la motocicleta:");
                        int velocidadMoto = scanner.nextInt();

                        Motocicleta moto = new Motocicleta(marcaMoto, modeloMoto, matriculaMoto, velocidadMoto);
                        if (motocicletas.add(moto)) {
                            System.out.println("Motocicleta agregada con éxito.");
                        } else {
                            System.out.println("La matrícula ya existe. No se pudo agregar la motocicleta.");
                        }
                    } else if (tipoVehiculo == 4) {

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;


                case 4:

                    System.out.println("Seleccione el tipo de vehículo a modificar:");
                    System.out.println("1. Coche");
                    System.out.println("2. Camión");
                    System.out.println("3. Motocicleta");
                    System.out.println("4. Bicicleta");
                    int tipoModificar = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea

                    System.out.println("Ingrese la matrícula del vehículo a modificar:");
                    String matriculaModificar = scanner.nextLine();

                    if (tipoModificar == 1) {

                        Coche cocheModificar = concesionario.obtenerCoche(matriculaModificar);
                        if (cocheModificar != null) {
                            System.out.println("Ingrese la nueva velocidad máxima del coche:");
                            int nuevaVelocidadCoche = scanner.nextInt();
                            cocheModificar = new Coche(cocheModificar.getMarca(), cocheModificar.getModelo(), matriculaModificar, nuevaVelocidadCoche);
                            concesionario.removeCoche(concesionario.obtenerCoche(matriculaModificar));
                            concesionario.addCoche(cocheModificar);
                            System.out.println("Coche modificado con éxito.");
                        } else {
                            System.out.println("No se encontró el coche con esa matrícula.");
                        }

                    } else if (tipoModificar == 3) {

                        Motocicleta motoModificar = concesionario.obtenerMotocicleta(matriculaModificar);
                        if (motoModificar != null) {
                            System.out.println("Ingrese la nueva velocidad máxima de la motocicleta:");
                            int nuevaVelocidadMoto = scanner.nextInt();
                            motoModificar = new Motocicleta(motoModificar.getMarca(), motoModificar.getModelo(), matriculaModificar, nuevaVelocidadMoto);
                            concesionario.removeMotocicleta(concesionario.obtenerMotocicleta(matriculaModificar));
                            concesionario.addMotocicleta(motoModificar);
                            System.out.println("Motocicleta modificada con éxito.");
                        } else {
                            System.out.println("No se encontró la motocicleta con esa matrícula.");
                        }
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;
            }


        /*
        Coche coche1 = new Coche("Toyota", "Corolla", "ABC123", 60);
        Coche coche2 = new Coche("Honda", "Civic", "XYZ789", 75);
        Coche coche3 = new Coche ("Ford", "Mustang", "DEF456", 100);
        Coche coche4 = new Coche ("Chevrolet", "Impala", "GHI789", 80);
        Coche coche5 = new Coche ("Volkswagen", "Golf", "JKL012", 65);

        Motocicleta moto1 = new Motocicleta("Harley-Davidson", "Sportster", "MNO345", 50);
        Motocicleta moto2 = new Motocicleta("Yamaha", "YZF R6", "PQ678", 90);
        Motocicleta moto3 = new Motocicleta("Ducati", "Monster", "STU901", 70);
        Motocicleta moto4 = new Motocicleta("Kawasaki", "Ninja", "ZAB567", 85);
        Motocicleta moto5 = new Motocicleta("Suzuki", "GSX-R750", "VWX234", 80);

        Concesionario concesionario = new Concesionario();

        concesionario.addCoche(coche1);
        concesionario.addCoche(coche2);
        concesionario.addCoche(coche3);
        concesionario.addCoche(coche4);
        concesionario.addCoche(coche5);

        concesionario.addMotocicleta(moto1);
        concesionario.addMotocicleta(moto2);
        concesionario.addMotocicleta(moto3);
        concesionario.addMotocicleta(moto4);
        concesionario.addMotocicleta(moto5);

        Coche cocheObtenido = concesionario.obtenerCoche("ABC123");
        if (concesionario.existeCoche("ABC123")) {
            System.out.println("\nCoche obtenido: " + cocheObtenido);
        } else {
            System.out.println("\nCoche no encontrado.");
        }


        System.out.println("\nVelocidad media de Coches: " + concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media de Motocicletas: " + concesionario.velocidadMediaMotocicletas());

         */

        }
    }

}
