package Herança;

public class Criacao {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica preg1 = new Preguica();
		
		
		System.out.println("============================");
		cao1.nome = "Beto";
		cao1.emiteSom = "AU AU";
		cao1.idade = 18;
		cao1.status();
		cao1.corrida();
		cao1.falar();
		System.out.println("===========================");
		
		System.out.println("============================");
		cav1.nome = "Morgan";
		cav1.emiteSom = "Relincha";
		cav1.idade = 50;
		cav1.status();
		cav1.corrida();
		cav1.falar();
		System.out.println("===========================");
		
		System.out.println("============================");
		preg1.nome = "Bill";
		preg1.emiteSom = "Oik";
		preg1.idade = 33;
		preg1.status();
		preg1.escalando();
		preg1.falar();
		System.out.println("===========================");

	}

}
