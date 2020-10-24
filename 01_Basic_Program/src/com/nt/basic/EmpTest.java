package com.nt.basic;

	public class EmpTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setSno(101);
		emp.setEname("arjun");
		emp.setSal(5000);
		emp.setAdd("jbp");
		
		System.out.println("sno: "+emp.getSno());
		System.out.println("ename: "+emp.getEname());
		System.out.println("sal: "+emp.getSal());
		System.out.println("add: "+emp.getAdd());
	}
}
