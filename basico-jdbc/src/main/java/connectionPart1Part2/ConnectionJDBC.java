package connectionPart1Part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {
//modo 1 de efetuar uma conexao com o banco de dados

        /*String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        try {
            Connection conn = DriverManager.getConnection(urlConnection, "root", "84525445");
            System.out.println("SUCESSO!");
        } catch (Exception e) {
            System.out.println("FALHA");
        }*/


        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one ";
        String user = "root";
        String password = "00000";

        String urlConnection = "jdbc:" +
                driver + "://" +
                dataBaseAddress + "/" +
                dataBaseName;

        try {
            Connection conn = DriverManager.getConnection(urlConnection, user, password);
            System.out.println("SUCESSO!");
        } catch (SQLException e) {
            System.out.println("FALHA");
        }
    }
}
