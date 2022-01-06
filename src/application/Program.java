package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyTax;
import entities.PhysicalPerson;
import entities.taxpayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<taxpayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Tax payer #" + i + "data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'i') {
				sc.nextLine();
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthExpenses));
			}else {
				sc.nextLine();
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new CompanyTax(name, annualIncome, employees));
			}
		}
		
		System.out.println("TAXES PAID: ");
		double aux = 0.0;
		for(taxpayer t : list) {
			System.out.print(t.getName()+ " : " + String.format("%.2f", t.taxPayment()) + "\n");
			aux += t.taxPayment();
		}
		
		System.out.print("TOTAL TAXES: $" + String.format("%.2f", aux));
	}

}
