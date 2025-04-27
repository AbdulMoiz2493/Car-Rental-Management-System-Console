import java.util.ArrayList;
import java.util.List;

public class Renter {

	    private int renterId;
	    private String name;
	    private String email;
	    private List<Car> rentedCars;
	    private double totalRentalFee;
	    private String phoneNumber;
	    private String address;
	    private static int nextRenterId = 1;

	    public Renter(String name1, String email1, String phoneNumber1, String address1) {
	        name = name1;
	        email = email1;
	        phoneNumber = phoneNumber1;
	        address = address1;
	        renterId = nextRenterId++;            //increasing renter id one by one
	        rentedCars = new ArrayList<>();
	        totalRentalFee = 0.0;                 //initializing to zero
	    }

	    public int getRenterId() {
	        return renterId;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public List<Car> getRentedCars() {
	        return rentedCars;
	    }

	    public double getTotalRentalFee() {
	        return totalRentalFee;
	    }

	    public void setTotalRentalFee(double totalRentalFee1) {
	        totalRentalFee = totalRentalFee1;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void rentCar(Car car) {
	        rentedCars.add(car);
	    }

	    public void returnCar(Car car) {
	        rentedCars.remove(car);
	    }

	    public String toString() {
	    	//incase memory is not displayed
	    	 return ("Renter ID: "+renterId+", Name: "+name+", Email: "+email+", Phone Number: "+phoneNumber+", Address: "+address);
	    }
}
