package br.com.jamesson.behavioral_patterns.chain.process.service;

import br.com.jamesson.behavioral_patterns.chain.process.steps.ProcessStep;
import br.com.jamesson.behavioral_patterns.chain.process.steps.SaveUser;
import br.com.jamesson.behavioral_patterns.chain.process.steps.ValidateMandatoryField;

public class ServicesCatalog {
	
	public static ProcessStep saveUserProcess = buildChain(
			new ValidateMandatoryField("name"),
			new ValidateMandatoryField("email"),
			new ValidateMandatoryField("password"),
			new SaveUser());
	
	private static ProcessStep buildChain(ProcessStep... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			ProcessStep currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}
