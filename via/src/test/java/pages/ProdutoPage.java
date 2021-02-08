package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dominio.Produto;
import helper.BasePage;
import utils.Utils;

public class ProdutoPage extends BasePage{
	private static final By DT_INICIO = By.id("startdate");
	private static final By INSURANCE_SUM = By.id("insurancesum");
	private static final By RATING = By.id("meritrating");
	private static final By DAMAGE = By.id("damageinsurance");
	private static final By OP_PRODUCTS = By.className("ideal-radiocheck-label");
	private static final By COURTESY_CAR = By.id("courtesycar");
	private static final By BUTTON_PREV = By.id("preventerinsurancedata");
	private static final By BUTTON_NEXT = By.id("nextselectpriceoption");
	private static final By CHECKBOX = By.className("ideal-check");	

	Utils util = new Utils();

	public void preencherAbaProduto(Produto produto) {
		preencherDtInicio(produto.getStartDate());
		selecionarTotalSeguro(produto.getInsuranceSum());
		selecionarClassificacaoMerito(produto.getMeritRating());
		selecionarSeguroDano(produto.getDamageInsurance());
		escolherOpcionais(produto.getOpProducts());
		selecionarCortesia(produto.getCourtesyCar());
	}
	

	public void preencherDtInicio(String data) {
		escrever(DT_INICIO, data);
	}

	public void selecionarTotalSeguro(String vlSeguro) {
		selecionarCombo(INSURANCE_SUM, vlSeguro);
	} 

	public void selecionarClassificacaoMerito(String merito) {
		selecionarCombo(RATING, merito);
	} 

	public void selecionarSeguroDano(String dano) {
		selecionarCombo(DAMAGE, dano);
	} 

	public void escolherOpcionais(String opcional) {
		String[] opcionais = util.splitString(opcional, ",");
		
		for (String o : opcionais) {
			List<WebElement> objetos = obterElementos(OP_PRODUCTS);
			for (WebElement webElement : objetos) {
				if (webElement.getText().equals(o)) {
					webElement.findElement(CHECKBOX).click();
				};
			}	
		}
		
	}

	public void selecionarCortesia(String cortesia) {
		selecionarCombo(COURTESY_CAR, cortesia);
	}

	public void clicarPrev() {
		clicar(BUTTON_PREV);
	}
	
	public void clicarProximo() {
		clicar(BUTTON_NEXT);
	}
}
