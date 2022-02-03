package com.bodhee.connecter.configuration;

import com.bodhee.connecter.services.*;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class ApplicationConfiguration {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(CounteriesEndpoint counteriesEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, counteriesEndpoint);
        endpoint.publish("/service/counteries");
        return endpoint;
    }
}