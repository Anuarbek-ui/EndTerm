package entities;

import java.util.Date;

public class Transaction {
   private int transaction_id;
   private Date transaction_date;
   private boolean returned;
   private double amount;

   public Transaction(int transaction_id, Date transaction_date, boolean returned, double amount) {
      this.transaction_id = transaction_id;
      this.transaction_date = transaction_date;
      this.returned = returned;
      this.amount = amount;
   }

   public int getTransaction_id() {
      return transaction_id;
   }

   public void setTransaction_id(int transaction_id) {
      this.transaction_id = transaction_id;
   }

   public Date getTransaction_date() {
      return transaction_date;
   }

   public void setTransaction_date(Date transaction_date) {
      this.transaction_date = transaction_date;
   }

   public boolean isReturned() {
      return returned;
   }

   public void setReturned(boolean returned) {
      this.returned = returned;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   @Override
   public String toString() {
      return "Transaction{" +
              "transaction_id=" + transaction_id +
              ", transaction_date=" + transaction_date +
              ", returned=" + returned +
              ", amount=" + amount +
              '}';
   }
}




