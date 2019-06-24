package com.app.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	@Id
	private String id;
	private Integer sId;
	private String sName;
	private String fee;
	private List<String> sSub;
	private Adress addr;
	public Student() {
		super();
	}
	public Student(Integer sId, String sName, String fee, List<String> sSub, Adress addr) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.fee = fee;
		this.sSub = sSub;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public List<String> getsSub() {
		return sSub;
	}
	public void setsSub(List<String> sSub) {
		this.sSub = sSub;
	}
	public Adress getAddr() {
		return addr;
	}
	public void setAddr(Adress addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sId=" + sId + ", sName=" + sName + ", fee=" + fee + ", sSub=" + sSub + ", addr="
				+ addr + "]";
	}
	

}
