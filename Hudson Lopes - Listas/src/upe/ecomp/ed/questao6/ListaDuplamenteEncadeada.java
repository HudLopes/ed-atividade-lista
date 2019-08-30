package upe.ecomp.ed.questao6;

public class ListaDuplamenteEncadeada {

	No inicio;

	public void add(String elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		if (isEmpty()) {
			novo.setProximo(null);
			novo.setAnterior(novo);
			this.inicio = novo;
		} else {
			No tmp = inicio;
			while (tmp.getProximo() != null) {
				tmp = tmp.getProximo();
			}
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(null);
		}
	}

	public boolean remover(String elemento) {
		boolean removido = false;
		if(isEmpty()) {
			return removido = false;
		} else if(inicio.getElemento() == elemento){
			inicio = inicio.getProximo();
		} else {
			No tmp = inicio;
			while(tmp != null) {
				if(tmp.getProximo().getElemento() == elemento) {
					tmp.setProximo(tmp.getProximo().getProximo());
					if(tmp.getProximo() == null) {
						return removido = true;
					} else {
						tmp.getProximo().setAnterior(tmp);
						return removido = true;
					}
				}
				tmp = tmp.getProximo();
			}
		}
		
		return removido;
	}

	public boolean isEmpty() {
		return (this.inicio == null);
	}

	public void print() {
		No tmp = inicio;
		while (tmp != null) {
			System.out.print(tmp.getElemento() + " -> ");
			tmp = tmp.getProximo();
		}
	}
}
