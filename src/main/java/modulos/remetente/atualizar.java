package modulos.remetente;

import classes.Remetente;

public class atualizar {
    public void modificar(int id, String remetente, String cpfcnpj, String cep, String logradouro, String numero,
                    String bairro, String cidade, String estado, String telefone, String email){        
        Remetente rem = new Remetente(id);
        
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
        rem.atualizar();
        
        System.out.println("Cadastro atualizado com Sucesso");
    }
}
