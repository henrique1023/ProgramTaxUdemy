package controller;

import javax.swing.JOptionPane;

public class ImpostoSaoPaulo implements ImpostoUrbano{

	@Override
	public void calculaImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total: "));
		int numComodo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cômodos: "));
		
		double imposto = (areaTotal * 10) + (numComodo * 2);
		System.out.println("Imposto a pagar: " + imposto);
		
	}

}
