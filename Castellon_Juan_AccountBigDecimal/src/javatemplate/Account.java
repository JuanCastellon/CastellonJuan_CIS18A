/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatemplate;
import java.math.BigDecimal;

/**
 *
 * @author Juan
 */
public class Account {
   private String name; // instance variable 
   private BigDecimal balance; // instance variable 

   // Account constructor that receives two parameters  
   public Account(String name, double bal) 
   {
      this.name = name; // assign name to instance variable name

      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      if (bal > 0.0){ // if the balance is valid
          this.balance = BigDecimal.valueOf(bal);
      }
      else{
          this.balance = BigDecimal.valueOf(0.0);
      }
   }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) 
   {      
      if (depositAmount > 0.0) // if the depositAmount is valid
          balance = balance.add(BigDecimal.valueOf(depositAmount));
   }

   // method returns the account balance
   public double getBalance()
   {
      return balance.doubleValue();
   }

   // method that sets the name
   public void setName(String name)
   {
      this.name = name; 
   } 

   // method that returns the name
   public String getName()
   {
      return name; 
   } 
}
