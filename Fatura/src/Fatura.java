
public class Fatura {
	private String nome;
	private String cpf;
	private Item[] itens;
	
	public double obtemPreco() {
		
	}
	public void adicionarItem(int i);
	
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
	
	public Item[] getItens() {
		return itens;
	}
	public void setItens(Item[] itens) {
		this.itens = itens;
	}
	
	
	
	
}
