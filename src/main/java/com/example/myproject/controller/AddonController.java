package com.example.myproject.controller;

import com.example.myproject.entity.Addon;
import com.example.myproject.service.Addonservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddonController {
    @Autowired
    private Addonservice service;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/saveaddon")
    public Addon addon(@RequestBody Addon addon)
    {
        Addon addonobj =null;
        addonobj  =service.saveaddon(addon);
        return addonobj;

    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/getaddon")
    public List<Addon> getAll()
    {
        return service.getaddon();
    }

    @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/deleteaddon")
    public void delete(@RequestParam int addonId)
    {
        service.delete(addonId);
    }


    @CrossOrigin("http://localhost:4200")
    @PutMapping("/updateaddon")
    public Addon update(@RequestBody Addon add)
    {
        return service.updateaddon(add);
    }

}
