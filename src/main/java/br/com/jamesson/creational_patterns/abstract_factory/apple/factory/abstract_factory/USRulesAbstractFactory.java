package br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory;

import br.com.jamesson.creational_patterns.abstract_factory.apple.model.certificate.Certificate;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.certificate.USCertificate;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.packing.Packing;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
