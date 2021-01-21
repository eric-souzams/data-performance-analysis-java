package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    
        private static String DRIVER = "com.mysql.cj.jdbc.Driver";
        private static String URL =  "jdbc:mysql://localhost:3306/db_aps?useTimezone=true&serverTimezone=UTC";
        private static String USER = "root";
        private static String PASSWORD = "root";

        public Connection getConexao(){

           try {
                Class.forName(DRIVER);
                System.out.println("Driver: Ok");
                Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
                return conexao;

            } catch (ClassNotFoundException | SQLException ex) {
                throw new RuntimeException("Error durante a conexão: ", ex);
            }

        }  

    }
 