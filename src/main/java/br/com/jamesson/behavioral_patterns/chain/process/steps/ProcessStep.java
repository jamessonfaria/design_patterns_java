package br.com.jamesson.behavioral_patterns.chain.process.steps;

import br.com.jamesson.behavioral_patterns.chain.process.service.ProcessContext;

public abstract class ProcessStep {
	protected ProcessStep nextStep;
	protected Object[] args;
	
	public ProcessStep(Object... args) {
		this.args = args;
	}
	
	public void setNextStep(ProcessStep next) {
		this.nextStep = next;
	}
	
	protected ProcessContext next(ProcessContext context, Object actualResult) throws Exception {
		context.setProcessResult(actualResult);
		return this.nextStep != null? nextStep.execute(context): context;
	}

	public abstract ProcessContext execute(ProcessContext context) throws Exception;
 }
