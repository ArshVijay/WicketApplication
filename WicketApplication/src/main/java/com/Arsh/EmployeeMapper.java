package com.Arsh;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpNO(rs.getString("EMP_N0"));
		emp.setEmpName(rs.getString("EMP_NAME"));
		return emp;

	}

}
