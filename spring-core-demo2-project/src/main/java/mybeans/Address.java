package mybeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private int addId;
	private String city;
	private String state;
	
	public Address() {	}

	public Address(int addId, String city, String state) {
		super();
		this.addId = addId;
		this.city = city;
		this.state = state;
	}

	public int getAddId() {
		return addId;
	}

	@Value("345")
	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	@Value("Madurai")
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@Value("Tamil Nadu")
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + "]";
	}
}
