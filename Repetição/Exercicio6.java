package Repeti��o;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, media, cont = 0, soma = 0;
		
		
		do {
			System.out.println("Digite um n�mero: ");
			x = ler.nextInt();
			
			if(x % 3 == 0) {
				soma = soma + x;
				cont ++;
			}
		}while(x != 0);
		media = soma / cont;
		System.out.println("A m�dia dos valores multiplos de 3 � de: " + media);
		System.out.println("Fim do programa.");
	}

}
