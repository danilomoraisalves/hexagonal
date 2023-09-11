package com.alves.hexagonal.config;

import com.alves.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.alves.hexagonal.adapters.out.InsertCustomerAdapter;
import com.alves.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.alves.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }

}