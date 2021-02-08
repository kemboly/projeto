package pages;

import org.openqa.selenium.By;

import helper.BasePage;

public class MenuPage extends BasePage {
	private static final By AUTOMOBILE 	= By.id("nav_automobile");
	private static final By TRUCK 		= By.id("nav_truck");
	private static final By MOTORCYCLE 	= By.id("nav_motorcycle");
	private static final By CAMPER 		= By.id("nav_camper");
	private static final By SELECTED_INSURANCE	= By.id("selectedinsurance");	

	
	public void menuAutomovel() {
		clicar(AUTOMOBILE);
	}
	
	public void menuTrator() {
		clicar(TRUCK);
	}
	
	public void menuMoto() {
		clicar(MOTORCYCLE);
	}
	
	public void menuTrailer() {
		clicar(CAMPER);
	}

	public boolean verificarFormulario(String string) {
		String texto;
		do {
			texto = obterTexto(SELECTED_INSURANCE).trim();
			sleep(1);	
		} while (texto.equals("undefined Insurance"));
		
		return texto.equals(string);
	}
	
	
	public boolean verificarMensagem(String mensagem) {
		String elemento = obterTexto(By.xpath("//div[@class='sweet-alert showSweetAlert visible']"));
		return elemento.contains(mensagem);
	}
}
