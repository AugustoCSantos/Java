package banco;

abstract public class Conta {
	protected double saldo;
	protected int numero;
	protected String dataAbertura;
	
	
	//construtor
	public Conta(int numero, double saldo, String dataAbertura) {
		this.numero = numero;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	public double obterSaldo() {
		return saldo;
	}
	
	//get and set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
