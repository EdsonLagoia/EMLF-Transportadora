package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Remetente {
    protected int id;
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
    
    public Remetente(int id){
        if(id != 0){
            String sql = "SELECT * FROM remetente WHERE id = ?";
            try{
                Connection con = DB.conexao();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setRemetente(registro.getString("remetente"));
                    this.setCpfcnpj(registro.getString("cpfcnpj"));
                    this.setCep(registro.getString("cep"));
                    this.setLogradouro(registro.getString("logradouro"));
                    this.setNumero(registro.getString("numero"));
                    this.setBairro(registro.getString("bairro"));
                    this.setEstado(registro.getString("estado"));
                    this.setCidade(registro.getString("cidade"));
                    this.setTelefone(registro.getString("telefone"));
                    this.setEmail(registro.getString("email"));
                }
            }catch(SQLException e){
                System.out.println("Erro ao Consultar: " + e.toString());
            }
        }
        //return remetente;
    }
    
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
            System.out.println("Erro ao Adicionar: " + e.toString());
        }
    }
    
    public static ArrayList<Remetente> listar(){
        String sql = "SELECT * FROM remetente";
        ArrayList<Remetente> remetente = new ArrayList<>();
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet registros = stmt.executeQuery();

            while(registros.next()){
                Remetente temp = new Remetente(0);
                temp.setId(registros.getInt("id"));
                temp.setRemetente(registros.getString("remetente"));
                temp.setCpfcnpj(registros.getString("cpfcnpj"));
                temp.setCep(registros.getString("cep"));
                temp.setLogradouro(registros.getString("logradouro"));
                temp.setNumero(registros.getString("numero"));
                temp.setBairro(registros.getString("bairro"));
                temp.setEstado(registros.getString("estado"));
                temp.setCidade(registros.getString("cidade"));
                temp.setTelefone(registros.getString("telefone"));
                temp.setEmail(registros.getString("email"));
                remetente.add(temp);
            }
        } catch(SQLException e) {
            System.out.println("Erro ao Listar: " + e.toString());
        }
        
        return remetente;
    }
    
    public void atualizar(){
        String sql = "UPDATE remetente SET remetente = ?, cpfcnpj = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, estado = ?, cidade = ?, telefone = ?, email = ? WHERE id = ?";
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
            stmt.setInt(11,this.getId());
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro ao Atualizar: " + e.toString());
        }
    }
    
    public void excluir(){
        String sql = "DELETE FROM remetente WHERE id = ?";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, this.getId());
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro ao excluir: " + e.toString());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
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
