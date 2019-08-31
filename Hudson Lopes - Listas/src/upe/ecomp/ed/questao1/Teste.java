package upe.ecomp.ed.questao1;

public class Teste {

	public static void main(String[] args) throws UnicidadeCPFException {
		
		Cliente hudson = new Cliente("Hudson", "123");
		Cliente Joao = new Cliente("Joao", "123");
		
		Empresa empresa = new Empresa("Google");
		
		try {
			empresa.adicionarCliente(hudson);
			empresa.adicionarCliente(Joao);
		}catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		System.out.print("\n\n");
		System.out.print("Quantidade cliente cadastrado: " + empresa.quantidadeClientes());

		
		System.out.print("\n\n");
		empresa.listarClientes();
		
		
		System.out.print("\n\n");
		System.out.print("Cliente hudson existe: " + empresa.isCliente(hudson));
		System.out.print("\n\n");
		System.out.print("Cliente joao existe: " + empresa.isCliente(Joao));
	
	}
}
