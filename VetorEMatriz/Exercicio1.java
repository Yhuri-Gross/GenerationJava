package VetorEMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
				Scanner ler = new Scanner(System.in);
				int n[] = new int [5];
				int x, maior= 0;
				
				for(x = 0; x < 5; x++){
					System.out.println("\nDigite os valores das notas: ");
					n[x] = ler.nextInt();
					System.out.println("\nVocê digitou o valor: "+ n[x]);
					if(n[x] > maior){
						maior = n[x];
					}
				}
				System.out.println("\nO maior valor digitado foi "+ maior);
	}

}
