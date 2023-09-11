package com.alves.hexagonal.application.ports.out;

import com.alves.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
