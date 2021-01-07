
import java.util.Scanner;

/*
13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo,
2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido. 
 */
//ALEXANDRE MENEZES GOMES ADS 1° PERIODO FANAP

public class diasDaSeman13 {
        public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Bem vindo ao informa master 1.0 ");
        System.out.println("Infomre um número coresponte ao dia da semana sendo : 1-Domingo  2-segunda 3-Terça   4-Quarta 5-Quinta 6-Sexta 7-Sabado ");
       String letra = leitor.next();
         if (letra.equals("1")) {
            System.out.println(" DOMINGO ");
         }else{
        if (letra.equals("2")) {
            System.out.println(" SEGUNDA ");
                 }else{

        if (letra.equals("3")) {
            System.out.println(" TERÇA ");
                 }else{

        if (letra.equals("4")) {
            System.out.println(" QUARTA ");
                     }else{

         if (letra.equals("5")) {
            System.out.println(" QUINTA");
                 }else{

        if (letra.equals("6")) {
            System.out.println( " SEXTA ");
                     }else{

        if (letra.equals("7")) {
            System.out.println( " SABADO ");
        }else{ 
            if (!letra.equals("1") && !letra.equals ("2")){
                if(!letra.equals ("3") &&!letra.equals ("4") &&!letra.equals("5")){
                     if (!letra.equals("6") && !letra.equals ("7")){
                }
            System.out.println("A letra digitada [" + letra + "] é inválida!");
        }
                            
}
}
}
}
}
 }
 }
 }
 }
}
        