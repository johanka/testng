package se.sigma.tutorial.testframework.junit.bank;

import org.hamcrest.Matcher;
import org.junit.Ignore;
import org.junit.Test;
import se.sigma.tutorial.testframework.bank.account.Account;
import se.sigma.tutorial.testframework.bank.dao.AccountDao;
import se.sigma.tutorial.testframework.bank.dao.impl.AccountDaoImpl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    @Ignore("to be implemented")
    public void createAccountAndFetchIt() {
        AccountDao dao = new AccountDaoImpl();
        Account expectedAccount = dao.createAccount();
        String expectedKey = expectedAccount.getKey();

        Account actualAccount = dao.getAccount(expectedKey);
        String actualKey = actualAccount.getKey();

        assertThat(actualKey, is(expectedKey));
    }
}
