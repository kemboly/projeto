package pages;

import org.openqa.selenium.By;

import dominio.Veiculo;
import helper.BasePage;
public class VeiculoPage extends BasePage{

	private static final By MAKE 				= By.id("make");
	private static final By ENGINEPERFORMANCE 	= By.id("engineperformance");
	private static final By DATEOFMANUFACTURE 	= By.id("dateofmanufacture");
	private static final By NUMBEROFSEATS 		= By.id("numberofseats");
	private static final By FUEL 				= By.id("fuel");	
	private static final By LISTPRICE 			= By.id("listprice");
	private static final By LICENSEPLATENUMBER 	= By.id("licenseplatenumber");
	private static final By ANNUALMILEAGE 		= By.id("annualmileage");
	private static final By BUTTON_NEXT 		= By.id("nextenterinsurantdata");
	

	public void preencherAbaVeiculo(Veiculo veiculo) {
		selecionarMarca(veiculo.getMarca());
		preencherPotencia(veiculo.getMotor());
		preencherFabricacao(veiculo.getDateofmanufacture());
		selecionarNroAssentos(String.valueOf(veiculo.getNumberofseats()));
		selecionarCombustivel(veiculo.getFuel());
		preencherPreco(Float.toString(veiculo.getListprice()));
		preencherPlaca(veiculo.getLicenseplatenumber());
		preencherMilhagem(Integer.toString(veiculo.getAnnualmileage()));
	
	}

	public void selecionarMarca(String marca) {
		selecionarCombo(MAKE, marca);
	}

	public void preencherPotencia(String potencia) {
		escrever(ENGINEPERFORMANCE, potencia);
	}	

	public void preencherFabricacao(String data) {
		escrever(DATEOFMANUFACTURE, data);
	}

	public void selecionarNroAssentos(String assento) {
		selecionarCombo(NUMBEROFSEATS, assento);
	}

	public void selecionarCombustivel(String combustivel) {
		selecionarCombo(FUEL, combustivel);
	}

	public void preencherPreco(String preco) {
		escrever(LISTPRICE, preco);
	}	

	public void preencherPlaca(String placa) {
		escrever(LICENSEPLATENUMBER, placa);
	}

	public void preencherMilhagem(String milhagem) {
		escrever(ANNUALMILEAGE, milhagem);
	}

	public void clicarProximo() {
		clicar(BUTTON_NEXT);
	}
}
