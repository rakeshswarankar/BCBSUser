package com.bcbs.database;

import java.util.ArrayList;
import java.util.List;

import com.bcbs.model.Employee;
import com.bcbs.model.EmployeeVacation;
import com.bcbs.model.User;


public class DBUtil {

	// This is the dummy list we have created for testing purpose
	private static List<User> userList;
	
	private static List<Employee> employeeList;
	
	private static List<EmployeeVacation> empVacList;
	
	// Static init block
	static{
		userList = new ArrayList<User>();
		User u1= new User("Tucker", "Govan", "Las Vegas"); 
		User u2= new User("Rick", "Simmon", "Atlanta");
		User u3= new User("Charli", "Sander", "Nashville");
		User u4= new User("Ross", "Taylor", "Memphis");
		User u5= new User("Bannie", "Leith", "New york");
		User u6= new User("Alice", "Underwood", "Chicago");
		User u7= new User("Dewey", "Layman", "Orlando");
		User u8= new User("Charles", "Sander", "Nashville");
		User u9= new User("Ross", "Trump", "Gatlinberg"); // First name same
		User u10= new User("Charles", "Sander", "Nashville");// Duplicate
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);
		
		/*---------- For Vacation system -----------------*/
		employeeList = new ArrayList<Employee>();
		
		Employee e1= new Employee(1, "Leroy", "Leroy", "pass", 40);
		Employee e2= new Employee(2, "Rick", "Rick", "pass", 20);
		Employee e3= new Employee(3, "Charles", "Charles", "pass", 30);
		Employee e4= new Employee(4, "Danny", "Danny", "pass", 10);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		empVacList = new ArrayList<EmployeeVacation>();
		
	}
	
	public static List<User> getUserList() {
		return userList;
	}

	public static void setUserList(List<User> userList) {
		DBUtil.userList = userList;
	}

	public static List<Employee> getEmployeeList() {
		
		return employeeList;
	}

	public static void setEmployeeList(List<Employee> employeeList) {
		DBUtil.employeeList = employeeList;
	}

	public static List<EmployeeVacation> getEmpVacList() {
		return empVacList;
	}

	public static void setEmpVacList(List<EmployeeVacation> empVacList) {
		DBUtil.empVacList = empVacList;
	}
	
	
}
