/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Account;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Dharun Karthick Ramaraj
 */
public class AccountDirectory {
    private ArrayList<Account> accounts;

    public AccountDirectory() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }

    public void deleteAccount(int accountId) {
        Account accountToRemove = findAccount(accountId);
        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
        }
    }

    // Additional methods for account management

    // Example: Method to print all account profiles
    public void printAllAccountProfiles() {
        for (Account account : accounts) {
            account.viewProfile();
        }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}

