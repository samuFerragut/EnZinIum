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
    public void toStringTest(){
        Address address = new Address();
        System.out.println(address.toString());
    }
}