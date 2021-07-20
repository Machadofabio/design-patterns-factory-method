package mensagemVo;

import javax.swing.*;

public class MensagemWhatsappVO implements MensagemVO{
    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "WhatsApp: " + mensagem + ", entregue com sucesso");
    }
}
