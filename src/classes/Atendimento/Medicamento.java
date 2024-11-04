package classes.Atendimento;

public class Medicamento {
    private int idMedicamento;
    private String nomeMedicamento;
    private String receita;

    public Medicamento(int idMedicamento, String nomeMedicamento, String receita){
        this.idMedicamento = idMedicamento;
        this.nomeMedicamento = nomeMedicamento;
        this.receita = receita;
    }
    public int getIdMedicamento() {
        return idMedicamento;
    }
    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    public String getNomeMedicamento() {
        return nomeMedicamento;
    }
    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }
    public String getReceita() {
        return receita;
    }
    public void setReceita(String receita) {
        this.receita = receita;
    }
    public String detalhesMedicamento(){
        return "Detalhes do medicamento: \n ID: " + idMedicamento + "\nNome do medicamento: " + nomeMedicamento + "\nReceita: " + receita; 
    }
    
}
