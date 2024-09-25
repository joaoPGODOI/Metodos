package main5;

import java.util.Scanner;

public class converter {

	public static void main(String[] args) {

		
		//Receber os minutos
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite os minutos á serem convertido:");
		int min = texto.nextInt();
		}
		
		
		//Método para conversão
		
		public static String ConverterMin(int minutos){
		int min = 0;
		int horas = min / 60;
		int restante = minutos % 60;
        return  horas + "horas e" + minutos + "minutos";
        
	}

}
