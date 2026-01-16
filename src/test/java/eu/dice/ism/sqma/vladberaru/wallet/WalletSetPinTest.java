package eu.dice.ism.sqma.vladberaru.wallet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WalletSetPinTest {

    @Test
    void setValidPin() {
        Wallet wallet = new Wallet();
        wallet.setPin("1234");
        assertEquals("1234", wallet.getPin());
    }

    @Test
    void setInvalidPinThrowsException() {
        Wallet wallet = new Wallet();
        assertThrows(IllegalArgumentException.class,
                () -> wallet.setPin("12"));
    }
}
