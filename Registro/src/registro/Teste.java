package registro;

public class Teste {
	public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Augusto");
        pessoa.setNome_Pai("Cesar");
        pessoa.setNome_Mae("Eridan");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Nome da mae: " + pessoa.getNome_Mae());
        System.out.println("Nome do pai: " + pessoa.getNome_Pai());

        pessoa.setDia(13);
        pessoa.setMes(10);
        pessoa.setAno(2003);

        System.out.println("Data de nascimento: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno());

        pessoa.setNacionalidade(Nacionalidade.BR);
        pessoa.setSexo(Sexo.MASCULINO);
        pessoa.setEstadocivil(Estadocivil.SOLTEIRO);

        System.out.println("Nacionalidade: " + Nacionalidade.BR);
        System.out.println("Sexo: " + Sexo.MASCULINO);
        System.out.println("Estadocivil: " + Estadocivil.SOLTEIRO);
        
        pessoa.setAltura(1.75);
        pessoa.setPeso(75.0);
        
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Peso: " + pessoa.getPeso());
}
}
