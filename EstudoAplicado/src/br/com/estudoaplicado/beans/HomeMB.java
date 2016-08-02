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
		System.out.println("Criando inst�ncia do HomeMB");
	}
	
	public void executar(){
		System.out.println("In�cio do m�todo executar");
		System.out.println("Nome do usu�rio : "+nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
