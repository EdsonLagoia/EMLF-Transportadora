package modulos.remetente;

import classes.Remetente;
import java.util.ArrayList;

public class listar {
    public void lista(){
        ArrayList<Remetente> remetentes = Remetente.listar();
        
        for(Remetente remlist:remetentes){
            int id = remlist.getId();
            String remetente = remlist.getRemetente();
            String cpfcnpj = remlist.getCpfcnpj();
            String cep = remlist.getCep();
            String logradouro = remlist.getLogradouro();
            String numero = remlist.getNumero();
            String bairro = remlist.getBairro();
            String estado = remlist.getEstado();
            String cidade = remlist.getCidade();
            String telefone = remlist.getTelefone();
            String email = remlist.getEmail();
            
            System.out.println(
                    "________________________________________________________________________" +
                    "\nID: " + id +
                    "\nRemetente: " + remetente +
                    "\nCPF/CNPJ: " + cpfcnpj +
                    "\nEndereço: " + logradouro + ", " + numero + " - " + bairro + 
                    "\n          " + cidade + "-" + estado + ", " + cep +
                    "\nTelefone: " + telefone +
                    "\nEmail: " + email +
                    "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n"
            );
        }
    }
}
