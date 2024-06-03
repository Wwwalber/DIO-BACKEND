package map.ope_basicas;

public class DicionarioMain {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Exemplos de adição de contatos
        dicionario.adicionarPalavra("Amizade", "Relação afetuosa entre duas ou mais pessoas baseada em confiança, companheirismo e apoio mútuo");
        dicionario.adicionarPalavra("Felicidade", "Estado emocional de contentamento, alegria e satisfação");
        dicionario.adicionarPalavra("Generosidade", "A qualidade de ser disposto a dar, compartilhar ou ajudar os outros sem esperar algo em troca");
        dicionario.adicionarPalavra("Resiliência", "Capacidade de se adaptar e se recuperar diante de desafios, adversidades ou situações difíceis");
        dicionario.adicionarPalavra("Empatia", "Habilidade de compreender e compartilhar os sentimentos e perspectivas de outra pessoa");
        dicionario.adicionarPalavra("Sustentabilidade", "Prática de utilizar recursos de forma responsável para garantir a preservação do meio ambiente e o bem-estar das gerações futuras");
        dicionario.adicionarPalavra("Solidariedade", "União e apoio mútuo entre indivíduos ou grupos em momentos de necessidade ou dificuldade");
        dicionario.adicionarPalavra("Integridade", "Qualidade de agir de acordo com princípios éticos e morais, mantendo a honestidade e a coerência");
        dicionario.adicionarPalavra("Compaixão", "Sentimento de simpatia e preocupação pelos sofrimentos e dificuldades dos outros");
        dicionario.adicionarPalavra("Persistência", "Determinação e perseverança para alcançar objetivos, mesmo diante de obstáculos e fracassos");

        dicionario.exibirPalavras();
        System.out.println("\n");
        dicionario.adicionarPalavra("Paciência", "Capacidade de esperar com calma e tolerância, mesmo diante de situações demoradas ou difíceis");
        dicionario.adicionarPalavra("Gratidão", "Sentimento de reconhecimento e apreço por algo que alguém fez por nós");

        dicionario.exibirPalavras();

        //dicionario.pesquisarPorPalavra("Gratidão");
        System.out.println("\nA definição da palavra pesquisada é: "+
                    dicionario.pesquisarPorPalavra("Empatia"));
    }
}
