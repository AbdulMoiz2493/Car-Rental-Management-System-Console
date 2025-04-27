
public class CompactCar extends Car {

	public CompactCar(String brand, String model, int year, String plateNumber) {
        super(brand, model, year, plateNumber);
    }
	
    public double calculateRentalCost(double distanceTraveled) {
    	double distance_cost=distanceTraveled*0.2;   //setting a standard value of cost with respect to distance
        return getRentalFee()+distance_cost;
    }
    
    //no insurance functions as it has no insurance policy
}

