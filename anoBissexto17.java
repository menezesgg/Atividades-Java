
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
public class anoBissexto17 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("informe um ano: ");
        
        int ano = leitor.nextInt();
        if (ano%4 == 0 && ano%100!=0 || ano%400 == 0){
            System.out.println("O ano é Bissexto ");
            
        }else System.out.println("O ano não é bissexto ");
        
        
        
        
        
        
        
        
    }
    
}
