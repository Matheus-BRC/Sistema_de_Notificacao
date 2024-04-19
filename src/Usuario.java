import java.util.ArrayList;

public class Usuario {
    private ArrayList<Notification> notificacao = new ArrayList<>();
    private String nome;
    private String email;
    private String telefone;

    public Usuario(String nome, String email, String telefone, boolean emailNotification, boolean smsNotification, boolean appNotification) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        cadastrarPreferencias(emailNotification, smsNotification, appNotification);
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    private void cadastrarPreferencias(boolean emailNotification, boolean smsNotification, boolean appNotification){
        if(emailNotification) notificacao.add(new Email());
        if(smsNotification) notificacao.add(new SMS());
        if(appNotification) notificacao.add(new AppMessage());
    }

    public String getMensagem(){
        StringBuilder mensagem = new StringBuilder();
        for(Notification notification : notificacao){
            mensagem.append(notification.getMensagem()).append("\n");
        }
        return mensagem.toString();
    }

}
