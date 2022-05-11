package controller;

import javax.swing.JOptionPane;

public class ImpostoBeloHorizonte implements ImpostoUrbano{

	@Override
	public void calculaImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total: "));
		int numQuartos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de quartos: "));
		
		double imposto = (areaTotal * 7) + (numQuartos * 4);
		System.out.println("Imposto a pagar: " + imposto);
	}

}
