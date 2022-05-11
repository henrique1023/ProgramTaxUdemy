package application;

import controller.ImpostoBeloHorizonte;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;
import controller.ImpostoUrbano;

public class Program {

	public static void main(String[] args) {
		ImpostoUrbano imposto;
		
//		imposto = new ImpostoSaoPaulo();
//		imposto.calculaImposto();
//		
//		imposto = new ImpostoPortoAlegre();
//		imposto.calculaImposto();
//		
//		imposto = new ImpostoBeloHorizonte();
//		imposto.calculaImposto();
		
		imposto = new ImpostoCuritiba();
		imposto.calculaImposto();
	}

}
