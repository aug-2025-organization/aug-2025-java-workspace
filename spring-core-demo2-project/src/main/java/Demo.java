import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Customer;
import mybeans.Employee;

public class Demo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");;
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);
		
		Customer cust1 = (Customer) context.getBean("customer");
		System.out.println(cust1);
	}
}
