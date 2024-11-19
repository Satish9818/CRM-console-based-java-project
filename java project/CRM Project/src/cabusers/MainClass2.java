package cabusers;

public class MainClass2 {
	
		public static void main(String[] args) {
			
			Cab c1= new Cab("kotal", "KA560987", 678342244, 76.89, 32.76, "east", 65.453, 67.089, "south");
			
			System.out.println("=====cab details======");
			System.out.println(c1.getCar_no());
			System.out.println(c1.getDriver_mobno());
			System.out.println(c1.getDriver_name());
			
			System.out.println("======pickup location======");
			System.out.println(c1.getPickup().getLongitude());
			System.out.println(c1.getPickup().getLatitude());
			System.out.println(c1.getPickup().getDirection());
			
			System.out.println("======Drop location=======");
			System.out.println(c1.getDrop().getLongitude());
			System.out.println(c1.getPickup().getLatitude());
			System.out.println(c1.getPickup().getDirection());
		}
		
	}

