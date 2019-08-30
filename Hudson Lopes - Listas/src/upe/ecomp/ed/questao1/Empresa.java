package upe.ecomp.ed.questao1;

public class Empresa {

	String nome;
	Cliente cliente;

	Empresa(String nome, Cliente cliente) {
		this.nome = nome;
		this.cliente = cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
