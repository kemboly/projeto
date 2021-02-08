package helper;

import static helper.DriverFactory.getDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class BasePage {
	public void escrever(By by, String texto ){
		esperar(by);
		getDriver().findElement(by).sendKeys(texto);;
	}


	public void clicar(By by){
		esperar(by);
		getDriver().findElement(by).click();

	}


	public void selecionarCombo(By byCombo, String valor){
		esperar(byCombo);
		Select selectBox = new Select(getDriver().findElement(byCombo));
		selectBox.selectByVisibleText(valor);

	}


	public String obterTexto(By by){
		esperar(by);
		return getDriver().findElement(by).getText(); 
	}


	public List<WebElement> obterElementos(By by){
		esperar(by);
		return getDriver().findElements(by);
	}


	public static void sleep(Integer tmpSegs) {
		try {
			Thread.sleep((long) tmpSegs * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void esperar(By by){
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}


	public void esperar(int tempo){
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}


	public static void esperaDriver(int tempo) {
		getDriver().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}

	public static void esperarLoading() {
		try {
			int i = 30;
			boolean espera = true;
			while (--i > 0 && espera) {
				esperaDriver(5);
				sleep(1);
				List<WebElement> lista = getDriver().findElements(By.id("LoadingPDF"));
				esperaDriver(1);
				espera = elementoVisivel(lista);
	
				if (espera)
					lista.clear();
			}
		} catch (Exception e) {
			return;
		}
	}

	private static boolean elementoVisivel(List<WebElement> lista) {
		for (WebElement element : lista) {		
			if (element.isDisplayed()) {
				return true;
			}
		}
		return false;
	}
	
	public void evidencia(Scenario scenario) {
          scenario.attach(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES), "image/png", "");
	}
}
