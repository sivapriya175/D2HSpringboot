package com.example.myproject.controller;


import com.example.myproject.entity.Monthly;
import com.example.myproject.entity.Premium;
import com.example.myproject.service.MonthlyService;
import com.example.myproject.service.PremiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonthlyController {

    @Autowired
    private MonthlyService service;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/savemonthly")
    public Monthly saveMonthly(@RequestBody Monthly m)
    {
        Monthly obj =null;
        obj  =service.saveMonthly(m);
        return obj;

    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/getmonthly")
    public List<Monthly> getAll()
    {
        return service.getMonthly();
    }

    @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/deletemonthly")
    public void delete(@RequestParam int PlanId)
    {
        service.delete(PlanId);
    }


    @CrossOrigin("http://localhost:4200")
    @PutMapping("/updatemonthly")
    public Monthly update(@RequestBody Monthly add)
    {
        return service.updateMonthly(add);
    }
}
