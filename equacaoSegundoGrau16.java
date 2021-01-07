
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 199x
 */
public class equacaoSegundoGrau16 {
    
    public static void main (String[]args) {
    int a, b, c , delta, d = -4, b2, v2;
    double r2,r1;    
    //Renomeando importações
    Scanner leitor = new Scanner(System.in);

    //Capturando variáveis
    System.out.println("Seja bem vindo a Calculadora de Equações do 2º Grau !");
    System.out.print("Digite o termo \"a\": ");
        a = leitor.nextInt();
    System.out.print("Digite o termo \"b\": ");
        b = leitor.nextInt();
    System.out.print("Digite o termo \"c\": ");    
        c = leitor.nextInt();

    System.out.println("");

    //Fórmula de Báskara - (Resoluções - Cálculos -Resoluções)
    System.out.println("APLICAÇÃO DA FÓRMULA DE BÁSKARA: ");
    System.out.println("Resolução da Fórmula de Báskara: b²-4.a.c " );
    System.out.println("Resolução da Fórmula de Báskara: " + b + "²" + d + "*" + a + "*" + c);
        b2 = b*b;
        v2 = ((-4)*(a)*(c));
        delta = (b*b)+((-4)*(a)*(c));
    if (v2 > 0) {
        System.out.println("Resolução da Fórmula de Báskara: " + b2 + "+" + v2);
    }    
        else
            System.out.println("Resolução da Fórmula de Báskara: " + b2 + "-" + v2);
    System.out.println("Resolução da Fórmula de Báskara: " + (delta));

    System.out.println("");

    //Fórmula Geral da Equação de segundo grau.
    System.out.println("Resultados das raízes: ");
    if (delta < 0){ 
        System.out.println("Não existe raíz real, Delta=0");
    }
        else {
            r1 = (-b + Math.sqrt(delta)) / (2*a);
                System.out.println("A 1º raíz é: " + r1);
            r2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("A 2º raíz é: " + r2);

        }
    }
}
    

