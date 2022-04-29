package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Entrega {
    protected int id;
    protected int envio;
    protected int statusEnvio;
    protected int formaEntrega;
    protected String entregador;
    protected String tempo;

    public Entrega(int id){
        if(id > 0){
            String sql = "SELECT * FROM entrega WHERE id = ?";
            try{
                Connection con = DB.conexao();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setEnvio(registro.getInt("envio"));
                    this.setStatusEnvio(registro.getInt("status_envio"));
                    this.setFormaEntrega(registro.getInt("forma_entrega"));
                    this.setEntregador(registro.getString("entregador"));
                    this.setTempo(registro.getString("tempo"));
                }
            }catch(SQLException e){
                System.out.println("Erro ao Consultar: " + e.toString());
            }
        }
        //return entrega;
    }
    
    public void adicionar(){
        String sql = "INSERT INTO entrega(id_envio, status_envio, forma_entrega, entregador, tempo) VALUES (?,?,?,?,?)";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,this.getEnvio());
            stmt.setInt(2,this.getStatusEnvio());
            stmt.setInt(3,this.getFormaEntrega());
            stmt.setString(4,this.getEntregador());
            stmt.setString(5,this.getTempo());
            stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao Adicionar: " + e.toString());
        }
    }
    
    public static ArrayList<Entrega> listar(){
        String sql = "SELECT * FROM entrega";
        ArrayList<Entrega> entrega = new ArrayList<>();
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet registros = stmt.executeQuery();

            while(registros.next()){
                Entrega temp = new Entrega(0);
                temp.setId(registros.getInt("id"));
                temp.setEnvio(registros.getInt("id_envio"));
                temp.setStatusEnvio(registros.getInt("status_envio"));
                temp.setFormaEntrega(registros.getInt("forma_entrega"));
                temp.setEntregador(registros.getString("entregador"));
                temp.setTempo(registros.getString("tempo"));
            }
        } catch(SQLException e) {
            System.out.println("Erro ao Listar: " + e.toString());
        }
        
        return entrega;
    }
    
    public void atualizar(){
        String sql = "UPDATE entrega SET id_envio = ?, status_envio = ?, forma_entrega = ?, entregador = ?, tempo = ? WHERE id = ?";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,this.getEnvio());
            stmt.setInt(2,this.getStatusEnvio());
            stmt.setInt(3,this.getFormaEntrega());
            stmt.setString(4,this.getEntregador());
            stmt.setString(5,this.getTempo());
            stmt.setInt(6,this.getId());
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro ao Atualizar: " + e.toString());
        }
    }
    
    public void excluir(){
        String sql = "DELETE FROM entrega WHERE id = ?";
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

    public int getEnvio() {
        return envio;
    }

    public void setEnvio(int envio) {
        this.envio = envio;
    }

    public int getStatusEnvio() {
        return statusEnvio;
    }

    public void setStatusEnvio(int statusEnvio) {
        this.statusEnvio = statusEnvio;
    }

    public int getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(int formaEntrega) {
        this.formaEntrega = formaEntrega;
    }

    public String getEntregador() {
        return entregador;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
}
