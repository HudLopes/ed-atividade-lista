package upe.ecomp.ed.questao6;

public class Teste {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		lista.add("a");
		lista.add("d");
		lista.add("b");
		lista.add("e");
		lista.add("c");


		lista.remover("b");
		lista.remover("e");
		
		lista.print();

	}

}
