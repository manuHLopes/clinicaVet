import atendimento.Atendimento;
import classes.Animal;
import classes.Cliente;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Atendimento atendimento = new Atendimento();
        Animal animal = new Animal();
        Cliente cliente = new Cliente();

        //Dados do cliente:

        System.out.print("Digite seu nome: ");
        cliente.setNome_cliente(leia.nextLine());
        System.out.print("Digite seu email: ");
        cliente.setEmail(leia.next());
        System.out.print("Digite seu CPF: ");
        cliente.setCpf(leia.next());
        System.out.print("Digite seu telefone: ");
        cliente.setTelefone(leia.next());
        System.out.print("Digite sua data de nascimento: ");
        cliente.setData_nascimento_cliente(leia.next());
        leia.nextLine();
        System.out.print("Digite seu endereço: : ");
        cliente.setEndereco(leia.nextLine());

        System.out.println("Dados: \n\n"+cliente.Imprimir());

        System.out.println("Agora digite os dados do animal: \n");
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

        System.out.println(animal.Imprimir());

        leia.close();
    }
}