package com.Arsh;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpDAOImpl implements EmpDAO {
	
	  private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }


	@Override
	public List<Employee> getEmployee() {
		/*String ID="vg77052";
		System.out.println("in DAo calass");
		String SQL = "select * from Employee where id = ?";
		List<Employee> emp =  jdbcTemplateObject.queryForList(SQL, new EmployeeMapper());*/
		
		  String SQL = "select * from Employee";
	      List <Employee> students = jdbcTemplateObject.query(SQL, 
	                                new EmployeeMapper());
	      return students;
//	ArrayList<Employee> emp1=new ArrayList<Employee>();
// 		for(int i=0;i<5;i++){
//		Employee emp=new Employee();
//		emp.setEmpName("vijay");
//		emp.setEmpNO("vg00709");
//		emp1.add(emp);
//		}
		
		//return  emp;

	}

public void getString(){
	System.out.println("hai");
}

}
