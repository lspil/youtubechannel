package repositories;

import model.Account;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class AccountRepository {

  public Optional<Account> findAccount(Connection con, int id) {
    var sql = "SELECT * FROM account WHERE id = ?";

    try (var stmt = con.prepareStatement(sql)) {
      stmt.setInt(1, id);

      var rs = stmt.executeQuery();

      if (rs.next()) {
        var amount = rs.getBigDecimal("amount");
        var account = new Account();

        account.setId(id);
        account.setAmount(amount);

        return Optional.of(account);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return Optional.empty();
  }

  public void updateAccount(Connection con, Account account) {
    var sql = "UPDATE account SET amount = ? WHERE id = ?";

    try (var stmt = con.prepareStatement(sql)) {
      stmt.setBigDecimal(1, account.getAmount());
      stmt.setInt(2, account.getId());

      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
