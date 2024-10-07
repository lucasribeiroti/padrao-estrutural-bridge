package src.main.java;

public class EmailNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
