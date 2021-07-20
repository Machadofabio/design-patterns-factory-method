package transporteVo;

public class TransporteFactoryVO {

    public static TransporteVO getTipoTransporte(String tipo){

        if(tipo.equalsIgnoreCase("aviao")){
            return new TransporteAereoVO();
        } else if(tipo.equalsIgnoreCase("barco")){
            return new TransporteAquaticoVO();
        } else if(tipo.equalsIgnoreCase("trem")){
            return new TransporteFerroviarioVO();
        }
        return new TransporteRodoviarioVO();
    }
}
