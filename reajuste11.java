
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
public class reajuste11 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        double percentual;
        double salario;
        System.out.println("Seja bem vindo ao REAJUSTE PLUS 1.0 ");
        System.out.println("FIQUE POR DENTRO DAS MUDANÇAS");
        System.out.println("• Salários até R$ 280,00 (incluindo) : aumento de 20% ");
        System.out.println("• salários entre R$ 280,00 e R$ 700,00 : aumento de 15% ");
        System.out.println("• salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% ");
        System.out.println("• salários de R$ 1500,00 em diante : aumento de 5%  " );
        
        System.out.println(" Agora informe seu salário: ");
       salario = leitor.nextDouble();
       
       //salários até R$ 280,00 (incluindo) : aumento de 20%

       if (salario<=280){
           System.out.println("Seu salário antes do reajuste era de: " + salario + " R$. " );
           System.out.println("Com percentual de 20% aplicado ");
           System.out.println("O valor do aumento será: " + salario*20/100);
           percentual =salario*20/100;
           System.out.println( "O valor do salário, após o aumento será:" + (salario+ percentual ));
       }else{
           
        //salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
           
        }if(salario>=280 && salario<=700){
            
           System.out.println("Seu salário antes do reajuste era de: " + salario + " R$. " );
           System.out.println("Com percentual de 15% aplicado ");
           System.out.println("O valor do aumento será: " + salario*15/100);
           percentual =salario*15/100;
           System.out.println( "O valor do salário, após o aumento será:" + (salario+ percentual ));
       
        }else{
            
           //salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
           
    }if(salario>=700 && salario<=1500){
            
           System.out.println("Seu salário antes do reajuste era de: " + salario + " R$. " );
           System.out.println("Com percentual de 10% aplicado ");
           System.out.println("O valor do aumento será: " + salario*10/100);
           percentual =salario*10/100;
           System.out.println( "E o valor do salário, após o aumento será:" + (salario+ percentual ));
  
           //salários de R$ 1500,00 em diante : aumento de 5% 
           
    }else{
        
}if(salario>=1500){
            
           System.out.println("Seu salário antes do reajuste era de: " + salario + " R$. " );
           System.out.println("Com percentual de 5% aplicado ");
           System.out.println("O valor do aumento será: " + salario*5/100);
           percentual =salario*5/100;
           System.out.println( "E o valor do salário, após o aumento será:" + (salario+ percentual ));
}
}
}