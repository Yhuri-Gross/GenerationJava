package Condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 0 && idade <= 14) {
			System.out.println("Voc� est� na categoria infantil. ");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Voc� est� na categoria juvenil. ");
		}else {
			System.out.println("Voc� est� na categoria adulto. ");
		}
	}

}
