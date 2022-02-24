package classes;

public class Remetente {
    public String remetente;
    public String cpfcnpj;
    public String cep;
    public String logradouro;
    public String numero;
    public String bairro;
    public String estado;
    public String cidade;
    public String telefone;
    public String email;
    
    public void addRemetente(String remetente, String cpfcnpj, String cep, String logradouro,
            String numero, String bairro, String estado, String cidade, String telefone, String email){
        this.remetente = remetente;
        this.cpfcnpj = cpfcnpj;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void delRemetente(){
        this.remetente = "";
        this.cpfcnpj = "";
        this.cep = "";
        this.logradouro = "";
        this.numero = "";
        this.bairro = "";
        this.estado = "";
        this.cidade = "";
        this.telefone = "";
        this.email = "";
    }
}
