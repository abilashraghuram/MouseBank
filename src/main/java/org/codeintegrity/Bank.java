package org.codeintegrity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayAllCustomers() {
        System.out.println("List of customers for " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerDetails());
        }
    }
}