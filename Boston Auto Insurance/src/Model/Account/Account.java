/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Account;

/**
 *
 * @author Dharun Karthick Ramaraj
 */
public abstract class Account {

    protected int accountId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected AccountCredentials accountCredentials;

    private static int nextAccountId = 1;

    public Account(String firstName, String lastName, String email) {
        this.accountId = nextAccountId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        return (firstName +' '+ lastName);
    }
    
    

    public String getEmail() {
        return email;
    }   
    
    public Account getAccount() {
        return(this);
    }

    public abstract String getRole();

    public abstract void viewProfile();

    public AccountCredentials getAccountCredentials() {
        return accountCredentials;
    }

    public void setUserAccountCredentials(AccountCredentials accountCredentials) {
        this.accountCredentials = accountCredentials;
    }
}
