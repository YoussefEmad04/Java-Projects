import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class AgencyMain {
    public static void main(String[] args) {
        System.out.println("-----Welcome to our Car Agency-----");
        System.out.println("---Please choose---");

        Scanner in = new Scanner(System.in);
        int a, x, y, z;
        System.out.println("1-car");
        System.out.println("2-customer");
        System.out.println("3-employee");
        a = in.nextInt();
        if (a == 1) {

            String carName;
            String carMaker;
            String carOwner;
            String registrationNumber;
            String licenseNumber;
            String typeOfFuel;
            String gearBox;
            String breakType;
            int numberOfDoors;
            int numberOfSeats;
            int moodle;
            int range;
            int maxSpeed;
            boolean used;
            //Tire
            double tireWidth;
            double tireAirPresser;
            double tireDiameter;
            //Engine
            double fuelCapacity;
            int numberOfCylinders;
            //new car
            int price;
            boolean warranty;
            String fairName;
            String dateOfArrival;
            //used car
            int kilometersUsed;
            boolean fabreka;
            // input car
            try {
                System.out.println("car Name ");
                carName = in.next();
                System.out.println("car Owner ");
                carOwner = in.next();
                System.out.println("car Maker ");
                carMaker = in.next();
                System.out.println("registration Number ");
                registrationNumber = in.next();
                System.out.println("license Number ");
                licenseNumber = in.next();
                System.out.println("type Of Fuel ");
                typeOfFuel = in.next();
                System.out.println("gear Box ");
                gearBox = in.next();
                System.out.println("break Type ");
                breakType = in.next();
                System.out.println("number Of Doors ");
                numberOfDoors = in.nextInt();
                System.out.println("number Of Seats");
                numberOfSeats = in.nextInt();
                System.out.println("moodle ");
                moodle = in.nextInt();
                System.out.println("range ");
                range = in.nextInt();
                System.out.println("max Speed ");
                maxSpeed = in.nextInt();
                System.out.println("used ");
                used = in.nextBoolean();
                System.out.println("tire Width ");
                tireWidth = in.nextDouble();
                System.out.println("tire Air Presser ");
                tireAirPresser = in.nextDouble();
                System.out.println("tire Diameter ");
                tireDiameter = in.nextDouble();
                System.out.println("fuel Capacity ");
                fuelCapacity = in.nextDouble();
                System.out.println("number Of Cylinders ");
                numberOfCylinders = in.nextInt();
                System.out.println("price ");
                price = in.nextInt();
                System.out.println("warranty ");
                warranty = in.nextBoolean();
                System.out.println("fair Name ");
                fairName = in.next();
                System.out.println("date Of Arrival ");
                dateOfArrival = in.next();
                System.out.println("kilometers Used");
                kilometersUsed = in.nextInt();
                System.out.println("fabreka ");
                fabreka = in.nextBoolean();


                System.out.println("1-New Car");
                System.out.println("2-Used car");
                x = in.nextInt();
                if (x == 1) {
                    NewCar car1 = new NewCar(carName, carMaker, carOwner, registrationNumber, licenseNumber,
                            typeOfFuel, gearBox, breakType, numberOfDoors, numberOfSeats, moodle, range,
                            maxSpeed, used, tireWidth, tireAirPresser, tireDiameter, fuelCapacity, numberOfCylinders,
                            price, warranty, fairName, dateOfArrival);
                    car1.carInfo();
                    car1.carMoreInfo();
                    car1.bodyInfo();
                    car1.enginInfo();
                    car1.tireInfo();
                    car1.licenseInfo();
                    car1.rangeSpeed();
                    try {
                        FileWriter f1 = new FileWriter("new Car:car 1");

                        f1.write(car1.getCarName());
                        f1.write(car1.getCarMaker());
                        f1.write(car1.getCarOwner());
                        f1.write(car1.getRegistrationNumber());
                        f1.write(car1.getLicenseNumber());

                        f1.close();
                        FileReader f2 = new FileReader("newCar");
                        int c = 0;
                        while ((c = f2.read()) != -1) {
                            System.out.print((char) c);
                            if (c == 32) {
                                System.out.println();
                            }
                        }
                        f1.close();
                        f2.close();


                    } catch (Exception e){}
                } else if (x == 2) {
                    UsedCars car2 = new UsedCars(carName, carMaker, carOwner, registrationNumber,
                            licenseNumber, typeOfFuel, gearBox, breakType,
                            numberOfDoors, numberOfSeats, moodle, range, maxSpeed,
                            used, tireWidth, tireAirPresser, tireDiameter,
                            fuelCapacity, numberOfCylinders, price, kilometersUsed, fabreka, warranty);
                    car2.carInfo();
                    car2.carMoreInfo();
                    car2.bodyInfo();
                    car2.enginInfo();
                    car2.tireInfo();
                    car2.licenseInfo();
                    car2.rangeSpeed();
                    try {
                        FileWriter f2 = new FileWriter("used Car:car 2");

                        f2.write(car2.getCarName());
                        f2.write(car2.getCarMaker());
                        f2.write(car2.getCarOwner());
                        f2.write(car2.getRegistrationNumber());
                        f2.write(car2.getLicenseNumber());
                        int c = 0;
                        FileReader f1 = new FileReader("newCar");

                        while ((c = f1.read()) != -1) {
                            System.out.print((char) c);
                            if (c == 32) {
                                System.out.println();
                            }
                        }
                        f1.close();
                        f2.close();


                        f2.close();


                    } catch (Exception e) {
                    }

                }
                System.out.println(" -------------------ERROR-------------- ");
            } catch (InputMismatchException q) {
                System.out.println("Input missmatch please re run ");
                in.nextLine();
            }/* finally {
                in.close();
            }*/


        } else if (a == 2) {
            try {
                String name;
                int age;
                int phoneNumber;
                String email;
                String gender;
                System.out.println("name");
                name = in.next();
                System.out.println("age");
                age = in.nextInt();
                System.out.println("phone Number ");
                phoneNumber = in.nextInt();
                System.out.println("email ");
                email = in.next();
                System.out.println("gender ");
                gender = in.next();

                System.out.println("1-Normal Customer ");
                System.out.println("2-VIP Customer ");
                y = in.nextInt();
                if (y == 1) {
                    NormalCustomer normal_Customer = new NormalCustomer(name, age, phoneNumber, email, gender);
                    normal_Customer.displayCustomerInfo();

                } else if (y == 2) {
                    VipCustomerImplementation vip_customers = new VipCustomerImplementation(name, age, phoneNumber, email, gender);
                    vip_customers.addCustomer(name, age, phoneNumber, email, gender);
                    vip_customers.upgradeVipLevel();
                    vip_customers.displayCustomerInfo();

                } else {
                    JOptionPane.showMessageDialog(null, "Error", "An error has occurred please check your input and try again.", JOptionPane.ERROR_MESSAGE);
                    System.out.println(" -------------------ERROR-------------- ");
                }
            } catch (InputMismatchException q) {
                System.out.println("Input missmatch please enter re run" );
                in.nextLine();
            } finally {
                in.close();
            }


        } else if (a == 3) {
            try {

                String firstName;
                String lastName;
                String position;
                String phone1;
                String phone2;
                String address;
                String nationality;
                String nationalityId;
                String fax;
                String postCode;
                String country;
                String emp_state;
                String emp_street;
                String empDateStarted;
                double salary;
                int id;
                //full time
                double salesCommission;
                //double baseSalary=salary;
                // part time
                //double hourSalary=salary/(6*5*4);

                //input

                System.out.println("first Name ");
                firstName = in.next();
                System.out.println("last Name ");
                lastName = in.next();
                System.out.println("position ");
                position = in.next();
                System.out.println("phone1 ");
                phone1 = in.next();
                System.out.println("phone2 ");
                phone2 = in.next();
                System.out.println("address ");
                address = in.next();
                System.out.println("nationality ");
                nationality = in.next();
                System.out.println("nationality Id ");
                nationalityId = in.next();
                System.out.println("fax ");
                fax = in.next();
                System.out.println("post Code ");
                postCode = in.next();
                System.out.println("country ");
                country = in.next();
                System.out.println("emp_state ");
                emp_state = in.next();
                System.out.println("emp_street ");
                emp_street = in.next();
                System.out.println("emp Date Started ");
                empDateStarted = in.next();
                System.out.println("salary ");
                salary = in.nextDouble();
                System.out.println("id ");
                id = in.nextInt();

                //full time
                System.out.println("sales Commission ");
                salesCommission = in.nextDouble();
                double baseSalary = salary;
                // part time
                double hourSalary = salary / (6 * 5 * 4);


                System.out.println("1-Full time employee");
                System.out.println("2-Part time employee");
                z = in.nextInt();
                if (z == 1) {
                    fullTimeEmployee fullTimeemployee = new fullTimeEmployee(firstName, lastName, position, phone1, phone2, id, address, nationality, nationalityId, salary, fax, postCode, country, emp_state, emp_street, empDateStarted, salesCommission, baseSalary);
                    fullTimeemployee.employeeInfo();
                    fullTimeemployee.employeeAddressInfo();
                    fullTimeemployee.employeeContactInfo();
                    fullTimeemployee.employeeNationalityInfo();
                    System.out.println("Salary +" + fullTimeemployee.salary);

                } else if (z == 2) {
                    partTimeEmployee partimeemployee = new partTimeEmployee(firstName, lastName, position, phone1, phone2, id, address, nationality, nationalityId, salary, fax, postCode, country, emp_state, emp_street, empDateStarted, salesCommission, hourSalary);
                    partimeemployee.employeeInfo();
                    partimeemployee.employeeAddressInfo();
                    partimeemployee.employeeContactInfo();
                    partimeemployee.employeeNationalityInfo();
                    System.out.println("Salary +" + partimeemployee.salary);

                } else {
                    System.out.println(" -------------------ERROR-------------- ");
                }


            } catch (InputMismatchException q) {
                System.out.println("Input missmatch please enter re run");
                in.nextLine();
            } finally {
                in.close();
            }

        }else {System.out.println(" -------------------ERROR-------------- ");}
        /*
            omar tokal 225238
            john amin 225141
            fady gamel 225120
            fadi hani 225046
            youssef emad 225241*/





    }
}