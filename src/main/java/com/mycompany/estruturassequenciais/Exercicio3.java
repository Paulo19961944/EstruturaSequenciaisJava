/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturassequenciais;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Exercicio3 {
    public static void main(String[] args){
        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- LEITOR DE DIFERENÇA DE NÚMEROS ----------\n");
        
        // Captura os Números
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();
        System.out.print("Digite o quarto número: ");
        int d = scanner.nextInt();
        
        // Calcula a Diferença
        int resultado = a * b -(c) * d;
        
        // Fecha o Scanner
        scanner.close();
        
        //Printa na Tela
        System.out.println("\nEntrada:\n" + a + "\n" + b + "\n" + c + "\n" + d);
        System.out.println("\nSaída:\n" + "DIFERENÇA = " + resultado);
    }
}
