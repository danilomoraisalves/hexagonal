package com.alves.hexagonal.adapters.in.consumer.mapper;

import com.alves.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.alves.hexagonal.application.core.domain.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-16T21:10:44-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class CustomerMessageMapperImpl implements CustomerMessageMapper {

    @Override
    public Customer toCustomer(CustomerMessage customerMessage) {
        if ( customerMessage == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerMessage.getId() );
        customer.setName( customerMessage.getName() );
        customer.setCpf( customerMessage.getCpf() );

        return customer;
    }
}
