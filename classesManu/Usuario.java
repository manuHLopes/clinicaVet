package classes;

public class Usuario {
    private static int contadorUsuario = 0;
    private String nome_usuario;
    private String cargo;
    private String login;
    private String senha;
    private int id_usuario;
    private int id_funcao; // chave estrangeira

    public Usuario() {
        id_usuario = ++contadorUsuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId_funcao() {
        return id_funcao;
    }

    public void setId_funcao(int id_funcao) {
        this.id_funcao = id_funcao;
    }



    public String imprimir() {
        return "\nid: " + id_usuario + "\nnome: " + nome_usuario + "\ncargo: " + cargo + "\nlogin: "+
                login+ "\nsenha: " + senha + "\nid da função: " + id_funcao;
    }
}
