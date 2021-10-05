package com.company;

public class Main {

    public static void main(String[] args) {
        KazakhstanCountry kazakhstanCountry = new ZaysanDistrict(new PetropavlovskCity(new NorthKazakhstanRegion()));

        System.out.println("Kazakstan country -> " + kazakhstanCountry.countryCities());
    }
}
