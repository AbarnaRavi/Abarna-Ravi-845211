package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import pojo.Employee;

public class CriteriaQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Session s=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory() .openSession();

		 Transaction t=s.beginTransaction();
		 Criteria cr=s.createCriteria(Employee.class);
		 
		 //add restriction
		 //cr.add(Restriction.gt("empSal",50000.00F));
		 cr.add(Restrictions.between("empSal",250000.00f,480000.00f));
		 	List employees=cr.list();
		 	List<Employee>list4=(List<Employee>)cr.list();
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	for(Employee e:list4)
		 	{
		 		System.out.println("First criteria:"+e.getEmpNo()+" "+e.getEmpName()+" "+e.getEmpSal());
		 	}
		 	Criteria cr11=s.createCriteria(Employee.class);
		 	cr11.setProjection(Projections.sum("empSal"));
		 	List totalSalary=cr11.list();
		 	System.out.println("Total Salary:"+totalSalary.get(0));
		 
		 
		 



		


	}

}
