package mensageiros;
// agora vou me abstrair e assim não entrar em detalhes de como vocês
// irão implementar serviços de mensagem. Vou garantir que façam de alguma forma
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();

}
