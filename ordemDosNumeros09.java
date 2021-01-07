
import java.util.Scanner;

//FAÇA UM PROGRAMA QUE LEIA TRÊS NUMEROS E MOSTRE-OS EM ORDEM DECRESCENTE.
//Quando os números estão na ordem do maior para o menor , estão na ordem decrescente.

// ALEXANDRE MENEZES GOMES ADS 1° PERIODO FANAP.
//  GOIÂNIA 12/10/19

public class ordemDosNumeros09 {
    public static void main (String[] args){

   Scanner leitor = new Scanner(System.in);
        int num01, num02, num03;
        System.out.println("Informe três números inteiros");
        num01 = leitor.nextInt();
        num02 = leitor.nextInt();
        num03 = leitor.nextInt();
        if (num01 <= num02 && num01 <= num03 && num02 <= num03) {
           
            System.out.println(num03 + " - " + num02 + " - " + num01);

        } else if (num01 <= num02 && num01 <= num03 && num03 <= num02) {
     
            System.out.println(num02 + " - " + num03 + " - " + num01);
        
        } else if (num02 <= num01 && num02 <= num03 && num01 <= num03) {
     
            System.out.println(num03 + " - " + num01 + " - " + num02);

        } else if (num02 <= num01 && num02 <= num03 && num03 <= num01) {
            
            System.out.println(num01 + " - " + num03 + " - " + num02);
 
        } else if (num03 <= num01 && num03 <= num02 && num01 <= num03) {
         
            System.out.println(num02 + " - " + num01 + " - " + num03);
            
        } else if (num03 <= num01 && num03 <= num02 && num02 <= num03) {
            
            System.out.println(num01 + " - " + num02 + " - " + num03);
        }
    }
}




       
    

             
             
             
             

        
       
   
