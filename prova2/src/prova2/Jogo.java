package prova2;

import java.util.ArrayList;

public class Jogo {
	private final String nome;
	private ArrayList <Lutavel> lutaveis;
	
	public Jogo(String nome) {
		this.nome = nome;
		this.lutaveis = new ArrayList<Lutavel>();
	} //construtor de jogo
	
	public void rinhaDeLutaveis(Lutavel l1, Lutavel l2) {
		Entidade en = (Entidade) l1;
		Entidade lp = (Entidade) l2;
		
		int vida_l1 = en.getVida();
		int vida_l2 = lp.getVida();
		
		while(vida_l1 > 0 && vida_l2 > 0) {
			if(en.ataqueTotal() > lp.defesaTotal()) {
				vida_l2 = lp.defesaTotal() - en.ataqueTotal();
			}
			else if(lp.ataqueTotal() > en.defesaTotal()) {
				vida_l1 = en.defesaTotal() - lp.ataqueTotal();
			}
		} //gerando luta
		
		if(vida_l1 > 0) {
			System.out.println("Ganhador: " + en.getNome());
		}
		else {
			System.out.println("Ganhador: " + lp.getNome());
		}
	} //luta das entidade

	public ArrayList<Lutavel> getLutaveis() {
		return lutaveis;
	}
	public void setLutaveis(ArrayList<Lutavel> lutaveis) {
		this.lutaveis = lutaveis;
	}

	public String getNome() {
		return nome;
	}
	
	
}
