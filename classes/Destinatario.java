package classes;

public class Destinatario {
    public String destinatario;
    public String cpf;
    public String cep;
    public String logradouro;
    public String numero;
    public String bairro;
    public String estado;
    public String cidade;
    public String telefone;
    public String email;
    
    public void addDestinatario(String destinatario, String cpf, String cep, String logradouro,
            String numero, String bairro, String estado, String cidade, String telefone, String email){
        this.destinatario = destinatario;
        this.cpf = cpf;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void delDestinatario(){
        this.destinatario = "";
        this.cpf = "";
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
