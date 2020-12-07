package br.com.fiap.sigmacareer.bean;

public abstract class Funcionario {
    protected double codigo;
    protected String senha;
    protected String nome;
    protected String telefone;
    protected String email;

    public boolean Autentica(String senha) {
        if(senha == this.senha) {
            System.out.println("Autenticado");
            return true;
        } else {
            System.out.println("Nao Autenticado");
            return false;
        }
    }


    public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}


	public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Cargo getCargo() {
//        return cargo;
//    }
//
//    public void setCargo(Cargo cargo) {
//        this.cargo = cargo;
//    }
}
