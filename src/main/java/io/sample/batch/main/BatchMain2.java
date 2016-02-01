package io.sample.batch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.sample.batch.dao.AbstractDao;

public class BatchMain2 {

	final static Logger logger = LoggerFactory.getLogger(BatchMain2.class);

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		AbstractDao abstractDao = (AbstractDao) context.getBean("abstractDao");

		abstractDao.getSampleData();
		System.out.println("Done");
	}

}