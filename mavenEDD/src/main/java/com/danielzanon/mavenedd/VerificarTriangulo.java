package com.danielzanon.mavenedd;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Verificar triángulo");
        System.out.print("Ingrese el primer lado: ");
        lado1 = input.nextDouble();
        System.out.print("Ingrese el segundo lado: ");
        lado2 = input.nextDouble();
        System.out.print("Ingrese el tercer lado: ");
        lado3 = input.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Sí es posible construir un triángulo con los lados ingresados.");
        } else {
            System.out.println("No es posible construir un triángulo con los lados ingresados.");
        }

        input.close();
    }
}
