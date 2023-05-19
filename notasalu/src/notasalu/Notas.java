package notasalu;

public class Notas {
	private String data;
	private double valor;
	
	public Notas(String data, double valor) {
		this.data = data;
		this.valor = valor;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
