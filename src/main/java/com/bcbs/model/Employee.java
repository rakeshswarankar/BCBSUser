package com.bcbs.model;

import java.util.Arrays;

public class Employee {

	
	private int employeeId;
	private String employeeName;
	private String employeeUserName;
	private String employeePassward;
	private int avilableHours; // We can take float by considering 30 minutes off
	
	
	public Employee()
	{
		
	}
	
	public Employee(int employeeId, String employeeName,
			String employeeUserName, String employeePassward, int avilableHours) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeUserName = employeeUserName;
		this.employeePassward = employeePassward;
		this.avilableHours = avilableHours;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeUserName=" + employeeUserName
				+ ", employeePassward=" + employeePassward + ", avilableHours="
				+ avilableHours + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avilableHours;
		result = prime * result + employeeId;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((employeePassward == null) ? 0 : employeePassward.hashCode());
		result = prime
				* result
				+ ((employeeUserName == null) ? 0 : employeeUserName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (avilableHours != other.avilableHours)
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeePassward == null) {
			if (other.employeePassward != null)
				return false;
		} else if (!employeePassward.equals(other.employeePassward))
			return false;
		if (employeeUserName == null) {
			if (other.employeeUserName != null)
				return false;
		} else if (!employeeUserName.equals(other.employeeUserName))
			return false;
		return true;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeUserName() {
		return employeeUserName;
	}
	public void setEmployeeUserName(String employeeUserName) {
		this.employeeUserName = employeeUserName;
	}
	public String getEmployeePassward() {
		return employeePassward;
	}
	public void setEmployeePassward(String employeePassward) {
		this.employeePassward = employeePassward;
	}
	public int getAvilableHours() {
		return avilableHours;
	}
	public void setAvilableHours(int avilableHours) {
		this.avilableHours = avilableHours;
	}
	
	
}
