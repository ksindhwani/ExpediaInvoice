package main.java.enums;

public enum ItemType {
    NON_MEDICAL(20),
    MEDICAL(0);

    private final int taxPercent;

    ItemType(int taxPercent) {
        this.taxPercent = taxPercent;
    }

    public int getTaxPercent() {
        return taxPercent;
    }
}
