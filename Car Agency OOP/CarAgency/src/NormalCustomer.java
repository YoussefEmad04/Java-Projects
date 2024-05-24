public class NormalCustomer implements Customers {
    private String name;
    private int age;
    private int phoneNumber;
    private String email;
    private String gender;

    public NormalCustomer(String name, int age, int phoneNumber, String email, String gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public NormalCustomer(String normalCustomerName, int age, String s, String email, String male) {
    }

    @Override
    public void addCustomer(String name, int age, int phoneNumber, String email, String gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer info ");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Customer PhoneNumber: " + phoneNumber);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Gender: " + gender);
    }
}