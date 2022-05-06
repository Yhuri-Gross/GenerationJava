package Condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 0 && idade <= 14) {
			System.out.println("Você está na categoria infantil. ");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria juvenil. ");
		}else {
			System.out.println("Você está na categoria adulto. ");
		}
	}

}
