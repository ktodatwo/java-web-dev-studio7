package org.launchcode.studio7;

public class CD extends Product implements OpticalDisc {

    private String code;
    private String description;
    private double storage;
    private static final int spinRate = 570;

    public CD(String code, String description, double storage) {
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
        System.out.println("CD Code: "+code);
        System.out.println("CD Description: "+description);
        System.out.println("CD Storage capacity: "+storage);
    }

    // TODO: Implement your custom interface. - done

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.



}
