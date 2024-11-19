package appusers;

public class MainClass1 {

	public static void main(String[] args) {
		
				Customer c1= new Customer("satish",6297477672L,"satish@gmail.com","10th cross",1234,"Banglore","Karnataka");
				
				System.out.println("Customer name: "+c1.getCustomerName());
				System.out.println("Customer pincode: "+c1.getA1().getPincode());
				System.out.println("Customer cityname: "+c1.getA1().getCity());
				
				//change streetname
				System.out.println("current street name :"+ c1.getA1().getStreetname());
				c1.getA1().setStreetname("11th cross");
				System.out.println("updated street name :"+ c1.getA1().getStreetname());
				
				//add new address
				Address a2 = new Address("12th cross ",9898,"hyderabad","hyderabad");
				
				c1.setA1(a2);
				
				System.out.println("new address "+ c1.getA1().getStreetname());
				
			}
		

	}


