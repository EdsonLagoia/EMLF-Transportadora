package main;

import modulos.remetente.adicionar;
import modulos.remetente.listar;
import modulos.remetente.atualizar;
import modulos.remetente.excluir;

public class main {
    public static void main(String[] args) {
        // Adicionar
        adicionar remadc = new adicionar();
        //remadc.novo("Eduardo","123.456.789-10","02468-642","Avenida Campos","30","Paraíso","São Paulo","SP","(11)99342-9919","eduardo@email.com");
        //remadc.novo("AirGuns", "12.345.678/0000-01", "55255-444", "Travessa Bela Vista", "1456", "Horizonte", "Curitiba", "PR", "(46)98413-0024", "contato@airguns.com");
        //remadc.novo("NumisCoin", "58.956.000/0458-51", "68903-430", "Avenida Professor Caramuru", "358", "Zerão", "Macapá", "AP", "(96)98142-5060", "moedas@NumisCoin.com");
        
        // Atualizar
        atualizar rematu = new atualizar();
        //rematu.modificar(1,"Eduardo","123.456.789-10","02468-642","Avenida Campos","30","Paraíso","São Paulo","SP","(11)99342-9919","eduardo@email.com");
        
        // Listar
        listar remlist = new listar();
        remlist.lista();        
        
        // Deletar
        excluir remdel = new excluir();
        //remdel.deletar(4);
    }

}
