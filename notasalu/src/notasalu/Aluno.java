package notasalu;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	ArrayList<Double> notas = new ArrayList<Double>();
	
	
	public Aluno(String nome, String cpf) {
		super(nome, cpf);
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void addNota(double nota) {
		notas.add(nota);
	}
	
	public double getMedia() {
		double notaFinal = 0;
		for(Double nota: notas) {
			notaFinal += nota;
		}
		
	return notaFinal/2;
	}
	
	public static void main(String [] args) {
		Aluno augusto = new Aluno("Augusto", "54215732");
		
		augusto.addNota(9.0);
		augusto.addNota(7.0);
		
		double notaFinal = augusto.getMedia();
		System.out.println("Media: " + notaFinal);
	}

}