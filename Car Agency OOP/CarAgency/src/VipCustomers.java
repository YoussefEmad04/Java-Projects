public class VipCustomers implements Customers {
    protected String name;
    protected int age;
    protected int phoneNumber;
    protected String email;
    protected String gender;
    protected int vipLevel;

    @Override
    public void addCustomer(String name, int age, int phoneNumber, String email, String gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.vipLevel=vipLevel;
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Customer PhoneNumber: " + phoneNumber);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Gender: " + gender);
    }
}