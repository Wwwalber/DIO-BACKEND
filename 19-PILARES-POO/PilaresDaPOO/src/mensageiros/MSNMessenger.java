package mensageiros;

public class MSNMessenger {
	public void enviarMensagem() {
        // primeiro verifica se está conectado na internet
        validarConectadoInternet();
		System.out.println("Enviando mensagem");
        // depois de enviada, salva no histórico
        salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
