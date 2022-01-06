package entities;

public class PhysicalPerson extends taxpayer{
	
	private Double healthExpenses;
	
	public PhysicalPerson() {
	}
	
	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double taxPayment() {
		double tax = 0.0;
		if(getAnnualIncome() < 20000) {
			tax += getAnnualIncome() * 0.15;
			tax -= healthExpenses / 2;
		}else {
			tax += getAnnualIncome() * 0.25;
			tax -= healthExpenses / 2;
		}
		return tax;
	}

}
