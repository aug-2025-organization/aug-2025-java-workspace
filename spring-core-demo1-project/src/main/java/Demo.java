import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Address;
import mybeans.Customer;
import mybeans.Employee;

public class Demo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "ABC", "Manager");
		System.out.println(emp1);

		// here we are creating the spring core container
		// the IOC container is created and it reads anyName.xml
		// the IOC container creates objects for the configured beans in the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
		
		// now ask the container to give the bean object
		Employee emp2 = context.getBean("myEmp", Employee.class);
		System.out.println(emp2);
		
		Employee emp3 = context.getBean("myEmp", Employee.class);
		System.out.println(emp3);
		emp3.setEmpDesignation("Tester");
		
		System.out.println(emp3);
		System.out.println(emp2);
		
		
		// create a customer object
		Address add1 = new Address(601, "Chennai", "Tamil Nadu");
		Customer customer1 = new Customer(222, "ABC", add1);
		System.out.println(customer1);
		
		Customer customer2 = context.getBean("cust", Customer.class);
		System.out.println(customer2);
	}

}
