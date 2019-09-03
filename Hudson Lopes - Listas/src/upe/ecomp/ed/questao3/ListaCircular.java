package upe.ecomp.ed.questao3;

public class ListaCircular {

	private No inicio;

	public ListaCircular() {
		this.inicio = null;
	}

	public boolean isEmpty() {
		return (this.inicio == null);
	}

	public void add(Object elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		if (isEmpty()) {
			novo.setProximo(novo);
			this.inicio = novo;
		} else {
			No tmp = inicio;
			while (tmp.getProximo() != inicio) {
				tmp = tmp.getProximo();
			}
			tmp.setProximo(novo);
			novo.setProximo(inicio);
		}
	}

	// considerando unicidade do elemento
	public void removerIntervaloEmComum(ListaCircular lista2) {
		ListaCircular listaTmp = new ListaCircular();
		No tmp = this.inicio;

		do {
			No tmp2 = lista2.inicio;
			do {
				if (tmp.getElemento() == tmp2.getElemento()) {
					listaTmp.add(tmp.getElemento());
					if (tmp2.getProximo() == lista2.inicio) {
						if (listaTmp.size() > 1) {
							this.removerElementosLista(listaTmp);
							break;
						}
					}
					tmp = tmp.getProximo();
					tmp2 = tmp2.getProximo();
				} else {
					if (listaTmp.size() <= 1 ) {
						listaTmp = new ListaCircular();
						tmp2 = tmp2.getProximo();
						break;
					} else if (listaTmp.size() > 1) {
						this.removerElementosLista(listaTmp);
						break;
					}
				}
			} while (tmp2 != lista2.inicio);

			tmp = tmp.getProximo();
		} while (tmp != this.inicio);

	}

	public void removerElementosLista(ListaCircular lista) {
		No tmp = lista.inicio;
		while (tmp.getProximo() != lista.inicio) {
			this.remove(tmp.getElemento());
			tmp = tmp.getProximo();
		}
		// remove o ultimo elemento
		this.remove(tmp.getElemento());
	}

	public boolean remove(Object elemento) {
		boolean removido = false;
		No tmp = inicio;
		if (inicio.getElemento() == elemento) {
			while (tmp.getProximo() != inicio) {
				tmp = tmp.getProximo();
			}
			tmp.setProximo(inicio.getProximo());
			inicio = tmp.getProximo();
			return removido = true;
		}
		while (tmp.getProximo() != inicio) {
			if (tmp.getProximo().getElemento() == elemento) {
				tmp.setProximo(tmp.getProximo().getProximo());
				removido = true;
			}
			tmp = tmp.getProximo();
		}
		return removido;
	}

	public int size() {
		if (this.isEmpty()) {
			return 0;
		} else {
			int size = 1;
			No tmp = inicio;

			while (tmp.getProximo() != inicio) {
				size++;
				tmp = tmp.getProximo();
			}

			return size;
		}
	}

	public void print() {
		No tmp = inicio;
		do {
			System.out.print(tmp.getElemento() + " -> ");
			tmp = tmp.getProximo();
		} while (tmp != inicio);
	}
}
