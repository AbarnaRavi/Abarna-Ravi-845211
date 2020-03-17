package dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Employee;

public class EmpViewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory sessionFactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();



		 Session session=sessionFactory.openSession();
		 /*
		  * hql -hibernate query language
		  * hql uses class name instead of table name
		  * and property names instead of column name
		  * 
		  */
		 //String query1="select*from Emp_Pojo";//error
		 //String query1="select Empno1,Empname1.Salary1 from Emp_Pojo";//valid
		 //no table name  only pojo class name
		 String query1="From Employee";//valid
		 Query query4=session.createQuery(query1);
		 List<Employee>list4=(List<Employee>)query4.list();//resultset
		 for(Employee e:list4)
		 {
			 System.out.println(e.getEmpNo()+" "+e.getEmpName()+ " "+e.getEmpSal());
		 }
		 String SQL_QUERY="select max(e1.empSal)from Employee e1";
		 query4=session.createQuery(SQL_QUERY);
		 List l1=query4.list();
		 System.out.println("MAX Salary:"+l1.get(0));
		 Query query5=session.createQuery("from Employee where empName='Abarna'");
		 	List<Employee> list3=query5.list();
		 Employee obj1=(Employee)list3.get(0);
		 System.out.println("Abarna Salary:"+ obj1.getEmpSal());
		 
		 
		 //parameterized queries
		 //positional parameter
		 //String q="from Employee where empNo=?";
		 String q="from Employee where empNo=:a";
		 
		 query4=session.createQuery(q);
		 System.out.println("enter the empNo:");
		 Scanner s1=new Scanner(System.in);
		 int empNo11=s1.nextInt();
		 query4.setInteger("a",empNo11);
		 List l2=query4.list();
		 Employee obj21=(Employee)l2.get(0);
		 System.out.println("Name&Salary:"+obj21.getEmpName()+" "+obj21.getEmpSal());
		 session.close();//detached state
		 
		 
		 


	}

}
