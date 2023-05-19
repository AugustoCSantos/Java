

public class Item {
	private int quantidade;
	private double precoUnitario;
	private String Nome;
	
	public Item(int quantidade, double precoUnitario, String Nome){
		this.quantidade = quantidade;
		this.Nome = Nome;
		this.precoUnitario = precoUnitario;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	

	
}
