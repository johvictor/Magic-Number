
package Estudo.Fundos;

import java.util.Scanner;


public class CalculadoraMagicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valores [] = new double [2];
        
        //Introducao
        System.out.println("\n---MAGIC NUMBER---\n");
        System.out.println("Calcula a quantidade de cotas do recebimento de proventos mensais  de um fundo imobiliário");
        System.out.println("para que seja aproximadamente igual ao valor da cota do mesmo.\n\n");
        
        //ObterValores
        System.out.println("Qual o valor da última cotação ?");
            valores[0]=input.nextDouble();

        System.out.println("Qual o valor do último rendimento ?");
            valores[1]=input.nextDouble();
        
        //Calculos    
        double cotas= MagicNumber(valores);
        double investimento=ValorInvestir(valores,cotas);

        //Resultados
        System.out.println("\nA quantidade de cotas para atingir o MAGIC NUMBER é: "+cotas+" (aproximado)");
        System.out.println("Valor a ser investido: R$"+investimento);
  } 
   
   public static double MagicNumber(double valores []){
     return valores[0]/valores[1];
   }
   public static double ValorInvestir(double valores[], double cotas){    
    return valores[0]*cotas; 
   }
}   
    
