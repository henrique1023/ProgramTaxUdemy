package entities;

public class CompanyTax extends taxpayer{
	
	private Integer employees;
	
	public CompanyTax() {
	}
	
	public CompanyTax(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double taxPayment() {
		if(employees <= 10) {
			return getAnnualIncome() * 0.16;
		}else {
			return getAnnualIncome() * 0.14;
		}
	}
	
}