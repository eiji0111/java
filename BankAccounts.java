public class BankAccounts {
  private String accountNumber;
  private int balance;

  public BankAccounts(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  public String getAccountNumber() {
    return this.accountNumber;
  }
  @Override
  public String toString() {
    return "¥" + this.balance + "(口座番号= " + this.accountNumber + ")";
  }
  // @Override
  // public boolean equals(Object obj) {
  //   return obj.trim();
  // }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) { return true; }
    if (obj instanceof BankAccounts) {
      BankAccounts A = (BankAccounts) obj;
      String ba1 = this.accountNumber.trim();
      String ba2 = A.accountNumber.trim();
      if (ba1.equals(ba2)) {
        return true;
      }
    }
    return false;
  }
}
