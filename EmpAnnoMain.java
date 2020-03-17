package dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.EmpPojo_Annotation;
import pojo.Employee;

public class EmpAnnoMain {
	public static void main(String args[]){
	SessionFactory sessionFactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
	Session session=sessionFactory.openSession();
	//start a transaction
	Transaction tx=session.beginTransaction();
	EmpPojo_Annotation e1=new EmpPojo_Annotation();
	Scanner sc=new Scanner(System.in);
		// TODO Auto-generated constructor stub
	 System.out.println("Eno:");

	 int empNo=sc.nextInt();

	 System.out.println("EmpName");

	 String empName=sc.next();

	 System.out.println("EmpSal:");

	 float empSal=sc.nextFloat();



	 e1.setEmp_num(empNo);

	 e1.setEmp_name(empName);

	 e1.setEmp_Salary(empSal);



	 session.persist(e1);

	 System.out.println("Inserted");

	 tx.commit();

	 sc.close();


}
}
