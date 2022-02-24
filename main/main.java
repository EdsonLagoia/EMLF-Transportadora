package main;

import classes.Destinatario;
import classes.Entrega;
import classes.Envio;
import classes.Mercadoria;
import classes.Remetente;

public class main {

    public static void main(String[] args) {
        Remetente rem1 = new Remetente();
        Remetente rem2 = new Remetente();
        Remetente rem3 = new Remetente();
        
        rem1.remetente = "Eduardo";
        rem1.cpfcnpj = "123.456.789-10";
        rem1.cep = "02468-642";
        rem1.logradouro = "Av. Campos";
        rem1.numero = "30";
        rem1.bairro = "Paraíso";
        rem1.estado = "São Paulo";
        rem1.cidade = "São Paulo";
        rem1.telefone = "(11)99342-9919";
        rem1.email = "eduardo@email.com";
        
        rem2.remetente = "AirGuns";
        rem2.cpfcnpj = "12.345.678/0000-01";
        rem2.cep = "55255-444";
        rem2.logradouro = "Travessa Bela Vista";
        rem2.numero = "1456";
        rem2.bairro = "Horizonte";
        rem2.estado = "Curitiba";
        rem2.cidade = "Paraná";
        rem2.telefone = "(46)98413-0024";
        rem2.email = "contato@airguns.com";
        
        rem3.remetente = "NumisCoin";
        rem3.cpfcnpj = "58.956.000/0458-51";
        rem3.cep = "68903-430";
        rem3.logradouro = "Avenida Professor Caramuru";
        rem3.numero = "358";
        rem3.bairro = "Zerão";
        rem3.estado = "Amapá";
        rem3.cidade = "Macapá";
        rem3.telefone = "(96)98142-5060";
        rem3.email = "moedas@NumisCoin.com";
        
        Mercadoria merc1 = new Mercadoria();
        Mercadoria merc2 = new Mercadoria();
        Mercadoria merc3 = new Mercadoria();
        
        merc1.remetente = 1;
        merc1.mercadoria = "Espelho";
        merc1.dimensao = "120cm x 40cm x 2.5cm";
        merc1.peso = 0.6;
        merc1.fragil = true;
        
        merc2.remetente = 2;
        merc2.mercadoria = "M4 Mechanical Shock";
        merc2.dimensao = "60cm x 20cm x 5cm";
        merc2.peso = 3.0;
        merc2.fragil = false;
        
        merc3.remetente = 3;
        merc3.mercadoria = "300 Reis FC";
        merc3.dimensao = "50mm x 50mm x 2mm";
        merc3.peso = 0.1;
        merc3.fragil = false;
        
        Destinatario dest1 = new Destinatario();
        Destinatario dest2 = new Destinatario();
        Destinatario dest3 = new Destinatario();
        
        dest1.destinatario = "Estevão";
        dest1.cpf = "325.448.765-11";
        dest1.cep = "12345-678";
        dest1.logradouro = "Avenida Sete";
        dest1.numero = "324";
        dest1.bairro = "Centro";
        dest1.estado = "Distrito Federal";
        dest1.cidade = "Brasília";
        dest1.telefone = "(61)99847-7454";
        dest1.email = "estevao@email.net";
        
        dest2.destinatario = "Carlos";
        dest2.cpf = "234.234.234-01";
        dest2.cep = "45124-456";
        dest2.logradouro = "Rodovia Bahia";
        dest2.numero = "4345";
        dest2.bairro = "Centro";
        dest2.estado = "Roraima";
        dest2.cidade = "Boa Vista";
        dest2.telefone = "(95)98578-5612";
        dest2.email = "carlos@email.com";
        
        dest3.destinatario = "Fernando";
        dest3.cpf = "753.159.852-51";
        dest3.cep = "65742-645";
        dest3.logradouro = "Travessa Amazonas";
        dest3.numero = "22-b";
        dest3.bairro = "Centro";
        dest3.estado = "Acre";
        dest3.cidade = "Rio Branco";
        dest3.telefone = "(68)95648-3574";
        dest3.email = "fernando@email.com";
        
        Envio env1 = new Envio();
        Envio env2 = new Envio();
        Envio env3 = new Envio();
        
        env1.remetente = 1;
        env1.mercadoria = 1;
        env1.destinatario = 1;
        env1.tipoEnvio = "Normal";
        env1.frete = 18.3;
        
        env2.remetente = 2;
        env2.mercadoria = 2;
        env2.destinatario = 2;
        env2.tipoEnvio = "Expresso";
        env2.frete = 52.98;
        
        env3.remetente = 3;
        env3.mercadoria = 3;
        env3.destinatario = 3;
        env3.tipoEnvio = "Expresso";
        env3.frete = 27.8;
        
        Entrega ent1 = new Entrega();
        Entrega ent2 = new Entrega();
        Entrega ent3 = new Entrega();
        
        ent1.envio = 1;
        ent1.statusEnvio = "Chegou na unidade de destino";
        ent1.formaEntrega = "Terrestre";
        ent1.entregador = "Robson";
        ent1.tempo = "25 dias";
        
        ent2.envio = 2;
        ent2.statusEnvio = "Entregue";
        ent2.formaEntrega = "Aérea";
        ent2.entregador = "Anderson";
        ent2.tempo = "10 dias";
        
        ent3.envio = 3;
        ent3.statusEnvio = "Postado";
        ent3.formaEntrega = "Fluvial";
        ent3.entregador = "André";
        ent3.tempo = "7 dias";
    }
    
}
