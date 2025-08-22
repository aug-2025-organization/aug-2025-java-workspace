import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mybeans.Customer;
import mybeans.Employee;

public class Demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.AppConfig.class);
		
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);
		
		Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer);
	}
}
