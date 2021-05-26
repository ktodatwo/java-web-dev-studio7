package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD newDVDRelease = new DVD("DVD", "Next Gen New Release", 64.5);
        CD newCDRelease = new CD("CD", "High Storage Discs", 100);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println("The new DVD products spin at a rate of "+newDVDRelease.spinDisc()+" rpm.");
        System.out.println("The new CD products spin at a rate of "+newCDRelease.spinDisc()+" rpm.");

    }
}
