package mensagemVo;

public class MensagemFactory {
    public static MensagemVO getMensagem(String tipo){
        if(tipo.equalsIgnoreCase("email")){
            return new MensagemEmailVO();
        } else if(tipo.equalsIgnoreCase("sms")){
            return new MensagemSmsVO();
        } else if(tipo.equalsIgnoreCase("whatsapp")){
            return new MensagemWhatsappVO();
        }
        return new MensagemAudioVO();
    }
}
