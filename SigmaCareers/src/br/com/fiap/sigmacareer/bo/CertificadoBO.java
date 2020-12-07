package br.com.fiap.sigmacareer.bo;


import java.util.List;

import br.com.fiap.sigmacareer.bean.Certificado;
import br.com.fiap.sigmacareer.dao.CertificadoDAO;


public class CertificadoBO {

	CertificadoDAO certifDAO = new CertificadoDAO();
		
		
	public void cadastrar(Certificado certificado) {
		certifDAO.cadastrar(certificado);
	}
		
	public void alterar(Certificado certificado)  {
			certifDAO.alterar(certificado);
	}
		
	public void remover(int codigo) throws Exception  {
		certifDAO.remover(codigo);
	}
	
	public List<Certificado> buscar() {
		return certifDAO.buscarTodos();
	}
	
	public List<Certificado> buscarCertificadoPorColaborador (int codigo) {
		return certifDAO.buscaPorColaborador(codigo);
	}
	
	public Certificado buscarCertficadoPorCodigo(int codigo) {
		return certifDAO.buscarPorCodigo(codigo);
	}
}
