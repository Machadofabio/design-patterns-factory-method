package mensagemVo;

import javax.swing.*;

public class MensagemEmailVO implements MensagemVO{

    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "E-mail: " + mensagem + ", entregue com sucesso");
    }
}
