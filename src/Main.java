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
        System.out.print("Digite seu endereço: : ");
        cliente.setEndereco(leia.nextLine());

        System.out.println("Dados: \n\n"+atendimento.Imprimir());




        leia.close();
    }
}