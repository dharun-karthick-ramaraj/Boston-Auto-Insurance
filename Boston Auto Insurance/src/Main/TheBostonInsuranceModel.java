/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.Account.AccountCredentialsDirectory;
import Model.Account.AccountDirectory;
import Model.Customer.CustomerDirectory;
import Model.Customer.Policy.CustomerPolicyDirectory;
import Model.Customer.Quote.CustomerQuoteDirectory;
import Model.Employee.EmployeeDirectory;
import Model.Thirdparty.PAYMENT.PaymentCardDirectory;
import Model.Thirdparty.POLK.VehicleListWithAddressDirectory;
import Model.Thirdparty.VIN.VINDirectory;

/**
 *
 * @author Dharun Karthick Ramaraj
 */
public class TheBostonInsuranceModel {

    private String Name;
    AccountDirectory accountDirectory;
    AccountCredentialsDirectory accountCredentialsDirectory;
    EmployeeDirectory employeeDirectory;
    CustomerDirectory customerDirectory;
    CustomerQuoteDirectory customerQuoteDirectory;
    CustomerPolicyDirectory customerPolicyDirectory;
    VehicleListWithAddressDirectory vehicleListWithAddressDirectory;
    PaymentCardDirectory paymentCardDirectory;
    VINDirectory vINDirectory;

    public TheBostonInsuranceModel(String N) {
        Name = N;
        accountDirectory = new AccountDirectory();
        accountCredentialsDirectory = new AccountCredentialsDirectory();
        employeeDirectory = new EmployeeDirectory();
        customerDirectory = new CustomerDirectory();
        customerQuoteDirectory = new CustomerQuoteDirectory();
        customerPolicyDirectory = new CustomerPolicyDirectory();
        vehicleListWithAddressDirectory = new VehicleListWithAddressDirectory();
        paymentCardDirectory = new PaymentCardDirectory();
        vINDirectory = new VINDirectory();
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public AccountCredentialsDirectory getAccountCredentialsDirectory() {
        return accountCredentialsDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public CustomerQuoteDirectory getCustomerQuoteDirectory() {
        return customerQuoteDirectory;
    }

    public CustomerPolicyDirectory getCustomerPolicyDirectory() {
        return customerPolicyDirectory;
    }

    public VehicleListWithAddressDirectory getVehicleListWithAddressDirectory() {
        return vehicleListWithAddressDirectory;
    }

    public PaymentCardDirectory getPaymentCardDirectory() {
        return paymentCardDirectory;
    }

    public VINDirectory getvINDirectory() {
        return vINDirectory;
    }

}
