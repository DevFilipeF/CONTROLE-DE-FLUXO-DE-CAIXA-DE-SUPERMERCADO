package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta_DAO {

    public static void carregaDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver carregado com sucesso!");
        } catch (Exception ex) {
            System.out.println("Driver não pode ser carregado: " + ex.getMessage());
        }
    }

    // Retornar a conexão com o banco de dados
    public static Connection getConnection() throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/Supermarket"; 
        String username = "root";
        String password = "123";  

        // Obtendo e retornando a conexão
        return DriverManager.getConnection(url, username, password);
    }
}