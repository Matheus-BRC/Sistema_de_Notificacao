public class SMS extends Notification{

    public String getMensagem(){
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Mensagem enviada por SMS!");
        return mensagem.toString();
    };
}
