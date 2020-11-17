package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "darksouls2";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static Connection createConnectionToMySQL() throws Exception{
        Class.forName("com.mysql.jdbc.Drive");

        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);


        return connection;
    }

    public static void main(String[] args)throws Exception{
        Connection con= createConnectionToMySQL();

        if(con!=null){
            System.out.println("Conexão feita com sucesso!");
            con.close();
        }
    }
}
