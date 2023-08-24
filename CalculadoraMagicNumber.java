
package Estudo.Fundos;

import java.util.Scanner;


public class CalculadoraMagicNumber {
    public static void main(String[] args) {
        Scanner pink = new Scanner(System.in);
        double azul [] = new double [2];
        
        //Introducao
        System.out.println("\n---MAGIC NUMBER---\n");
        System.out.println("Calcula a quantidade de cotas do recebimento de proventos mensais  de um fundo imobiliário");
        System.out.println("para que seja aproximadamente igual ao valor da cota do mesmo.\n\n");
        
        //ObterValores
        System.out.println("Qual o valor da última cotação ?");
            azul[0]=pink.nextDouble();

        System.out.println("Qual o valor do último rendimento ?");
            azul[1]=pink.nextDouble();
        
        //Calculos    
        double cotas= MagicNumber(azul);
        double investimento=ValorInvestir(azul,cotas);

        //Resultados
        System.out.println("\nA quantidade de cotas para atingir o MAGIC NUMBER é: "+cotas+" (aproximado)");
        System.out.println("Valor a ser investido: R$"+investimento);
  } 
   
   public static double MagicNumber(double amarelo []){
     return amarelo[0]/amarelo[1];
   }
   public static double ValorInvestir(double bicinho[], double cotas){    
    return bicinho[0]*cotas; 
   }
}   
    
