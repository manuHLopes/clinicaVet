package atendimento;

import classes.Animal;
import classes.Cliente;
import atendimento.servico.Servico;
import atendimento.servico.TipoServico;

import java.util.Scanner;

public class Atendimento {
    private Scanner scanner = new Scanner(System.in);
    private Cliente cliente;

    public void realizarCadastroCompleto() {
        cliente = new Cliente(); // Inicializar o cliente
        Animal animal = new Animal();
        Servico servico = new Servico();
        TipoServico tipoServico = new TipoServico();

        // Cadastro do Cliente
        System.out.println("Cadastro de Cliente:");
        System.out.print("Nome: ");
        cliente.setNome_cliente(scanner.nextLine());
        System.out.print("Data de nascimento: ");
        cliente.setData_nascimento_cliente(scanner.nextLine());
        System.out.print("Email: ");
        cliente.setEmail(scanner.nextLine());
        System.out.print("CPF: ");
        cliente.setCpf(scanner.nextLine());
        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(scanner.nextLine());

        // Cadastro do Animal
        System.out.println("\nCadastro do Animal:");
        System.out.print("Nome: ");
        animal.setNome_animal(scanner.nextLine());
        System.out.print("Espécie: ");
        animal.setEspecie(scanner.nextLine());
        System.out.print("Raça: ");
        animal.setRaca(scanner.nextLine());
        System.out.print("Data de nascimento: ");
        animal.setData_nascimento_animal(scanner.nextLine());
        System.out.print("Pelagem: ");
        animal.setPelagem(scanner.nextLine());
        System.out.print("Sexo (F ou M): ");
        animal.setSexo(scanner.nextLine().charAt(0));

        // Cadastro do Serviço
        System.out.println("\nCadastro de Serviço:");
        System.out.print("Nome do serviço: ");
        servico.setNome_servico(scanner.nextLine());
        // Supondo que o ID do serviço é gerado automaticamente ou definido em outro lugar
        servico.setId_servico(1);

        // Cadastro do Tipo de Serviço
        tipoServico.cadastrarTipoDeServico();

        System.out.println(cliente.imprimir());
        System.out.println(animal.imprimir());
        System.out.println(servico.imprimir());
        System.out.println(tipoServico.imprimir());
    }

    public Cliente getCliente() {
        return cliente;
    }
}
