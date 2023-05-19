import java.util.ArrayList;

public class Fatura {
	private String nome;
	private String cpf;
	private ArrayList <Item> itens; //atributos
	
	public Fatura(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.itens = new ArrayList <Item>();
	} //construtor
	
	public double obtemPreco() {
		double precoFinal = 0;
		for(Item item: itens) {
			precoFinal += item.getPrecoUnitario() * item.getQuantidade();
		}
		return precoFinal;
	}
	
	public void adicionarItem(int i, Item item) {
		itens.add(item);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static void main(String [] args) {
		ArrayList<Item> carrinho = new ArrayList();
		
		Item pao = new Item(8, 3.00, "Pao frances");
		Item mortadela = new Item(100, 5.00, "Mortadela");
		Item queijo = new Item(300, 15.00, "Queijo"); //criar itens
		
		carrinho.add(pao);
		carrinho.add(mortadela);
		carrinho.add(queijo); //adicionar item
		
		Fatura fatura = new Fatura("Bruno", "4456176515");
		
		for (Item item : carrinho) {
			System.out.println("Item: " + item.getNome());
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("Preco: " + item.getPrecoUnitario());
			System.out.println(".......");
		}//gerar recibo
		
		double totalFatura = fatura.obtemPreco();
		System.out.println("Total: " + totalFatura);
		
	}
	
	
}
