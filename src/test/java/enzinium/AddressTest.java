package enzinium;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.junit.Assert;
import org.junit.Test;
import enzinium.Address;

public class AddressTest {

    @Test
    public void constructor_test() {
        Address address = new Address();
        assertNotNull(address);
        assertEquals(0d, address.getBalance(), 0d);
    }

    @Test
    public void generate_key_pair_test() {
        Address address = new Address();
        assertNotNull(address);
        address.generateKeyPair();
        assertNotNull(address.getPK());
    }
}