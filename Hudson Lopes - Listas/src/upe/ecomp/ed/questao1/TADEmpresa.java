package upe.ecomp.ed.questao1;

public interface TADEmpresa {
	
	public void adicionarCliente(Cliente cliente) throws UnicidadeCPFException;
	
	public boolean isCliente(Cliente cliente);
	
	public int quantidadeClientes();
	
	public void listarClientes();
	
	public boolean isEmpty();

}
