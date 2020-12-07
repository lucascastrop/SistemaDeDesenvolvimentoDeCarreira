package br.com.fiap.sigmacareer.dao;

import java.sql.Date;
import java.sql.SQLException;

import br.com.fiap.sigmacareer.bean.Certificado;
import br.com.fiap.sigmacareer.bo.CertificadoBO;

public class TestaCertificado {

	public static void main(String[] args) throws SQLException {

		Certificado certificado = new Certificado();
		
		certificado.setCdColaborador(20001);
		certificado.setCodVerificador("asfd");
		certificado.setEmissor("ere");
		certificado.setNomeCurso("erwerw");
		certificado.setLinkCertificado("www.aasdsa.com.br");
		certificado.setDataEnvio(new Date(23/12/2020));
		
		CertificadoBO certificadoBO = new CertificadoBO();
		
		certificadoBO.cadastrar(certificado);
	}

}
