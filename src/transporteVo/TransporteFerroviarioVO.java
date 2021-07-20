package transporteVo;

import javax.swing.*;

public class TransporteFerroviarioVO implements TransporteVO {

    @Override
    public void calcularRota() {
        JOptionPane.showMessageDialog(null, "A rota ferroviária do destino será de" +
                " aproximadamente 100 km");
    }
}
