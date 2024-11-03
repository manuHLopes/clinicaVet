package atendimento.servico;

import atendimento.Atendimento;

    public class Servico extends Atendimento {
        private int id_servico;
        private String nome_servico;
        private Servico_percentece_TipoServico servico_pertence_tiposervico;

        public Servico(){
            this.servico_pertence_tiposervico = new Servico_percentece_TipoServico();
        }

        public int getId_servico() {
            return id_servico;
        }

        public void setId_servico(int id_servico) {
            this.id_servico = id_servico;
        }

        public String getNome_servico() {
            return nome_servico;
        }

        public void setNome_servico(String nome_servico) {
            this.nome_servico = nome_servico;
        }

        public String Imprimir(){
            return "Nome do servico: "+nome_servico;
        }

        public Servico_percentece_TipoServico getServico_pertence_tiposervico() {
            return servico_pertence_tiposervico;
        }

        public void setServico_pertence_tiposervico(Servico_percentece_TipoServico servico_pertence_tiposervico) {
            this.servico_pertence_tiposervico = servico_pertence_tiposervico;
        }
    }
