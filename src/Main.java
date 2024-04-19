public class Main {
    public static void main(String[] args) {

        Usuario matheus = new Usuario("Matheus", "matheusLindo@gmail.com", "97070-7070", true, true, true);
        Usuario alice = new Usuario("Alice", "aliceLinda@gmail.com", "97070-7070", false, true, true);
        Usuario lisa = new Usuario("Lisa", "lisaLinda@gmail.com", "97070-7070", true, true, false);

        System.out.println("Usuário: " + matheus.getNome());
        System.out.println(matheus.getMensagem());

        System.out.println("Usuário: " + alice.getNome());
        System.out.println(alice.getMensagem());

        System.out.println("Usuário: " + lisa.getNome());
        System.out.println(lisa.getMensagem());
    }
}