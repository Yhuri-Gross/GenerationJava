package POO.Introdu��o;

public class MoldeCliente {
		
	String nome;
	boolean dinheiro;
    int telefone;
    
    public void comprar() {
    	if(this.dinheiro == true) {
    		System.out.println("Voc� consegue comprar nosos produtos ");
    	}else {
 
    		System.out.println("Infelizmente voc� n�o tem dinheiro para comprar os produtos.");
    	}
    }
    
    public void fiado() {
    	System.out.println("Voc� pode pagar na pr�xima.");
    }
    public void olharProdutos() {
    	System.out.println("Estou s� olhando.");
    }
    public void status() {
    	System.out.println("Nome do cliente: " + this.nome);
    	System.out.println("Telefone: " + this.telefone);
    	System.out.println("Dinheiro na conta: " + this.dinheiro);
    }
}
