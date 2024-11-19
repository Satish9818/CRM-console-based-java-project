package appusers;

public class Customer {
	

		private String customerName;
		private long phoneNo;
		private String emailId;
		
		private Address a1;
		
		public Customer(String customerName, long phoneNo, String emailId,String streetname, int pincode, String city, String state) {
			
			this.customerName = customerName;
			this.phoneNo = phoneNo;
			this.emailId = emailId;
			
			this.a1 = new Address(streetname,pincode,city, state);
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public Address getA1() {
			return a1;
		}
		public void setA1(Address a1) {
			this.a1 = a1;
		}
	}

