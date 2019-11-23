package br.designPattern.factoryMethod.Factories;

import br.designPattern.factoryMethod.Entities.Book;
import br.designPattern.factoryMethod.Entities.Product;

public class FactoryBook implements FactoryProduct{

	@Override
	public Product create(String name) {
		return new Book(name);
	}

}
