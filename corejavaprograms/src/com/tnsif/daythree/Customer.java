package com.tnsif.daythree;

public class Customer {

    // Instance variables (correct position)
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default Constructor
    public Customer() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public Customer(String customerName, int customerId, String customerCity) {
        this(); // calling default constructor
        System.out.println("Parameterized Constructor");
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // toString() method for printing details
    @Override
    public String toString() {
        return "Customer [Id=" + customerId + ", Name=" + customerName + ", City=" + customerCity + "]";
    }

    // Main method (if you want to test here separately)
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer("John", 101, "Chennai");
        System.out.println(c2);
    }
}
