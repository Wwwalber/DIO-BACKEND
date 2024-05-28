package dispositivos;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("Alô, quem fala?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamada não atendida. Deixe uma mensagem após o sinal.");
    }

    @Override
    public String ligar(String numero) {
        System.out.println("Ligando do iPhone ...");
        return "ligou";
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso.");
    }

    @Override
    public String exibirPagina(String url) {
        System.out.println("abrindo: "+url);
        return "url aberta";
    }

    @Override
    public void pausar() {
        System.out.println("Música em pausa.");        
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("Selecionar "+musica);
        return "música selecionada.";
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música");        
    }

}
