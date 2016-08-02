package br.com.estudoaplicado.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HomeMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	
	public HomeMB() {
		System.out.println("Criando instância do HomeMB");
	}
	
	public void executar(){
		System.out.println("Início do método executar");
		System.out.println("Nome do usuário : "+nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
