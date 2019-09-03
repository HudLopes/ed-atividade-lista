package upe.ecomp.ed.questao3;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaCircular lista = new ListaCircular();
		
		lista.add(1);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(3);
		lista.add(8);
		lista.add(10);
		
		ListaCircular lista2 = new ListaCircular();
		
		lista2.add(4);
		lista2.add(5);
		lista2.add(8);
		//lista.add(7);
		//lista2.add(12);
		//lista2.add(7);
		
		
		lista.removerIntervaloEmComum(lista2);
		//lista.remove(1);
		lista.print();
		
		
		
		
		//lista.removerIntervaloEmComum(lista2);
	}

}
