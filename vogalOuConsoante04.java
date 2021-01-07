
import java.util.Scanner;

/*
 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

//ALEXANDRE MENEZES GOMES ADS 1° PERIODO FANAP

public class vogalOuConsoante04 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("INFORME UMA LETRA QUALQUER: ");
        String letra = leitor.next();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            System.out.println("A letra digitada [" + letra + "] é uma vogal.");
        } else {
            System.out.println("A letra digitada [" + letra + "] é uma consoante.");
        }
    }
}

    
    
