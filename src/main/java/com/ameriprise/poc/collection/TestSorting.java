package com.ameriprise.poc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
	public static void main(String args[]){
		EmpBean emp1= new EmpBean();
		emp1.setName("Yaten");
		emp1.setAge(27);
		emp1.setDepartment("Tech1");
		emp1.setEmpID(01);
		
		EmpBean emp2= new EmpBean();
		emp2.setName("Yaten");
		emp2.setAge(27);
		emp2.setDepartment("Tech");
		emp2.setEmpID(01);
		
		List<EmpBean> elpys= new ArrayList<EmpBean>();
		elpys.add(emp1);
		elpys.add(emp2);
		Collections.sort(elpys);
		System.out.println(elpys.toString());
	}

}
