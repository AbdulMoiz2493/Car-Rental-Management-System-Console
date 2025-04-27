
public class LuxuryCar extends Car {

    public LuxuryCar(String brand, String model, int year, String plateNumber) {
        super(brand, model, year, plateNumber);
    }

    public double calculateRentalCost(double distanceTraveled) {
    	double distance_cost=distanceTraveled*0.25;   //setting a standard value of cost with respect to distance
    	double luxury_tax=0.2*distance_cost;         
        return getRentalFee()+distance_cost+luxury_tax;         //adding tax for luxury car as well
    }

    public double calculateInsuranceCost() {    //calculating insurance of car
        return 0.1 * getRentalFee();
    }
}


