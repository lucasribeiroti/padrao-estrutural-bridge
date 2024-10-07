package src.main.java;

public class WhatsappNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
