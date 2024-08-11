/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.Account.Account;
import Model.Account.AccountCredentials;
import Model.Account.AccountCredentialsDirectory;
import Model.Account.AccountDirectory;
import Model.Customer.Customer;
import Model.Customer.CustomerDirectory;
import Model.Customer.Payment.PaymentCard;
import Model.Customer.Policy.CustomerPolicy;
import Model.Customer.Policy.CustomerPolicyDirectory;
import Model.Customer.Quote.CustomerQuote;
import Model.Customer.Quote.CustomerQuoteDirectory;
import Model.Customer.Vehicle.Vehicle;
import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.InsurancePackage.PremiumPackage;
import Model.Thirdparty.PAYMENT.PaymentCardDirectory;
import Model.Thirdparty.POLK.VehicleListWithAddressDirectory;
import Model.Thirdparty.VIN.VINDirectory;
import java.util.ArrayList;

/**
 *
 * @author Dharun Karthick Ramaraj
 */
class TheBostonInsuranceIntialization {

    static TheBostonInsuranceModel initialize() {
        TheBostonInsuranceModel BIC = new TheBostonInsuranceModel("Intial Data");

        //------Create Employees------
        EmployeeDirectory employeeDirectory = BIC.getEmployeeDirectory();

        //Admin
        Employee admin1Linata = employeeDirectory.createEmployee("Linata", "Deshmukh", "linata@gmail.com", "987654321", "admin");
        Account admin1LinataAC = admin1Linata.getAccount(); //get associated account

        //Agent
        Employee agent1Dharun = employeeDirectory.createEmployee("Dharun", "Ramaraj", "dharun@gmail.com", "987654321", "agent");
        Account agent1DharunAC = agent1Dharun.getAccount(); //get associated account

        //Underwriter
        Employee underwriter1Pranesh = employeeDirectory.createEmployee("Pranesh", "Kannan", "pranesh@gmail.com", "987654321", "underwriter");
        Account underwriter1PraneshAC = underwriter1Pranesh.getAccount(); //get associated account

        //------Create Customers------
        CustomerDirectory customerDirectory = BIC.getCustomerDirectory();

        Customer cust1Harish = customerDirectory.createCustomer("Harish", "Rudra", "harish@gmail.com", "137 Thornton St", "Boston", "MA", "02119", "25/10/2001", "6177021234");
        Account cust1HarishAC = cust1Harish.getAccount(); //get associated account

        Customer cust2Manoj = customerDirectory.createCustomer("Manoj", "David", "manoj@gmail.com", "136 Thornton St", "Boston", "MA", "02119", "25/10/2001", "6177021234");
        Account cust2ManojAC = cust2Manoj.getAccount(); //get associated account

        Customer cust3Yukesh = customerDirectory.createCustomer("Yukesh", "Veer", "yukesh@gmail.com", "138 Thornton St", "Boston", "MA", "02119", "25/10/2001", "6177021234");
        Account cust3YukeshAC = cust3Yukesh.getAccount(); //get associated account

        Customer cust4Girish = customerDirectory.createCustomer("Girish", "Balaji", "girish@gmail.com", "139 Thornton St", "Boston", "MA", "02119", "25/10/2001", "6177021234");
        Account cust4GirishAC = cust4Girish.getAccount(); //get associated account

        Customer cust5Kavin = customerDirectory.createCustomer("Kavin", "Raja", "kavin@gmail.com", "140 Thornton St", "Boston", "MA", "02119", "25/10/2001", "6177021234");
        Account cust5KavinAC = cust5Kavin.getAccount(); //get associated account

        //Creating logins for accounts
        AccountCredentialsDirectory accountCredentialsDirectory = BIC.getAccountCredentialsDirectory();
        //Admin
        AccountCredentials admin1LinataACC = accountCredentialsDirectory.addAccountCredentials(admin1LinataAC, "admin", "admin");

        //Agent
        AccountCredentials agent1DharunACC = accountCredentialsDirectory.addAccountCredentials(agent1DharunAC, "Dharun.a", "dharun");

        //Underwriter
        AccountCredentials underwriter1PraneshACC = accountCredentialsDirectory.addAccountCredentials(underwriter1PraneshAC, "Pranesh.uw", "pranesh");

        // Customer
        AccountCredentials cust1HarishACC = accountCredentialsDirectory.addAccountCredentials(cust1HarishAC, "Harish.c", "harish");
        AccountCredentials cust2ManojACC = accountCredentialsDirectory.addAccountCredentials(cust2ManojAC, "Manoj.c", "manoj");
        AccountCredentials cust3YukeshACC = accountCredentialsDirectory.addAccountCredentials(cust3YukeshAC, "Yukesh.c", "yukesh");
        AccountCredentials cust4GirishACC = accountCredentialsDirectory.addAccountCredentials(cust4GirishAC, "Girish.c", "girish");
        AccountCredentials cust5KavinACC = accountCredentialsDirectory.addAccountCredentials(cust5KavinAC, "Kavin.c", "kavin");
        //assigning the credentials in the account class 
        admin1LinataAC.setUserAccountCredentials(admin1LinataACC);
        agent1DharunAC.setUserAccountCredentials(agent1DharunACC);
        underwriter1PraneshAC.setUserAccountCredentials(underwriter1PraneshACC);
        cust1HarishAC.setUserAccountCredentials(cust1HarishACC);
        cust2ManojAC.setUserAccountCredentials(cust2ManojACC);
        cust3YukeshAC.setUserAccountCredentials(cust3YukeshACC);
        cust4GirishAC.setUserAccountCredentials(cust4GirishACC);
        cust5KavinAC.setUserAccountCredentials(cust5KavinACC);

        //Adding accounts to account directory
        AccountDirectory accountDirectory = BIC.getAccountDirectory();
        accountDirectory.addAccount(admin1LinataAC);
        accountDirectory.addAccount(agent1DharunAC);
        accountDirectory.addAccount(underwriter1PraneshAC);
        accountDirectory.addAccount(cust1HarishAC);
        accountDirectory.addAccount(cust2ManojAC);
        accountDirectory.addAccount(cust3YukeshAC);
        accountDirectory.addAccount(cust4GirishAC);
        accountDirectory.addAccount(cust5KavinAC);

        //Adding a quote
        CustomerQuoteDirectory customerQuoteDirectory = BIC.getCustomerQuoteDirectory();
        CustomerQuote cust1HarishACQuote = customerQuoteDirectory.createCustomerQuote(cust1Harish, "pending", 12000);
        Vehicle vehFordRangercust1Harish = new Vehicle("Car/Van", "4Y1SL65848Z41A439", 2017, "Ford", "Ford Ranger");
        vehFordRangercust1Harish.setOwnership("Paid for");
        vehFordRangercust1Harish.setRegisteration("Yes");
        vehFordRangercust1Harish.setUse("Business (delivery services, taxi service)");
        customerQuoteDirectory.addVehicleToQuote(cust1Harish, vehFordRangercust1Harish);

        CustomerQuote cust2ManojACQuote = customerQuoteDirectory.createCustomerQuote(cust2Manoj, "unauthorized", 150000);
        Vehicle vehRRGhostcust2Manoj = new Vehicle("Car/Van", "4Y1SL65848Z411444", 2018, "Rolls Royce", "Rolls-Royce Ghost");
        customerQuoteDirectory.addVehicleToQuote(cust2Manoj, vehRRGhostcust2Manoj);

        //Adding a policy
        //#1
        CustomerPolicyDirectory customerPolicyDirectory = BIC.getCustomerPolicyDirectory();

        CustomerQuote cust3YukeshACQuote = customerQuoteDirectory.createCustomerQuote(cust3Yukesh, "completed", 149000);
        Vehicle vehFordRangercust3Yukesh = new Vehicle("Car/Van", "4Y1SAC5848Z422439", 2016, "Ford", "Ford Expedition");
        vehFordRangercust3Yukesh.setOwnership("Paid for");
        vehFordRangercust3Yukesh.setRegisteration("Yes");
        vehFordRangercust3Yukesh.setUse("Business (delivery services, taxi service)");
        customerQuoteDirectory.addVehicleToQuote(cust3Yukesh, vehFordRangercust3Yukesh);

        PremiumPackage cust3YukeshACQuotePremPack = new PremiumPackage();
        cust3YukeshACQuote.getQuote().setPackageType("premium");
        cust3YukeshACQuote.getQuote().setPremiumPackage(cust3YukeshACQuotePremPack);

        PaymentCard cust3YukeshCard = new PaymentCard("Yukesh Veer", "3782822463100051", 05, 2028, "115", " ", " ", " ", " ");
        cust3YukeshACQuote.getQuote().setPaymentCard(cust3YukeshCard);
        cust3YukeshACQuote.getQuote().setPaymentStatus("completed");

        CustomerPolicy cust3YukeshACPolicy = customerPolicyDirectory.createCustomerPolicy(cust3Yukesh, "issued", cust3YukeshACQuote.getQuote().getPremiumAmount(), cust3YukeshACQuote.getQuote().getVehicles());
        cust3YukeshACPolicy.getPolicy().setQuote(cust3YukeshACQuote.getQuote());
        cust3YukeshACPolicy.getPolicy().setPremiumPackage(cust3YukeshACQuote.getQuote().getPremiumPackage());

        //removing from the quote directory
        customerQuoteDirectory.deleteCustomerQuote(cust3YukeshACQuote);

        CustomerQuote cust4GirishACQuote = customerQuoteDirectory.createCustomerQuote(cust4Girish, "completed", 179000);
        Vehicle vehFordBroncocust4Girish = new Vehicle("Car/Van", "4Y1SL66668Z422439", 2018, "Ford", "Ford Bronco");
        vehFordBroncocust4Girish.setOwnership("Paid for");
        vehFordBroncocust4Girish.setRegisteration("Yes");
        vehFordBroncocust4Girish.setUse("Business (delivery services, taxi service)");
        customerQuoteDirectory.addVehicleToQuote(cust4Girish, vehFordBroncocust4Girish);

        PremiumPackage cust4GirishACQuotePremPack = new PremiumPackage();
        cust4GirishACQuote.getQuote().setPackageType("premium");
        cust4GirishACQuote.getQuote().setPremiumPackage(cust4GirishACQuotePremPack);

        PaymentCard cust4GirishCard = new PaymentCard("Girish Balaji", "3782822463100051", 05, 2028, "115", " ", " ", " ", " ");
        cust4GirishACQuote.getQuote().setPaymentCard(cust4GirishCard);
        cust4GirishACQuote.getQuote().setPaymentStatus("completed");

        CustomerPolicy cust4GirishACPolicy = customerPolicyDirectory.createCustomerPolicy(cust4Girish, "expired", cust4GirishACQuote.getQuote().getPremiumAmount(), cust4GirishACQuote.getQuote().getVehicles());
        cust4GirishACPolicy.getPolicy().setQuote(cust4GirishACQuote.getQuote());
        cust4GirishACPolicy.getPolicy().setPremiumPackage(cust4GirishACQuote.getQuote().getPremiumPackage());

        customerQuoteDirectory.deleteCustomerQuote(cust4GirishACQuote);

        //3rd Party service
        //POLK 
        VehicleListWithAddressDirectory vehicleListWithAddressDirectory = BIC.getVehicleListWithAddressDirectory();
        Vehicle vehNissanNV200cust1Harish = new Vehicle("Car/Van", "4Y1SL65849Z411439", 2019, "Nissan", "NV200");
        vehicleListWithAddressDirectory.create("137 Thornton St", "Boston", "MA", "02119", vehNissanNV200cust1Harish);

        Vehicle vehToyotaCorollacust2Yukesh = new Vehicle("Car/Van", "4Y1SL66848Z411954", 2019, "Toyota", "Toyota Corolla");
        vehicleListWithAddressDirectory.create("138 Thornton St", "Boston", "MA", "02119", vehToyotaCorollacust2Yukesh);

        //PAYMENT
        PaymentCardDirectory paymentCardDirectory = BIC.getPaymentCardDirectory();
        PaymentCard Pcard1 = new PaymentCard(" ", "3782822463100051", 05, 2028, "115", " ", " ", " ", " ");
        paymentCardDirectory.addPaymentCard(Pcard1);
        PaymentCard Pcard2 = new PaymentCard(" ", "4111111111111111", 05, 2028, "111", " ", " ", " ", " ");
        paymentCardDirectory.addPaymentCard(Pcard2);

        //VIN Directory
        VINDirectory vinDirectory = BIC.getvINDirectory();
        vinDirectory.addVin("4Y1SL65848Z41A439");
        vinDirectory.addVin("4Y1SL65848Z411444");
        vinDirectory.addVin("4Y1SAC5848Z422439");
        vinDirectory.addVin("4Y1SL66668Z422439");
        vinDirectory.addVin("4Y1SL65849Z411439");
        vinDirectory.addVin("4Y1SL66848Z411954");

        //ununsed
        vinDirectory.addVin("1HGCM82633A400001");
        vinDirectory.addVin("JTEBU5JR8E5145879");
        vinDirectory.addVin("5XYZG3AB3CG101234");
        vinDirectory.addVin("WBXPA93486WJ26710");
        vinDirectory.addVin("2G1WC581159106525");
        vinDirectory.addVin("JM1BL1S57A1223456");
        vinDirectory.addVin("5FNRL3H76AB123456");
        vinDirectory.addVin("WAULC68E92A123456");
        vinDirectory.addVin("2T1BURHE3GC123456");
        vinDirectory.addVin("KMHDN45D52U123456");
        vinDirectory.addVin("1HGCG5641WA123456");
        vinDirectory.addVin("1FADP3E22EL123456");
        vinDirectory.addVin("3C4PDCAB5HT123456");
        vinDirectory.addVin("JHMAP11481T123456");
        vinDirectory.addVin("1N4BL11E35N123456");
        vinDirectory.addVin("WBAEU33425P123456");

        return BIC;

    }

}
