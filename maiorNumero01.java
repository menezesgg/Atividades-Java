/*
1. Faça um Programa que peça dois números e imprima o maior deles.
 */
package maiorNumero01;

 //ALEXANDRE MENEZES GOMES ADS 1° PERIODO FANAP.
import java.util.Scanner;


public class maiorNumero01 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int n1,n2;
        System.out.println("1° Numero: ");
        n1 = leitor.nextInt();
        System.out.println("2° Numero: ");
        n2 = leitor.nextInt();
        if (n1>n2){
            System.out.println("O maior número é : " + n1 + ".");
        } else {
            System.out.println ("O maior numero é : " + n2 + ".");
            
        }
    }
    
}
