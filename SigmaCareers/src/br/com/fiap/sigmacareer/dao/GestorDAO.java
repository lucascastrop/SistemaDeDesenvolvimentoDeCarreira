//package br.com.fiap.sigmacareer.dao;
//
//import br.com.fiap.sigmacareer.factory.ConnectionFactory;
//import br.com.fiap.sigmacareer.bean.Gestor;
//
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class GestorDAO {
//
//    //Atributo
//    private Connection con;
//
//    //Construtor
//    public GestorDAO() throws SQLException {
//        con = new ConnectionFactory().getConnection();
//    }
//
//    /**
//     * Inseri um objeto Colaborador na tabela T_SSC_COLABORADOR
//     * <p>
//     *     Inseri na tabela T_SSC_COLABORADOR um colaborador com os seguintes atributos, nm_colaborador, ds_telefone, ds_email e cd_senha
//     * </p>
//     * @param colaborador objeto do tipo Colaborador com seus atributos respectivos
//     * @throws SQLException
//     */
//    //Insert
//    public void insert(Gestor gestor) throws SQLException {
//
//        PreparedStatement st = con.prepareStatement("INSERT INTO T_SSC_GESTOR (CD_SENHA,NM_GESTOR,DS_TELEFONE,DS_EMAIL,DS_AREA_INTERESSE) VALUES(?,?,?,?,?)");
//        st.setString(1, gestor.getSenha());
//        st.setString(2, gestor.getNome());
//        st.setString(3, gestor.getTelefone());
//        st.setString(4, gestor.getEmail());
//        st.setString(5, gestor.getAreaInteresse());
//
//        st.execute();
//        System.out.println("Query INSERT executada");
//        st.close();
//    }
//
//    /**
//     * Deleta um colaborador na tabela T_SSC_COLABORADOR
//     * <p>
//     *     procura na tabela(T_SSC_COLABORADOR) um colaborador com o codigo igual ao do
//     *     objeto Colaborador passado como parametro e deleta da tabela
//     * </p>
//     * @param colaborador objeto do tipo Colaborador com seus atributos respectivos
//     * @throws SQLException
//     */
//    //Delete
//    public void delete(Gestor gestor) throws SQLException {
//
//        PreparedStatement st = con.prepareStatement("DELETE FROM T_SSC_COMPETENCIA WHERE CD_GESTOR=?");
//        st.setInt(1, gestor.getCodigo());
//
//        st.execute();
//        System.out.println("Query DELETE executada");
//        st.close();
//    }
//
//    /**
//     * Atualiza um colaborador na tabela T_SSC_COLABORADOR
//     * <p>
//     *     procura na tabela(T_SSC_COLABORADOR) um colaborador com o codigo igual ao do
//     *     objeto Colaborador passado como parametro e atualiza com os dados do mesmo
//     *     objeto Colaborador passado
//     * </p>
//     * @param colaborador objeto do tipo Colaborador com seus atributos respectivos
//     * @throws SQLException
//     */
//    //Update
//    public void update(Gestor gestor) throws SQLException {
//        PreparedStatement st = con.prepareStatement("UPDATE T_SSC_COMPETENCIA SET CD_SENHA=?, NM_GESTOR=?, DS_TELEFONE=?, DS_EMAIL=?, DS_AREA_INTERESSE=? WHERE CD_GESTOR=?");
//        st.setString(1, gestor.getSenha());
//        st.setString(2, gestor.getNome());
//        st.setString(3, gestor.getTelefone());
//        st.setString(4, gestor.getEmail());
//        st.setString(5, gestor.getAreaInteresse());
//        st.setInt(6, gestor.getCodigo());
//
//
//        st.execute();
//        System.out.println("Query UPDATE executada");
//        st.close();
//    }
//
//    /**
//     * Busca na tabela T_SSC_COLABORADOR todos colaboradors
//     * <p>
//     *     procura na tabela T_SSC_COLABORADOR todos colaboradors e retorna uma
//     *     lista de colaboradors
//     * </p>
//     * @return Retorna um objeto "List<Colaborador>" com todos colaboradors encontrados na tabela T_SSC_COLABORADOR
//     * @throws SQLException
//     */
//    //Select
//    public List<Gestor> getGestores() throws SQLException {
//
//        ArrayList<Gestor> gestores = new ArrayList<Gestor>();
//
//        PreparedStatement st = con.prepareStatement("SELECT * FROM T_SSC_GESTOR");
//        st.execute();
//
//        //Retorno dos dados
//        ResultSet rs = st.getResultSet();
//
//        while (rs.next()) {
//            Gestor gestor = new Gestor();
//            gestor.setCodigo(rs.getInt("CD_GESTOR"));
//            gestor.setSenha(rs.getString("CD_SENHA"));
//            gestor.setNome(rs.getString("NM_GESTOR"));
//            gestor.setTelefone(rs.getString("DS_TELEFONE"));
//            gestor.setEmail(rs.getString("DS_EMAIL"));
//            gestor.setAreaInteresse(rs.getString("DS_AREA_INTERESSE"));
//
//            gestores.add(gestor);
//        }
//
//        return gestores;
//    }
//}
