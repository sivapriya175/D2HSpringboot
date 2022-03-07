package com.example.myproject.controller;


import com.example.myproject.entity.Premium;
import com.example.myproject.service.PremiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PremiumController {

    @Autowired
    private PremiumService service;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/savepremium")
    public Premium premium(@RequestBody Premium pre)
    {
        Premium obj =null;
        obj  =service.savePremium(pre);
        return obj;

    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/getpremium")
    public List<Premium> getAll()
    {
        return service.getPremium();
    }

    @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/deletepremium")
    public void delete(@RequestParam int PlanId)
    {
        service.delete(PlanId);
    }


    @CrossOrigin("http://localhost:4200")
    @PutMapping("/updatepremium")
    public Premium update(@RequestBody Premium add)
    {
        return service.updatePremium(add);
    }


}
