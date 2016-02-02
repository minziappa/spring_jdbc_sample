package io.sample.batch.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import io.sample.batch.bean.model.SampleData;

public class CustomMapper implements RowMapper<SampleData> {

	@Override
	public SampleData mapRow(ResultSet rs, int rowNum) throws SQLException {
		SampleData sample = new SampleData();
		sample.setDataId(rs.getInt("data_id"));
		sample.setDataTitle(rs.getString("data_title"));
		sample.setDataDummy1(rs.getString("data_dummy1"));
		sample.setDataDummy2(rs.getString("data_dummy2"));
		sample.setDataDummy3(rs.getString("data_dummy3"));
		return sample;
	}

}
