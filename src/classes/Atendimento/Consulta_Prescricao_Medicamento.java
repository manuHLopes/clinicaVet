package classes.Atendimento;

public class Consulta_Prescricao_Medicamento {
    private Consulta consulta;
    private Medicamento medicamento;

    public Consulta_Prescricao_Medicamento(Consulta consulta, Medicamento medicamento){
        this.consulta = consulta;
        this.medicamento = medicamento;
    }

    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public Medicamento getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public String detalhesPrescricao(){
        return "Detalhes da Prescrição:\n" + consulta.destalhesConsulta() + "\n" + medicamento.detalhesMedicamento();
    }
}
