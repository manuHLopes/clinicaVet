package classes;

public class teste {
    public static void main(String[] args){

        /*
        // primeiramente estabelecemos nossas duas funções de acesso
        Funcao medico = new Funcao("Médico"); // id = 1
        Funcao recepcionista = new Funcao("Recepcionista"); // id = 2

        medico.adicionar_usuario();
        recepcionista.adicionar_usuario();

        if(!recepcionista.usuarios.isEmpty()){
            recepcionista.imprimir_usuarios();
        }
        //

         */

        Pagamento p = new Pagamento();
        p.pagar();
        p.imprimir_pagamento();

        /*
        Cliente manu = new Cliente();
        manu.cadastrar_cliente(manu);
        manu.adicionar_animal();
        manu.exibir_cliente();
        if(manu.tem_pets()) manu.exibe_pets();
        manu.remover_animal();
        if(manu.tem_pets()) manu.exibe_pets();
        */

    }
}
