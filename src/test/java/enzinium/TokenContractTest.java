package enzinium;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TokenContractTest {
   private Address rick = null;
   private Address morty = null;
   private TokenContract ricknillos = null;

   @Before
   public void setup_address_y_contract() {

      rick = new Address();
      rick.generateKeyPair();
      ricknillos = new TokenContract(rick);
      ricknillos.addOwner(rick.getPK(), 100d);
      assertEquals(1, ricknillos.getBalances().size());

      ricknillos.setTokenPrice(5d);

      morty = new Address();
      morty.generateKeyPair();
   }

   @Test
   public void addOwner_test() {

      ricknillos.addOwner(morty.getPK(), 0d);
      assertEquals(2, ricknillos.getBalances().size());

      assertEquals(100, ricknillos.getBalances().get(rick.getPK()), 0d);
      ricknillos.addOwner(rick.getPK(), 500d);
      assertEquals(100, ricknillos.getBalances().get(rick.getPK()), 0d);
   }
}