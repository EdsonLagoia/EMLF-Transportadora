package modulos.remetente;

import classes.Remetente;

public class adicionar {
    public void novo(String remetente, String cpfcnpj, String cep, String logradouro, String numero,
                    String bairro, String cidade, String estado, String telefone, String email){
        Remetente rem = new Remetente(0);
        
        rem.setRemetente(remetente);
        rem.setCpfcnpj(cpfcnpj);
        rem.setCep(cep);
        rem.setLogradouro(logradouro);
        rem.setNumero(numero);
        rem.setBairro(bairro);
        rem.setCidade(cidade);
        rem.setEstado(estado);
        rem.setTelefone(telefone);
        rem.setEmail(email);
        rem.adicionar();
        System.out.println("Cadastro realizado com Sucesso");
    }
}
