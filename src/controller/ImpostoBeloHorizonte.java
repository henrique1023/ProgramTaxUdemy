package controller;

import javax.swing.JOptionPane;

public class ImpostoBeloHorizonte implements ImpostoUrbano{

	@Override
	public void calculaImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a �rea total: "));
		int numQuartos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de quartos: "));
		
		double imposto = (areaTotal * 7) + (numQuartos * 4);
		System.out.println("Imposto a pagar: " + imposto);
	}

}
