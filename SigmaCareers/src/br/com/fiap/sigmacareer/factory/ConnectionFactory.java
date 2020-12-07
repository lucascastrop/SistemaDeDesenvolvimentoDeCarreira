package br.com.fiap.sigmacareer.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	//Implementar o TRY CATCH do SQLException 
    public Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                "RM85164",
                "210693"
        );
        
        return con;
    }
}
