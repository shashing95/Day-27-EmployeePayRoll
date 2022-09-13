package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {
		CONSOLE_IO;
	}
	private List<EmployeePayrollData> employeePayrollList;
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList=employeePayrollList;
	}
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList=new ArrayList<>();
		EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollList);
		Scanner sc=new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(sc);
		employeePayrollService.writeEmployeePayrollData();
	}
	private void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll to Console\n"+employeePayrollList);
		
	}
	private void readEmployeePayrollData(Scanner sc) {
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name");
		String name=sc.next();
		System.out.println("Enter Employee Salary");
		double salary=sc.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

}
