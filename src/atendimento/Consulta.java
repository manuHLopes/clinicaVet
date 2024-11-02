package atendimento;

public class Consulta extends Atendimento{
    private int id_consulta;
    private int data_consulta;
    private String hora_consulta;

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public int getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(int data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getHora_consulta() {
        return hora_consulta;
    }

    public void setHora_consulta(String hora_consulta) {
        this.hora_consulta = hora_consulta;
    }
}
