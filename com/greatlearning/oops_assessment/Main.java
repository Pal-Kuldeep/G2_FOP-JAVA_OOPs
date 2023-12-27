package com.greatlearning.oops_assessment;

public class Main extends superDepartment 
{

	public static void main(String[] args) 
	{
		Admin_Department AD = new Admin_Department();
		System.out.println(AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		
			System.out.println();
		
			HR_Department HRD;
			HRD = new HR_Department();
			System.out.println(HRD.departmentName());
			System.out.println(HRD.doActivity());
			System.out.println(HRD.getTodaysWork());
			System.out.println(HRD.getWorkDeadline());
			System.out.println(HRD.isTodayAHoliday());
			
				System.out.println();
		
		Tech_Department TD;
		TD= new Tech_Department();
		System.out.println(TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(TD.isTodayAHoliday());
		
	}

}

