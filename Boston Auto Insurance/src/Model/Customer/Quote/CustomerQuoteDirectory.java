/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer.Quote;

import Model.Customer.Customer;
import Model.Customer.Vehicle.Vehicle;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dharun Karthick Ramaraj
 */
public class CustomerQuoteDirectory {

    private ArrayList<CustomerQuote> customerQuotes;

    public CustomerQuoteDirectory() {
        this.customerQuotes = new ArrayList<>();
    }

    public ArrayList<CustomerQuote> getCustomerQuotes() {
        return customerQuotes;
    }

    public void addCustomerQuote(CustomerQuote customerQuote) {
        customerQuotes.add(customerQuote);
    }

    public void deleteCustomerQuote(CustomerQuote customerQuote) {
        customerQuotes.remove(customerQuote);
    }

    public CustomerQuote findCustomerQuote(Customer customer) {
        for (CustomerQuote customerQuote : customerQuotes) {
            if (customerQuote.getCustomerAccount().equals(customer)) {
                return customerQuote;
            }
        }
        return null;
    }

    public boolean customerExists(int customerId) {
        for (CustomerQuote customerQuote : customerQuotes) {
            if (customerQuote.getCustomerAccount().getCustomerId() == customerId) {
                return true;
            }
        }
        return false;
    }

    public CustomerQuote createCustomerQuote(Customer customer, String status, double premiumAmount) {
        if (customer instanceof Customer) {
            CustomerQuote existingQuote = findCustomerQuote(customer);
            if (existingQuote != null) {
                // Customer already has a quote, update it
                existingQuote.setQuote(customer, status, premiumAmount);
                return existingQuote;
            } else {
                // Customer doesn't have a quote, create a new one
                CustomerQuote newQuote = new CustomerQuote(customer, status, premiumAmount);
                addCustomerQuote(newQuote);
                return newQuote;
            }
        } else {
            // Handle error: Account is not a customer
            System.out.println("Error: Only customers can create quotes.");
            return null;
        }
    }

    public Vehicle addVehicleToQuote(Customer customer, Vehicle vehicle) {
        CustomerQuote existingQuote = findCustomerQuote(customer);

        if (existingQuote != null) {
            // Customer has a quote, add the vehicle
            if (existingQuote.getQuote().getVehicles().size() < 4) {
                existingQuote.getQuote().addVehicle(vehicle);
                //JOptionPane.showMessageDialog(null, "Vehicle added to the quote successfully.");
                return vehicle;
            } else {
                //JOptionPane.showMessageDialog(null, "Error: Maximum limit of 4 vehicles reached for the quote.");
                return null;
            }
        } else {
            // Customer doesn't have a quote
            JOptionPane.showMessageDialog(null, "Error: Customer does not have an existing quote.");
            return null;
        }
    }

    public CustomerQuote getCustomerQuote(int customerId) {
        for (CustomerQuote customerQuote : customerQuotes) {
            if (customerQuote.getCustomerAccount().getCustomerId() == customerId) {
                return customerQuote;
            }
        }
        return null;
    }

}
