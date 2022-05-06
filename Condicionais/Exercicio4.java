package Condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1, valor;
		
		System.out.println("Digite um número: ");
		n1 = leia.nextDouble();
		
		if(n1 % 2 == 0){
			System.out.println("Este número é par ");
			valor = Math.sqrt(n1);
			System.out.println("A raiz quadrada de " + n1 + " é: " + valor);
		}else {
			System.out.println("O número digitado é ímpar");
			valor = Math.pow(n1, 2);
			System.out.println("Seu valor elevado ao quadrado é: " + valor);
		}
	}

}
