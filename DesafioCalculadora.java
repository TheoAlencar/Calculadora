package DesafioIncode;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        int opcao = 0;
        boolean continuar = true;
        int numInt1, numInt2;
        Scanner src = new Scanner(System.in);



        //loop principal
        while (continuar) {
            System.out.println("\n=== Calculadora de Números Inteiros ===");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Módulo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma operação (1-6): ");
            opcao = src.nextInt();
            src.nextLine();
            //opcao para sair da calculadora
            if (opcao == 6){
                continuar = false;
                System.out.println("Calculadora encerrada");
                break; //encerramento do loop
            }
            //Analise do primeiro numero inteiro
            System.out.print("Digite o primeiro numero inteiro: ");
            while (!src.hasNextInt()) {  // Validação para garantia de ser um numero inteiro
                System.out.println("Erro: Caractere ou numero invalido. Por favor, digite um número inteiro.");
                src.next(); // descartar caracteres ou numeros invalidos
                System.out.print("Digite um número inteiro: ");
            }
            numInt1 = src.nextInt();
            src.nextLine();

            // Leitura do segundo número inteiro
            System.out.print("Digite o segundo número inteiro: ");
            while (!src.hasNextInt()) { // Validação para garantir que o valor inserido é um inteiro
                System.out.println("Erro: Caractere ou numero invalido. Por favor, digite um número inteiro.");
                src.next(); // descartar caracteres ou numeros invalidos
                System.out.print("Digite o segundo número inteiro: ");
            }
            numInt2 = src.nextInt();
            src.nextLine();

            // Analisando qual opcao escolhida
            switch (opcao){
                case 1:
                    System.out.println(numInt1 + " + " + numInt2 + " = " + (numInt1 + numInt2));
                    break;
                case 2:
                    System.out.println(numInt1 + " - " + numInt2 + " = " + (numInt1 - numInt2));
                    break;
                case 3:
                    System.out.println(numInt1 + " x " + numInt2 + " = " + (numInt1 * numInt2));
                    break;
                case 4:
                    if (numInt1 == 0 || numInt2 == 0) {
                        System.out.println("ERRO!");
                    } else {
                        System.out.println(numInt1 + " ÷ " + numInt2 + " = " + ((double) numInt1 / (double) numInt2));
                    }
                    break;
                case 5:
                    if (numInt1 == 0 || numInt2 == 0) {
                        System.out.println("ERRO!");
                    } else {
                        System.out.println(numInt1 + " % " + numInt2 + " = " + (numInt1 % numInt2));
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
        src.close();
    }
}
