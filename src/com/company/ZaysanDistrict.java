package com.company;

public class ZaysanDistrict extends KazakhstanCountryDecorator{


    public ZaysanDistrict(KazakhstanCountry kazakhstanCountry) {
        super(kazakhstanCountry);
    }

    String hasZaysanDistrict (){
        return "Zaysan district";
    }

    @Override
    public String countryCities() {
        return super.countryCities() + hasZaysanDistrict();
    }
}
