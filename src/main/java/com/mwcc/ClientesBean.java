package com.mwcc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ClientesBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Cliente> cliente = new ArrayList<>();
	
	
	private String clienteSelecionado;
	private String nomeCliente;
	private String telefoneCliente;

	public ClientesBean() {
		cliente.add(new Cliente("Marcio Willian", "98981056278"));
		cliente.add(new Cliente("Leticia Padilha", "98999717142"));
		cliente.add(new Cliente("João Lucas", "98991351407"));
		
	}

	public void adicionarCliente() {
		cliente.add(new Cliente(nomeCliente, telefoneCliente));
		
		System.out.println("Nome" + this.nomeCliente);
		System.out.println(this.telefoneCliente);
		
	}
	
	public void excluirCliente() {
		cliente.remove(clienteSelecionado);
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public String getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(String clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

		
	
}
