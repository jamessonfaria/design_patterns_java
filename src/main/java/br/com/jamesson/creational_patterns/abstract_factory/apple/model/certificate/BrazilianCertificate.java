package br.com.jamesson.creational_patterns.abstract_factory.apple.model.certificate;

public class BrazilianCertificate implements Certificate {

	public String applyCertification() {
		return "\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp";
	}

}
