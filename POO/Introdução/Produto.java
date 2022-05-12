package POO.Introdução;

public class Produto {

	public static void main(String[] args) {
		MoldeProduto prod1 = new MoldeProduto();
		
		
		System.out.println("Cliente 1");
		prod1.produto = "Celular";
		prod1.bateria = 100;
		prod1.valor = 534;
		prod1.status();
		prod1.olharValor();
		prod1.comprar();
		System.out.println("");
		
	}

}