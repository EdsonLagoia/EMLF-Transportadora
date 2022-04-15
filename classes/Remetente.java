package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Remetente {
    protected String remetente;
    protected String cpfcnpj;
    protected String cep;
    protected String logradouro;
    protected String numero;
    protected String bairro;
    protected String estado;
    protected String cidade;
    protected String telefone;
    protected String email;
    
    public void adicionar(){
        String sql = "INSERT INTO remetente(remetente, cpfcnpj, cep, logradouro, numero, bairro, estado, cidade, telefone, email) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1,this.getRemetente());
            stmt.setString(2,this.getCpfcnpj());
            stmt.setString(3,this.getCep());
            stmt.setString(4,this.getLogradouro());
            stmt.setString(5,this.getNumero());
            stmt.setString(6,this.getBairro());
            stmt.setString(7,this.getEstado());
            stmt.setString(8,this.getCidade());
            stmt.setString(9,this.getTelefone());
            stmt.setString(10,this.getEmail());
            stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao Adicionar o Remetente: " + e.toString());
        }
    }
    
    public static void listar(){}
    
    public void atualizar(){}
    
    public void excluir(){}

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
