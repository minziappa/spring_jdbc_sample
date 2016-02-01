package io.sample.batch.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import io.sample.batch.bean.model.SampleData;
import io.sample.batch.dao.mapper.CustomMapper;

public class AbstractDao implements DefaultDao {

	// @Autowired 
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate; 

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public List<SampleData> getSampleData() {

		String sql = "SELECT * FROM sample_data";

		SqlParameterSource sqlParameterSource = new MapSqlParameterSource();

		List<SampleData> sampleDataList = namedParameterJdbcTemplate.query(sql, sqlParameterSource, new CustomMapper());

		for(SampleData sampleData : sampleDataList) {
			System.out.println(">>>dataDummy1 >> " + sampleData.getDataDummy1());
		}

		return sampleDataList;
	}
	
}