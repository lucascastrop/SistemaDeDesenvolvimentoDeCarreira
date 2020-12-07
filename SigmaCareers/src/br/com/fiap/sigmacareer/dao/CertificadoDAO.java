package br.com.fiap.sigmacareer.dao;

import java.util.ArrayList;
import java.util.List;


import br.com.fiap.sigmacareer.bean.Certificado;

public class CertificadoDAO {

private static List<Certificado> lista = new ArrayList<Certificado>();
	
	public void cadastrar(Certificado certificado) {
		certificado.setCodigo((lista.size() + 1));
		lista.add(certificado);
	}

	public Certificado buscarPorCodigo(int codigo) {
		for(Certificado c : lista) {
			if(c.getCodigo() == codigo) {
				return c;
			}
		}
		return null;
	}
	
	public ArrayList<Certificado> buscaPorColaborador(int codigo){
		ArrayList<Certificado> busca = new ArrayList<Certificado>();
		for(Certificado c : lista) {
			if( c.getCdColaborador() == codigo) {
				busca.add(c);
			}
		}
		return busca;
	}
	
	public void alterar(Certificado certificado) {
		Certificado c = buscarPorCodigo(certificado.getCodigo());
		
		c.setCodVerificador(certificado.getCodVerificador());
		c.setNomeCurso(certificado.getNomeCurso());
		c.setEmissor(certificado.getEmissor());
		c.setLinkCertificado(certificado.getLinkCertificado());

	}
	
	public void remover(int codigo) throws Exception{
		Certificado c = buscarPorCodigo(codigo);
		if(c == null) {
			throw new Exception("Venda não encontrada");
		}
		lista.remove(c);		
	}
	
	public List<Certificado> buscarTodos(){
		return lista;
	}
}

