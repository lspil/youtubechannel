package main;

import services.MoneyTransferService;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    MoneyTransferService moneyTransferService = new MoneyTransferService();

    moneyTransferService.transferMoney(1, 2, new BigDecimal(500));
  }
}
