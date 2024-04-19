public class Email extends Notification{

    public String getMensagem(){
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Mensagem enviada por E-mail!");
        return mensagem.toString();
    };
}
