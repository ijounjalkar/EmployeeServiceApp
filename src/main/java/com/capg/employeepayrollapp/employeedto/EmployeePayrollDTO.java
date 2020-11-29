package com.capg.employeepayrollapp.employeedto;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

public class EmployeePayrollDTO {
	@NotEmpty(message = "Name should not be null")
	public String name;
	@NotNull
	public long salary;

}
