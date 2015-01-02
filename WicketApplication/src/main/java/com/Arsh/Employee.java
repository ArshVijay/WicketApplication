package com.Arsh;

import java.io.Serializable;

import org.apache.wicket.model.IModel;

public class Employee implements Serializable{
	private String empNO;
	private String empName;
	private String user;
	private String pass;
	public String getEmpNO() {
		return empNO;
	}
	public void setEmpNO(String empNO) {
		this.empNO = empNO;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
