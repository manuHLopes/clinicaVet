package classes;

public class Cartao {
    private String titular;
    private String num_cartao;
    private String tipo_cartao;
    private String validade_cartao;
    private int cvv;
    private int qtd_parcelas;
    private int id_cartao;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNum_cartao() {
        return num_cartao;
    }

    public void setNum_cartao(String num_cartao) {
        this.num_cartao = num_cartao;
    }

    public String getTipo_cartao() {
        return tipo_cartao;
    }

    public void setTipo_cartao(String tipo_cartao) {
        this.tipo_cartao = tipo_cartao;
    }

    public String getValidade_cartao() {
        return validade_cartao;
    }

    public void setValidade_cartao(String validade_cartao) {
        this.validade_cartao = validade_cartao;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(int qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }

    public int getId_cartao() {
        return id_cartao;
    }

    public void setId_cartao(int id_cartao) {
        this.id_cartao = id_cartao;
    }
}
