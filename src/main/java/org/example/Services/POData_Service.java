package org.example.Services;


import org.example.DTO.PODataDTO;

import org.example.repository.PoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class POData_Service {

    @Autowired
    PoDataRepository poDataRepository;

    public POData_Service() {



    }

    public List<PODataDTO> poOrderGetData(){

        return (List<PODataDTO>) poDataRepository.findAll();
    }


    public void addDataToPoData(PODataDTO poDataDTO){

        poDataRepository.save(poDataDTO);
    }

}
