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
public class Exercicio4 {
    public static void main(String[] args){
        // Importa a Classe Locale
        Locale.setDefault(Locale.US);
       
        // Importa a Classe Scanner
        Scanner scanner = new Scanner(System.in);
     
        // Calculo de Salario
        System.out.println("\n---------- CALCULADORA DE SALARIO ----------\n");
        
        // Lê os Dados do Funcionário
        System.out.print("Digite o seu número: ");
        int numero = scanner.nextInt();
        System.out.print("Digite a quantidade de Horas Trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o valor que você recebe por hora: ");
        float valorHora = scanner.nextFloat();
        
        // Calcula o Salario
        float salario = valorHora * horasTrabalhadas;
        
        // Fecha o Scanner
        scanner.close();
        
        // Printa na Tela
        System.out.println("\nEntrada:\n" + numero + "\n" + horasTrabalhadas + "\n" + valorHora);
        System.out.println("\nSaída:\n" + "NUMBER = " + numero);
        System.out.printf("SALARY = U$%.2f", salario);
    }
}
