package mensageiros;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("- MSN -");
        MSNMessenger msn = new MSNMessenger();
        // implementado o encapsulamento o usuário não fica responsável por todos os passos
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("- Facebook -");
        FacebookMessenger fcm = new FacebookMessenger();
        // implementado o encapsulamento o usuário não fica responsável por todos os passos
        fcm.enviarMensagem();
        fcm.receberMensagem();

        System.out.println("- Telegram -");
        Telegram tlg = new Telegram();
        // implementado o encapsulamento o usuário não fica responsável por todos os passos
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
