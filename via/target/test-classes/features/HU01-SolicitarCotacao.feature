# language: pt
#Author: camil_nascimento@hotmail.com

@cotacao
Funcionalidade: Solicitar Cotacao
	Como usuário desejo solicitar uma cotacao de seguro para meu veiculo

  @cadastro
  Cenario: Cadastrar Cotacao de Automovel
    Dado que eu acesse o formulario de automovel
    E que a seguinte proposta seja preenchida:
      | Marca         | Honda               |
      | Potencia (kW) |                 228 |
      | Fabricacao    | 02/01/2020          |
      | Nro Assentos  |                   5 |
      | Combustivel   | Gas                 |
      | Preco	(USD)   |               45475 |
      | Placa         | HND4568             |
      | Milhagem	(Mi) |               13500 |
      | Nome          | Camila              |
      | Sobrenome     | Freitas             |
      | Dt Nascimento | 03/10/1989          |
      | Genero        | Female              |
      | Endereco      | Rua 25              |
      | Pais          | Brazil              |
      | CEP           |            72320000 |
      | Cidade        | Brasilia            |
      | Ocupacao      | Employee            |
      | Hobbies       | Speeding,Skydiving  |
      | Website       | www.me.io           |
      | Picture       | \\fixtures\\3x4.png |
      | Start Date    | 03/09/2021          |
      | Insurance Sum |        5.000.000,00 |
      | Merit Rating  | Bonus 3             |
      | Damage Ins    | Partial Coverage    |
      | Optional Prod | Euro Protection     |
      | Courtesy Car  | Yes                 |
    Quando selecionar o plano "Platinum"
    E preencher minhas informacoes
      | E-Mail       | teste@teste.com |
      | Phone        |      6199999999 |
      | Username     | teste           |
      | Password     | Teste54         |
      | Confirm Pass | Teste54         |
      | Comments     | Yes             |
    E clicar no botao Send
    Entao devo visualizar a mensagem "Sending e-mail success!"
