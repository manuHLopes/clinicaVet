package atendimento.servico;

public class Servico_percentece_TipoServico {
    private double valor_total;
    private int id_servico;
    private Servico servico;
    private TipoServico tiposervico;

    public Servico_percentece_TipoServico(double valor_total, Servico servico, TipoServico tiposervico){
        this.valor_total = valor_total; //CONSTRUTOR
        this.servico = servico;
        this.tiposervico = tiposervico;
    }

    //DEPOIS QUANDO JUNTAR COLOCAR AS CHAVES ESTRANGEIRAS DA TABELA USUARIO E ANIMAL

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public TipoServico getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(TipoServico tiposervico) {
        this.tiposervico = tiposervico;
    }
}
