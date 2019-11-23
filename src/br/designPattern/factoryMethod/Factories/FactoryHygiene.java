package br.designPattern.factoryMethod.Factories;

import br.designPattern.factoryMethod.Entities.Hygiene;
import br.designPattern.factoryMethod.Entities.Product;

public class FactoryHygiene implements FactoryProduct {

	@Override
	public Product create(String name) {
		return new Hygiene(name);
	}
	
}

