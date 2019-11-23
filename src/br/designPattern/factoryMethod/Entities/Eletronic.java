package br.designPattern.factoryMethod.Entities;

public class Eletronic implements Product{
	private String name;	
	
	public Eletronic(String name) {
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