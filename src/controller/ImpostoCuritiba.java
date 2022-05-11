package controller;

import javax.swing.JOptionPane;

public class ImpostoCuritiba implements ImpostoUrbano{

	@Override
	public void calculaImposto() {
		
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total: "));
		int idadeImovel = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos tem o imovel: "));
		double aux = 0;
		
		if(idadeImovel > 50) {
			aux = idadeImovel * 3;
		}else if(idadeImovel < 20) {
			aux = idadeImovel * 2;
		}else {
			aux = idadeImovel * 2.5;
		}
		
		double imposto = (areaTotal * 10) + aux;
		System.out.println("Imposto a pagar: " + imposto);
	}

}
