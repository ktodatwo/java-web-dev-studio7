package org.launchcode.studio7;

public class DVD extends Product implements OpticalDisc {
    private String code;
    private String description;
    private double storage;
    private static final int spinRate = 500;

    public DVD(String code, String description, double storage) {
        super(code, description, storage);
    }

    @Override
    public int spinDisc() {
        return spinRate;
    }

    @Override
    public double storeData() {
        return storage;
    }

    @Override
    public void loadReport() {
        System.out.println("DVD Code: "+code);
        System.out.println("DVD Description: "+description);
        System.out.println("DVD Storage capacity: "+storage);

    }

    // TODO: Implement your custom interface. - done

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
