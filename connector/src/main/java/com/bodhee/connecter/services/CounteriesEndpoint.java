package com.bodhee.connecter.services;

import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.feature.Features;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ai.bodhee.connector.soap.*;
import com.bodhee.connecter.Repository.*;


@Service
@Slf4j
@Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
public class CounteriesEndpoint implements CountriesPort{
  //  

    private CountryRepository countryRepository;

    @Autowired
    public CounteriesEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public GetCountryResponse getCountry(GetCountryRequest parameters) {
        GetCountryResponse countryResponse = new GetCountryResponse();
        try{
            System.out.println("This is test code for now");
            
            countryResponse.setCountry(countryRepository.findCountry(parameters.getName()));
        }
        catch (Exception e){
         //   log.error("Error while setting values for employee object", e);
        }
        return countryResponse;
    }

}
