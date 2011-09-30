package se.sigma.tutorial.testframework.bank.dao;

import se.sigma.tutorial.testframework.bank.account.Account;

public interface AccountDao {
    Account createAccount();

    Account getAccount(String accountKey);
}
