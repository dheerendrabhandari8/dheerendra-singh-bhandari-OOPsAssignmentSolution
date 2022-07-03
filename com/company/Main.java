package com.company;

import com.company.department.AdminDepartment;
import com.company.department.HrDepartment;
import com.company.department.TechDepartment;

public class Main {

	public static void main(String[] args) {
		

		AdminDepartment ad = new AdminDepartment();   
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());     
		
		System.out.print("\n");
		
		HrDepartment hr = new HrDepartment();        
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());	 
		
		System.out.print("\n");
		
		TechDepartment td = new TechDepartment();        
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());	 
	
	}

}
