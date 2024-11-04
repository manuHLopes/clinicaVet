package classes.Atendimento;

public class Medico {
    private int id_medico;
    private String nome_medico;
    private String crmv;
    private String telefone_medico;
    private String especialidade;
    private String rqe;

public Medico(int id_medico,  String nome_medico, String crmv, String telefone_medico, String especialidade, String rqe){
    this.id_medico = id_medico;
    this.nome_medico = nome_medico;
    this.crmv = crmv;
    this.telefone_medico = telefone_medico;
    this.especialidade = especialidade;
    this.rqe = rqe;
}

    public int getId_medico() {
        return id_medico;
    }
    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }
    public String getNome_medico() {
        return nome_medico;
    }
    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }
    public String getCrmv() {
        return crmv;
    }
    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    public String getTelefone_medico() {
        return telefone_medico;
    }
    public void setTelefone_medico(String telefone_medico) {
        this.telefone_medico = telefone_medico;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getRqe() {
        return rqe;
    }
    public void setRqe(String rqe) {
        this.rqe = rqe;
    }

    public String detalhesMedico(){
        return "Id: " + id_medico + "\nNome do médico responsável: " + nome_medico + "\nCRMV: " + crmv + "\nTelefone: " + telefone_medico + "\nEspecialidade: " + especialidade + " RQE: " + rqe;
    }
    
}
