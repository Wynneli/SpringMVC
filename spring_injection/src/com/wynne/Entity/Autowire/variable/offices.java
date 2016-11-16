package com.wynne.Entity.Autowire.variable;

public class offices {
	private String officeNo;
	private String size;
	public String getOfficeNo() {
		return officeNo;
	}
	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String toString(){
		return "officeNo:"+officeNo+"\t"+"size:"+size;
	}
}
