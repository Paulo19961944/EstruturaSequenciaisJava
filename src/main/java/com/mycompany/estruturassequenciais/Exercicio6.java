package com.mycompany.estruturassequenciais;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
    public static void main(String[] args) {
        // Importa a Classe Locale
        Locale.setDefault(Locale.US);

        // PI
        final float PI = 3.141592f;

        // Importa a Classe Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada:\n");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        // Fecha o Scanner
        scanner.close();

        // Faz os cálculos
        float resultadoTriangulo = (a * c) / 2;
        float resultadoCirculo = PI * c * c;
        float resultadoTrapezio = ((a + b) * c) / 2;
        float resultadoQuadrado = b * b;
        float resultadoRetangulo = a * b;

        // Printa o Resultado na Tela
        System.out.println("\nSaída:");
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", resultadoTriangulo, resultadoCirculo, resultadoTrapezio, resultadoQuadrado, resultadoRetangulo);
    }
}
