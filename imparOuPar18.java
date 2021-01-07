
import java.util.Scanner;

/*
18. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o
operador módulo (resto da divisão). 
 */
/**
 *
 * @author 199x
 */
public class imparOuPar18 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        int num;
        System.out.println("Bem vindo ao informa número 1.0 plus ! ");
        System.out.println("Informe um número: ");
        num = leitor.nextInt();
        if(num%2 ==0){
            System.out.println("“O numero é par");
            
        }else System.out.println("O numero é impar ");
        
    }
    
}
