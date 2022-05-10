package VetorEMatriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mat[][] = new int [3][3];
		int n = 0, soma = 0, diagonal = 0, x, y;

				for(x = 0; x < 3; x++){
					for(y = 0; y < 3; y++){
					System.out.println("Digite os valores da matriz: ");
					n = ler.nextInt();
					mat[x][y] = n;
					soma = soma + mat[x][y];
					}
				}
				for(x = 0; x < 3; x++){
					diagonal = diagonal + mat[x][x];
					}
				System.out.println("\nO valor da soma da matriz é de: "+ soma);
				System.out.println("\nO valor da soma da diagonal é de: "+ diagonal);

	}

}
