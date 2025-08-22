package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mybeans.Address;
import mybeans.Customer;
import mybeans.Employee;

@Configuration
public class AppConfig {
	// now configure the beans here
	
	@Bean
	public Employee employee() {
		return new Employee(333, "DDD", "Manager");
	}
	
	@Bean
	public Address address() {
		return new Address(232, "Salem", "Tamil Nadu");
	}
	
	@Bean
	public Customer customer() {
		return new Customer(444, "WER", address());
	}
}
