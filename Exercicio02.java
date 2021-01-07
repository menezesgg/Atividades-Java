

import java.util.Scanner;

/**
 * 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número maior ou igual a 0.");
        int numero1 = leitor.nextInt();
        // Verifique se o numero1 é positivo ou negativo
        if (numero1 >= 0) {
            System.out.println("O número digitado [" + numero1 + "] é positivo ou neutro.");
        } else {
            System.out.println("O número digitado [" + numero1 + "] é negativo.");            
        }
    }
}
