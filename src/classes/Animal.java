package classes;

public class Animal {
    private String raca;
    private String nome_animal;
    private String especie;
    private String data_nascimento_animal;
    private String pelagem;
    private char sexo;
    // double peso_animal; acho que isso aqui fica melhor no prontuário


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getData_nascimento_animal() {
        return data_nascimento_animal;
    }

    public void setData_nascimento_animal(String data_nascimento_animal) {
        this.data_nascimento_animal = data_nascimento_animal;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public String Imprimir(){
        return "Dados do animal: \n\n" +
                "Nome: "+nome_animal+"\nEspécie: "+especie+"\nRaça: "+raca+"\n" +
                "Data nascimento: "+data_nascimento_animal+"\nPelagem: "+pelagem+"\n" +
                "Sexo (F ou M): "+sexo;
    }

}
