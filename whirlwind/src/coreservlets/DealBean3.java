package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DealBean3 {
  private String accountId;
  private Integer count;
  private DailyDeal todaysDeal = DealUtils.todaysDeal();
  private Account account;
  private static AccountLookupService lookupService =
    new AccountSimpleMap();

  public String getAccountId() {
    return(accountId);
  }
  
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  
  public Integer getCount() {
    return(count);
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DailyDeal getTodaysDeal() {
    return(todaysDeal);
  }

  public Account getAccount() {
    return(account);
  }
  
  public double getPurchaseAmount() {
    return(count * todaysDeal.getPrice());
  }
  
  public String getPurchaseDollars() {
    return(String.format("$%,.2f", getPurchaseAmount()));
  }
  
  public String buyDailyDeal() {
    account = lookupService.findAccount(accountId);
    if (account == null) {
      return("deal-bad-id-3");
    } 
    if (account.getBalance() < getPurchaseAmount()) {
      return("deal-insufficient-balance-3");
    }
    account.setBalance(account.getBalance() - getPurchaseAmount());
    return("deal-success-3");
  }
}
