package atendimento.servico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TipoServico {
    private int id_tipo_servico;
    private String descricao_servico;
    private String nome_tipo_servico;
    private double valor_servico;

    public TipoServico() {
    }

    public TipoServico(String descricao_servico, String nome_tipo_servico, double valor_servico) {
        this.descricao_servico = descricao_servico;
        this.nome_tipo_servico = nome_tipo_servico;
        this.valor_servico = valor_servico;
    }

    public int getId_tipo_servico() {
        return id_tipo_servico;
    }

    public void setId_tipo_servico(int id_tipo_servico) {
        this.id_tipo_servico = id_tipo_servico;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public String getNome_tipo_servico() {
        return nome_tipo_servico;
    }

    public void setNome_tipo_servico(String nome_tipo_servico) {
        this.nome_tipo_servico = nome_tipo_servico;
    }

    public double getValor_servico() {
        return valor_servico;
    }

    public void setValor_servico(double valor_servico) {
        this.valor_servico = valor_servico;
    }

    public void cadastrarTipoDeServico() {
        Scanner leia = new Scanner(System.in);
        try {
            System.out.print("Nome do serviço: ");
            nome_tipo_servico = leia.nextLine();
            System.out.print("Descrição do serviço: ");
            descricao_servico = leia.nextLine();
            System.out.print("Valor do serviço: ");
            valor_servico = leia.nextDouble();
            leia.nextLine(); // Limpa o buffer
        } catch (InputMismatchException e) {
            System.out.println("Erro: valor inválido. Tente novamente.");
            leia.nextLine();
            cadastrarTipoDeServico();
        }
    }

    public String imprimir() {
        return "Dados do serviço:\n" +
                "Nome do serviço: " + nome_tipo_servico +
                "\nDescrição: " + descricao_servico +
                "\nValor do serviço: " + valor_servico;
    }
}
