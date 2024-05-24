public class fullTimeEmployee extends Employee {
    //Attributes
    private double salesCommission;
    private double baseSalary=salary();

    //constructors
    public  fullTimeEmployee(String employeeFirstName) {}

    public fullTimeEmployee(String firstName, String lastName, String position,
                            String phone1, String phone2, int id, String address,
                            String nationality, String nationalityId,
                            double salary, String fax, String postCode, String country,
                            String emp_state, String emp_street, String empDateStarted,
                           /*New*/ double salesCommission, double baseSalary ) {
        super(firstName, lastName, position, phone1, phone2, id, address, nationality, nationalityId, salary, fax, postCode, country, emp_state, emp_street, empDateStarted);
        this.salesCommission = salesCommission;
        this.baseSalary = baseSalary;
    }

    //Setters and Getters


    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }

    public double getBaseSalary() {
        return baseSalary+salesCommission;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    //Methods

    @Override
    public double salary() {
        return baseSalary+salesCommission;
    }

    @Override
    public void employeeInfo() {
        System.out.println("Name "+getFirstName()+" "+getLastName());
        System.out.println("Position "+getPosition());
        System.out.println("ID :" +getId());
        System.out.println("Phone "+getPhone1());
        System.out.println("Date Started "+getEmpDateStarted());
        System.out.println("Salary :"+getSalary());
    }

    @Override
    public void employeeAddressInfo() {
        System.out.println("Address :"+getAddress());
        System.out.println("Phone "+getPhone2());
    }

    @Override
    public void employeeContactInfo() {
        System.out.println(getPhone1()+getPhone2());

    }
    @Override
    public void employeeHomeMoreInfo() {
        System.out.println("Fax :"+getFax());
        System.out.println("Post code :"+getPostCode());
        System.out.println("Street "+getEmp_street());
        System.out.println("State "+getEmp_state());

    }
    @Override
    public void employeeNationalityInfo() {
        System.out.println("Nationality "+getNationality());
        System.out.println("NationalityId :"+getNationalityId());

    }

}
