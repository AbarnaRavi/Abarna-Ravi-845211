package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_annodemo12")
public class EmpPojo_Annotation {
	@Column(name="emp_no")
	@Id
	int Emp_num;
	
	@Column(name="ename")
	String Emp_name;
	
	@Column(name="esalary")
	float Emp_Salary;

	public int getEmp_num() {
		return Emp_num;
	}

	public void setEmp_num(int emp_num) {
		Emp_num = emp_num;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public float getEmp_Salary() {
		return Emp_Salary;
	}

	public void setEmp_Salary(float emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	

}
