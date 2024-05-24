public class UsedCars extends Car {
    private int price;
    private int kilometersUsed;
    private boolean fabreka;
    private boolean warranty;
    //constructors
    public UsedCars(){}

    public UsedCars(String carName, String carMaker,
                    String carOwner, String registrationNumber,
                    String licenseNumber, String typeOfFuel,
                    String gearBox, String breakType, int numberOfDoors,
                    int numberOfSeats, int moodle, int range, int maxSpeed,
                    boolean used, double tireWidth, double tireAirPresser,
                    double tireDiameter, double fuelCapacity,
                    int numberOfCylinders, int price, int kilometersUsed,
                    boolean fabreka, boolean warranty) {
        super(carName, carMaker, carOwner, registrationNumber,
                licenseNumber, typeOfFuel, gearBox, breakType,
                numberOfDoors, numberOfSeats, moodle, range, maxSpeed,
                used, tireWidth, tireAirPresser, tireDiameter,
                fuelCapacity, numberOfCylinders);
        this.price = price;
        this.kilometersUsed = kilometersUsed;
        this.fabreka = fabreka;
        this.warranty = warranty;
    }



    //Setters


    public void setPrice(int price) {
        this.price = price;
    }

    public void setKilometersUsed(int kilometersUsed) {
        this.kilometersUsed = kilometersUsed;
    }

    public void setFabreka(boolean fabreka) {
        this.fabreka = fabreka;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    //Getters

    public int getPrice() {
        return price;
    }

    public int getKilometersUsed() {
        return kilometersUsed;
    }

    public boolean isFabreka() {
        return fabreka;
    }

    public boolean isWarranty() {
        return warranty;
    }

    //Methods
    @Override
    public void carInfo() {
        System.out.println("Car info ");
        System.out.println("car name :"+getCarName());
        System.out.println("car Maker :"+getCarMaker());
        System.out.println("Owner :"+getCarOwner());
        System.out.println("moodle "+getMoodle());
    }
    @Override
    public void carMoreInfo(){
        System.out.println("More info ");
        System.out.println("gear Box "+getGearBox());
        System.out.println("break Type "+getBreakType());
    }
    @Override
    public void tireInfo() {
        System.out.println("Tire info ");
        System.out.println("tire width "+getTireWidth());
        System.out.println("tire air presser "+getTireAirPresser());
        System.out.println("tire diameter "+getTireDiameter());

    }
    @Override
    public void enginInfo() {
        System.out.println("Engin info");
        System.out.println("fuel Capacity "+getFuelCapacity());
        System.out.println("number Of Cylinders "+getNumberOfCylinders());

    }
    @Override
    public void bodyInfo() {
        System.out.println("Body info ");
        System.out.println("break Type "+getBreakType());
        System.out.println("number Of Doors "+getNumberOfDoors());
        System.out.println("number Of Seats "+getNumberOfSeats());


    }
    @Override
    public void licenseInfo() {
        System.out.println("License Info");
        System.out.println("license Number "+getLicenseNumber());
        System.out.println("registration Number "+getRegistrationNumber());

    }
    @Override
    public void rangeSpeed() {
        System.out.println("Range Speed");
        System.out.println("range "+getRange());
        System.out.println("max speed "+getMaxSpeed());

    }
}
