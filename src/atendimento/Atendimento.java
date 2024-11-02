package atendimento;

public class Atendimento {
    private int id_atendimento;
    private String data_hora_atendimento;
    private String tipo_atendimento;
    private String status_atendimento;

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
}
