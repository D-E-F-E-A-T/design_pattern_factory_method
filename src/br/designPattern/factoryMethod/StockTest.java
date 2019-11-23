package br.designPattern.factoryMethod;

import br.designPattern.factoryMethod.Entities.Product;
import br.designPattern.factoryMethod.Factories.FactoryBook;
import br.designPattern.factoryMethod.Factories.FactoryEletronic;
import br.designPattern.factoryMethod.Factories.FactoryHygiene;
import br.designPattern.factoryMethod.Factories.FactoryProduct;

public class StockTest {

	public static void main(String[] args) {
		
		FactoryProduct factoryProduct = new FactoryBook();
		Product product = factoryProduct.create("O Senhor dos An�is - A Sociedade do Anel");
		product.showInformation();
		
		product = factoryProduct.create("O Senhor dos An�is - As duas Torres");
		product.showInformation();
		
		product = factoryProduct.create("O Senhor dos An�is - O retorno de Rei");
		product.showInformation();
		
		factoryProduct = new FactoryEletronic();
		product = factoryProduct.create("PS4 PRO 1TB + FIFA 2020 Gr�tis");
		product.showInformation();
		
		product = factoryProduct.create("Televis�o 5K LG - 43 polegadas");
		product.showInformation();
		
		product = factoryProduct.create("Smartphone Motorola");
		product.showInformation();
			
		factoryProduct = new FactoryHygiene();
		product = factoryProduct.create("Shampoo e Condicionador");
		product.showInformation();
		
		product = factoryProduct.create("Escova de dente Oral-B");
		product.showInformation();
		
		product = factoryProduct.create("Creme dental Colgate");
		product.showInformation();

	}

}
