/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturassequenciais;
import java.util.Scanner;

public class Exercicio1{
    
    public static void main(String[] args){
       // Declaração de Variáveis    
       int num1, num2;

       // Lê os dois valores
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--------- LEITURA DE DOIS NUMEROS ---------\n");

        System.out.print("\nDigite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        // Fecha o Scanner
        scanner.close();

        // Soma os dois números
	int soma = num1 + num2;        

        // Printa o Numero na Tela
        System.out.println("\nEntrada:\n" + num1 + "\n" + num2);
        System.out.println("\nSaída:\n" + "SOMA = " + soma);
	System.out.println("\n---------- FIM ----------\n");
    }    
}

