package mensagemVo;

import javax.swing.*;

public class MensagemSmsVO implements MensagemVO{
    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "SMS: " + mensagem + " entregue com sucesso");
    }
}
