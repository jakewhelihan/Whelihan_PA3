package com.company;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String args[])
    {
        DecimalFormat decimal  = new DecimalFormat(".00");
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        int total = 0;


        saver1.modifyInterestRate(0.04);

        System.out.println("balance for saver1:\n");

        for(int i = 0; i<12; i++){
            double calcInterest = saver1.GetBalance();
            System.out.println("Month " + (i+1) + ": " + (decimal.format(saver1.calculateMonthlyInterest())));
            saver1.modifyInterestRate(0.04);
            System.out.println();
        }

        System.out.println("balance for saver2:\n ");
        for(int i = 0; i<12; i++){
            double calcInterest = saver2.GetBalance();
            System.out.println("Month " + (i+1) + ": " + (decimal.format(saver2.calculateMonthlyInterest())));
            saver2.modifyInterestRate(0.04);
            System.out.println();
        }

        saver1.setInterestRate(.05);
        saver1.setSavingsBalance(2000.00);
        System.out.println("balance for saver1:\n");
        // with 5 percent
        for(int i = 0; i<12; i++){
            double calcInterest = saver1.GetBalance();
            System.out.println("Month " + (i+1) + ": " + (decimal.format(saver1.calculateMonthlyInterest())));
            saver1.modifyInterestRate(0.05);
            System.out.println();
        }
        saver1.setInterestRate(.05);
        saver1.setSavingsBalance(3000.00);
        System.out.println("balance for saver2:\n");

        for(int i = 0; i<12; i++){
            double calcInterest = saver2.GetBalance();
            System.out.println("Month " + (i+1) + ": " + (decimal.format(saver2.calculateMonthlyInterest())));
            saver2.modifyInterestRate(0.05);
            System.out.println();
        }
    }
}

class SavingsAccount
{
    private double savingsBalance;
    private double annualInterestRate;

    public SavingsAccount(double input)
    {
        savingsBalance = input;
        annualInterestRate = 0;
    }

    public double GetBalance()
    {
        return savingsBalance;
    }

    public double calculateMonthlyInterest(){
        double interstRate = (this.GetBalance() * this.annualInterestRate / 12);
        interstRate += this.GetBalance();

        return interstRate;
    }

    public void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate += newInterestRate;
    }

    public void setInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
    public void setSavingsBalance(double newInterestRate){
        savingsBalance = newInterestRate;
    }
}
