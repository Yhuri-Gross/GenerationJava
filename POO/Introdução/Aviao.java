package POO.Introdução;

public class Aviao {

	public static void main(String[] args) {
		MoldeAviao aviao1 = new MoldeAviao();
		MoldeAviao aviao2 = new MoldeAviao();
		
		System.out.println("Primeiro");
		aviao1.modelo = "Boeing XB-15";
		aviao1.identificacao = 3224;
		aviao1.voando = false;
		aviao1.combustivel = false;
		aviao1.status();
		aviao1.voar();
		aviao1.aterrissar();
		System.out.println("");
		
		System.out.println("Segundo");
		aviao2.modelo = "14-Bis";
		aviao2.identificacao = 5534;
		aviao2.voando = true;
		aviao2.combustivel = true;
		aviao2.status();
		aviao2.reabastecer();
		aviao2.voar();
		aviao2.aterrissar();
		System.out.println("");
	}

}
