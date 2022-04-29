package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static final String servidor = "127.0.0.1:3306";
    public static final String usuario = "root";
    public static final String senha = "";
    public static final String nome_banco = "transportadora";
    
    public static Connection conexao(){
        Connection conexao = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(
                "jdbc:mysql://"+servidor+"/"+nome_banco+"?useTimeZone=true&serverTimeZone=UTC", usuario, senha
            );
        } catch(SQLException e) {
            System.out.println("Erro de Conexão: " + e.toString());
        } catch(ClassNotFoundException e){
            System.out.println("Classe Não Encontrada: " + e.toString());
        }
        return conexao;
    }
}
