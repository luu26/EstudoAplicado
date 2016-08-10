package br.com.estudoaplicado.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginMB implements Serializable {

	
	private static final long serialVersionUID = 987387080925261041L;
	private String login;
	private String senha;

	public LoginMB() {
		System.out.println("Criando instância do LoginMB");
		
	}

	String exibirPaginaLogin() {
		return "login";
	}

	public String logar() {
		System.out.println("Entrou no método Logar!");
			return "/pages/home";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
