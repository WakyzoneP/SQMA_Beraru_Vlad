package eu.dice.ism.sqma.vladberaru.wallet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WalletSetBalanceTest {

    @Test
    void setValidBalance() {
        Wallet wallet = new Wallet();
        wallet.setBalance(100.0);
        assertEquals(100.0, wallet.getBalance());
    }

    @Test
    void setNegativeBalanceThrowsException() {
        Wallet wallet = new Wallet();
        assertThrows(IllegalArgumentException.class,
                () -> wallet.setBalance(-50));
    }
}