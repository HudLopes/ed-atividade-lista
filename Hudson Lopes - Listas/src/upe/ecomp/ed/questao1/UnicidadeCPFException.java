package upe.ecomp.ed.questao1;

public class UnicidadeCPFException extends Exception {
	
	String nome;
	
	public UnicidadeCPFException(String nome) {
		this.nome = nome;
	}

	@Override
	public String getMessage() {
		return "CPF ja foi cadastrado, não foi possivel salvar o cliente: " + nome;
	}
	
}
