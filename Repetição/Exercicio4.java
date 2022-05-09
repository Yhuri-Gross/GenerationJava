package Repetição;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, genero, humor, x, pessoa = 0;
		int contIdade = 0, contCalma = 0, mulheresNervosas = 0, homensAgressivos = 0;
		int outrosCalmos = 0, nervososMaior = 0, menorCalmos = 0;
		
		while(pessoa < 150){
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu gênero (1 para Feminino / 2 para Masculino / 3 para Outros");
			genero = ler.nextInt();
			
			System.out.println("Digite seu humor (1 para CALMA / 2 para NERVOSA / 3 para AGRESSIVA");
			humor = ler.nextInt();
			
			pessoa ++;
			
			if(humor == 1){
				contCalma ++;
					if(idade < 18){
						menorCalmos ++;
					}else if(genero == 3){
						outrosCalmos ++;
					}
			}
			
			if(humor == 2){
				if(genero == 1){
					mulheresNervosas ++;
				}
				if(idade >= 40){
					nervososMaior ++;
				}
			}
			
			if(genero == 2 && humor == 3){
				homensAgressivos ++;
			}
		}
		System.out.println( "A quantidade de pessoas calmas são " + contCalma );
		System.out.println( "A quantidade de Mulheres nervosas são " + mulheresNervosas );
		System.out.println( "A quantidade de homens agressivos são " + homensAgressivos );
		System.out.println( "A quantidade de 'Outros' calmos é " + outrosCalmos );
		System.out.println( "A quantidade de pessoas nervosas com mais de 40 anos é " + nervososMaior );
		System.out.println( "A quantidade de pessoas calmas com menos de 18 é " + menorCalmos );
	}	
}
