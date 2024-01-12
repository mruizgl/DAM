package app;

import utilidades.UtilidadesCal;

import java.util.Scanner;

public class AppCalculadora extends UtilidadesCal {
    public static void main(String[] args) {
        UtilidadesCal utilidadesCal = new UtilidadesCal();
        Scanner scanner = new Scanner(System.in);
        int seleccion;

        do {
            System.out.println("¿Qué operación desea realizar?"+"\n1. Suma"+"\n2. Resta"+"\n3. Multiplicacion+"+ "\n4. División"+"\n5. Salir del programa");
            seleccion = scanner.nextInt();
            if (seleccion == 1) {
                System.out.println("Elija primero numero para sumar");
                int suma1 = scanner.nextInt();
                System.out.println("Elija el segundo numero para sumar");
                int suma2 = scanner.nextInt();
                int resultadoSuma = utilidadesCal.suma(suma1, suma2);
                System.out.println("El resultado es " + resultadoSuma);
            }else if (seleccion == 2) {
                System.out.println("Elija el primer numero para restar");
                int resta1 = scanner.nextInt();
                System.out.println("Elija el segundo numero para restar");
                int resta2 = scanner.nextInt();
                int resultadoResta = utilidadesCal.resta(resta1, resta2);
                System.out.println("EL resultado es " + resultadoResta);
            }else if (seleccion == 3) {
                System.out.println("Elija el primero numero para multiplicar");
                double multiplicacion1 = scanner.nextDouble();
                System.out.println("Elija el segundo numero para multiplicar");
                double multiplicacion2 = scanner.nextDouble();
                double resultadoMultiplicacion = utilidadesCal.multiplicacion(multiplicacion1, multiplicacion2);
                System.out.println("El resultado es " + resultadoMultiplicacion);
            }else if (seleccion == 4) {
                System.out.println("Elija el primer numero para dividir");
                double division1 = scanner.nextDouble();
                System.out.println("Elija el segundo numero para dividir");
                double division2 = scanner.nextDouble();;
                double resultadoDivision = utilidadesCal.division(division1, division2);
                System.out.println("El resultado es " + resultadoDivision);
            }else {
                System.out.println("Por favor, introduzca una selección válida. Se reinicia el programa.");
            }


        } while (seleccion == 5);

        System.out.println("Ha salido del programa correctamente");
    }
}
