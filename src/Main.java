import atendimento.Atendimento;

public class Main {
    public static void main(String[] args) {
        Atendimento atendimento = new Atendimento();
        atendimento.realizarCadastroCompleto(); // Agora inclui todos os cadastros
        System.out.println(atendimento.imprimir());
    }
}
