package br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone;

import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory.CountryRulesAbstractFactory;

public abstract class IPhone {
	CountryRulesAbstractFactory rules;

	public IPhone(CountryRulesAbstractFactory rules){
		this.rules = rules;
	}

	public abstract void getHardware();
	
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
		rules.getCertificates().applyCertification();
	}

	public void pack() {
		System.out.println("Packing the device");
		rules.getPacking().pack();
	}
}
