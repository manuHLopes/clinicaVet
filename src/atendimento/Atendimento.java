package atendimento;

import atendimento.servico.Servico;
import classes.Animal;
import classes.Cliente;
import java.util.Scanner;

public class Atendimento {
    private int id_atendimento;
    private String data_hora_atendimento;
    private String tipo_atendimento;
    private String status_atendimento;
    private Animal animal;
    private Cliente cliente;
    private Servico servico;

    public Atendimento() {
        this.animal = new Animal();
        this.cliente = new Cliente();
        this.servico = new Servico();
    }

    public void cadastrarCliente() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        cliente.setNome_cliente(leia.nextLine());
        System.out.print("Digite seu email: ");
        cliente.setEmail(leia.nextLine());
        System.out.print("Digite seu CPF: ");
        cliente.setCpf(leia.nextLine());
        System.out.print("Digite seu telefone: ");
        cliente.setTelefone(leia.nextLine());
        System.out.print("Digite sua data de nascimento: ");
        cliente.setData_nascimento_cliente(leia.nextLine());
        System.out.print("Digite seu endereço: ");
        cliente.setEndereco(leia.nextLine());
    }

    public void cadastrarAnimal() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Nome: ");
        animal.setNome_animal(leia.nextLine());
        System.out.print("Espécie: ");
        animal.setEspecie(leia.nextLine());
        System.out.print("Raça: ");
        animal.setRaca(leia.nextLine());
        System.out.print("Data de nascimento: ");
        animal.setData_nascimento_animal(leia.nextLine());
        System.out.print("Pelagem: ");
        animal.setPelagem(leia.nextLine());
        System.out.print("Sexo: ");
        animal.setSexo(leia.next().charAt(0));
        leia.nextLine(); // Consome a nova linha
    }

    public void cadastrarServico() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do serviço: ");
        servico.setNome_servico(leia.nextLine());
    }

    public void cadastrarAtendimento() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a data e hora do atendimento: ");
        this.data_hora_atendimento = leia.nextLine();
        System.out.print("Digite o tipo de atendimento: ");
        this.tipo_atendimento = leia.nextLine();
        System.out.print("Digite o status do atendimento: ");
        this.status_atendimento = leia.nextLine();
    }

    public void realizarCadastroCompleto() {
        cadastrarCliente();
        cadastrarAnimal();
        cadastrarServico();
        cadastrarAtendimento();
    }

    public String imprimir() {
        return "Data e hora do atendimento: " + data_hora_atendimento +
                ", Tipo do atendimento: " + tipo_atendimento +
                ", Status do atendimento: " + status_atendimento +
                ", Cliente: " + cliente.getNome_cliente() +
                ", Animal: " + animal.getNome_animal() +
                ", Serviço: " + servico.getNome_servico();
    }

}
