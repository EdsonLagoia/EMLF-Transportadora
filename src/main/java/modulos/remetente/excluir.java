package modulos.remetente;

import classes.Remetente;

public class excluir {
    public void deletar(int id){
        Remetente rem = new Remetente(id);
        rem.excluir();
        System.out.println("Cadastro Excluido com Sucesso");
    }
}
