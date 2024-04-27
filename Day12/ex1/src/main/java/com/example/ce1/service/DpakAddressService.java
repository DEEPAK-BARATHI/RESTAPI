package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.DpakAddress;
import com.example.ce1.repository.DpakAddressRepo;
import com.example.ce1.repository.DpakEmployeeRepo;

@Service
public class DpakAddressService {
    @Autowired
    DpakAddressRepo addressRepo;
    @Autowired
    DpakEmployeeRepo employeeRepo;
    public DpakAddress setAddressById(int id,DpakAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
