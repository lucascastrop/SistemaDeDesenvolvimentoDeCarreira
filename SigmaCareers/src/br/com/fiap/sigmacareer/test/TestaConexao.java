package br.com.fiap.sigmacareer.test;

import java.sql.*;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84372", "190499");

        System.out.println("Conexao aberta com o BD Oracle!!!");

        con.close();
    }


}
