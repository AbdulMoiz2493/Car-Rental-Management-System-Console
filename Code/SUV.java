
public class SUV extends Car{
    public SUV(String brand, String model, int year, String plateNumber) {
        super(brand, model, year, plateNumber);
    }

    public double calculateRentalCost(double distanceTraveled) {
    	double distance_cost=distanceTraveled*0.25;   //setting a standard value of cost with respect to distance
        return getRentalFee()+distance_cost;
    }

    public double calculateInsuranceCost() {         //calculating insurance of car
        return 0.05 * getRentalFee();
    }
}
