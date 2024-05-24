public class partTimeEmployee extends Employee{

    private double salesCommission;
    private double hourSalary=salary()/(6*5*4);

    //Constructors
    public partTimeEmployee(){}

    public partTimeEmployee(String firstName, String lastName, String position, String phone1, String phone2, int id, String address, String nationality, String nationalityId, double salary, String fax, String postCode, String country, String emp_state, String emp_street, String empDateStarted, double salesCommission, double hourSalary) {
        super(firstName, lastName, position, phone1, phone2, id, address, nationality, nationalityId, salary, fax, postCode, country, emp_state, emp_street, empDateStarted);
        this.salesCommission = salesCommission;
        this.hourSalary = hourSalary;
    }

    //setters and getters


    //Methods
    @Override
    public double salary() {
        return hourSalary+salesCommission;
    }

    @Override
    public void employeeInfo() {
        System.out.println("employee Info ");
        System.out.println("Name "+getFirstName()+" "+getLastName());
        System.out.println("Position "+getPosition());
        System.out.println("ID :" +getId());
        System.out.println("Phone "+getPhone1());
        System.out.println("Date Started "+getEmpDateStarted());
        System.out.println("Salary :"+getSalary());
    }

    @Override
    public void employeeAddressInfo() {
        System.out.println("More info ");
        System.out.println("Address :"+getAddress());
        System.out.println("Phone "+getPhone2());
    }

    @Override
    public void employeeContactInfo() {
        System.out.println("Employee Contact Info");
        System.out.println(getPhone1()+getPhone2());

    }
    @Override
    public void employeeHomeMoreInfo() {
        System.out.println("Employee Home More Info");
        System.out.println("Fax :"+getFax());
        System.out.println("Post code :"+getPostCode());
        System.out.println("Street "+getEmp_street());
        System.out.println("State "+getEmp_state());

    }
    @Override
    public void employeeNationalityInfo() {
        System.out.println("Employee Nationality Info");
        System.out.println("Nationality "+getNationality());
        System.out.println("NationalityId :"+getNationalityId());

    }


}




/*
 try {
      FileWriter f1 = new FileWriter("new Car:car 1");
        f1.write("name");
         f1.close();


          FileReader f2 = new FileReader("newCar");
           int c = 0;
        while ((c = f2.read()) != -1) {
          System.out.print((char) c);
           if (c == 32) {
            System.out.println();
                            }







* */