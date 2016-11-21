package com.bcbs.model;

import java.util.Date;

public class EmployeeVacation {

	private int employeeId; // FK from Employee
	private int vacationId; // PK for EmployeeVacation
	private Date startDate; // Starting date of vacation
	private Date endDate;   // Ending date of vacation
	private String vacationType; // Sick or Personal
	private String status; // Approved or Denied
	
	public EmployeeVacation()
	{
		
	}
	public EmployeeVacation(int employeeId, int vacationId, Date startDate,
			Date endDate, String vacationType, String status) {
		super();
		this.employeeId = employeeId;
		this.vacationId = vacationId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.vacationType = vacationType;
		this.status = status;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getVacationId() {
		return vacationId;
	}
	public void setVacationId(int vacationId) {
		this.vacationId = vacationId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getVacationType() {
		return vacationType;
	}
	public void setVacationType(String vacationType) {
		this.vacationType = vacationType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + vacationId;
		result = prime * result
				+ ((vacationType == null) ? 0 : vacationType.hashCode());
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
		EmployeeVacation other = (EmployeeVacation) obj;
		if (employeeId != other.employeeId)
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (vacationId != other.vacationId)
			return false;
		if (vacationType == null) {
			if (other.vacationType != null)
				return false;
		} else if (!vacationType.equals(other.vacationType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmployeeVacation [employeeId=" + employeeId + ", vacationId="
				+ vacationId + ", startDate=" + startDate + ", endDate="
				+ endDate + ", vacationType=" + vacationType + ", status="
				+ status + "]";
	}
	
}
