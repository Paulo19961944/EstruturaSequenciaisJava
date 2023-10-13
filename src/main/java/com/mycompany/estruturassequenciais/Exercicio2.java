/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturassequenciais;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2{
    public static void main(String[] args){
        
        // Seleciona o Teclado Americano
        Locale.setDefault(Locale.US);
        
        // Declaração de Variáveis
        final float pi = 3.14159f;
        float area, raio;
        
        // Formata o Titulo
        System.out.println("\n----------CALCULO DE AREA--------\n");

        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Captura o Diametro
        System.out.print("Digite o Raio do Circulo: ");
        raio = scanner.nextFloat();

        // Fecha o Scanner
        scanner.close();

        // Calcula a Área
        area = pi * raio * raio;

        // Printa na Tela
	System.out.println("\n--------- RESULTADO ----------\n");
        System.out.println("Entrada: \n" + raio);
	System.out.printf("\nSaída\nA=%.4f" , area);
	System.out.println("\n--------- FIM ----------\n");
    }
}


