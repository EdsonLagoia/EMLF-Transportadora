package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Mercadoria {
    protected int id;
    protected int remetente;
    protected String mercadoria;
    protected String dimensao;
    protected double peso;
    protected boolean fragil;

    public Mercadoria(int id){
        if(id > 0){
            String sql = "SELECT * FROM mercadoria WHERE id = ?";
            try{
                Connection con = DB.conexao();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setRemetente(registro.getInt("id_remetente"));
                    this.setMercadoria(registro.getString("mercadoria"));
                    this.setDimensao(registro.getString("dimensao"));
                    this.setPeso(registro.getDouble("peso"));
                    this.setFragil(registro.getBoolean("fragil"));
                }
            }catch(SQLException e){
                System.out.println("Erro ao Consultar: " + e.toString());
            }
        }
        //return mercadoria;
    }
    
    public void adicionar(){
        String sql = "INSERT INTO mercadoria(id_remetente, mercadoria, dimensao, peso, fragil) VALUES (?,?,?,?,?)";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,this.getRemetente());
            stmt.setString(2,this.getMercadoria());
            stmt.setString(3,this.getDimensao());
            stmt.setDouble(4,this.getPeso());
            stmt.setBoolean(5,this.isFragil());
            stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro ao Adicionar: " + e.toString());
        }
    }
    
    public static ArrayList<Mercadoria> listar(){
        String sql = "SELECT * FROM mercadoria";
        ArrayList<Mercadoria> mercadoria = new ArrayList<>();
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet registros = stmt.executeQuery();

            while(registros.next()){
                Mercadoria temp = new Mercadoria(0);
                temp.setId(registros.getInt("id"));
                temp.setRemetente(registros.getInt("id_remetente"));
                temp.setMercadoria(registros.getString("mercadoria"));
                temp.setDimensao(registros.getString("dimensao"));
                temp.setPeso(registros.getDouble("peso"));
                temp.setFragil(registros.getBoolean("fragil"));
            }
        } catch(SQLException e) {
            System.out.println("Erro ao Listar: " + e.toString());
        }
        
        return mercadoria;
    }
    
    public void atualizar(){
        String sql = "UPDATE mercadoria SET id_remetente = ?, mercadoria = ?, dimensao = ?, peso = ?, fragil = ? WHERE id = ?";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,this.getRemetente());
            stmt.setString(2,this.getMercadoria());
            stmt.setString(3,this.getDimensao());
            stmt.setDouble(4,this.getPeso());
            stmt.setBoolean(5,this.isFragil());
            stmt.setInt(6,this.getId());
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro ao Atualizar: " + e.toString());
        }
    }
    
    public void excluir(){
        String sql = "DELETE FROM mercadoria WHERE id = ?";
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

    public String getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
    
}
