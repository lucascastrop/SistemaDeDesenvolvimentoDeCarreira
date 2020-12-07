package br.com.fiap.sigmacareer.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.sigmacareer.bean.Certificado;
import br.com.fiap.sigmacareer.bo.CertificadoBO;
import br.com.fiap.sigmacareer.bo.ColaboradorBO;


//Considerar essa servlet
@WebServlet("/certificado")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String acao = request.getParameter("acao");
		String retorno = "";
		
		switch (acao) {
		case "cadastrar":
 			try {
				cadastrarCertificado(request);
				listarCertColab(request);
				retorno = "certificados.jsp";
			} catch (ParseException e) {
				request.setAttribute("msg", "ERRO AO CADASTRAR");
				//e.printStackTrace();
				retorno = "upload.jsp";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case"editar":
			try {
				editarCertificado(request);
			} catch (ParseException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			retorno = "upload.jsp";
			break;
		case "remover":
			removerCertificado(request);
			try {
				listarCertColab(request);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			retorno = "certificados.jsp";
			break;
		case "listarPorColab":
			listarCertColab(request);
			retorno = "certificados.jsp";
			break;
		}
		request.getRequestDispatcher(retorno).forward(request, response);
	}
	
	private void editarCertificado(HttpServletRequest request) throws ParseException {
		
			if(request.getParameter("codCertificado") != null) {
				
				int codigo = Integer.parseInt(request.getParameter("codCertificado"));
				
				CertificadoBO certificadoBO = new CertificadoBO();
				Certificado certificado = certificadoBO.buscarCertficadoPorCodigo(codigo);
				request.setAttribute("certificado", certificado);
				
			}
	}			

		

	
	private void cadastrarCertificado (HttpServletRequest request) throws ParseException {
		
			
			String codigoCertificado = request.getParameter("codCertificado");
			
			String codVerificador = request.getParameter("codVerificador");
			String emissor = request.getParameter("emissor");
			String nomeCurso = request.getParameter("curso");
			String linkCertificado = request.getParameter("linkCertificado");
			double codColaborador = Double.parseDouble(request.getParameter("codigo"));
			
			CertificadoBO certificadoBO = new CertificadoBO();
			
			if(codigoCertificado.equals("")) {
				Certificado certificado = new Certificado();
				certificado.setCdColaborador(codColaborador);
				certificado.setCodVerificador(codVerificador);
				certificado.setEmissor(emissor);
				certificado.setNomeCurso(nomeCurso);
				certificado.setLinkCertificado(linkCertificado);
	
				
				certificadoBO.cadastrar(certificado);
				int codCertificado = certificado.getCodigo();
				
				request.setAttribute("msg", "Cadastro realizado com sucesso!" );
				request.setAttribute("codCertificado", codCertificado);
			}else {
				int codigo = Integer.parseInt(codigoCertificado);
				Certificado certificado = new Certificado();
				certificado.setCodigo(codigo);
				certificado.setCdColaborador(codColaborador);
				certificado.setCodVerificador(codVerificador);
				certificado.setEmissor(emissor);
				certificado.setNomeCurso(nomeCurso);
				certificado.setLinkCertificado(linkCertificado);
				
				certificadoBO.alterar(certificado);
				request.setAttribute("msg", "Certificado alterado com sucesso!");
				
			}
	}
	
	private void listarCertColab (HttpServletRequest request)  {
	
			CertificadoBO certificadobo = new CertificadoBO();
			ColaboradorBO colaboradorbo = new ColaboradorBO();
			
			ArrayList<Certificado> certificados = (ArrayList<Certificado>) certificadobo.buscar();
			request.setAttribute("certificados", certificados);
			try {
				request.setAttribute("lista", colaboradorbo.buscar() );
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
	}
	
	private void removerCertificado(HttpServletRequest request)  {
		
		int codigo = Integer.parseInt(request.getParameter("codCertificado"));

	
		CertificadoBO bo = new CertificadoBO();
		try {
			bo.remover(codigo);
		}catch (Exception e){
			e.printStackTrace();
		}
		request.setAttribute("msg", "Certificado removido com Sucesso!");
	}
	
}