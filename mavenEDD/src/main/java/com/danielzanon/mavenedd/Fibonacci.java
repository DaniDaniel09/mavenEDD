package com.danielzanon.mavenedd;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int n = input.nextInt();
            
            System.out.println("Secuencia de Fibonacci hasta " + n + ":");
            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
