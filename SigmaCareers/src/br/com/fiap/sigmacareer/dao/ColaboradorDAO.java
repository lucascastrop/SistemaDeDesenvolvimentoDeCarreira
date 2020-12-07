package br.com.fiap.sigmacareer.dao;

import br.com.fiap.sigmacareer.bean.Colaborador;

import java.util.ArrayList;
import java.util.List;

public class ColaboradorDAO {

	private static List<Colaborador> lista = new ArrayList<Colaborador>();
	
	public void cadastrar(Colaborador colaborador) {
		colaborador.setCodigo (lista.size() + 1);
		lista.add(colaborador);
	}
	
	
	public Colaborador buscarPorCodigo(double codigo) {
		for(Colaborador c : lista) {
			if(c.getCodigo() == codigo) {
				return c;
			}
		}
		return null;
	}
	
	public void alterar(Colaborador colaborador) {
		Colaborador c = buscarPorCodigo(colaborador.getCodigo());
		c.setNome(colaborador.getNome());
		c.setSenha(colaborador.getSenha());
		c.setEmail(colaborador.getEmail());
		c.setTelefone(colaborador.getTelefone());
		c.setGestor(c.getGestor());
		
	}
	
	public void remover(double codigo) throws Exception{
		Colaborador c = buscarPorCodigo(codigo);
		if(c == null) {
			throw new Exception("Colaborador não encontrado");
		}
		lista.remove(c);		
	}
	
	public List<Colaborador> buscarTodos(){
		return lista;
	}
	
    
}
