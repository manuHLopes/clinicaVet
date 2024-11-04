package classes.Atendimento;

public class Consulta_Realisa_Medico {
    private double temp_Animal;
    private String observacoes_Prontuario;
    private double peso_Animal;
    private String data_Criacao_Prontuario;
    private String diagnostico;
    private Consulta consulta;
    private Medico medico;

public Consulta_Realisa_Medico(double temp_Animal, String observacoes_Prontuario, double peso_Animal, String data_Criacao_Prontuario, String diagnostico, Consulta consulta, Medico medico){
    this.temp_Animal = temp_Animal;
    this.observacoes_Prontuario = observacoes_Prontuario;
    this.peso_Animal = peso_Animal;
    this.data_Criacao_Prontuario = data_Criacao_Prontuario;
    this.diagnostico = diagnostico;
    this.consulta = consulta;
    this.medico = medico;
}


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
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public String detalhesProntuario(){
        return "PRONTUÁRIO:\nTemperatura do animal:" + temp_Animal + "\nObservações: " + observacoes_Prontuario + "\nPeso do animal: " + peso_Animal + "\nData de criação do prontuário: " + data_Criacao_Prontuario + "\nDetalhes do diagnóstico: " + diagnostico + "\nInformações: " + consulta.destalhesConsulta() + medico.detalhesMedico();
    }
    
}
