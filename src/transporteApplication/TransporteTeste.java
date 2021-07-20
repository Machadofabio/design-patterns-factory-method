package transporteApplication;

import transporteVo.TransporteFactoryVO;
import transporteVo.TransporteVO;

import javax.swing.*;

public class TransporteTeste {
    public static void main(String[] args) {

        String tipo = JOptionPane.showInputDialog(null);
        TransporteVO transporteVO = TransporteFactoryVO.getTipoTransporte(tipo);
        transporteVO.calcularRota();
    }
}
