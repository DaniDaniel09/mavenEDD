package com.danielzanon.mavenedd;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class MavenEDD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        int opcion;

        System.out.println("Calculadora básica\n");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada\n");
        System.out.print("Ingrese la operación que desea realizar (1-6): ");

        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el primer número: ");
                num1 = input.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = input.nextDouble();
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;

            case 2:
                System.out.print("Ingrese el primer número: ");
                num1 = input.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = input.nextDouble();
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;

            case 3:
                System.out.print("Ingrese el primer número: ");
                num1 = input.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = input.nextDouble();
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;

            case 4:
                System.out.print("Ingrese el primer número: ");
                num1 = input.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = input.nextDouble();
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                }
                break;

            case 5:
                System.out.print("Ingrese el número base: ");
                num1 = input.nextDouble();
                System.out.print("Ingrese el exponente: ");
                num2 = input.nextDouble();
                resultado = Math.pow(num1, num2);
                System.out.println(num1 + " ^ " + num2 + " = " + resultado);
                break;

            case 6:
                System.out.print("Ingrese el número: ");
                num1 = input.nextDouble();
                resultado = Math.sqrt(num1);
                System.out.println("√" + num1 + " = " + resultado);
                break;

            default:
                System.out.println("La opción ingresada no es válida.");
                break;
        }

        input.close();
    }
}
