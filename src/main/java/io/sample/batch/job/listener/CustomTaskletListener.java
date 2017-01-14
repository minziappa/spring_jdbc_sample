package io.sample.batch.job.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class CustomTaskletListener implements StepExecutionListener {

	@Override
	public void beforeStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		System.out.println("beforeStep");
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		System.out.println("afterStep");
		
		System.out.println("exitStatus -> " + stepExecution.getExitStatus().getExitCode());

		return ExitStatus.COMPLETED;
	}

}
