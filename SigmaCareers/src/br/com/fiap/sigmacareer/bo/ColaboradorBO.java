package br.com.fiap.sigmacareer.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.sigmacareer.bean.Colaborador;
import br.com.fiap.sigmacareer.dao.ColaboradorDAO;

public class ColaboradorBO {
	
	ColaboradorDAO colabDAO = new ColaboradorDAO();
	
	public void cadastrar (Colaborador colaborador) throws SQLException{
		colabDAO.cadastrar(colaborador);
	}
	
	public void alterar (Colaborador colaborador) throws SQLException {
		colabDAO.alterar(colaborador);
	}
	
	public void remover (double codigo) throws Exception {
		colabDAO.remover(codigo);
	}
	
	public List<Colaborador> buscar() throws SQLException{
		return colabDAO.buscarTodos();
	}
	
	public Colaborador selecionarColaboradorPorCodigo(double codigo) {
		return colabDAO.buscarPorCodigo(codigo);
		
	}
	
}
