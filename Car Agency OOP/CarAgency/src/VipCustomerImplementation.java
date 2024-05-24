public class VipCustomerImplementation extends VipCustomers {



    public VipCustomerImplementation() {
        super();

    }

    public VipCustomerImplementation(String name, int age, int phoneNumber, String email, String gender) {
        super.addCustomer(name, age, phoneNumber, email, gender);

    }

    public void upgradeVipLevel() {
        vipLevel++;
        System.out.println("VIP level upgraded to: " + vipLevel);
    }

    @Override
    public void displayCustomerInfo() {
        super.displayCustomerInfo();
        System.out.println("VIP Level: " + vipLevel);
    }

    @Override
    public void addCustomer(String name, int age, int phoneNumber, String email, String gender) {
        super.addCustomer(name, age, phoneNumber, email, gender);
        System.out.println("Customer added successfully");
    }

    // Add any other methods or modifications as needed
}
