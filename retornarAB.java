package main;

import java.util.Scanner;

public class retornarAB {

	public static void main(String[] args) {
		
		//Escaner número A
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite o número A:");
		int A = texto.nextInt();
		
		//Escanear número B
		System.out.println("Digite o número B");
		int B = texto.nextInt();
		
	    //Receber os números e exibir AB
		
		System.out.println(A + "," + B);
	}

}
