package br.com.jamesson.behavioral_patterns.chain.processplus.steps;

import java.util.Map;

import br.com.jamesson.behavioral_patterns.chain.processplus.repository.UserRepository;
import br.com.jamesson.behavioral_patterns.chain.processplus.service.ProcessContext;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	@SuppressWarnings("unchecked")
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = (Map<String, Object>) context.get("input");
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
