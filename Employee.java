package com.cts;
import java.util.ArrayList;


 class Employee {
	 int id;
	 double salary;
	 Employee(int id,double salary){
		 this.id=id;
		 this.salary=salary;
	 }
	 public String toString(){
		 return "Employee:["+ this.id+" "+ this.salary+"]";
	 }
	 public boolean equals(Object object)
	 {
		 if(object==null)
			 return false;
		 boolean result=false;
		 //Employee argument=(Employee) 
	 }
	
}
 public class NewDates {
public static void main(String[] args){
		 Employee e1=new Employee(123,3000.7);
		 Employee e2=new Employee(123,3000.7);
		// Employee e1=e2;
		 
		 System.out.println(e1==e2);
		 A a=new A();
		 A b-new A();
		 
		 System.out.println();
		 System.out.println();
		 
		 //System.out.println(e2.toString());
		 //System.out.println(e3);
		 
	 }
 }
 
 
 
 
  
 