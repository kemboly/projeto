package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dominio.Preco;
import helper.BasePage;
import utils.Utils;

public class PrecoPage extends BasePage{

	private static final By RADIO = By.xpath("//label[@class='choosePrice ideal-radiocheck-label']");
	private static final By BUTTON_PREV = By.id("preventerproductdata");
	private static final By BUTTON_NEXT = By.id("nextsendquote");

	Utils util = new Utils();
	
	public void preencherAbaPreco(Preco preco) {
		selecionarPlano(preco.getPlano());
	}

	public void selecionarPlano(String plano) {
		List<WebElement> label = obterElementos(RADIO);
		if (label.size()>0) {

			for (WebElement o : label) {
				WebElement radio = o.findElement(By.xpath("//input[@value='"+plano+"']"));
				if(radio.getSize() != null) {
					WebElement parentElement = radio.findElement(By.xpath("./.."));
					parentElement.click();
				}
			}
		}
	}		
	
	public void clicarPrev() {
		clicar(BUTTON_PREV);
	}
	
	public void clicarProximo() {
		clicar(BUTTON_NEXT);
	}	
}
