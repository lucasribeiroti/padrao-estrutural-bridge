package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoInformativaTest {

    @Test
    void deveEnviarNotificacaoInformativaPorEmail() {
        CanalNotificacao canalEmail = new EmailNotificacao();
        Notificacao notificacaoInformativa = new NotificacaoInformativa(canalEmail);
        assertDoesNotThrow(() -> notificacaoInformativa.enviarMensagem("Atualização do sistema agendada para amanhã."));
    }

    @Test
    void deveEnviarNotificacaoInformativaPorSMS() {
        CanalNotificacao canalSMS = new SMSNotificacao();
        Notificacao notificacaoInformativa = new NotificacaoInformativa(canalSMS);
        assertDoesNotThrow(() -> notificacaoInformativa.enviarMensagem("Novo recurso disponível no portal."));
    }

    @Test
    void deveEnviarNotificacaoInformativaPorWhatsapp() {
        CanalNotificacao canalWhatsapp = new WhatsappNotificacao();
        Notificacao notificacaoInformativa = new NotificacaoInformativa(canalWhatsapp);
        assertDoesNotThrow(() -> notificacaoInformativa.enviarMensagem("Encontro de equipe agendado para sexta-feira."));
    }
}