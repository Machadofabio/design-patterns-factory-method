package mensagemApplication;

import mensagemVo.MensagemFactory;
import mensagemVo.MensagemVO;

import javax.swing.*;

public class MensagemTeste {
    public static void main(String[] args) {

        String mensagem = JOptionPane.showInputDialog(null);

        MensagemVO mensagemVO = MensagemFactory.getMensagem("email");
        mensagemVO.enviar(mensagem);
    }
}
