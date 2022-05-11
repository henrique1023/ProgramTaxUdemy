package controller;

import javax.swing.JOptionPane;

public class ImpostoPortoAlegre implements ImpostoUrbano{

	@Override
	public void calculaImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total: "));
		int areaGaragem = Integer.parseInt(JOptionPane.showInputDialog("Digite a área da garagem: "));
		
		double imposto = 0;
		if(areaGaragem == 0) {
			imposto = (areaTotal * 8);
		}else {
			imposto = (areaTotal * 7.5) + (areaGaragem * 2.5);
		}
		
		System.out.println("Imposto a pagar: " + imposto);
	}

}
