package com.example.myproject.service;

import com.example.myproject.entity.Addon;
import com.example.myproject.repository.AddonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Addonservice {
    @Autowired
    private AddonRepository repo;

    public Addon saveaddon(Addon a)
    {
        return repo.save(a);
    }

    public List<Addon> getaddon()
    {
        return repo.findAll();
    }

    public void delete(int addonId)

    {
        repo.deleteById(addonId);
    }

    public Addon updateaddon(Addon a)
    {
        int addonId=a.getAddonId();
        Addon add=repo.findById(addonId).get();
        add.setAddonName(a.getAddonName());
        add.setAddonPrice(a.getAddonPrice());
        add.setAddonDetails(a.getAddonDetails());
        add.setAddonValidity(a.getAddonValidity());
        return repo.save(add);

    }


}
