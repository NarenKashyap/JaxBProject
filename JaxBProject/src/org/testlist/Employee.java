package org.testlist;

import java.util.Date;

public class Employee {

	int id;
	String name;
	Date joinDate;
	
	public Employee(int id, String name, Date joinDate) {
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joinDate=" + joinDate + "]";
	}
}
