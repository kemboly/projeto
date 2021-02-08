package dominio;

public class Veiculo {
	
	private String marca;	
	private String motor;
	private String dateofmanufacture;
	private int numberofseats;
	private String fuel;	
	private float listprice;
	private String licenseplatenumber;
	private int annualmileage;
	
	public Veiculo() {
		
	}
	
		
	public Veiculo(String marca, String motor, String dateofmanufacture, int numberofseats, String fuel, float listprice,
			String licenseplatenumber, int annualmileage) {
		super();
		this.marca = marca;
		this.motor = motor;
		this.dateofmanufacture = dateofmanufacture;
		this.numberofseats = numberofseats;
		this.fuel = fuel;
		this.listprice = listprice;
		//this.licenseplatenumber = licenseplatenumber;
		this.annualmileage = annualmileage;
	}


	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public String getDateofmanufacture() {
		return dateofmanufacture;
	}
	
	public void setDateofmanufacture(String dateofmanufacture) {
		this.dateofmanufacture = dateofmanufacture;
	}
	
	public int getNumberofseats() {
		return numberofseats;
	}
	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public float getListprice() {
		return listprice;
	}
	
	public void setListprice(float listprice) {
		this.listprice = listprice;
	}
	
	public String getLicenseplatenumber() {
		return licenseplatenumber;
	}
	
	public void setLicenseplatenumber(String licenseplatenumber) {
		this.licenseplatenumber = licenseplatenumber;
	}
	
	public int getAnnualmileage() {
		return annualmileage;
	}
	
	public void setAnnualmileage(int annualmileage) {
		this.annualmileage = annualmileage;
	}
}
