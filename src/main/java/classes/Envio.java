package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Envio {
    protected int id;
    protected int remetente;
    protected int mercadoria;
    protected int destinatario;
    protected int tipoEnvio;
    protected double frete;
    
    public Envio(int id){
        if(id > 0){
            String sql = "SELECT * FROM envio WHERE id = ?";
            try{
                Connection con = DB.conexao();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setRemetente(registro.getInt("id_remetente"));
                    this.setMercadoria(registro.getInt("id_mercadoria"));
                    this.setDestinatario(registro.getInt("id_destinatario"));
                    this.setTipoEnvio(registro.getInt("tipo_envio"));
                    this.setFrete(registro.getDouble("frete"));
                }
            }catch(SQLException e){
                System.out.println("Erro ao Consultar: " + e.toString());
            }
        }
        //return envio;
    }
    
    public void adicionar(){
        String sql = "INSERT INTO envio(id_remetente, id_mercadoria, id_destinatario, tipo_envio, frete) VALUES (?,?,?,?,?)";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,this.getRemetente());
            stmt.setInt(2,this.getMercadoria());
            stmt.setInt(3,this.getDestinatario());
            stmt.setInt(4,this.getTipoEnvio());
            stmt.setDouble(5,this.getFrete());
            stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao Adicionar: " + e.toString());
        }
    }
    
    public static ArrayList<Envio> listar(){
        String sql = "SELECT * FROM envio";
        ArrayList<Envio> envio = new ArrayList<>();
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet registros = stmt.executeQuery();

            while(registros.next()){
                Envio temp = new Envio(0);
                temp.setId(registros.getInt("id"));
                temp.setRemetente(registros.getInt("id_remetente"));
                temp.setMercadoria(registros.getInt("id_mercadoria"));
                temp.setDestinatario(registros.getInt("id_destinatario"));
                temp.setTipoEnvio(registros.getInt("tipo_envio"));
                temp.setFrete(registros.getDouble("frete"));
            }
        } catch(SQLException e) {
            System.out.println("Erro ao Listar: " + e.toString());
        }
        
        return envio;
    }
    
    public void atualizar(){
        String sql = "UPDATE envio SET id_remetente = ?, id_mercadoria = ?, id_destinatario = ?, tipo_envio = ?, frete = ? WHERE id = ?";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,this.getRemetente());
            stmt.setInt(2,this.getMercadoria());
            stmt.setInt(3,this.getDestinatario());
            stmt.setInt(4,this.getTipoEnvio());
            stmt.setDouble(5,this.getFrete());
            stmt.setInt(6,this.getId());
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro ao Atualizar: " + e.toString());
        }
    }
    
    public void excluir(){
        String sql = "DELETE FROM envio WHERE id = ?";
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

    public int getRemetente() {
        return remetente;
    }

    public void setRemetente(int remetente) {
        this.remetente = remetente;
    }

    public int getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(int mercadoria) {
        this.mercadoria = mercadoria;
    }

    public int getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(int destinatario) {
        this.destinatario = destinatario;
    }

    public int getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(int tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
    
}
