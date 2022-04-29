package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Destinatario {
    protected int id;
    protected String destinatario;
    protected String cpf;
    protected String cep;
    protected String logradouro;
    protected String numero;
    protected String bairro;
    protected String estado;
    protected String cidade;
    protected String telefone;
    protected String email;
    
    public Destinatario(int id){
        if(id != 0){
            String sql = "SELECT * FROM destinatario WHERE id = ?";
            try{
                Connection con = DB.conexao();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setDestinatario(registro.getString("remetente"));
                    this.setCpf(registro.getString("cpf"));
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
        //return destinatario;
    }
    
    public void adicionar(){
        String sql = "INSERT INTO destinatario(destinatario, cpf, cep, logradouro, numero, bairro, estado, cidade, telefone, email) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1,this.getDestinatario());
            stmt.setString(2,this.getCpf());
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
    
    public static ArrayList<Destinatario> listar(){
        String sql = "SELECT * FROM destinatario";
        ArrayList<Destinatario> destinatario = new ArrayList<>();
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet registros = stmt.executeQuery();

            while(registros.next()){
                Destinatario temp = new Destinatario(0);
                temp.setId(registros.getInt("id"));
                temp.setDestinatario(registros.getString("destinatario"));
                temp.setCpf(registros.getString("cpf"));
                temp.setCep(registros.getString("cep"));
                temp.setLogradouro(registros.getString("logradouro"));
                temp.setNumero(registros.getString("numero"));
                temp.setBairro(registros.getString("bairro"));
                temp.setEstado(registros.getString("estado"));
                temp.setCidade(registros.getString("cidade"));
                temp.setTelefone(registros.getString("telefone"));
                temp.setEmail(registros.getString("email"));
                destinatario.add(temp);
            }
        } catch(SQLException e) {
            System.out.println("Erro ao Listar: " + e.toString());
        }
        
        return destinatario;
    }
    
    public void atualizar(){
        String sql = "UPDATE destinatario SET destinatario = ?, cpf = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, estado = ?, cidade = ?, telefone = ?, email = ? WHERE id = ?";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1,this.getDestinatario());
            stmt.setString(2,this.getCpf());
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
        String sql = "DELETE FROM destinatario WHERE id = ?";
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
    
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
