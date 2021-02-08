package dominio;

public class Produto {
	
	private String startDate;	
	private String insuranceSum;
	private String meritRating;
	private String damageInsurance;
	private String opProducts;	
	private String courtesyCar;
	
	public Produto() {
		
	}

	
	public Produto(String startDate, String insuranceSum, String meritRating, String damageInsurance, String opProducts,
			String courtesyCar) {
		super();
		this.startDate = startDate;
		this.insuranceSum = insuranceSum;
		this.meritRating = meritRating;
		this.damageInsurance = damageInsurance;
		this.opProducts = opProducts;
		this.courtesyCar = courtesyCar;
	}


	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getInsuranceSum() {
		return insuranceSum;
	}

	public void setInsuranceSum(String insuranceSum) {
		this.insuranceSum = insuranceSum;
	}

	public String getMeritRating() {
		return meritRating;
	}

	public void setMeritRating(String meritRating) {
		this.meritRating = meritRating;
	}

	public String getDamageInsurance() {
		return damageInsurance;
	}

	public void setDamageInsurance(String damageInsurance) {
		this.damageInsurance = damageInsurance;
	}

	public String getOpProducts() {
		return opProducts;
	}

	public void setOpProducts(String opProducts) {
		this.opProducts = opProducts;
	}

	public String getCourtesyCar() {
		return courtesyCar;
	}

	public void setCourtesyCar(String courtesyCar) {
		this.courtesyCar = courtesyCar;
	}
	
		
	
}
