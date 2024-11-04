package classes.Atendimento;

public class Consulta_Solicita_Exame {
    private Consulta consulta;
    private Exame exame;

    //Construtor
        public Consulta_Solicita_Exame(Consulta consulta, Exame exame){
        this.consulta = consulta;
        this.exame = exame;
    }
    
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public Exame getExame() {
        return exame;
    }
    public void setExame(Exame exame) {
        this.exame = exame;
    }

    //Método de impressao
    public String detalhesDaAssociacao(){
        return "Detalhes da solicitação: \n" + consulta.destalhesConsulta() + "\n" + exame.detalhesExame();
    }
    
}
