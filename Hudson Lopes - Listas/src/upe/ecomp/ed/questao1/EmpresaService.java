package upe.ecomp.ed.questao1;


public class EmpresaService {
	private No inicio;
	private No fim;
	int size;
	Empresa empresa;
	
	public void addCliente(Empresa empresa, Cliente cliente) {
		No novo = new No(cliente);
		
		if(isEmpty()) {
			inicio = novo;
			fim = novo;
			size++;
		} else {
			No tmp = inicio;
			while(tmp.getProx() != null);
			novo.setProx(tmp.getProx());
			tmp.setProx(novo);
			if(novo.getProx() == null ) {
				fim = novo;
				size++;
			}
		}
	}
	
	public boolean isEmpty() {
		return (this.inicio == null);
	}
}
