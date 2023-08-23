package prova2;

public class TesteDeRinha {
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo("Lutinha"); //criando jogo
		
		Troll t = new Troll("MecaB", 200, 50);
		SpellBlade s = new SpellBlade("Giggs", 320, 100); //criando entidades
		
		Item a = new Item("Braço de Ferro", 80, 10, 30, 5);
		Item b = new Item("Chute Furioso", 100, 30, 20, 10); //criando itens
		
		t.getItens().add(a);
		s.getItens().add(b);
		
		jogo.getLutaveis().add(t);
		jogo.getLutaveis().add(s);
		
		jogo.rinhaDeLutaveis(t, s);
	}

}
