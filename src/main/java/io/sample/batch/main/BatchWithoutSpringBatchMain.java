package io.sample.batch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.sample.batch.dao.SampleDao;

public class BatchWithoutSpringBatchMain {

	final static Logger logger = LoggerFactory.getLogger(BatchWithoutSpringBatchMain.class);

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		SampleDao abstractDao = (SampleDao) context.getBean("abstractDao");

		abstractDao.getSampleData();
		System.out.println("Done");
	}

}