
import java.util.Scanner;

/*
6. Faça um Programa que leia três números e mostre o maior deles.

 */
/**
 *
 * @author 199x
 */
public class tresNumeros06 {
    public static void main (String[]args){
        Scanner leitor = new Scanner (System.in);
        int n1,n2,n3;
         
           System.out.println("informe o 1° número: ");
        n1 = leitor.nextInt();
            System.out.println("informe o 2° número: ");
          n2 = leitor.nextInt();
            System.out.println("informe o 3° número: ");
            n3 = leitor.nextInt();
           if (n1 >= n2 && n1 >= n3){
                                System.out.println("o maior numero é " + n1 );
           } if (n2 >= n1 && n2 >= n3){
                                System.out.println("o maior numero é o numero " + n2 );
           } if (n3 >= n1 && n3 >= n2 ){
                                System.out.println("o maior numero é o numero " + n3 );
           } 
          
        }
    
    
}
