package VetorEMatriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int maior = 0, media, x, y, soma = 0, valor = 0;
		int dado[] = new int [10];

				for(x = 0; x < 10; x++){
					System.out.println("\n\n5Digite os valores do dado: ");
					dado[x] = ler.nextInt();
					soma = soma + dado[x];
					if(maior < dado[x]){
						maior = dado[x];
					}
					System.out.println("\nO valor do dado foi: "+ dado[x]);
				}
				for(y=0; y < 10; y++){
						if(maior == dado[y]){
						valor ++;
						}
					}
				media = soma / 10;
				System.out.println("\nA média dos valores é: "+ media);
				System.out.println("\nO maior valor digitado apareceu " + valor + " vezes.");

	}

}
