package eu.dice.ism.sqma.vladberaru.wallet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WalletAddMoneyTest {

    @Test
    void addMoneySuccessfully() {
        Wallet wallet = new Wallet();
        wallet.setBalance(50);
        wallet.addMoney(30);
        assertEquals(80, wallet.getBalance());
    }

    @Test
    void addNegativeMoneyThrowsException() {
        Wallet wallet = new Wallet();
        assertThrows(IllegalArgumentException.class,
                () -> wallet.addMoney(-10));
    }
}
