package classes;

public class teste {
    public static void main(String[] args){
        Cliente manu = new Cliente();
        manu.cadastrar_cliente(manu);
        manu.adicionar_animal();
        manu.exibir_cliente();
        if(manu.tem_pets()) manu.exibe_pets();
        manu.remover_animal();
        if(manu.tem_pets()) manu.exibe_pets();
    }
}
