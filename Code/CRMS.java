import java.util.ArrayList;
import java.util.List;
public class CRMS {

	private List<Car> cars;
    private List<Renter> renters; 
    

    public CRMS() {                  //constructor
        cars = new ArrayList<>();
        renters = new ArrayList<>();
    }

    public void addCar(Car car) {          //function to add cars
        cars.add(car);
        car.setRentalStatus(1);
    }

    public void displayAvailableCars() {           //function to display cars
    	System.out.println("Car Details:");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public void removeCar(Car car) {                //function to remove car
        if (car.isRentalStatus()==1) {
            cars.remove(car);
            System.out.println("Car removed successfully.\n");
        } else {
            System.out.println("Cannot remove a rented car.\n");
        }
    }

    public void addRenter(Renter renter) {        //function to add renter
        renters.add(renter);
    }

    public void displayRenterDetails() {               //function to display renter details
        System.out.println("Renter Details:");
        for (Renter renter : renters) {
            System.out.println(renter);
        }
        System.out.println();
    }

    public void removeRenter(Renter renter) {        //function to remove the renter
        renters.remove(renter);
        System.out.println("Renter removed successfully.\n");
    }

    public void rentCar(Renter renter, Car car) {           //function to rent the car
        if (car.isRentalStatus()==0) {
            renter.rentCar(car);
            car.setRentalStatus(1);
            System.out.println("Car rented successfully.\n");
        } else {
            System.out.println("Car is already rented.\n");
        }
    }

    public void displayRentalDetails() {             //displaying rental details
        System.out.println("Rental Details:");
        for (Renter renter : renters) {
            System.out.println(renter.getName() + "'s rented cars:");
            for (Car car : renter.getRentedCars()) {
                System.out.println(car);
            }
            System.out.println();
        }
    }
    
    public double DamagePercentage(double total) {       //calculating the damage of car
    	double damagePercentage=0.2;
    	double damage_cost=damagePercentage*total;
    	return damage_cost;

    }

}
