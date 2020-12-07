package br.com.fiap.sigmacareer.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.sigmacareer.factory.ConnectionFactory;

public class TestaListagemColaboradores {


    public static void main(String[] args) throws SQLException {

        Connection con = new ConnectionFactory().getConnection();

        System.out.println("Conexao aberta com o BD Oracle!!!");

        Statement st = con.createStatement();
        st.execute("SELECT * FROM T_SSC_COLABORADOR ORDER BY CD_COLABORADOR");

        ResultSet rs = st.getResultSet();

        while (rs.next()) {
            int cd_colaborador = rs.getInt("CD_COLABORADOR");
            String nm_colaborador = rs.getString("NM_COLABORADOR");
            String ds_telefone = rs.getString("DS_TELEFONE");
            String ds_email = rs.getString("DS_EMAIL");
            System.out.println("ID: " + cd_colaborador + "  |  NOME: " + nm_colaborador + "  |  DS_TELEFONE: " + ds_telefone + "  |  DS_EMAIL:" + ds_email);
        }
    }
}
