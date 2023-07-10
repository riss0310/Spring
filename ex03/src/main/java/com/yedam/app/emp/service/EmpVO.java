package com.yedam.app.emp.service;

import java.util.Date;

import lombok.Data;

@Data	//getter, setter사용하는거임 lombok있어야함
public class EmpVO {
	private int employeeId; //setting완료했으면 _쓰지 않아도됨
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private double salary;
	private double commissionPCT;
	private int managerId;
	private int departmentId;
}
