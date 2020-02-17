package enzinium;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class TokenContract {
    private PublicKey ownerPK = null;
    private Address owner = null;
    private String name = null;
    private String symbol = null;
    private double totalSupply = 0d;
    private Double totalTokensSold = 0d;
    private Double tokenPrice = 0d;

    private final Map<PublicKey, Double> balances = new HashMap<>();


    public TokenContract(Address owner) {
        this.owner = owner;
        this.ownerPK = owner.getPK();
    }
        public void setName(String name) {
            this.name = name;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public void setTotalSupply(double totalSupply) {
            this.totalSupply = totalSupply;
        }

        public void setTokenPrice(Double tokenPrice) {
            this.tokenPrice = tokenPrice;
        }

        public String getName() {
        return this.name;
        }

        public String getSymbol() {
        return this.symbol;
        }

        public double getTotalSupply() {
        return this.totalSupply;
        }

        public PublicKey getOwnerPK() {
        return this.ownerPK;
        }

    @Override
    public String toString() {
        return "name = " + getName() +
                "\n symbol = " + getSymbol() +
                "\n totalSupply = " + getTotalSupply() +
                "\n owner PK = " + getOwnerPK().hashCode();
    }
}

