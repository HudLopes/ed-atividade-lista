package upe.ecomp.ed.questao1;

public class Empresa implements TADEmpresa {

	private String nomeEmpresa;
	private No listaClientes;

	Empresa(String nome) {
		this.nomeEmpresa = nome;
	}

	public void adicionarCliente(Cliente cliente) throws UnicidadeCPFException {
		No novo = new No(cliente);
		if (isEmpty()) {
			listaClientes = novo;
		} else {
			if (listaClientes.getCliente().getCpf() == cliente.cpf) {
				throw new UnicidadeCPFException(cliente.nome);
			} else {
				No tmp = listaClientes;
				while (tmp.getProx() != null) {
					if (tmp.getCliente().getCpf() == cliente.cpf) {
						throw new UnicidadeCPFException(cliente.nome);
					}
					tmp = tmp.getProx();
				}
				tmp.setProx(novo);
			}
		}
	}

	public boolean isCliente(Cliente cliente) {
		boolean existe = false;

		No tmp = listaClientes;
		while (tmp != null) {
			if (tmp.getCliente() == cliente) {
				existe = true;
				break;
			}
			tmp = tmp.getProx();
		}
		return existe;
	}

	public int quantidadeClientes() {
		int quantidade = 0;
		No tmp = listaClientes;

		while (tmp != null) {
			quantidade++;
			tmp = tmp.getProx();
		}
		
		return quantidade;
	}

	public void listarClientes() {
		No tmp = listaClientes;
		while (tmp != null) {
			System.out.println("Nome: " + tmp.getCliente().getNome() + "\nCPF: " + tmp.getCliente().getCpf());
			tmp = tmp.getProx();
		}
	}

	public boolean isEmpty() {
		return listaClientes == null;
	}

}
