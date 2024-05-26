package mensageiros;

import mensageiros.apps.FacebookMessenger;
import mensageiros.apps.MSNMessenger;
import mensageiros.apps.ServicoMensagemInstantanea;
import mensageiros.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;// mais a frente vamos saber qual classe vai ser usada
        /*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido ="tlg";
        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
