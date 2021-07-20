package transporteVo;

import javax.swing.*;

public class TransporteRodoviarioVO implements TransporteVO{
    @Override
    public void calcularRota() {
        JOptionPane.showMessageDialog(null, "A rota rodoviária até o destino será de" +
                " aproximadamente 150 km");
    }
}
