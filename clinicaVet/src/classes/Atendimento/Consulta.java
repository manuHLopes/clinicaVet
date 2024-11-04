package classes.Atendimento;

public class Consulta { 
    private int id_consulta;
    private String data_hora_consulta;
    private double valor_consulta;

    //construtor
    public Consulta(int id_consulta, String data_hora_consulta, double valor_consulta){
        this.id_consulta = id_consulta;
        this.data_hora_consulta = data_hora_consulta;
        this.valor_consulta = valor_consulta;
    }

    //métodos de acesso
    public int getId_consulta() {
        return id_consulta;
    }
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }    
    public String getData_hora_consulta() {
        return data_hora_consulta;
    }
    public void setData_hora_consulta(String dataHoraConsulta) {
        this.data_hora_consulta = dataHoraConsulta;
    }
    public Double getValor_consulta() {
        return valor_consulta;
    }
    public void setValor_consulta(Double valorConsulta) {
        this.valor_consulta = valorConsulta;
    }
    public String destalhesConsulta(){
        return "Data e Hora: " + data_hora_consulta + ", " + "\nValor: R$" + valor_consulta;
    }
}
