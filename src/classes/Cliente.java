package classes;

public class Cliente {
    private String data_nascimento_cliente;
    private String telefone;
    private String endereco;
    private String cpf;
    private String email;
    private String nome_cliente;

    public String getData_nascimento_cliente() {
        return data_nascimento_cliente;
    }

    public void setData_nascimento_cliente(String data_nascimento_cliente) {
        this.data_nascimento_cliente = data_nascimento_cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String imprimir() {
        return "Dados do cliente:\n\n" +
                "Nome: " + nome_cliente + "\nData de nascimento: " + data_nascimento_cliente + "\nEmail: " + email + "\n" +
                "CPF: " + cpf + "\nTelefone: " + telefone + "\nEndereço: " + endereco + "\n\n";
    }
}
