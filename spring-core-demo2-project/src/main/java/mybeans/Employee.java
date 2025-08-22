package mybeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	//@Value("444")
	private int empId;
	//@Value("BNM")
	private String empName;
	//@Value("Manager")
	private String empDesignation;
//	
//	public Employee() {
//		super();
//	}

	public Employee(@Value("123") int empId, @Value("DFG") String empName, @Value("Lead") String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}

	public int getEmpId() {
		return empId;
	}

	//@Value("666")
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	//@Value("HJK")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	//@Value("Manager")
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + "]";
	}
}
