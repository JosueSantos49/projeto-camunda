package com.exemplo.primeiro;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SomaDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Long a = (Long) execution.getVariable("a");
		Long b = (Long) execution.getVariable("b");
		
		execution.setVariable("resultado", a+b);
	}

}
