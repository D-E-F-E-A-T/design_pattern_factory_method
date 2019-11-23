package br.designPattern.factoryMethod.Factories;

import br.designPattern.factoryMethod.Entities.Product;

public interface FactoryProduct {
	Product create(String name);
}
