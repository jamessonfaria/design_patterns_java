package br.com.jamesson.behavioral_patterns.chain.process.steps;

import java.util.HashMap;
import java.util.Map;

import br.com.jamesson.behavioral_patterns.chain.process.repository.UserRepository;
import br.com.jamesson.behavioral_patterns.chain.process.service.ProcessContext;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = new HashMap<String, Object>();
		userInput.put("name", context.get("name"));
		userInput.put("email", context.get("email"));
		userInput.put("password", context.get("password"));
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
