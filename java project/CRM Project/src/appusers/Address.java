package appusers;

public class Address {

		private String streetname;
		private int pincode;
		private String city;
		private String state;
		
		public Address(String streetname, int pincode, String city, String state) {
			super();
			this.streetname = streetname;
			this.pincode = pincode;
			this.city = city;
			this.state = state;
		}
		public String getStreetname() {
			return streetname;
		}
		public void setStreetname(String streetname) {
			this.streetname = streetname;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
	}

