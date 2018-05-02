package th.co.truecorp.esd.grapghql.models.filter;

public class CustomerFilter {
	
	private int customerId;
	private int operatorId;
	private String certification;
	private String ban;
	private String primResourceVal;
	private String customerType;


	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getPrimResourceVal() {
		return primResourceVal;
	}

	public void setPrimResourceVal(String primResourceVal) {
		this.primResourceVal = primResourceVal;
	}


	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
