package com.alves.hexagonal.application.ports.in;

import com.alves.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
