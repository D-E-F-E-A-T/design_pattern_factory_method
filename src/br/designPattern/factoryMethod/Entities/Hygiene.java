package br.designPattern.factoryMethod.Entities;

public class Hygiene implements Product {
	
	private String name;	
	
	public Hygiene(String name) {
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