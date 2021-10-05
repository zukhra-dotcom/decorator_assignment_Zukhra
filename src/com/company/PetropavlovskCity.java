package com.company;

public class PetropavlovskCity extends KazakhstanCountryDecorator{

    public PetropavlovskCity(KazakhstanCountry kazakhstanCountry) {
        super(kazakhstanCountry);
    }

    String hasPetropavlovskCity(){
        return "Petropavlovsk city -> ";
    }

    @Override
    public String countryCities() {
        return super.countryCities() + hasPetropavlovskCity();
    }
}
