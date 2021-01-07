
/*
20. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
• "Telefonou para a vítima?"
• "Esteve no local do crime?"
• "Mora perto da vítima?"
• "Devia para a vítima?"
• "Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a
pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4
como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente". 
 */
/**
 *
 * @author 199x
 */
import java.util.Scanner;
public class culpadoOuInocente{
    public static void main(String[] args){
        //responsável por capturar as respostas do usuário
        Scanner s = new Scanner(System.in);
 
        //lista de perguntas
        String[] perguntas = new String[5];
            perguntas[0] = "Telefonou para a vítima?";
            perguntas[1] = "Esteve no local do crime?";
            perguntas[2] = "Mora perto da vítima?";
            perguntas[3] = "Devia para a vítima?";
            perguntas[4] = "Já trabalhou com a vítima?";
       
        // variável que guardará o número de respostas "sim"
        int respostasPositivas = 0;
       
        //ciclo de repetição responsável por fazer as perguntas, coletar as respostas do usuário
        //e verificar se a resposta foi sim
        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);//exibe a pergunta
            String respostas = s.nextLine();//captura a resposta do usuário
           
            
            //toLowerCase() coloca todas as letras em minúsculo
            if(respostas.toLowerCase().equals("sim")){ // verifica se a resposta for sim
                respostasPositivas++; //adiciona +1 à variável respostasPositivas
            }
        }
 
        //verificação da quantidade de respostas positivas
        switch(respostasPositivas){
            case 2: // caso o número de respostas positivas seja 2
                System.out.println("Suspeito");
                break;
 
            case 3:// caso o número de respostas positivas seja 3 ou 4
            case 4:
                System.out.println("Cúmplice");
                break;
 
            case 5:// caso o número de respostas positivas seja 5
                System.out.println("Assassino");
                break;
 
            default:// caso o número de respostas positivas não seja nenhuma das outras opções
                System.out.println("Inocente");
                break;
        }
    }
}