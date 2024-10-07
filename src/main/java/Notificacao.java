package src.main.java;

public abstract class Notificacao {

    protected CanalNotificacao canalNotificacao;

    public Notificacao(CanalNotificacao canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public abstract void enviarMensagem(String mensagem);
}
