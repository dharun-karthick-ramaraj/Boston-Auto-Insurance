/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Customer.Quote;

import Model.Customer.Customer;

/**
 *
 * @author Dharun Karthick Ramaraj
 */
public class CustomerQuote {
    private Customer customerAccount;
    private Quote quote;

    public CustomerQuote(Customer customerAccount, String status, double premiumAmount) {
        this.customerAccount = customerAccount;
        this.quote = new Quote(status, premiumAmount);
    }

    public Customer getCustomerAccount() {
        return customerAccount;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Customer customer, String status, double premiumAmount) {
        this.customerAccount = customer;
        this.quote.setStatus(status);
        this.quote.setPremiumAmount(premiumAmount);
    }
    
    @Override
    public String toString(){
        return quote.getQuoteId();
    }
}
