package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoCriticaTest {

    @Test
    void deveEnviarNotificacaoCriticaPorEmail() {
        CanalNotificacao canalEmail = new EmailNotificacao();
        Notificacao notificacaoCritica = new NotificacaoCritica(canalEmail);
        assertDoesNotThrow(() -> notificacaoCritica.enviarMensagem("Servidor fora do ar!"));
    }

    @Test
    void deveEnviarNotificacaoCriticaPorSMS() {
        CanalNotificacao canalSMS = new SMSNotificacao();
        Notificacao notificacaoCritica = new NotificacaoCritica(canalSMS);
        assertDoesNotThrow(() -> notificacaoCritica.enviarMensagem("Falha na segurança detectada!"));
    }

    @Test
    void deveEnviarNotificacaoCriticaPorWhatsapp() {
        CanalNotificacao canalWhatsapp = new WhatsappNotificacao();
        Notificacao notificacaoCritica = new NotificacaoCritica(canalWhatsapp);
        assertDoesNotThrow(() -> notificacaoCritica.enviarMensagem("Erro no banco de dados!"));
    }
}