
import java.util.Scanner;

/*
12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do
Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e
que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao
usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

 */
 // ALEXANDRE MENEZES GOMES ADS 1° PERIODO FANAP.
//  GOIÂNIA 12/10/19

public class calculoFolhaDePagamento12 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
        double salarioHora,horasTrabalhadas,vlrIr,impR,inss,desc;
       
        
              
System.out.println("INFORME O VALOR QUE GANHA POR HORAS TRABALHADA: ");
salarioHora = leitor.nextDouble();

System.out.println("INFORME O NUMERO DE HORAS TRABALHADAS: ");
horasTrabalhadas = leitor.nextInt();


double salarioBruto = salarioHora*horasTrabalhadas;


       if(salarioBruto<=900){
 System.out.println("Salario bruto:  (" + salarioHora+ ")*"  + "("+ horasTrabalhadas + ") = R$ " + salarioBruto );
 System.out.println("insento de descontos de 'Ir' e 'FGTS' ");
 System.out.println("(-) INSS  (10%)" + " : R$ " + salarioBruto/100*10);
       }else{
           
           
     
      if(salarioBruto<=1500){
System.out.println("Salario bruto:  (" +salarioHora+ ")*"  + "("+horasTrabalhadas + ") : R$ " +salarioBruto );

               System.out.println(("(-) IR 5%") + "                     : R$ " + salarioBruto/100*5);
impR = salarioBruto/100*5;
               System.out.println(" (-) INSS  (10%)" + "             : R$ " + salarioBruto/100*10);
inss = salarioBruto/100*10;
               System.out.println("FGTS (11%)"+ "                    : R$ " + salarioBruto/100*11);

               System.out.println("Total de descontos " +"      : R$ " +( impR+inss ));
               desc =  impR+inss;
               System.out.println("Salário liquido"+"                : R$ " + (salarioBruto-desc ));

      }else{

          if(salarioBruto<=2500){
System.out.println("Salario bruto:  (" +salarioHora+ ")*"  + "("+horasTrabalhadas + ") : R$ " +salarioBruto );

               System.out.println(("(-) IR 10%") + "                     : R$ " + salarioBruto/100*10);
impR = salarioBruto/100*10;
               System.out.println(" (-) INSS  (10%)" + "              : R$ " + salarioBruto/100*10);
inss = salarioBruto/100*10;
               System.out.println("FGTS (11%)" + "                    : R$ " + salarioBruto/100*11);

              System.out.println("Total de descontos " + "       : R$ " +( impR+inss ));
               desc =  impR+inss;
              System.out.println("Salário liquido" + "                 : R$ " + (salarioBruto-desc ));
      }else{
              if(salarioBruto>=2500){
System.out.println("Salario bruto:  (" +salarioHora+ ")*"  + "("+horasTrabalhadas + ") : R$ " +salarioBruto );

               System.out.println(("(-) IR 20%") +                   " : R$ " + salarioBruto/100*20);
impR = salarioBruto/100*20;
               System.out.println(" (-) INSS  (10%)" +            " : R$ " + salarioBruto/100*10);
inss = salarioBruto/100*10;
               System.out.println("FGTS (11%)" +                  " : R$ " + salarioBruto/100*11);
               System.out.println("Total de descontos " +   " : R$ " +( impR+inss ));
               desc =  impR+inss;
               System.out.println("Salário liquido" +              ": R$ " + (salarioBruto-desc ));

          }
      }


}
       }
    }
}
        
        
        
        
        
        
        
  