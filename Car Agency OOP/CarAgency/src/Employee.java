public abstract class Employee {
    //Attributes
    private  String firstName;
    private String lastName;
    private String position;
    private String phone1;
    private String phone2;
    private int id;
    private String address;
    private String nationality;
    private String nationalityId;
    double salary;
    private String fax;
    private String postCode;
    private String country;
    private String emp_state;
    private String emp_street;
    private String empDateStarted;


    //constructors

    public Employee() {
        System.out.println("You created new empty object");
    }


    public Employee(String firstName, String lastName,
                    String position, String phone1, String phone2,
                    int id, String address, String nationality,
                    String nationalityId, double salary, String fax,
                    String postCode, String country, String emp_state,
                    String emp_street, String empDateStarted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.id = id;
        this.address = address;
        this.nationality = nationality;
        this.nationalityId = nationalityId;
        this.salary = salary;
        this.fax = fax;
        this.postCode = postCode;
        this.country = country;
        this.emp_state = emp_state;
        this.emp_street = emp_street;
        this.empDateStarted = empDateStarted;
    }

    //Setters


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmp_state(String emp_state) {
        this.emp_state = emp_state;
    }

    public void setEmp_street(String emp_street) {
        this.emp_street = emp_street;
    }

    public void setEmpDateStarted(String empDateStarted) {
        this.empDateStarted = empDateStarted;
    }

    //Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public double getSalary() {
        return salary;
    }

    public String getFax() {
        return fax;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getEmp_state() {
        return emp_state;
    }

    public String getEmp_street() {
        return emp_street;
    }

    public String getEmpDateStarted() {
        return empDateStarted;
    }

    //Methods
    public abstract double salary();
    public abstract void employeeInfo();
    public abstract void employeeAddressInfo();
    public abstract void employeeContactInfo();
    public abstract void employeeHomeMoreInfo();
    public abstract void employeeNationalityInfo();



}

