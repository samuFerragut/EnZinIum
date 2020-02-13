package enzinium;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {
    private PrivateKey SK;
    private PublicKey PK;
    private double Balance = 0d;
    private String Symbol = "EZI";

    public void Address(int PK, int SK, int Balance, String Symbol) {
    }

    public PublicKey getPK() {
        this.PK = PK;
        return PK;
    }

    public double getBalance() {
        this.Balance = Balance;
        return Balance;
    }

    public PrivateKey getSK() {
        this.SK = SK;
        return SK;
    }

    public String getSymbol() {
        this.Symbol = Symbol;
        return Symbol;
    }

    @Override
    public String toString() {
        return "PublicKey: " + getPK() + "symbol: " + getSymbol() + "balance: " + getBalance();
    }
}
