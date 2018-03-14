package com.yaten.poc.collection;

public class EmpBean implements Comparable<EmpBean>{
	private int empID;
	private String name;
	private String department;
	private int age;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(EmpBean o) {
		int i = this.name.compareTo(o.name);
		if(i==0){
			i= this.age > o.age?1:this.age==o.age?0:-1;
			if(i==0){
				return this.department.compareTo(o.department);
			}
			return i;
		}
		return i;
	}
	
	@Override
	public String toString(){
		return this.name+" "+this.age+" "+this.department;
		
	}
	
}
