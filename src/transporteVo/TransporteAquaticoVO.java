package transporteVo;

import javax.swing.*;

public class TransporteAquaticoVO implements TransporteVO {

    @Override
    public void calcularRota() {
        JOptionPane.showMessageDialog(null, "A rota marítima do destino será de" +
                " aproximadamente 200 km");
    }
}
