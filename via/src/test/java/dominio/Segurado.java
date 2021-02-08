package dominio;

public class Segurado {
	private String name;
	private String lastname;
	private String nascimento;
	private String gender;
	private String endereco;
	private String pais;	
	private String cep;	
	private String cidade;
	private String ocupacao;
	private String hobbie;
	private String website;
	private String picture;
	
	public Segurado() {
		
	}
	
	public Segurado(String name, String lastname, String nascimento, String pais, String cep, String ocupacao,
			String hobbie) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.nascimento = nascimento;
		this.pais = pais;
		this.cep = cep;
		this.ocupacao = ocupacao;
		this.hobbie = hobbie;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public String getHobbie() {
		return hobbie;
	}
	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	

}
