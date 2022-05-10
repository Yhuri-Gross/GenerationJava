package VetorEMatriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mat1[][] = new int [4][6];
		int mat2[][] = new int [4][6];
		int mat3[][] = new int [4][6];
		int mat4[][] = new int [4][6];
		int x, y, n1 = 0, n2 = 0;

				for(x = 0; x < 4; x++){
					for(y = 0; y < 6; y++){
						System.out.println("\nDigite um numero: ");
						n1 = ler.nextInt();
						mat1[x][y]= n1;
					}
				}
				for(x = 0; x < 4; x++){
					for(y = 0; y < 6; y++){
						System.out.println("\nDigite um numero: ");
						n2 = ler.nextInt();
						mat2[x][y]= n2;
					}
				}
				for(x = 0; x < 4; x++){
					for(y = 0; y < 6; y++){
						mat3[x][y] = mat1[x][y] + mat2[x][y];
					}
				}

				for(x = 0; x < 4; x++){
					for(y = 0; y < 6; y++){
						mat3[x][y] = mat1[x][y] + mat2[x][y];
					}
				}
				for(x = 0; x < 4; x++){
					for(y = 0; y < 6; y++){
						mat4[x][y] = mat1[x][y] - mat2[x][y];
					}
				}
	}
}
