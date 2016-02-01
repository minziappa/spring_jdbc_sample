package io.sample.batch.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import io.sample.batch.bean.model.SampleData;

public class CustomMapper implements RowMapper<SampleData> {

	@Override
	public SampleData mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
