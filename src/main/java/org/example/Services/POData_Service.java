package org.example.Services;


import org.example.repository.PO_OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class POData_Service {

    @Autowired
    PO_OrderRepository poOrderRepository;



}
