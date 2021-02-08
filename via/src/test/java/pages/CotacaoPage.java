package pages;

import org.openqa.selenium.By;

import dominio.Cotacao;
import helper.BasePage;
import utils.Utils;

public class CotacaoPage extends BasePage {
	private static final By EMAIL = By.id("email");
	private static final By PHONE = By.id("phone");
	private static final By USERNAME = By.id("username");
	private static final By PASSWORD = By.id("password");
	private static final By CONFIRM_PASSWORD = By.id("confirmpassword");
	private static final By COMMENTS = By.id("Comments");
	private static final By BUTTON_PREV = By.id("prevselectpriceoption");
	private static final By BUTTON_SEND = By.id("sendemail");

	Utils util = new Utils();
	
	   
	public void preencherAbaCotacao(Cotacao cotacao) {
		preencherEmail(cotacao.getEmail());
		preencherTelefone(cotacao.getPhone());
		preencherUsuario(cotacao.getUsername());
		preencherSenha(cotacao.getPassword());
		preencherConfirmSenha(cotacao.getPassword());
		preencherComentario(cotacao.getComments());	
	}

	public void preencherEmail(String email) {
		escrever(EMAIL, email);
	}
	
	public void preencherTelefone(String telefone) {
		escrever(PHONE, telefone);
	}
	
	public void preencherUsuario(String usuario) {
		escrever(USERNAME, usuario);
	}

	public void preencherSenha(String senha) {
		escrever(PASSWORD, senha);
	}
	
	public void preencherConfirmSenha(String senha) {
		escrever(CONFIRM_PASSWORD, senha);
	}
	
	public void preencherComentario(String comentario) {
		escrever(COMMENTS, comentario);
	}
	
	
	public void clicarPrev() {
		clicar(BUTTON_PREV);
	}
	
	public void clicarEnviar() {
		clicar(BUTTON_SEND);
	}	
}
