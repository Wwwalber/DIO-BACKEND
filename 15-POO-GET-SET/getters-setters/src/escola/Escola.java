package escola;

// arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe de Souza");
		felipe.setIdade(18);
		
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	

	}
}