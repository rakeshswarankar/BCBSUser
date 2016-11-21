package com.bcbs.controller;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bcbs.database.DBUtil;
import com.bcbs.model.Employee;
import com.bcbs.model.EmployeeVacation;
import com.bcbs.model.User;

@Controller
public class VacationController {

	
	private static final String VIEW_LOGIN = "login";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(VacationController.class);
	private static List<Employee> empList= DBUtil.getEmployeeList();
	
	// For get the first request 
	@RequestMapping( value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("vacation login!");
		model.addAttribute("employee", new Employee());
		
		logger.debug("[VacationController] login!");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_LOGIN;

	}

	// Handle submitted user detail and response with Welcome page
	@RequestMapping(value = "/vacation", method = RequestMethod.POST)
	public String loginProcess(@ModelAttribute("employee") Employee employee, ModelMap model) {
		boolean loginFlag= false;
		System.out.println("vacation apply "+employee.getEmployeeUserName() + "  "+employee.getEmployeePassward());
		
		// Check login credential
		for (Employee emp : empList) 
		{			
			System.out.println(emp.getEmployeeUserName() + " -- "+emp.getEmployeePassward());
			if(emp.getEmployeeUserName().equals(employee.getEmployeeUserName()))
			{
				if(emp.getEmployeePassward().equals(employee.getEmployeePassward()))
				{
					employee = emp; // For keep track of emp id to get available hours and session
					loginFlag= true;
					break;
				}
					
			}
		}
		model.addAttribute("employee", employee);
		
		if(loginFlag){
			logger.debug("[VacationController] vacation apply!");
			EmployeeVacation employeeVacation=new EmployeeVacation();
			employeeVacation.setEmployeeId(employee.getEmployeeId());
			
			model.addAttribute("employeeVacation", employeeVacation);
			System.out.println("Login Successful!");
			return "vacationApply";
		}
		else
		{
			logger.debug("[VacationController] login Failed!");
			System.out.println("Login Failed!");
			return VIEW_LOGIN;
		}		
	}
	
	// Handle submitted user detail and response with Welcome page
		@RequestMapping(value = "/vacationApply", method = RequestMethod.POST)
		public String vacationProcess(@ModelAttribute("employeeVacation") EmployeeVacation employeeVacation, ModelMap model) {
			boolean loginFlag= false;
			
			
			int diff=employeeVacation.getEndDate().compareTo(employeeVacation.getStartDate());
			diff=+1;
			int totlaHours=diff*8;
			
			System.out.println("diff "+totlaHours);
			
			System.out.println(employeeVacation.getEmployeeId());
			Employee emp = getEmployee(employeeVacation.getEmployeeId());
			if(emp != null && emp.getAvilableHours()>=totlaHours)
			{
				for (Employee employee : empList) {
					if(emp.getEmployeeId() == employee.getEmployeeId())
					{
						employee.setAvilableHours(emp.getAvilableHours()-totlaHours);
						
						List<EmployeeVacation> empVacList= DBUtil.getEmpVacList();
						employeeVacation.setEmployeeId(employee.getEmployeeId());
						employeeVacation.setVacationId(empVacList.size()+1);
						
						empVacList.add(employeeVacation);
						break;
					}
				}
				
				printEmp();
				return "success";
			}
			else
			{
				return "failed";
			}
			
		}
		
		public void printEmp(){
			
			for (Employee employee : empList) {
				System.out.println(employee.toString());
			}
			
			List<EmployeeVacation> list = DBUtil.getEmpVacList();
			for (EmployeeVacation employeeVacation : list) {
				System.out.println(employeeVacation.toString());
			}
		}
		
		public Employee getEmployee(int empId)
		{
			for (Employee employee : empList) {
				if(employee.getEmployeeId() == empId)
					return employee;
			}
			return null;
		}
		
}


// I can improvise this solution or task using Validator and Exception handing and Binding Result