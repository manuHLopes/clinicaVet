package atendimento;

import classes.Animal;
import classes.Cliente;

public class Atendimento {
    private int id_atendimento;
    private String data_hora_atendimento;
    private String tipo_atendimento;
    private String status_atendimento;
    private Animal animal;
    private Cliente cliente;

    public Atendimento(){
        this.animal = new Animal();
        this.cliente = new Cliente();
    }

    public int getId_atendimento() {
        return id_atendimento;
    }

    public void setId_atendimento(int id_atendimento) {
        this.id_atendimento = id_atendimento;
    }

    public String getData_hora_atendimento() {
        return data_hora_atendimento;
    }

    public void setData_hora_atendimento(String data_hora_atendimento) {
        this.data_hora_atendimento = data_hora_atendimento;
    }

    public String getTipo_atendimento() {
        return tipo_atendimento;
    }

    public void setTipo_atendimento(String tipo_atendimento) {
        this.tipo_atendimento = tipo_atendimento;
    }

    public String getStatus_atendimento() {
        return status_atendimento;
    }

    public void setStatus_atendimento(String status_atendimento) {
        this.status_atendimento = status_atendimento;
    }

    public String Imprimir(){
        return "Nome do animal: "+ animal.getNome_animal()+", Raça: "+animal.getRaca()+"," +
                " Espécie: "+animal.getEspecie()+"\nData nascimento: "+animal.getData_nascimento_animal()+", " +
                "Sexo (M ou F): "+animal.getSexo()+", Pelagem: "+animal.getPelagem()+",\n" +
                "Peso animal: ESTÁ FALTANDO\n\n" +
                "Data e hora do atendimento: "+data_hora_atendimento+", tipo do atendimento: "+tipo_atendimento+", " +
                "status do atendimento: "+status_atendimento+"\n\n" +
                "Dados do cliente (dono do animal): "+cliente.getNome_cliente()+", email: "+cliente.getEmail()+", " +
                "CPF: "+cliente.getCpf()+", endereço: "+cliente.getEndereco()+", " +
                "data de nascimento: "+cliente.getData_nascimento_cliente()+"\n" +
                "telefone: "+cliente.getTelefone();

    }
}
