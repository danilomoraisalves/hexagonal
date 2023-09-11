package com.alves.hexagonal.adapters.out.client.mapper;

import com.alves.hexagonal.adapters.out.client.response.AddressResponse;
import com.alves.hexagonal.application.core.domain.Address;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-16T21:10:44-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class AddressResponseMapperImpl implements AddressResponseMapper {

    @Override
    public Address toAddress(AddressResponse addressResponse) {
        if ( addressResponse == null ) {
            return null;
        }

        Address address = new Address();

        address.setStreet( addressResponse.getStreet() );
        address.setCity( addressResponse.getCity() );
        address.setState( addressResponse.getState() );

        return address;
    }
}
