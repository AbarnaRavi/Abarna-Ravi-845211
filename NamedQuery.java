package dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.Employee;
public class NamedQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
          Session session=sessionFactory.openSession();
          
          //Named queries
          Query query=session.getNamedQuery("CTS_EmpView");
          System.out.println("Eno\tName\tSalary");
          List<Employee>list4=(List<Employee>)query.list();
          for(Employee e:list4)
          {
        	  System.out.println(e.getEmpNo()+" "+e.getEmpName()+" "+e.getEmpSal());
        	  
          }
          Scanner s1=new Scanner(System.in);
          //parameterized named queries
          Query query2= session.getNamedQuery("CTS_DeleteRecord");
          System.out.println("enter the eno:");
          int deno=s1.nextInt();
          query2.setParameter("deleno",deno);
          int result=query2.executeUpdate();
          System.out.println(result+"Record Deleted");
		 
		

	}

}
