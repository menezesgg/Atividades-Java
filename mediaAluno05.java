
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
public class mediaAluno05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a nota obtida no primeiro bimestre");
        double nota01 = leitor.nextDouble();
        System.out.println("Informe a nota obtida no segundo bimestre");
        double nota02 = leitor.nextDouble();
        double media = (nota01 + nota02) / 2;
        System.out.println("A média final do aluno é: " + media + ".");
        // Verifique a nota do aluno e imprima o resultado
        if (media == 10) {
            System.out.println("Resultado: Aprovado com distinção!");
        }
        if (media >= 7 && media < 10) {
            System.out.println("Resultado: Aprovado! :)");
        }
        if (media < 7) {
            System.out.println("Resultado: Reprovado! :(");
        }
        System.out.println("");
    }
}

    

