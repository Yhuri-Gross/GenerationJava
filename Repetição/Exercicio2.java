package Repeti��o;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int x, n, contPar = 0, contImpar = 0;
		Scanner ler = new Scanner(System.in);
		
		for(x = 1; x <= 10; x++){
			System.out.println("Digite um n�mero: ");
			n = ler.nextInt();
			
			if(n % 2 == 0) {
				contPar ++;
			}else {
				contImpar ++;
			}
		}
		System.out.println("\nN�meros digitados que s�o pares: " + contPar);
		System.out.println("\nN�meros digitados que s�o impares: " + contImpar);
		System.out.println("Fim do programa.");
	}
}
