public abstract class Car {
    //Attributes
    private String carName;
    private String carMaker;
    private String carOwner;
    private String registrationNumber;
    private String licenseNumber;
    private String typeOfFuel;
    private String gearBox;
    private String breakType;
    private int numberOfDoors;
    private int numberOfSeats;
    private int moodle;
    private int range;
    private int maxSpeed;
    private boolean used;
    //Tire
    private double tireWidth;
    private double tireAirPresser;
    private double tireDiameter;
    //Engine
    private double fuelCapacity;
    private int numberOfCylinders;

    //constructors
    public Car(){}

    public Car(String carName, String carMaker, String carOwner,
               String registrationNumber, String licenseNumber,
               String typeOfFuel, String gearBox, String breakType,
               int numberOfDoors, int numberOfSeats, int moodle,
               int range, int maxSpeed, boolean used, double tireWidth,
               double tireAirPresser, double tireDiameter,
               double fuelCapacity, int numberOfCylinders) {
        this.carName = carName;
        this.carMaker = carMaker;
        this.carOwner = carOwner;
        this.registrationNumber = registrationNumber;
        this.licenseNumber = licenseNumber;
        this.typeOfFuel = typeOfFuel;
        this.gearBox = gearBox;
        this.breakType = breakType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.moodle = moodle;
        this.range = range;
        this.maxSpeed = maxSpeed;
        this.used = used;
        this.tireWidth = tireWidth;
        this.tireAirPresser = tireAirPresser;
        this.tireDiameter = tireDiameter;
        this.fuelCapacity = fuelCapacity;
        this.numberOfCylinders = numberOfCylinders;
    }

    //Setters

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public void setBreakType(String breakType) {
        this.breakType = breakType;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setMoodle(int moodle) {
        this.moodle = moodle;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setZero(boolean used) {
        this.used = used;
    }

    public void setTireWidth(double tireWidth) {
        this.tireWidth = tireWidth;
    }

    public void setTireAirPresser(double tireAirPresser) {
        this.tireAirPresser = tireAirPresser;
    }

    public void setTireDiameter(double tireDiameter) {
        this.tireDiameter = tireDiameter;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    //Getters

    public String getCarName() {
        return carName;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBreakType() {
        return breakType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getMoodle() {
        return moodle;
    }

    public int getRange() {
        return range;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isZero() {
        return used;
    }

    public double getTireWidth() {
        return tireWidth;
    }

    public double getTireAirPresser() {
        return tireAirPresser;
    }

    public double getTireDiameter() {
        return tireDiameter;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    //Methods
    public abstract void carInfo();
    public abstract void carMoreInfo();
    public abstract void tireInfo();
    public abstract void enginInfo();
    public abstract void bodyInfo();
    public abstract void licenseInfo();
    public abstract void rangeSpeed();


}
