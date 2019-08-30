package upe.ecomp.ed.questao2;

public class ListaEstatica implements TADListaEstatica {

	private Object elementos[];
	private int qtd;

	public ListaEstatica(int capacidade) {
		elementos = new Object[capacidade];
		qtd = -1;
	}

	@Override
	public void add(Object obj) {
		if (qtd == elementos.length) {
			expandirMemoria();
		}
		qtd++;
		elementos[qtd] = obj;
	}

	@Override
	public boolean remove(Object obj) {
		boolean removido = false;

		for (int i = 0; i < qtd; i++) {
			if (elementos[i] == obj) {
				while (i < qtd) {
					elementos[i] = elementos[i + 1];
					i++;
				}
				elementos[i] = 0;
				qtd--;
				removido = true;
				break;
			}
		}
		return removido;
	}

	@Override
	public int size() {
		return qtd+1;
	}

	@Override
	public void print() {
		for (int i = 0; i <= qtd; i++) {
			System.out.print(elementos[i] + " , ");
		}
	}

	public void expandirMemoria() {
		Object[] novoVetor = new Object[elementos.length * 2];
		for (int i = 0; i < elementos.length; i++) {
			novoVetor[i] = elementos[i];
		}
		elementos = novoVetor;
	}

	public boolean trocarObjetos(Object obj1, Object obj2) {
		int index1 = -1;
		int index2 = -1;
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] == obj1) {
				index1 = i;
			}
			if (elementos[i] == obj2) {
				index2 = i;
			}
		}
		if (index1 == -1 || index2 == -1) {
			return false;
		} else {
			Object temp = elementos[index1];
			elementos[index1] = elementos[index2];
			elementos[index2] = temp;
			return true;
		}
	}
	
	public void concatenarLista(ListaEstatica lista) {
		int i = 0;
		for ( ; i < elementos.length; i++) {
			if(elementos[i] == null) {
				break;
			}
		}
		//i ta uma posição vazia após ultimo elemento
		for(int j = 0; j<lista.size(); j++) {
			elementos[i] = lista.getElemento(j);
			i++;
			qtd++;
		}
	}
	
	public boolean removerTodasInstancias(Object obj) {
		boolean removido = false;

		for (int i = 0; i <= qtd; i++) {
			if (elementos[i] == obj) {
				int j = i;
				while (j < qtd) {
					elementos[j] = elementos[j + 1];
					j++;
				}
				elementos[j] = null;
				qtd--;
				i--;
				removido = true;
			}
		}
		return removido;
	}
	
	public Object getElemento(int index) {
		return elementos[index];
	}
}
