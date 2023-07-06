package org.example.Controller;

import org.example.DTO.PODataDTO;
import org.example.Services.POData_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class POData_Controller {


    @Autowired
    POData_Service poDataService;

    @GetMapping("/getData")
    public List<PODataDTO> getAllPoData(){
        return  poDataService.poOrderGetData();
    }

    @PostMapping("/addData")
    public void addDataToPoData(@RequestBody PODataDTO poDataDTO){
        poDataService.addDataToPoData(poDataDTO);
    }





}
