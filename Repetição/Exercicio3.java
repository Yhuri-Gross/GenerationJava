package Repeti��o;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, velho, novo;
		int contNovo = 0, contVelho = 0;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		while(idade > -99){
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			if(idade < 21) {
				contNovo ++;
			}else if(idade > 50) {
				contVelho ++;
			}
		}
		System.out.println("O n�mero de pessoas com menos de 21 anos � de: " + contNovo);
		System.out.println("O n�mero de pessoas com mais de 50 anos � de: " + contVelho);
		System.out.println("Fim do programa.");
	}	
}
