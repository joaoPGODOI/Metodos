package main2;

import java.util.Scanner;

public class número_Maior {

	public static void main(String[] args) {
		 
		//receber números
        Scanner texto = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
		int numero1 = texto.nextInt();
		
		System.out.println("Digite o segundo número:");
		int numero2 = texto.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int numero3 = texto.nextInt();
	}
	
	//Definir método para retornar valor
	
	public static int maiorNumero(int numero1, int numero2, int numero3) {
		int maior = maiorNumero(numero1,numero2,numero3);
		
		//Método para retornar o maior número
		
		System.out.println("Maior número é:" + maior);
		
			if(numero1 > numero2 && numero1 > numero3) {
				return numero1;			
		    }
			if(numero2 > numero1 && numero2 > numero3) {
				return numero2;
			}
			else {
				return numero3;
			}
		
	}
	  
}

	


	   
	


