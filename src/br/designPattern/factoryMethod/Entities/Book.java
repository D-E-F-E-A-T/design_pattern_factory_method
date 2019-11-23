package br.designPattern.factoryMethod.Entities;

public class Book implements Product {
	
	private String name;	
	
	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void showInformation() {
		System.out.println("Produto adicionado ao estoque: " + this.getName());		
	}

}