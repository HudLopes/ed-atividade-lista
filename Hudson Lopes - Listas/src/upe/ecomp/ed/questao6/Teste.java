package upe.ecomp.ed.questao6;

public class Teste {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		
		//LETRA A
		
		lista.add("a");
		lista.add("d");
		lista.add("b");
		lista.add("e");
		lista.add("c");

		lista.print();
		System.out.print("\n\n\n\n");
		
		//LETRA B
		
		lista.remover("b");
		lista.remover("e");
		lista.print();
		System.out.print("\n\n\n\n");
		
		//LETRA C
		
		//ja esta sendo usado nos outros testes
		//lista.print();
		
		//LETRA D
		
		System.out.print(lista.consultarIndex(2));
		System.out.print("\n" + lista.consultarIndex(0));
		System.out.print("\n" + lista.consultarIndex(3));
	
		// LETRA E
		
		System.out.print("\n\n\n\n");
		ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
		
		lista2.add("z");
		lista2.add("a");
		lista2.add("b");
		lista2.add("c");
		
		ListaDuplamenteEncadeada lista3 = lista.elementosEmComum(lista2);
		lista3.print();
	}

}
