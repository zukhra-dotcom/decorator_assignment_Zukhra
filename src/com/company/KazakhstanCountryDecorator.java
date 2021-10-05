package com.company;

public class KazakhstanCountryDecorator implements KazakhstanCountry{

    private KazakhstanCountry kazakhstanCountry;

    public KazakhstanCountryDecorator (KazakhstanCountry kazakhstanCountry) {
        this.kazakhstanCountry = kazakhstanCountry;
    }

    @Override
    public String countryCities() {
        return kazakhstanCountry.countryCities() ;
    }
}
