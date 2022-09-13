package com.bridgelabz.employeepayroll;

public class EmployeePayrollData {
	public Integer id;
	public String name;
	public Double salary;
	public EmployeePayrollData(Integer id,String name,Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "id="+id+", Name='"+name+'\''+", Salary="+salary;
	}

}
