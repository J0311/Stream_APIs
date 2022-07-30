package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria","99999");
        // Normal Java method:
        greetCustomer(maria);


        // Uses Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering " +
            "phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering " +
                "phone number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}