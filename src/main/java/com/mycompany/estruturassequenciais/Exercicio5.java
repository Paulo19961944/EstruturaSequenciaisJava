/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturassequenciais;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author paulo
 */
public class Exercicio5 {
    public static void main(String[] args){
        // Importa a biblioteca Locale
        Locale.setDefault(Locale.US);
        
        // Importa a Classe Scanner
        Scanner scanner = new Scanner(System.in);
               
        // Titulo
        System.out.println("\n---------- LEITOR DE CÓDIGO ---------\n");
        
        // Captura os Dados da Peça 1
        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Digite o numero de peças 1: ");
        int numeroPeca1 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        float valorUnitarioPeca1 = scanner.nextFloat();
        
        // Captura os Dados da Peça 2
        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Digite o numero de peças 2: ");
        int numeroPeca2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        float valorUnitarioPeca2 = scanner.nextFloat();
        
        // Fecha o Scanner
        scanner.close();
        
        // Faz o Calculo
        float resultadoPeca1 = valorUnitarioPeca1 * numeroPeca1;
        float resultadoPeca2 = valorUnitarioPeca2 * numeroPeca2;
        float resultadoTotal = resultadoPeca1 + resultadoPeca2;
        
        // Printa o Resultado na Tela
        System.out.println("\n---------- RESULTADO ----------");
        System.out.println("\nEntrada: \n" + codigoPeca1 + "\n" + numeroPeca1 + "\n" + valorUnitarioPeca1 + "\n" + codigoPeca2 + "\n" + numeroPeca2 + "\n" +  valorUnitarioPeca2);
        System.out.println("\nSaída:");
        System.out.printf("VALOR A PAGAR: R$%.2f ", resultadoTotal);
        System.out.println("\n\n---------- FIM ----------\n");
    }
}
