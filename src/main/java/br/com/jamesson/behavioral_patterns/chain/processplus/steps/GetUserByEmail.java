package br.com.jamesson.behavioral_patterns.chain.processplus.steps;

import br.com.jamesson.behavioral_patterns.chain.processplus.repository.UserRepository;
import br.com.jamesson.behavioral_patterns.chain.processplus.service.ProcessContext;

public class GetUserByEmail extends ProcessStep {
	
	public GetUserByEmail(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		String email = (String) context.get("input.email");
		Object user = UserRepository.getInstance().getUserByEmail(email);
		if(user == null)  throw new Exception("User not found");
		context.put("user", user);
		return next(context, user);
	}

}
