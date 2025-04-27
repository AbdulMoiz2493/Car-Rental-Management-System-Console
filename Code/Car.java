
public abstract class Car {

    private int carId;
    private String brand;
    private String model;
    private int year;
    private int rentalStatus;
    private double rentalFee;
    private String plateNumber;
    private static int nextCarId = 1;
    

    public Car(String brand1, String model1, int year1, String plateNumber1) {
        brand = brand1;
        model = model1;
        year = year1;
        plateNumber = plateNumber1;
        carId = nextCarId++;         //car Id increasing one by one
        rentalStatus = 0;            //Initializing to zero
        rentalFee = 0;               //Initializing to zero
    }


    public int getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setRentalStatus(int rentalStatus1) {
        rentalStatus = rentalStatus1;
    }
    
    public int isRentalStatus() {
        return rentalStatus;
    }

    public void setRentalFee(double rentalFee1) {
        rentalFee = rentalFee1;
    }
    
    public double getRentalFee() {
        return rentalFee;
    }


    public String getPlateNumber() {
        return plateNumber;
    }

    public String toString() {
    	//incase memory is not displayed
        return ("Car ID: "+carId+", Brand: "+brand+", Model: "+model+", Year: "+year+", Plate Number: "+plateNumber);
    }
	    
}
