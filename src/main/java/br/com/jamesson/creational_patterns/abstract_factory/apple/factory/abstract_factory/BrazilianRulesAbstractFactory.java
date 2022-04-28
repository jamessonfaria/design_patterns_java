package br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory;

import br.com.jamesson.creational_patterns.abstract_factory.apple.model.certificate.BrazilianCertificate;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.certificate.Certificate;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.packing.BrazilianPacking;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
