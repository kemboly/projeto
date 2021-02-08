package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dominio.Segurado;
import helper.BasePage;
import utils.Utils;

public class SeguradoPage extends BasePage{

	private static final By FIRSTNAME = By.id("firstname");
	private static final By LASTNAME = By.id("lastname");
	private static final By BIRTHDATE = By.id("birthdate");
	private static final By GENDER = By.className("ideal-radiocheck-label");
	private static final By STREETADDRESS = By.id("streetaddress");
	private static final By COUNTRY = By.id("country");
	private static final By ZIPCODE = By.id("zipcode"); 
	private static final By CITY    = By.id("city");
	private static final By OCCUPATION  = By.id("occupation");
	private static final By HOBBIE = By.className("ideal-radiocheck-label");
	private static final By WEBSITE   = By.id("website");
	private static final By BUTTON_OPEN   = By.id("open");
	private static final By BUTTON_PREV = By.id("preventervehicledata");
	private static final By BUTTON_NEXT = By.id("nextenterproductdata");
	private static final By RADIO_BUTTON = By.className("ideal-radio");
	private static final By CHECKBOX = By.className("ideal-check");

	Utils util = new Utils();
	
	public void preencherAbaSegurado(Segurado segurado) {
		preencherNome(segurado.getName());
		preencherSobrenome(segurado.getLastname());
		preencherDtNasc(segurado.getNascimento());
		selecionarGenero(segurado.getGender());
		preencherEndereco(segurado.getEndereco());
		selecionarPais(segurado.getPais());
		preencherCEP(segurado.getCep());
		preencherCidade(segurado.getCidade());
		selecionarOcupacao(segurado.getOcupacao());
		escolherHobbies(segurado.getHobbie());
		preencherWebsite(segurado.getWebsite());
		enviarFoto(segurado.getPicture());
	}

	public void preencherNome(String nome) {
		escrever(FIRSTNAME, nome);
	}

	public void preencherSobrenome(String sobrenome) {
		escrever(LASTNAME, sobrenome);
	} 

	public void preencherDtNasc(String data) {
		escrever(BIRTHDATE, data);
	}

	public void selecionarGenero(String genero) {
		List<WebElement> objetos = obterElementos(GENDER);
		for (WebElement webElement : objetos) {
			if (webElement.getText().equals(genero)) {
				webElement.findElement(RADIO_BUTTON).click();
			};
		}
	}

	public void preencherEndereco(String endereco) {
		escrever(STREETADDRESS, endereco);
	}

	public void selecionarPais(String pais) {
		selecionarCombo(COUNTRY, pais);
	} 

	public void preencherCEP(String cep) {
		escrever(ZIPCODE, cep);
	}

	public void preencherCidade(String cidade) {
		escrever(CITY, cidade);

	}

	public void selecionarOcupacao(String ocupacao) {
		selecionarCombo(OCCUPATION, ocupacao);
	}

	public void escolherHobbies(String hobbie) {
		String[] hobbies = util.splitString(hobbie, ",");
		
		for (String p : hobbies) {
			List<WebElement> objetos = obterElementos(HOBBIE);
			for (WebElement webElement : objetos) {
				if (webElement.getText().equals(p)) {
					webElement.findElement(CHECKBOX).click();
				};
			}	
		}
		
	}

	public void preencherWebsite(String website) {
		escrever(WEBSITE, website);
	}

	public void enviarFoto(String caminho) {
		util.enviarArquivo(BUTTON_OPEN, caminho);	 
	}
	
	public void clicarPrev() {
		clicar(BUTTON_PREV);
	}
	
	public void clicarProximo() {
		clicar(BUTTON_NEXT);
	}
}
