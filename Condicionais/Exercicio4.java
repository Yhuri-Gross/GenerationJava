package Condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1, valor;
		
		System.out.println("Digite um n�mero: ");
		n1 = leia.nextDouble();
		
		if(n1 % 2 == 0){
			System.out.println("Este n�mero � par ");
			valor = Math.sqrt(n1);
			System.out.println("A raiz quadrada de " + n1 + " �: " + valor);
		}else {
			System.out.println("O n�mero digitado � �mpar");
			valor = Math.pow(n1, 2);
			System.out.println("Seu valor elevado ao quadrado �: " + valor);
		}
	}

}
