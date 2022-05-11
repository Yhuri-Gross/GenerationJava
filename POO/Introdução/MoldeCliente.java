package POO.Introdução;

public class MoldeCliente {
		
	String nome;
	boolean dinheiro;
    int telefone;
    
    public void comprar() {
    	if(this.dinheiro == true) {
    		System.out.println("Você consegue comprar nosos produtos ");
    	}else {
 
    		System.out.println("Infelizmente você não tem dinheiro para comprar os produtos.");
    	}
    }
    
    public void fiado() {
    	System.out.println("Você pode pagar na próxima.");
    }
    public void olharProdutos() {
    	System.out.println("Estou só olhando.");
    }
    public void status() {
    	System.out.println("Nome do cliente: " + this.nome);
    	System.out.println("Telefone: " + this.telefone);
    	System.out.println("Dinheiro na conta: " + this.dinheiro);
    }
}
