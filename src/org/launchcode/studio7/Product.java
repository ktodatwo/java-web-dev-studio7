package org.launchcode.studio7;

public abstract class Product {
    private String code;
    private String description;
    private double storage;

    public Product(String code, String description, double storage) {

        this.code = code;
        this.description = description;
        this.storage = storage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }


}
