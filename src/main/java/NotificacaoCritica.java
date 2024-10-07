package src.main.java;

public class NotificacaoCritica extends Notificacao {

    public NotificacaoCritica(CanalNotificacao canalNotificacao) {
        super(canalNotificacao);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("ALERTA CRÍTICO:");
        canalNotificacao.enviar(mensagem);
    }
}
