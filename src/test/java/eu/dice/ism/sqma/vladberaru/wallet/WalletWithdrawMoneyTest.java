package eu.dice.ism.sqma.vladberaru.wallet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WalletWithdrawMoneyTest {

    @Test
    void withdrawSuccessfully() {
        Wallet wallet = new Wallet();
        wallet.setBalance(100);
        wallet.withdrawMoney(40);
        assertEquals(60, wallet.getBalance());
    }

    @Test
    void withdrawMoreThanBalanceThrowsException() {
        Wallet wallet = new Wallet();
        wallet.setBalance(30);
        assertThrows(IllegalArgumentException.class,
                () -> wallet.withdrawMoney(50));
    }
}
