package utils;

import static helper.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utils {
	public void enviarArquivo(By elemento, String path) {
		String dir = System.getProperty("user.dir");
		String caminho = dir+path;

		WebElement fileInput = getDriver().findElement(elemento);
		fileInput.sendKeys(caminho);
	}
	
	
	public String[] splitString(String texto, String delimitador) {
		String[] s = texto.split(delimitador);
		return s;
	}
}
