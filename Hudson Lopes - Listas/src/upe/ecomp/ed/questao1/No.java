package upe.ecomp.ed.questao1;


public class No {
	private No prox;
	private Cliente cliente;
	
	public No(Cliente cliente) {
		this.cliente = cliente;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
