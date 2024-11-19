package cabusers;

public class Cab {

		private String driver_name;
		private String car_no;
		private long driver_mobno;
		
		private Location pickup;
		private Location drop;
		
		public Cab(String driver_name, String car_no, long driver_mobno, double plongitude, double platitude,String pdirection,double dlongitude,double dlatitude,String ddirection) {
			
			this.driver_name = driver_name;
			this.car_no = car_no;
			this.driver_mobno = driver_mobno;
			
			this.pickup=new Location(platitude,plongitude,pdirection);
			this.drop=new Location(dlatitude, dlatitude, ddirection);
			
		}

		public String getDriver_name() {
			return driver_name;
		}

		public void setDriver_name(String driver_name) {
			this.driver_name = driver_name;
		}

		public String getCar_no() {
			return car_no;
		}

		public void setCar_no(String car_no) {
			this.car_no = car_no;
		}

		public long getDriver_mobno() {
			return driver_mobno;
		}

		public void setDriver_mobno(long driver_mobno) {
			this.driver_mobno = driver_mobno;
		}

		public Location getPickup() {
			return pickup;
		}

		public void setPickup(Location pickup) {
			this.pickup = pickup;
		}

		public Location getDrop() {
			return drop;
		}

		public void setDrop(Location drop) {
			this.drop = drop;
		}
	
}
