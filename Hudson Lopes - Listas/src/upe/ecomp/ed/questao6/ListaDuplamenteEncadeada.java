package upe.ecomp.ed.questao6;

public class ListaDuplamenteEncadeada implements TADListaDuplamenteEncadeada {

	private No inicio;
	private int qtd = 0;

	public void add(String elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		if (isEmpty()) {
			novo.setProximo(null);
			novo.setAnterior(novo);
			this.inicio = novo;
			qtd++;
		} else {
			No tmp = inicio;
			while (tmp.getProximo() != null) {
				tmp = tmp.getProximo();
			}
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(null);
			qtd++;
		}
	}

	public boolean remover(String elemento) {
		boolean removido = false;
		if (isEmpty()) {
			return removido = false;
		} else if (inicio.getElemento() == elemento) {
			inicio = inicio.getProximo();
		} else {
			No tmp = inicio;
			while (tmp != null) {
				if (tmp.getProximo().getElemento() == elemento) {
					tmp.setProximo(tmp.getProximo().getProximo());
					if (tmp.getProximo() == null) {
						qtd--;
						return removido = true;
					} else {
						tmp.getProximo().setAnterior(tmp);
						qtd--;
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

	public String consultarIndex(int index) {
		String elemento = "";

		if (index > qtd - 1) {
			return "index maior que o tamanho da lista";
		} else {
			No tmp = inicio;
			while (index > 0) {
				tmp = tmp.getProximo();
				index--;
			}
			elemento = tmp.getElemento();

			return elemento;
		}
	}

	public ListaDuplamenteEncadeada elementosEmComum(ListaDuplamenteEncadeada lista) {
		ListaDuplamenteEncadeada listaEmComum = new ListaDuplamenteEncadeada();

		No thisTmp = inicio;
		while (thisTmp != null) {
			No listaTmp = lista.inicio;
			while (listaTmp != null) {
				if (thisTmp.getElemento() == listaTmp.getElemento()) {
					listaEmComum.add(thisTmp.getElemento());
				}
				listaTmp = listaTmp.getProximo();
			}
			thisTmp = thisTmp.getProximo();
		}

		return listaEmComum;
	}
}
