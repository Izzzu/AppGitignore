package sda;

import java.util.LinkedList;
import java.util.List;

public class Company {
	private List<Employee> employees;
	
	public Company(){
		this.employees = new LinkedList<>();
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public double sumOfSalaries() {
		//TODO: zaimplementuj - suma zarobków pracowników
		//zarobki pracowników obliczane są za pomocą metodu calculateNetSalary
		return 0.0;
	}
	
	public double avgOfSalaries() {
		//TODO: zaimplementuj - średnie zarobki pracowników
		return 0.0;
	}
	

}
