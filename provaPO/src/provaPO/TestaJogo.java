package provaPO;

public class TestaJogo {
	public static void main(String[] args) {
		Jogo jogo = new Jogo("Clash"); //referencia a clash royale unico jogo de cartas que joguei na vida kkkkk
		Jogador auggie = new Jogador("Auggie", 50, 40);
		
		jogo.getJogadores().add(auggie);
		
		Carta h1 = new Humano("Barbaro", 5, Tipo.NORMAL, 174, 310);
		Carta b1 = new Robo("P.E.K.K.A", 7, Tipo.NORMAL, 300, 800); //criando cartas
		Carta r1 = new Reptil("Goblin", 2, Tipo.NORMAL, 109, 184);
		
		h1.imprimir();
		b1.imprimir(); //imprimindo as cartas
		r1.imprimir();
	}
}
