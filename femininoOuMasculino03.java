
import java.util.Scanner;

/*
 Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F
- Feminino, M - Masculino, Sexo Inválido.
 */
/**
//ALEXANDRE MENZES GOMES ADS 1°PERIODO 
 */
public class femininoOuMasculino03 {
     public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe 'F' ou 'M'");
        String letra = leitor.next();
        // Verifique se a letra é F, M ou alguma inválida.
        if (letra.equals("F")) {
            System.out.println(letra + " -Feminino");
        }
        if (letra.equals("M")) {
            System.out.println(letra + " Masculino");
        } 
        if (!letra.equals("F") && !letra.equals("M")){
            System.out.println("A letra digitada [" + letra + "] é inválida!");
        }
    }
}

    

