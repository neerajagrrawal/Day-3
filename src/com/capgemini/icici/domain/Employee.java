package com.capgemini.icici.domain ;

public class Employee {
	
	private long empId;
	private String empName;
	private double hra,pf,basicSalary,grossSalary,medical,netSalary ;
	public static final double PT=200 ;
	
	private static long totalEmployees;

	public Employee() {
		totalEmployees++;
	}
	
	public Employee(long empId, String empName, double basicSalary, double medical) {
		this.empId=empId ;
		this.empName=empName ;
		this.basicSalary=basicSalary ;
		this.medical=medical ;
		totalEmployees++;
	}
	
	public Employee(long empId, String empName) {
		this.empId=empId ;
		this.empName=empName ;
		totalEmployees++;
	}

	public double calculateNetSalary() {
		this.hra=basicSalary*0.5 ;
		this.pf=0.12*basicSalary ;
		this.grossSalary=this.hra+this.basicSalary+this.medical ;
		this.netSalary=grossSalary-(this.pf+Employee.PT) ;
		return this.netSalary ;
	}
	
	public double calculateNetSalary(double basicsalary,double medical) {
		this.basicSalary=basicsalary ;
		this.medical=medical ;
		this.hra=basicSalary*0.5 ;
		this.pf=0.12*basicSalary ;
		this.grossSalary=this.hra+this.basicSalary+this.medical ;
		this.netSalary=grossSalary-(this.pf+Employee.PT) ;
		return this.netSalary ;
	}
	
	public long totalEmployees()
	{
		return totalEmployees ;
	}
	
	public void employeeDetails()
	{
		System.out.println("Employee Name: "+this.empName);
		System.out.println("Employee Id: "+this.empId);
		System.out.println("Net Salary: "+this.netSalary);
	}

}
