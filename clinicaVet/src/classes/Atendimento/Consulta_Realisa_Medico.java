package classes.Atendimento;

public class Consulta_Realisa_Medico {
    private double temp_Animal;
    private String observacoes_Prontuario;
    private double peso_Animal;
    private String data_Criacao_Prontuario;
    private String diagnostico;
    private Consulta id_consulta;
    private Medico id_medico;

    public double getTemp_Animal() {
        return temp_Animal;
    }
    public void setTemp_Animal(double temp_Animal) {
        this.temp_Animal = temp_Animal;
    }
    public String getObservacoes_Prontuario() {
        return observacoes_Prontuario;
    }
    public void setObservacoes_Prontuario(String observacoes_Prontuario) {
        this.observacoes_Prontuario = observacoes_Prontuario;
    }
    public double getPeso_Animal() {
        return peso_Animal;
    }
    public void setPeso_Animal(double peso_Animal) {
        this.peso_Animal = peso_Animal;
    }
    public String getData_Criacao_Prontuario() {
        return data_Criacao_Prontuario;
    }
    public void setData_Criacao_Prontuario(String data_Criacao_Prontuario) {
        this.data_Criacao_Prontuario = data_Criacao_Prontuario;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public Consulta getId_consulta() {
        return id_consulta;
    }
    public void setId_consulta(Consulta consulta) {
        this.id_consulta = consulta;
    }
    public Medico getId_medico() {
        return id_medico;
    }
    public void setId_medico(Medico medico) {
        this.id_medico = medico;
    }
    public String imprimir3(){
        return "PRONTUÁRIO:\nTemperatura do animal:" + temp_Animal + "\nObservações: " + observacoes_Prontuario + "\nPeso do animal: " + peso_Animal + "\nData de criação do prontuário: " + data_Criacao_Prontuario + "\nDetalhes do diagnóstico: " + diagnostico + "\nInformações: " + id_consulta.imprimir() + id_medico.imprimir4();
    }
    
}
