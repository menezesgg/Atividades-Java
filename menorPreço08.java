
import java.util.Scanner;

/*
FAÇA UM PROGRAMA QUE PERGUNTE O PREÇO DE TRES PRODUTOS E INFORME QUAL
PRODUTO VOÇE DEVE COMPRAR, SABENDO QUE A DECISÃO É SEMPRE PELO MAIS BARATO.
*/

// ALEXANDRE MENEZES GOMES ADS 1° PERIODO FANAP.
//  GOIÂNIA 12/10/19

public class menorPreço08 {
    public static void main (String[] args ){
        Scanner leitor = new Scanner (System.in);
        
        double p1,p2,p3;
        System.out.println("BEM VINDO AO POUPA CASH 1.0 ");
        
        System.out.print("QUAL O PREÇO DO 1° PRODUTO ? ");
        p1 = leitor.nextDouble();
        
        System.out.print("QUAL O PREÇO DO 2° PRODUTO ? ");
        p2 = leitor.nextDouble();
        
        System.out.print("QUAL O PREÇO DO 3° PRODUTO ? ");
        p3 = leitor.nextDouble();
        
        if(p1 < p2 && p2 < p3 ){
             System.out.print("ECONOMIZE SEU DINHEIRO $ ");
            System.out.println("VOÇE PODE OPTAR EM COMPRAR O PRODUTO DE: " + p1 + " R$" );
       }else if (p2 < p1 && p2 < p3){
            System.out.print("ECONOMIZE SEU DINHEIRO $ ");
            System.out.println("VOÇE PODE OPTAR EM COMPRAR O PRODUTO DE:  " + p2 + " R$");
       }if(p3 < p1 && p3 < p2){
           System.out.print("ECONOMIZE SEU DINHEIRO $$$,");
           System.out.println("VOÇE PODE OPTAR EM COMPRAR O PRODUTO DE: " + p3 + " R$");
           
       }
        
        
    }
    
}
