package src.main.java;

public class NotificacaoInformativa extends Notificacao {

    public NotificacaoInformativa(CanalNotificacao canalNotificacao) {
        super(canalNotificacao);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("NOTIFICAÇÃO INFORMATIVA:");
        canalNotificacao.enviar(mensagem);
    }
}
