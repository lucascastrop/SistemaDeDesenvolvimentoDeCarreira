package br.com.fiap.sigmacareer.bean;

import java.sql.Date;

public class Certificado {
    private int codigo;
    private String codVerificador;
    private String emissor;
    private Date dataEnvio;
    private String nomeCurso;
    private double cdColaborador;
    private String linkCertificado;
    


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getCodVerificador() {
		return codVerificador;
	}
	public void setCodVerificador(String codVerificador) {
		this.codVerificador = codVerificador;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public Date getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getCdColaborador() {
		return cdColaborador;
	}
	public void setCdColaborador(double cdColaborador) {
		this.cdColaborador = cdColaborador;
	}
	public String getLinkCertificado() {
		return linkCertificado;
	}
	public void setLinkCertificado(String linkCertificado) {
		this.linkCertificado = linkCertificado;
	}



}
