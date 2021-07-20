package transporteVo;

import javax.swing.*;

public class TransporteAereoVO implements TransporteVO {

    @Override
    public void calcularRota() {
        JOptionPane.showMessageDialog(null, "A rota aerea do destino será de" +
                " aproximadamente 80 km");
    }
}
