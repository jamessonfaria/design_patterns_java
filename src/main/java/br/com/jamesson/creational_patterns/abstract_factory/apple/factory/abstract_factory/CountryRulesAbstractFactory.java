package br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory;

import br.com.jamesson.creational_patterns.abstract_factory.apple.model.certificate.Certificate;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
	
	Packing getPacking();
}
