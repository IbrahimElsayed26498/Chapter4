/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditlimitcalculator;

/**
 *
 * @author ibrahim
 */
public class Customer {

    private int accountNumber;
    private int beginningBalance;
    private int charges;
    private int credits;

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the beginningBalance
     */
    public int getBeginningBalance() {
        return beginningBalance;
    }

    /**
     * @param beginningBalance the beginningBalance to set
     */
    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    /**
     * @return the charges
     */
    public int getCharges() {
        return charges;
    }

    /**
     * @param charges the charges to set
     */
    public void setCharges(int charges) {
        this.charges = charges;
    }

    /**
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

}
