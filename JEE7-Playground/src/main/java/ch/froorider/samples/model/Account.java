package ch.froorider.samples.model;

/**
 * Created by U114843 on 29.07.2016.
 */
public class Account {
    private String name;
    private String nameOfBank;
    private String iban;

    public Account() {
    }

    public Account(String name, String nameOfBank, String iban) {
        this.name = name;
        this.nameOfBank = nameOfBank;
        this.iban = iban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
