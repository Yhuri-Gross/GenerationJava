package POO.Introdução;

public class MoldeAviao {
		
	String modelo;
	int identificacao;
	boolean voando;
	boolean combustivel;
	
	public void voar() {
		if(this.voando == false && this.combustivel == true) {
			System.out.println("Decolando em 3, 2, 1");
		}else if(this.combustivel == false && this.voando == false) {
			System.out.println("Você não tem combustível para voar ");
		}else {
			System.out.println("Você já está voando");
		}
	}
	
	public void aterrissar() {
		if(this.voando == true) {
		System.out.println("Estamos aterrissando");
		}else {
			System.out.println("Você não está voando");
		}
	}
	
	public void reabastecer() {
		if(this.combustivel == false) {
			System.out.println("Conseguimos reabastecer");
		}else {
			System.out.println("O tanque já estava cheio");
		}
	}
	
	public void status() {
		System.out.println("Modelo do avião: " + this.modelo);
		System.out.println("Identificação do avião: " + this.identificacao);
		System.out.println("O avião está voando: " + this.voando);
		System.out.println("Combustível do avião: " + this.combustivel);
	}
}
