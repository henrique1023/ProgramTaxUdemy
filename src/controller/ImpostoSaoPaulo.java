package controller;

import javax.swing.JOptionPane;

public class ImpostoSaoPaulo implements ImpostoUrbano{

	@Override
	public void calculaImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a �rea total: "));
		int numComodo = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de c�modos: "));
		
		double imposto = (areaTotal * 10) + (numComodo * 2);
		System.out.println("Imposto a pagar: " + imposto);
		
	}

}
