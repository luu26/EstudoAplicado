package br.com.estudoaplicado.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginMB implements Serializable{

	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	
	public LoginMB() {
		System.out.println("Criando inst�ncia do HomeMB");
	}
	
	public void executar(){
		System.out.println("In�cio do m�todo executar");
		System.out.println("Nome do usu�rio : "+login);
	}

	public String getNome() {
		return login;
	}

	public void setNome(String nome) {
		this.login = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
