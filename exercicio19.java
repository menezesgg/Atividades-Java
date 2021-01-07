
import java.util.Scanner;

/*
19. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele
deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número
é:
• par ou ímpar;
• positivo ou negativo; 
 */
/**
 *
 * @author 199x
 */
public class exercicio19 {
    
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("informe o 1° número: ");
        double n1 = leitor.nextDouble();
        System.out.println("informe o 2° número: ");
        double n2 = leitor.nextDouble();
        System.out.println("Qual  operação voçê deseja realizar '+' '-' '*' ou '%' ? ");
        String letra = leitor.next();
        
        if (letra.equals('+')){  
        double resultado = n1 + n2;
        if (resultado % 2 == 0){
		System.out.println("O numero é par!"  + resultado);
        }else
		System.out.println("O numero é impar." + resultado);
        if (resultado >= 0){
		System.out.println("O numero é Positivo!" + resultado);
        }else
		System.out.println("O numero é negativo." +  resultado);
	

        }if (letra.equals('-')){
        double resultado = n1 - n2;
        if (resultado % 2 == 0){
		System.out.println("O numero é par!" + resultado);
        }else
		System.out.println("O numero é impar." + resultado);
	if (resultado >= 0){
		System.out.println("O numero é Positivo!" + resultado);
        }else
		System.out.println("O numero é negativo." + resultado);
	

        }if (letra.equals('*')){
   
	double resultado = n1*n2;
	if (resultado % 2 == 0)
		System.out.println("O numero é par!" + resultado);
	else
		System.out.println("O numero é impar." + resultado);
	if (resultado >= 0){
		System.out.println("O numero é Positivo!" + resultado);
                    }else
		System.out.println("O numero é negativo." + resultado);
	

        }if (letra.equals('/')){
    

	double resultado = n1 / n2;
	if (resultado % 2 == 0)
            
        
		System.out.println("O numero é par!" + resultado);
         else
		System.out.println("O numero é impar." + resultado);
	if (resultado >= 0){
		System.out.println("O numero é Positivo!" + resultado);
        }else
		System.out.println("O numero é negativo." + resultado);
	

        }
    }
}
    
        
    


        
    
