package main;

import classes.Destinatario;
import classes.Entrega;
import classes.Envio;
import classes.Mercadoria;
import classes.Remetente;

public class main {

    public static void main(String[] args) {
        Remetente rem = new Remetente();
        
        rem.setRemetente("Eduardo");
        rem.setCpfcnpj("123.456.789-10");
        rem.setCep("02468-642");
        rem.setLogradouro("Av. Campos");
        rem.setNumero("30");
        rem.setBairro("Paraíso");
        rem.setEstado("São Paulo");
        rem.setCidade("São Paulo");
        rem.setTelefone("(11)99342-9919");
        rem.setEmail("eduardo@email.com");
        rem.adicionar();
    }
    
}
