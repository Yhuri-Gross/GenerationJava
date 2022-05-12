package POO.Introdução;

public class MoldeProduto {
		String produto;
		double valor;
		int bateria;
		    
		    public void comprar() {
		    	System.out.println("Comprado");
		    }
		    public void olharValor() {
		    	System.out.println("Estou só olhando. ");
		    }
		    public void status() {
		    	System.out.println("Nome do produto: " + this.produto);
		    	System.out.println("Valor: R$ " + this.valor);
		    	System.out.println("Bateria: " + this.bateria);
		    }
}
