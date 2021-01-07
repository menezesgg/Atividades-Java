
import java.util.Scanner;

/*
Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os
valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é:
equilátero, isósceles ou escaleno.
Dicas:
• Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
terceiro;
• Triângulo Equilátero: três lados iguais;
• Triângulo Isósceles: quaisquer dois lados iguais;
• Triângulo Escaleno: três lados diferentes; 
 */
/**
 *
 * @author 199x
 */
public class triangulo15 {
   public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);


          int x, y, z;

          System.out.println("Entre com o primeiro lado"); // classe particular criada para ler entrada de dados do teclado//
          x = leitor.nextInt();
          System.out.println("Entre com o segundo lado");
          y = leitor.nextInt();
         System.out.println("Entre com o terceiro lado");
          z = leitor.nextInt();



   if ((x < y + z) && (y < x + z) && (z < x+y)){
        if (x == y && x == z){
          System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
        }else if((x == y) || (x == z)){
          System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
        }else
            System.out.println("Escaleno . Três lados diferentes.");
       }

    }
}