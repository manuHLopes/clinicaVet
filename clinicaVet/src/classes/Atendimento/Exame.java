package classes.Atendimento;

public class Exame {
    private int id_exame;
    private String nome_exame;
    private String descricao_exame;
    
    //Construtores 
    public Exame(){

    }

    public Exame(int id_exame, String nome_exame, String descricao_exame, Consulta consulta){
        this.id_exame = id_exame;
        this.nome_exame = nome_exame;
        this.descricao_exame = descricao_exame;
    }
    //Getters and Setters dos atributos
    public int getId_exame() {
        return id_exame;
    }
    public void setId_exame(int id_exame) {
        this.id_exame = id_exame;
    }    
    public String getNome_exame() {
        return nome_exame;
    }
    public void setNome_exame(String nome_exame) {
        this.nome_exame = nome_exame;
    }
    public String getDescricao_exame() {
        return descricao_exame;
    }
    public void setDescricao_exame(String descricao_exame) {
        this.descricao_exame = descricao_exame;
    }
    
    public String imprimir2(){
        return "ID do Exame: " + id_exame + "\nNome do Exame: " + nome_exame + "\nDescrição do Exame: " + descricao_exame;
    }

    
}
