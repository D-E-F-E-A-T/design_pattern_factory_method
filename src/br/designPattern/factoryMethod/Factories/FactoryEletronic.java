package br.designPattern.factoryMethod.Factories;

import br.designPattern.factoryMethod.Entities.Eletronic;
import br.designPattern.factoryMethod.Entities.Product;

public class FactoryEletronic implements FactoryProduct {

	@Override
	public Product create(String name) {
		return new Eletronic(name);
	}
	
}
