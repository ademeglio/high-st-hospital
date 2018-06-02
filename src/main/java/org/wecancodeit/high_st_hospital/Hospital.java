package org.wecancodeit.high_st_hospital;

import java.util.HashMap;
import java.util.Map;

public class Hospital {

	private Map<String, Employee> employees = new HashMap<String, Employee>();

	
	public void addStaff(Employee employee) {
		employees.put(employee.getNumber(), employee);	
	}

	public int staffSize() {
		return employees.size();
	}

	public Employee getStaffByNumber(String number) {
		return employees.get(number);
	}

}
