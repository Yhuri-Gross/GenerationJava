package POO.Introdução;

public class Cliente {

	public static void main(String[] args) {
		MoldeCliente cliente1 = new MoldeCliente();
		MoldeCliente cliente2 = new MoldeCliente();
		MoldeCliente cliente3 = new MoldeCliente();
		
		System.out.println("Cliente 1");
		cliente1.nome = "Yhuri";
		cliente1.telefone = 932424;
		cliente1.dinheiro = true;
		cliente1.status();
		cliente1.olharProdutos();
		cliente1.comprar();
		System.out.println("");
		
		System.out.println("Cliente 2");
		cliente2.nome = "Priscila";
		cliente2.telefone = 874366534;
		cliente2.dinheiro = false;
		cliente2.status();
		cliente2.fiado();
		System.out.println("");
		
		System.out.println("Cliente 3");
		cliente3.nome = "Marjory";
		cliente3.telefone = 756534;
		cliente3.dinheiro = false;
		cliente3.status();
		cliente3.olharProdutos();
		cliente3.comprar();
		System.out.println("");
		
	}

}
