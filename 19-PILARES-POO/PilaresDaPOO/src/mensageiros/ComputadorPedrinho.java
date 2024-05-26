package mensageiros;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        // implementado o encapsulamento o usuário não fica responsável por todos os passos
        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
