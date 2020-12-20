package services;

import db.managers.DBConnectionManager;
import exceptions.AccountMissingException;
import repositories.AccountRepository;

import java.math.BigDecimal;
import java.sql.SQLException;

public class MoneyTransferService {

  private final AccountRepository accountRepository;

  public MoneyTransferService() {
    this.accountRepository = new AccountRepository();
  }

  // ACID

  /*
  A - Atomicity
  C - Consistency
  I - Isolation
  D - Durability
   */
  public void transferMoney(int fromAccount, int toAccount, BigDecimal amount) {
    try (var con = DBConnectionManager.getInstance().getConnection()) {
      var from = accountRepository.findAccount(con, fromAccount);
      var to = accountRepository.findAccount(con, toAccount);

      var a1 = from.orElseThrow(AccountMissingException::new);
      var a2 = to.orElseThrow(AccountMissingException::new);

      a1.setAmount(a1.getAmount().subtract(amount));
      a2.setAmount(a2.getAmount().add(amount));

      accountRepository.updateAccount(con, a1);
//      if (true) throw new RuntimeException(":(");
      accountRepository.updateAccount(con, a2);
      con.commit();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
