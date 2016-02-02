package io.sample.batch.job;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import io.sample.batch.dao.SampleDao;

public class CustomTaskletStep implements Tasklet {

	@Autowired
	private SampleDao abstractDao;

	@Override
	public RepeatStatus execute(StepContribution contribution, 
			ChunkContext chunkContext) throws Exception {
		
		System.out.println("test");
		abstractDao.getSampleData();

		return null;
	}

}