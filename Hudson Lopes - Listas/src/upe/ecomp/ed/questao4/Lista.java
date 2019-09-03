package upe.ecomp.ed.questao4;

public class Lista {
	private No inicio;

	Lista() {
		this.inicio = null;
	}

	public boolean isEmpty() {
		return (this.inicio == null);
	}

	public void add(int elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		novo.setProximo(null);

		if (isEmpty()) {
			this.inicio = novo;
		} else {
			No aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	public void inverterLista() {
		Lista invertida = new Lista();
		No temp = inicio;
		while(temp.getProximo() != null) {
			temp = temp.getProximo();
		}
		//ultimo elemento
		//invertida.add(temp);
	}

	public void print() {
		No tmp = inicio;
		while (tmp != null) {
			System.out.print(tmp.getElemento() + " -> ");
			tmp = tmp.getProximo();
		}
	}

}
