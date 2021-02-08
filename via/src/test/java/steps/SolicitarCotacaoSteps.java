package steps;
import static org.junit.Assert.assertTrue;

import dominio.Cotacao;
import dominio.Preco;
import dominio.Produto;
import dominio.Segurado;
import dominio.Veiculo;
import helper.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CotacaoPage;
import pages.MenuPage;
import pages.PrecoPage;
import pages.ProdutoPage;
import pages.SeguradoPage;
import pages.VeiculoPage;

public class SolicitarCotacaoSteps {
	
	
	CotacaoPage cotacaoPage = new CotacaoPage();
	
	@Before
	public void setUp() {
		DriverFactory.getDriver();
	}
	
	@Dado("que eu acesse o formulario de automovel")
	public void que_eu_acesse_o_formulario_de_automovel() {
	    MenuPage menu = new MenuPage();
	    menu.menuAutomovel();
	    assertTrue(menu.verificarFormulario("Automobile Insurance"));
	}

	@E("que a seguinte proposta seja preenchida:")
	public void que_a_seguinte_proposta_seja_preenchida(DataTable dataTable) {
	 	DataTable data = dataTable;

	 	VeiculoPage veiculoPage = new VeiculoPage();
	 	SeguradoPage seguradoPage = new SeguradoPage();
	 	ProdutoPage produtoPage = new ProdutoPage();

	 	Veiculo carro = new Veiculo();
	 	Segurado segurado = new Segurado();
	 	Produto produto = new Produto();
	 	
	 	carro.setMarca(data.cell(0,1));
	 	carro.setMotor(data.cell(1,1));
	 	carro.setDateofmanufacture(data.cell(2,1));
	 	carro.setNumberofseats(Integer.parseInt(data.cell(3,1)));
	 	carro.setFuel(data.cell(4,1));
	 	carro.setListprice(Float.parseFloat(data.cell(5,1)));
	 	carro.setLicenseplatenumber(data.cell(6,1));
	 	carro.setAnnualmileage(Integer.parseInt(data.cell(7,1)));
	 	
        veiculoPage.preencherAbaVeiculo(carro);
        veiculoPage.clicarProximo();
        
	 	segurado.setName(data.cell(8,1));
	 	segurado.setLastname(data.cell(9,1));
	 	segurado.setNascimento(data.cell(10,1));
	 	segurado.setGender(data.cell(11,1));
	 	segurado.setEndereco(data.cell(12,1));
	 	segurado.setPais(data.cell(13,1));
	 	segurado.setCep(data.cell(14,1));
	 	segurado.setCidade(data.cell(15,1));
        segurado.setOcupacao(data.cell(16,1));
        segurado.setHobbie(data.cell(17,1));
        segurado.setWebsite(data.cell(18,1));
        segurado.setPicture(data.cell(19,1));
        
        seguradoPage.preencherAbaSegurado(segurado);
        seguradoPage.clicarProximo();
        
        produto.setStartDate(data.cell(20,1));
        produto.setInsuranceSum(data.cell(21,1));
        produto.setMeritRating(data.cell(22,1));
        produto.setDamageInsurance(data.cell(23,1));
        produto.setOpProducts(data.cell(24,1));
        produto.setCourtesyCar(data.cell(25,1));
        
        produtoPage.preencherAbaProduto(produto);
        produtoPage.clicarProximo();
        
	}

	@Quando("selecionar o plano {string}")
	public void selecionar_o_plano(String string) {
	    PrecoPage precoPage = new PrecoPage();
	    Preco preco = new Preco();
	    
	    preco.setPlano(string);
	    
	    precoPage.preencherAbaPreco(preco);
	    
	    precoPage.clicarProximo();
	}

	@Quando("clicar no botao Next")
	public void clicar_no_botao_next() {
		ProdutoPage produtoPage = new ProdutoPage();
		produtoPage.clicarProximo();
	}

	@Quando("preencher minhas informacoes")
	public void preencher_minhas_informacoes(DataTable dataTable) {
		DataTable data = dataTable;


	 	Cotacao cotacao = new Cotacao();
	 	
	 	cotacao.setEmail(data.cell(0,1));
	 	cotacao.setPhone(data.cell(1,1));
	 	cotacao.setUsername(data.cell(2,1));
	 	cotacao.setPassword(data.cell(3,1));
	 	cotacao.setComments(data.cell(4,1));

	 	cotacaoPage.preencherAbaCotacao(cotacao);
	 	
	}
	
	@Quando("clicar no botao Send")
	public void clicar_no_botao_send() {
		CotacaoPage cotacao = new CotacaoPage();
	 	
	 	cotacao.clicarEnviar();
	}

	@Entao("devo visualizar a mensagem {string}")
	public void devo_visualizar_a_mensagem(String string) {
	    MenuPage menu = new MenuPage();
	    MenuPage.esperarLoading();
	    assertTrue(menu.verificarMensagem(string));
	}
	
    @After
	public void tearDown() {
    	DriverFactory.killDriver();
	}	
}
