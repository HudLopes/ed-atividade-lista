package upe.ecomp.ed.questao2;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEstatica lista = new ListaEstatica(20);
		
		//TESTANDO FUNÇÕES DA LETRA A
		
		lista.add(1);
		lista.add(4);
		lista.add(5);
		
		lista.print();
		System.out.print("\n"); 
		
		lista.remove(4);
		lista.add(7);
		
		lista.print();
		
		System.out.print("\n" + lista.size()); 
		
		//TESTANDO LETRA B
		
		lista.add(5);
		lista.add(5);
		
		System.out.print("\n");
		lista.print();
		System.out.print("\n");
		
		lista.removerTodasInstancias(5);
		
		System.out.print("\n");
		lista.print();
		System.out.print("\n");
		
		//TESTANDO LETRA C
		
		lista.add(4);
		lista.add(3);
		lista.trocarObjetos(1, 4);
		
		System.out.print("\n");
		lista.print();
		System.out.print("\n");
		
		//TESTANDO LETRA D
		
		ListaEstatica lista2 = new ListaEstatica(10);
		
		lista2.add(5);
		lista2.add(9);
		
		lista.concatenarLista(lista2);
		
		System.out.print("\n");
		lista.print();
		System.out.print("\n");
		
	}

}
