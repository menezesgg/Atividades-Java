
import java.util.Scanner;

/*
14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo
de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
 */
//ALEXANDRE MENEZES GOMES ALIENIGENA ADS FANAP GOIANIA 12/10/19 23:42 SÁBADO

public class notasAluno14 {
    public static void main (String[]args){
        Scanner leitor = new Scanner (System.in);
        double n1,n2,media;
        
        System.out.println("Informe a 1° nota: ");
        n1 = leitor.nextDouble();
        System.out.println("Informe a 2° nota: ");
        n2 = leitor.nextDouble();
       System.out.println(  "Nota 1: " +  n1);
       System.out.println(  "Nota 2: " + n2);
       System.out.println(  "Média: " + (n1+n2)/2);
       media = ((n1+n2)/2);
       if(media>=9.0 && media>=10.0){
           System.out.println("Conceito: 'A' ");
           System.out.println("Parabéns voçe foi APROVADO! ");
       }else{
             if(media>=7.5 && media<=9.0){
           System.out.println("Conceito: 'B' ");
           System.out.println("Parabéns voçe foi APROVADO! ");
           }else{
             if(media>=6.0 && media<=7.5){
           System.out.println("Conceito: 'C' ");
           System.out.println("Parabéns voçe foi APROVADO! ");
           }else{
             if(media>=4.0 && media<=6.0){
           System.out.println("Conceito: 'D' ");
           System.out.println("Voçe foi REPROVADO SEU LIXO! ");
           }else{
             if(media<=4.0 && media>=0){
           System.out.println("Conceito: 'E' ");
           System.out.println("Voçe foi REPROVADO SEU LIXO! ");
           }else{
            
       
       

    }
}}}}}}
