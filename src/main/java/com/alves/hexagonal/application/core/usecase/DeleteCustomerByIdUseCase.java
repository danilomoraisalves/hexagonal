package com.alves.hexagonal.application.core.usecase;

import com.alves.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.alves.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.alves.hexagonal.application.ports.out.DeleteCustomerOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerOutputPort deleteCustomerOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerOutputPort deleteCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerOutputPort = deleteCustomerOutputPort;
    }
    @Override
    public void delete(String id) {

        findCustomerByIdInputPort.find(id);

        deleteCustomerOutputPort.delete(id);

    }

}
