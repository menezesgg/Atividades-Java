
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
public class turnoDeAula10 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("SEJA BEM VINDO AO BOAS VINDAS 1.0 ");
        
        System.out.println("INFORME 'M' MATUTINO 'V' VESPERTINO OU 'N' NOTURNO : ");
       String letra = leitor.next();
       
       if(letra.equals("M")) {
           System.out.println("BOA DIA ! ");
           
       }if(letra.equals("V")){
                      System.out.println("BOA TARDE ! ");

       }if(letra.equals("N")){
                      System.out.println("BOA NOITE ! ");
                      
       }if (!letra.equals("M") && !letra.equals("V")&& !letra.equals("N")){
            System.out.println("A LETRA DIGITADA  É INVALIDA ! ");

       }
    
         }
    }
      

