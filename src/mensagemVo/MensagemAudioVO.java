package mensagemVo;

import javax.swing.*;

public class MensagemAudioVO implements MensagemVO{
    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "Audio: " + mensagem + ", entregue com sucesso");
    }
}
