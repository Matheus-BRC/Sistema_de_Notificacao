public class AppMessage extends Notification{

    public String getMensagem(){
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Mensagem enviada por App de Mensagem!");
        return mensagem.toString();
    };
}
