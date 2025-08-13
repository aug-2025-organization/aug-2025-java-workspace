import java.io.Serializable;

public class Account implements Serializable{
	private int accNo;
	private String accName;
	transient private int atmPin;
	
	public Account(int accNo, String accName, int atmPin) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.atmPin = atmPin;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", atmPin=" + atmPin + "]";
	}
}
