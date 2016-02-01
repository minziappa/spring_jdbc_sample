package io.sample.batch.job;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import io.sample.batch.dao.AbstractDao;
import io.sample.batch.service.SampleService;

public class CustomTaskletStep implements Tasklet {

	@Autowired
	private AbstractDao abstractDao;

	@Override
	public RepeatStatus execute(StepContribution contribution, 
			ChunkContext chunkContext) throws Exception {
		
		System.out.println("test");
		abstractDao.getSampleData();

		return null;
	}

}