package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DpakPerson;
import com.example.springapp.repository.DpakPersonRepo;

@Service
public class DpakPersonService {
    @Autowired
    private DpakPersonRepo rep;

    public boolean post(DpakPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DpakPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<DpakPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
