package src.main.java;

public class SMSNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}