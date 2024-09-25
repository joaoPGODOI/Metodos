package maiin3;

import java.util.Scanner;

public class média_Aritmética {

	public static void main(String[] args) {
		
		
		//Receber o três números
		
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Insira um número:");
		double numero1 = texto.nextInt();
        
		System.out.println("Insira outro número:");
		double numero2 = texto.nextInt();
		
		System.out.println("Insira o último número:");
		double numero3 = texto.nextInt();
		
		//Método para calculo da média
		
		double media = calculoMedia(numero1,numero2,numero3);
		System.out.println("A média aritmética dos números é" + media);
	}
          
	//Método para inseriri calculoMedia
	
	  private static double calculoMedia(double numero1, double numero2, double numero3) {
		return(numero1 + numero2 + numero3 / 3);
		
	  }

}


