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

    private Map<PublicKey, Double> balances = new HashMap<>();


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
    };

    public Address owner() {
        return this.owner;
    }

    public String name() {
        return this.name;
    }

    public String symbol() {
        return this.symbol;
    }

    public double totalSupply() {
        return this.totalSupply;
    }

    public void setTokenPrice(Double tokenPrice) {
        this.tokenPrice = tokenPrice;
    }

    public Double getTokenPrice() {
        return this.tokenPrice;
    }

    public Map<PublicKey, Double> getBalances() {
        return this.balances;
    }

    @Override
    public String toString() {
        return "name = " + name() +
                "\n symbol = " + symbol() +
                "\n totalSupply = " + totalSupply() +
                "\n owner PK = " + this.ownerPK.hashCode();
    }

    public void addOwner(PublicKey PK, Double units) {
        getBalances().putIfAbsent(PK, units);
    }

    public int numOwners() {
        return this.getBalances().size();
    }

    public double balanceOf(PublicKey owner) {
        return this.getBalances().getOrDefault(owner, 0d);
    }
}

