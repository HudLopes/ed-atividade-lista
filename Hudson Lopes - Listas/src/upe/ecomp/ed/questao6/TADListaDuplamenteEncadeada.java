package upe.ecomp.ed.questao6;

public interface TADListaDuplamenteEncadeada {

	public void add(String elemento);
	
	public boolean remover(String elemento);
	
	public boolean isEmpty();
	
	public void print();
	
	public String consultarIndex(int index);
	
	public ListaDuplamenteEncadeada elementosEmComum(ListaDuplamenteEncadeada lista);
}
