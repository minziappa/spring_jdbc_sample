package io.sample.batch.bean.model;

import java.util.Date;

public class SampleData {

	private int dataId;
	private String dataTitle;
	private String dataDummy1;
	private String dataDummy2;
	private String dataDummy3;
	private Date insertDate;
	private Date updateDate;

	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getDataTitle() {
		return dataTitle;
	}
	public void setDataTitle(String dataTitle) {
		this.dataTitle = dataTitle;
	}
	public String getDataDummy1() {
		return dataDummy1;
	}
	public void setDataDummy1(String dataDummy1) {
		this.dataDummy1 = dataDummy1;
	}
	public String getDataDummy2() {
		return dataDummy2;
	}
	public void setDataDummy2(String dataDummy2) {
		this.dataDummy2 = dataDummy2;
	}
	public String getDataDummy3() {
		return dataDummy3;
	}
	public void setDataDummy3(String dataDummy3) {
		this.dataDummy3 = dataDummy3;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
